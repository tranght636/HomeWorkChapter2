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
	<h1>Home work chapter 2</h1>
	<a href='<c:url value="/lab1"/>'>Lab 1</a><br/>
	<a href='<c:url value="/lab2"/>'>Lab 2</a><br/>
	<a href='<c:url value="/lab3?action=mua_hang"/>'>Lab 3</a><br/>
	<a href='<c:url value="/lab4"/>'>Lab 4</a><br/>
	<a href='<c:url value="/lab1?action=pheptoan"/>'>Lab 5</a>
</body>
</html>