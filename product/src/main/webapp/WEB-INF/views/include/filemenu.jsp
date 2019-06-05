<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<%@ include file="header.jsp" %>
<style type="text/css">
	a{text-decoration: none;}
	a:visited {color: blue;}
	a:hover {color: red;}
</style>
</head>
<body>
	<div align="center">
		<a href="${path}/upload/uploadForm" >파일 업로드</a>&nbsp;&nbsp;
		<a href="${path}/shop/product/list.do" >상품 목록</a>
	</div>
	<hr><br>
</body>
</html>