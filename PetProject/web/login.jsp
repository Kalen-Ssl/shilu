<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>会员登录</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
	<script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<!-- 引入自定义css文件 style.css -->
	<link rel="stylesheet" href="css/style.css" type="text/css"/>

	<style>
	  body{
	   margin-top:20px;
	   margin:0 auto;
	 }
	 .carousel-inner .item img{
		 width:100%;
		 height:300px;
	 }
	 .container .row div{ 
		 /* position:relative;
		 float:left; */
	 }
	 
	font {
	    color: #666;
	    font-size: 22px;
	    font-weight: normal;
	    padding-right:17px;
	}
		.error{
			color: red;
		}
	</style>
</head>
<body>
	<%@ include file="head.jsp" %>
	
	
	<div class="container"  style="width:100%;height:460px;background:#99FFFF url('images/12.png') no-repeat;">
	<div class="row"> 
		<div class="col-md-7">
			<!--<img src="./image/login.jpg" width="500" height="330" alt="会员登录" title="会员登录">-->
		</div>
		
		<div class="col-md-5">
					<div style="width:440px;border:1px solid #E7E7E7;padding:20px 0 20px 30px;border-radius:5px;margin-top:60px;background:#fff;">
					<font>会员登录</font>USER LOGIN
	
					<div>&nbsp;</div>	  
	<form class="form-horizontal" action="UserAbout?cmd=login" method="post" onsubmit = "return checkForm()">
	  
	 <div class="form-group">
	    <label for="username" class="col-sm-2 control-label">用户名</label>
	    <div class="col-sm-6">
	      <input type="text" class="form-control" name="name" id="username" placeholder="请输入用户名">
	    </div>
	    <label id="nameError" class="error"></label>
	  </div>
	   <div class="form-group">
	    <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
	    <div class="col-sm-6">
	      <input type="password" class="form-control"  name="passwd" id="inputPassword3" placeholder="请输入密码">
	    </div>
	    <label id="passwordError" class="error"></label>
	  </div>
	  <div class="form-group">
	    <div class="col-sm-offset-2 col-sm-10">
	    <input type="submit"  width="100" value="登录" name="submit" border="0"
	    style="background: url('./images/login.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0);
	    height:35px;width:100px;color:white;">
	    </div>
	  </div>
	</form>
	</div>			
		</div>
	</div>
	</div>


	<%@ include file="tail.jsp" %>
</body>
</html>

<script>
	//检查表单有效性
	function checkForm(){	
		//用户
		document.getElementById("nameError").innerHTML = "";
		var username = document.getElementById("username").value;
		if (!username)
		{
			document.getElementById("nameError").innerHTML = "请正确输入用户名！";
			return false;
		}
		
		//密码
		document.getElementById("passwordError").innerHTML = "";
		var passwd = document.getElementById("inputPassword3").value;
		if (!passwd)
		{
			document.getElementById("passwordError").innerHTML = "请正确输入密码！";
			return false;
		}

		return true;
	}
	
	
</script>