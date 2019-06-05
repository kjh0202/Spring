<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ include file="../include/header.jsp" %>
<script>
$(function(){
	$("#btnUpdate").click(function() {
		document.form1.action="${path}/member/addupdate.do";
		document.form1.submit();
	});
	
	$("#btnDelete").click(function() {
		if(confirm("삭제하시겠습니까?")) {
		document.form1.action="${path}/member/adddelete.do";
		document.form1.submit();			
		}
	});
});
</script>

<title>Insert title here</title>
</head>
<body>
<%@ include file="../include/menu.jsp" %>
	<h1> 회원 정보</h1>
	<form name="form1" method="post">
		<table border="1" width="400px">
			<tr>
				<td> 아이디 </td>
				<td> <input name="userid" value="${dto.userid}" readonly> </td>
			</tr>
			<tr>
				<td> 비밀번호 </td>
				<td> <input type="password" name="passwd"> </td>
			</tr>
			<tr>
				<td> 이  름 </td>
				<td> <input name="name" value="${dto.name}"> </td>
			</tr>
			<tr>
				<td> 연락처 </td>
				<td> <input name="email" value="${dto.tel}"> </td>
			</tr>
			<tr>
				<td> 주  소 </td>
				<td> <input name="address" value="${dto.address}"> </td>
			</tr>
			<tr>
				<td colspan="2" align="center">
				<input type="button" value="수정" id="btnUpdate">
				<input type="button" value="삭제" id="btnDelete">
				<div style="color:red; ">${message}</div>
				</td> 
			</tr>
		</table>
	
	
	</form>
</body>
</html>