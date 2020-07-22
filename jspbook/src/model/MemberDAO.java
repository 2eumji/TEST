package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//����Ŭ �����ͺ��̽� �����ϰ� select, insert,delete,update�۾��� �������ִ� Ŭ����
public class MemberDAO {
	//����Ŭ ���� �ҽ� �ۼ�
	
	String url="jdbc:oracle:thin:@localhost:1521:orcl"; //���� url
	String user="system";
	String pass="12341234";
	
	Connection con; //�����ͺ��̽� ����(����)
	PreparedStatement pstmt; //���� ���� ��ü
	ResultSet re;//������� ���Ϲ޾� �ڹٿ� �����ϴ� ��ü
	
	//�����ͺ��̽��� ������ �� �ֵ��� �ϴ� �޼���
	public void getCon() {
		try { //1.����̹� ���� (������ͺ��̽� ����Ұ��ΰ�)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.�ش� �����ͺ��̽��� ����
			con=DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//ȸ�������� �������ִ� �޼ҵ�
	public void insertMember(MemberDBBean mbean) {
		try{
			getCon(); //���� �Ϸ�
			//3. ���� �� ���� �غ�
			String sql="insert into member values(?,?,?,?,?,?,?,?,?,?,?)";
			//������ ����ϵ��� ����
			PreparedStatement pstmt = con.prepareStatement(sql); //��û
			//?�� �°� ������ ����
			pstmt.setString(1, mbean.getId());
			pstmt.setString(2, mbean.getPass1());
			pstmt.setString(3, mbean.getPass2());
			pstmt.setString(4, mbean.getEmail());
			pstmt.setString(5, mbean.getGender());
			pstmt.setString(6, mbean.getAddress());
			pstmt.setString(7, mbean.getPhone());
			pstmt.setString(8, mbean.getHobby());
			pstmt.setString(9, mbean.getJob());
			pstmt.setString(10, mbean.getAge());
			pstmt.setString(11, mbean.getInfo());
			//4.����Ŭ���� ������ ����
			pstmt.executeUpdate();
			//5.�ڿ� �ݳ�
			con.close(); //��������
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
