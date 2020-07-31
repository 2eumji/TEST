package model2.ch12;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Bank1Bean {
	private int aid;
	private String aname;
	private int balance;
	
	//�����ͺ��̽� ���� ��ü ����
	Connection conn=null;
	Statement stmt=null;
	PreparedStatement pstmt=null;
	
	//JNDI�� ���� ����
	public void connect() {
		try {
			//Context �ʱ�ȭ�� ���� ������ ���̽� ����
			Context initContext=new InitialContext();
			Context envContext=(Context)initContext.lookup("java:/comp/env");
			DataSource ds =(DataSource)envContext.lookup("jdbc/orcl");
			conn=ds.getConnection();
			
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	//connection ��ȯ
	public void disconnect(){
		try {
			if(conn !=null) {
				conn.close();
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		System.out.println("Close");
	}
	
	//bank1���̺� �������� �޼ҵ�
	public void getData() {
		connect();
		try {
			stmt=conn.createStatement();//������ �����Ǹ� ��� ��밡��
			ResultSet rs=stmt.executeQuery("select * from bank1");//���ǿ� ���Ѱ���� ResultSet �� ����������
			rs.next();//type�� row���·� �޾ƿ�
			//���� row�� ������� aid�÷��� ������ int������ ��ȯ�Ͽ� �޾ƿ�
			aid=rs.getInt("aid");
			aname=rs.getString("aname");
			balance=rs.getInt("balance");
			
		} catch (Exception e) {
			System.out.println(aid+aname+balance);
			System.out.println(e);
			
		}
		finally {
			disconnect();//conn.createStatement();�Ҹ�
		}
	}
	//��ü ó�� �޼ҵ�
	public boolean transfer (int bal) {
		connect();
		try {
			conn.setAutoCommit(false);//update delete�� ����
			//���¿��� ����
			pstmt=conn.prepareStatement("update bank1 set balance=balance-? where aid=101");
			pstmt.setInt(1, bal);
			pstmt.executeUpdate();
			
			//���¿��� ��ü�ݾ� ����
			pstmt=conn.prepareStatement("update bank2 set balance=balance+? where aid=201");
			pstmt.setInt(1, bal);
			pstmt.executeUpdate();
			stmt=conn.createStatement();
			
			ResultSet rs=stmt.executeQuery("select balance from bank2 where aid=201");
			rs.next();
			
			if(rs.getInt(1) > 500000) {
				conn.rollback();
				return false;
			}else {
				conn.commit();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			disconnect();
		}
		return true;
	}
	public int getAid() {
		return aid;
	}
	public String getAname() {
		return aname;
	}
	public int getBalance() {
		return balance;
	}
	
	
	
}
