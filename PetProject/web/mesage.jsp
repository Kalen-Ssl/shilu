<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>消息提示</title>
</head>
<body>
	<%@ include file="head.jsp" %>
	<!-- 提示信息 -->
	<br/>
	<center><h1>${mesage }</h1></center>
	<br/>
	<%@ include file="tail.jsp" %>
</body>
</html>

<script>

var time = 0;

function jump(){
	time++;
	if (time >= 2){
		window.location.href='index.jsp';
		return;
	}
	setTimeout("jump()", 2000);
}
jump();

</script>