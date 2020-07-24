package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

//����Ŭ �����ͺ��̽� �����ϰ� select, insert,delete,update�۾��� �������ִ� Ŭ����
public class MemberDAO {
	//����Ŭ ���� �ҽ� �ۼ�
	
	String url="jdbc:oracle:thin:@localhost:1521:orcl"; //���� url
	String user="system";
	String pass="12341234";
	
	Connection con; //�����ͺ��̽� ����(����)
	PreparedStatement pstmt; //���� ���� ��ü
	ResultSet rs;//������� ���Ϲ޾� �ڹٿ� �����ϴ� ��ü
	
//�����ͺ��̽��� ������ �� �ֵ��� �ϴ� �޼���======================================================
	public void getCon() {
		try { //1.����̹� ���� (������ͺ��̽� ����Ұ��ΰ�)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.�ش� �����ͺ��̽��� ����
			con=DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//ȸ�������� �������ִ� �޼ҵ�================================================================
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
	
//��� ����ڵ��� �˻��ϴ� �޼ҵ�====================================================
	public Vector<MemberDBBean> allSelectMember(){
		
		//Vector ��ü
		
		Vector<MemberDBBean> v=new Vector<MemberDBBean>();
		
		try {
			//Ŀ�ؼ� ����
			getCon();
			//�����غ�
			String sql="select * from member";
			pstmt=con.prepareStatement(sql);
			//���� ��� ����
			rs=pstmt.executeQuery();
			while(rs.next()) { //rs�� ������ true
				MemberDBBean bean=new MemberDBBean();
				//�Ӽ����̶� ��ġ�ϰ� ����
				bean.setId(rs.getString(1));//ù����������Ƽ
				bean.setPass1(rs.getString(2));
				bean.setPass2(rs.getString(3));
				bean.setEmail(rs.getString(4));
				bean.setGender(rs.getString(5));
				bean.setAddress(rs.getString(6));
				bean.setPhone(rs.getString(7));
				bean.setHobby(rs.getString(8));
				bean.setJob(rs.getString(9));
				bean.setAge(rs.getString(10));
				bean.setInfo(rs.getString(11));
				//�ڽ��� ���� ��, ���Ϳ� ����
				v.add(bean);
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return v;
	}
	
//�ϳ��� ����� ������ �����ϴ� �޼ҵ�====================================================
	public MemberDBBean oneSelectMember(String id) {
		MemberDBBean bean=new MemberDBBean();
		try {
			getCon();
			String sql="select * from member where id=?";
			pstmt=con.prepareStatement(sql);
			//?����
			pstmt.setString(1,id);
			//��������
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				//MemberDBBean�� �����͸� ����
				bean.setId(rs.getString(1));
				bean.setPass1(rs.getString(2));
				bean.setPass2(rs.getString(3));
				bean.setEmail(rs.getString(4));
				bean.setGender(rs.getString(5));
				bean.setAddress(rs.getString(6));
				bean.setPhone(rs.getString(7));
				bean.setHobby(rs.getString(8));
				bean.setJob(rs.getString(9));
				bean.setAge(rs.getString(10));
				bean.setInfo(rs.getString(11));
			}
			con.close();
			//�Ѹ��� �����̱⶧���� ���� �ʿ����
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
//���� :: �ѻ���� ���� ȸ������ ����====================================================================
	public String getPass(String id) {
		String pass="";
		try {
			getCon();
			String sql="select pass1 from member where id=?";
			pstmt=con.prepareStatement(sql);
			//?ǥ ����
			pstmt.setString(1, id);
			//��������
			rs=pstmt.executeQuery();
			//���üũ
			if(rs.next()) {
				pass=rs.getString(1);//�н����� ���� ����� Į���ε���
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//��� ����
		return pass;
	}
	
//������Ʈ :: �ѻ���� ���� ȸ������ �������� ������Ʈ==================================================================
	public void updateMember(MemberDBBean bean) {
		getCon();
		try {
			String sql="update member set phone=?,email=? where id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,bean.getPhone());
			pstmt.setString(2,bean.getEmail());
			pstmt.setString(3, bean.getId());
			//����
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
//���� :: �ѻ���� ���� ȸ������ ����==================================================================	
	public void deleteMember(String id) {
		getCon();
		try {
			String sql="delete from member where id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
