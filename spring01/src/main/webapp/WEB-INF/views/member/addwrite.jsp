<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="../include/header.jsp" %>
<title>Insert title here</title>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
	<h2>주소록 폼</h2>
	<form name="form1" method="post" action="${path}/member/addinsert.do">
		<table border="1" width="400px">
			<tr>
				<td> 아이디 </td>
				<td> <input type="text" name="userid"> </td>
			</tr>
			<tr>
				<td> 비밀번호 </td>
				<td> <input type="password" name="passwd"> </td>
			</tr>		
			<tr>
				<td> 이  름 </td>
				<td> <input type="text" name="name"> </td>
			</tr>	
			<tr>
				<td> 연락처 </td>
				<td> <input type="text" name="tel"> </td>
			</tr>
			<tr>
				<td> 주  소 </td>
				<td> <input type="text" name="address"> </td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="등록"/> </td>
			</tr>					
		</table>	
	</form>

</body>
</html>