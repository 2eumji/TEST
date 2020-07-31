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
	
	//데이터베이스 관련 객체 선언
	Connection conn=null;
	Statement stmt=null;
	PreparedStatement pstmt=null;
	
	//JNDI를 통한 연결
	public void connect() {
		try {
			//Context 초기화를 통한 데이터 베이스 연동
			Context initContext=new InitialContext();
			Context envContext=(Context)initContext.lookup("java:/comp/env");
			DataSource ds =(DataSource)envContext.lookup("jdbc/orcl");
			conn=ds.getConnection();
			
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	//connection 반환
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
	
	//bank1테이블 가져오는 메소드
	public void getData() {
		connect();
		try {
			stmt=conn.createStatement();//연결이 유지되면 계속 사용가능
			ResultSet rs=stmt.executeQuery("select * from bank1");//질의에 대한결과는 ResultSet 에 담을수있음
			rs.next();//type을 row형태로 받아옴
			//현재 row의 결과에서 aid컬럼의 내용을 int형으로 변환하여 받아옴
			aid=rs.getInt("aid");
			aname=rs.getString("aname");
			balance=rs.getInt("balance");
			
		} catch (Exception e) {
			System.out.println(aid+aname+balance);
			System.out.println(e);
			
		}
		finally {
			disconnect();//conn.createStatement();소멸
		}
	}
	//이체 처리 메소드
	public boolean transfer (int bal) {
		connect();
		try {
			conn.setAutoCommit(false);//update delete를 제한
			//계좌에서 차감
			pstmt=conn.prepareStatement("update bank1 set balance=balance-? where aid=101");
			pstmt.setInt(1, bal);
			pstmt.executeUpdate();
			
			//계좌에서 이체금액 증가
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
