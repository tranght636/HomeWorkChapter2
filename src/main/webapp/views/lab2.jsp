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
</head>
<body>

	<h1>Sample of adding 2 big size numbers</h1>
	<div style="width: 400px; margin-left: 30px;">
		<div class="form-group row">
			<label for="toan-hang-1" class="col-sm-5 col-form-label">Toán
				hạng thứ nhất</label>
			<div class="col-sm-7">
				<input type="number" id="toan-hang-1" class="form-control"
					name="toanHang1">
			</div>
		</div>
		<div class="form-group row">
			<label for="toan-hang-2" class="col-sm-5 col-form-label">Toán
				hạng thứ hai</label>
			<div class="col-sm-7">
				<input type="number" id="toan-hang-2" class="form-control"
					name="toanHang2">
			</div>
		</div>
		<div class="form-group row">
			<div class="col-sm-5 col-form-label"></div>
			<div class="col-sm-7">
				<button type="submit" class="btn btn-primary">Add</button>
			</div>
		</div>
		<div class="form-group row">
			<label for="ket-qua" class="col-sm-5 col-form-label">Kết quả</label>
			<div class="col-sm-7">
				<input type="number" id="ket-qua" class="form-control">
			</div>
		</div>
	</div>

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
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script type="text/javascript" src="<c:url value='/js/custom.js'/>"></script>
</body>
</html>