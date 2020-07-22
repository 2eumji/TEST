package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//오라클 데이터베이스 연결하고 select, insert,delete,update작업을 실행해주는 클래스
public class MemberDAO {
	//오라클 접속 소스 작성
	
	String url="jdbc:oracle:thin:@localhost:1521:orcl"; //접속 url
	String user="system";
	String pass="12341234";
	
	Connection con; //데이터베이스 접근(연결)
	PreparedStatement pstmt; //쿼리 실행 객체
	ResultSet re;//결과값을 리턴받아 자바에 저장하는 객체
	
	//데이터베이스에 접속할 수 있도록 하는 메서드
	public void getCon() {
		try { //1.드라이버 설정 (어떤데이터베이스 사용할것인가)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.해당 데이터베이스에 접속
			con=DriverManager.getConnection(url, user, pass);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//회원정보를 저장해주는 메소드
	public void insertMember(MemberDBBean mbean) {
		try{
			getCon(); //접속 완료
			//3. 접속 후 쿼리 준비
			String sql="insert into member values(?,?,?,?,?,?,?,?,?,?,?)";
			//쿼리를 사용하도록 설정
			PreparedStatement pstmt = con.prepareStatement(sql); //요청
			//?에 맞게 데이터 맵핑
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
			//4.오라클에서 쿼리를 실행
			pstmt.executeUpdate();
			//5.자원 반납
			con.close(); //연결종료
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
