<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align=center>
		<h2>회원가입</h2>
		<form name="joinform" action="MemberDBJoin.jsp" method="post">
		<% 
			//post 방식에서 한글깨짐 방지
			request.setCharacterEncoding("UTF-8");
		%>
		<table border=1 cellpadding="10">
			<tr>
                <td>아이디</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>패스워드</td>
                <td><input type="password" name="pass1"></td>
            </tr>
            <tr>
                <td>패스워드 확인</td>
                <td><input type="password" name="pass2"></td>
            </tr>
            <tr>
                <td>이메일</td>
                <td><input type="email" name="email"></td>
            </tr>
            <tr>
                <td>성별</td>
                <td>
                    <input type="radio" name="gender" id="" value="남"> 남 
                    <input type="radio" name="gender" id="" value="여"> 여
                </td>
            </tr>
            <tr>
                <td>주소</td>
                <td><input type="text" name="address"></td>
            </tr>
            <tr>
                <td>전화번호</td>
                <td><input type="tel" name="phone"></td>
            </tr>
            <tr>
                <td>당신의 관심분야</td>
                <td>
                    <input type="checkbox" name="hobby" id="" value="여행"> 여행
                    <input type="checkbox" name="hobby" id="" value="등산"> 등산
                    <input type="checkbox" name="hobby" id="" value="음악"> 음악
                    <input type="checkbox" name="hobby" id="" value="독서"> 독서
                </td>
            </tr>
            <tr>
                <td>당신의 직업은</td>
                <td>
                    <select name="job" id="">
                        <option value="무직">무직</option>
                        <option value="교사">교사</option>
                        <option value="회사원">회사원</option>
                        <option value="학생">학생</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>당신의 연령은</td>
                <td>
                    <input type="radio" name="age" id="" value="10대"> 10대
                    <input type="radio" name="age" id="" value="20대"> 20대
                    <input type="radio" name="age" id="" value="30대"> 30대
                    <input type="radio" name="age" id="" value="40대"> 40대
                </td>
            </tr>
            <tr>
                <td>하고싶은말</td>
                <td>
                    <textarea name="info" id="" cols="30" rows="5"></textarea>
                </td>
            </tr>
            <tr align=center>
                <td colspan="2">
                	<input type="submit" value="회원가입">
       				<input type="reset" value="취소">
                </td>
            </tr>
		</table>
		</form>
		
	</div>

</body>
</html>