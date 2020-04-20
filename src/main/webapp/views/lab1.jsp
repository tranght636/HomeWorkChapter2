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
	<form action="/lap1?action=ketqua" method="post">
		<h1>Calculator</h1>
		<div class="form-group ">
			<label for="ToanHang1">Toán hạng thứ nhất</label> 
			<input type="number" id="ToanHang1" name="ToanHang1">
		</div>

		<div class="form-group ">
			<label for="PhepToan">Phép toán</label> <select name="PhepToan">
				<option value="cong">Cộng</option>
				<option value="tru">Trừ</option>
				<option value="nhan">Nhân</option>
				<option value="chia">Chia</option>
			</select>
		</div>
		<div class="form-group ">
			<label for="ToanHang2">Toán hạng thứ hai</label> 
			<input type="number" id="ToanHang2" name="ToanHang2">
		</div>
		<button type="submit">Tính toán</button>
	</form>
</body>
</html>