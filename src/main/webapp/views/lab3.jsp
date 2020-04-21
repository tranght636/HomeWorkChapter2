<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style>
table, td, th {
	border: 1px solid black;
}

#table {
	border-collapse: separate;
}
</style>
</head>
<body>
		<h1>Mua hàng online:</h1>
		<h4>Giỏ hàng: <input id="soLuongMua" readonly value='${soLuongMua}'></input></h4>
		<table id="table">
			<tr>
				<th>STT</th>
				<th>Tên Hàng</th>
				<th>Giá</th>
				<th>Số Lượng</th>
				<th>Mua</th>
			</tr>
			<!-- <script language="javascript">
				var i = 0;
			</script> -->
			<c:forEach var="mh" items="${MatHang.entrySet()}">
				<tr>
					<td class="stt" value="${mh.getValue().stt}">${mh.getValue().stt}</td>
					<td>${mh.getValue().tenHang}</td>
					<td>${mh.getValue().gia}</td>
					<td><input class="soLuong" type="number" value="${mh.getValue().soLuong}"> </td>
					<td><button class ="btnMua" type="button" listHang="${MatHang}">Mua</button></td>
				</tr>
			</c:forEach>
		</table>
		<button id="btn-dat-hang">Thanh Toán</button>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<script type="text/javascript"
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script type="text/javascript" src="<c:url value='/js/custom.js'/>"></script>
</body>
</html>