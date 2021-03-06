﻿<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>用户注册</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
		<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
		<!-- 引入自定义css文件 style.css -->
		<link rel="stylesheet" href="css/style.css" type="text/css"/>
    </head>
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
	    color: #3164af;
	    font-size: 18px;
	    font-weight: normal;
	    padding: 0 10px;
	}
 </style>
</head>
<body>

<%@ include file="head.jsp" %>



<div class="container" style="width:100%;background:url('image/13.jpg');">
<div class="row"> 

	<div class="col-md-2"></div>

	<div class="col-md-8" style="background:#fff;padding:40px 80px;margin:30px;border:7px solid #ccc;">
		<font>会员注册</font>USER REGISTER
		<form class="form-horizontal" style="margin-top:5px;" action="UserAbout?cmd=register" method="post" onsubmit = "return checkForm()">
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
			      <input type="password" class="form-control" name="passwd" id="inputPassword3" placeholder="请输入密码">
			    </div>
			    <label id="passwordError" class="error"></label>
			  </div>
			   <div class="form-group">
			    <label for="confirmpwd" class="col-sm-2 control-label">确认密码</label>
			    <div class="col-sm-6">
			      <input type="password" class="form-control" id="confirmpwd" placeholder="请再次确认密码">			     
			    </div>
			    <label id="confirmError" class="error"></label>
			  </div>
			  
			  <div class="form-group">
			    <label for="Phone" class="col-sm-2 control-label">手机号</label>
			    <div class="col-sm-6">
			      <input type="phonenum" class="form-control" name = "phone" id="Phone" placeholder="请输入手机号">
			    </div>
			    <label id="phoneError" class="error"></label>
			  </div>
			  
			  
			  <div class="form-group">
			    <label for="inputEmail3" class="col-sm-2 control-label">Email</label>
			    <div class="col-sm-6">
			      <input type="email" class="form-control" name="email" id="inputEmail3" placeholder="Email">			      
			    </div>
			    <label id="emailError" class="error"></label>
			  </div>

			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <input type="submit"  width="100" value="注册" name="submit" border="0"
				    style="background: url('./images/register.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0);
				    height:35px;width:100px;color:white;">
			    </div>
			  </div>
			</form>
	</div>
	
	<div class="col-md-2"></div>
  
</div>
</div>



<%@ include file="tail.jsp" %>

</body></html>

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

		//确认密码
		document.getElementById("confirmError").innerHTML = "";
		var confirm = document.getElementById("confirmpwd").value;
		if (confirm != passwd)
		{
			document.getElementById("confirmError").innerHTML = "两次输入不一致！";
			return false;
		}
		
		//手机号码
		document.getElementById("phoneError").innerHTML = "";
		var phone = document.getElementById("Phone").value;
		var phoneExp = /^1[3456789]\d{9}$/;
		if (!phoneExp.test(phone))
		{
			document.getElementById("phoneError").innerHTML = "请正确输入手机号码！";
			return false;
		}
		
		//邮箱
		document.getElementById("emailError").innerHTML = "";
		var email = document.getElementById("inputEmail3").value;
		var emailExp = /^\w+@\w{2,5}[.]\w{2,5}$/;
		if (!emailExp.test(email))
		{
			document.getElementById("emailError").innerHTML = "请正确输入邮箱！";
			return false;
		}
		
		return true;
	}
</script>




