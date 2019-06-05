<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file = "../include/header.jsp" %>
</head>
<body>
<%@ include file = "../include/filemenu.jsp" %>

<!-- 그림, 동영상 등 깨지지 않도록, 반드시 multipart/form.data 해준다 -->
<form method="post" id="form1" action="${path}/upload/uploadForm" enctype="multipart/form-data" target="iframe1">
	<input type="file" name="file">
	<input type="submit" value="업로드">

</form>


<!-- iframe은 프레임 안에 프레임 있는거 -->
<!-- target을 주지 않으면 페이지가 넘어가므로 target을 주어 iframe에 표시함 -->
<iframe name="iframe1"></iframe>
</body>
</html>