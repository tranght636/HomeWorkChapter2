<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Kết quả</h1>
	${ketQua} <br/>
	<input type="button" value="Back" onclick="javascript:history.back()">
	<input type="button" value="Close" onclick="return window.close()">
</body>
</html>