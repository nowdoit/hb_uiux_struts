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
</head>
<body>
	<h1>로그인 페이지</h1>
	<form action="test22.action">
	<%-- 
		<p>id:<input type="text" name="bean.id" value="${bean.id }"></p>
		<p>pw:<input type="text" name="bean.pw"></p>
	--%>
	    <%-- struts.xml 에서 interceptor-ref name="prepare" 사용하면 bean을 안써도 됨 --%>
		<p>id:<input type="text" name="id" value="${bean.id }"></p>
		<p>pw:<input type="text" name="pw"></p>
		<p>
			<button type="submit">LOGIN</button>
			<button type="reset">RESET</button>
		</p>
	</form>
</body>
</html>