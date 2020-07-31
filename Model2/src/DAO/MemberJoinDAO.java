package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberJoinDAO {
	
	//데이터베이스에 접근하기 위한 변수 선언
	Connection con=null;
	Statement stmt=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public void getCon() {
		try {
			//데이터 베이스 연동
			Context initContext=new InitialContext();
			Context envContext=(Context)initContext.lookup("java:/comp/env");
			DataSource ds =(DataSource)envContext.lookup("jdbc/orcl");
			con=ds.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//1.데이터베이스에 한사람의 회원 정보를 저장해주는 메소드(inset)
	public void insertMember(MemberJoinBean mjbean) {
		getCon();
		try {
			String sql="insert into member values(?,?,?,?,?,?,?,?,?,?,?)";
			//쿼리를 돌려주는 클래스 PreparedStatement 담음
			PreparedStatement pstmt=con.prepareStatement(sql);
			//물음표 매핑
			pstmt.setString(1, mjbean.getId());
			pstmt.setString(2, mjbean.getPw1());
			pstmt.setString(3, mjbean.getPw2());
			pstmt.setString(4, mjbean.getEmail());
			pstmt.setString(5, mjbean.getGender());
			pstmt.setString(6, mjbean.getAddress());
			pstmt.setString(7, mjbean.getTel());
			pstmt.setString(8, mjbean.getHobby());
			pstmt.setString(9, mjbean.getJob());
			pstmt.setString(10, mjbean.getAge());
			pstmt.setString(11, mjbean.getInfo());
			
			pstmt.executeUpdate();//컨트롤+엔터
			
			con.close();//DB접속 닫기
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//모든 회원들의 정보를 검색하여 얻어옴
	public Vector<MemberJoinBean> allSelectMember() {
		Vector<MemberJoinBean> v=new Vector<>();
		getCon();
		try {
			String sql="select * from member";
			pstmt=con.prepareStatement(sql);//sql문을 읽기
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				MemberJoinBean mjbean=new MemberJoinBean();
				mjbean.setId(rs.getString(1));//첫번쨰프로퍼티
				mjbean.setPw1(rs.getString(2));
				mjbean.setPw2(rs.getString(3));
				mjbean.setEmail(rs.getString(4));
				mjbean.setGender(rs.getString(5));
				mjbean.setAddress(rs.getString(6));
				mjbean.setTel(rs.getString(7));
				mjbean.setHobby(rs.getString(8));
				mjbean.setJob(rs.getString(9));
				mjbean.setAge(rs.getString(10));
				mjbean.setInfo(rs.getString(11));
				
				v.add(mjbean);
			}	
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return v;
		
	}
	
	
}
