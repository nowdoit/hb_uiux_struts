<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Map"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<title>Insert title here</title>
<style>
	.err {
		background: yellow;
	}
</style>
</head>
<body>
	<h1>로그인 페이지</h1>
	<form action="test32.action">
		<% 
			Map<String, List<String>> map = (Map<String, List<String>>)request.getAttribute("FieldErrors");
		%>
		<p>id:<input type="text" name="id" value="${id }">${FieldErrors.id }<span class="err"><%=map.get("id").get(0) %></span></p>
		<p>pw:<input type="text" name="pw" value="${pw }">${FieldErrors.pw }<span class="err"><%=map.get("pw").get(0) %></span></p>
		<p>
			<button type="submit">LOGIN</button>
			<button type="reset">RESET</button>
		</p>
	</form>
</body>
</html>