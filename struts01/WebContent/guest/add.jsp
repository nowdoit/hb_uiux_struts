<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</head>
<body>
	<h1>입력페이지</h1>
	<form action="insert.action">
	<table>
		<tr>
			<td>사번</td>
			<td><input type="text" name="sabun">${fieldErrors.sabun }</td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>금액</td>
			<td><input type="text" name="pay"></td>
		</tr>
		<tr>
			<td colspan="2">
				<button type="submit">전 송</button>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>