<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ page import="java.net.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
	<script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<!-- 引入自定义css文件 style.css -->
	<link rel="stylesheet" href="css/style.css" type="text/css" />
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
	 
	 .error{
			color: red;
		}
	 
	font {
	    color: #3164af;
	    font-size: 18px;
	    font-weight: normal;
	    padding: 0 10px;
	}
 </style>
<!-- 头部 -->
<body>
	<!-- 描述：菜单栏   -->
	<div class="container-fluid">
		<div >
			<img src="img/页面上标.png" width = 100% />
		</div>
		<div class="col-md-3" style="padding-top:20px">
			<ol class="list-inline">
				<li><a href="login.jsp" id="login">登录</a></li>
				<li><a href="register.jsp" id="register">注册</a></li>
				<li id="user"></li>
				<li><a href="UserAbout?cmd=logout" id="logout"></a></li>
				<li><a href="#" id="cart"></a></li>
			</ol>
		</div>
	</div>
	
	<!-- 描述：导航条 -->
	<div class="container-fluid">
		<nav class="navbar navbar-inverse">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="index.jsp">首页</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li><a href="PetAbout?cmd=list&sort=dog">宠物狗<span class="sr-only">(current)</span></a></li>
						<li><a href="PetAbout?cmd=list&sort=cat">宠物猫</a></li>
						<li><a href="#">宠物兔</a></li>
						<li><a href="#">宠物仓鼠</a></li>
					</ul>
					<form class="navbar-form navbar-right" role="search">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search">
						</div>
						<button type="submit" class="btn btn-default">Submit</button>
					</form>

				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
		</nav>
	</div>

</body>
</html>

<script>
	//检查cookie
	function checkUserStat(){
		
		var name = "<%
		   Cookie cookie = null;
		   Cookie[] cookies = null;
		   // 获取 cookies 的数据,是一个数组
		   cookies = request.getCookies();
		   if( cookies != null ){
			   
		      for (int i = 0; i < cookies.length; i++){
		         cookie = cookies[i];
		         if (cookie.getName().equals("uname")){
		        	 break;
		         }
		      }
		      
		      out.print(URLDecoder.decode(cookie.getValue(), "utf-8"));
		  }
		%>";
		if ("null" != name){
			document.getElementById("login").innerHTML = "";
			document.getElementById("register").innerHTML = "";
			document.getElementById("user").innerHTML = "欢迎您 " + name;
			document.getElementById("logout").innerHTML = "退出登陆";
			document.getElementById("cart").innerHTML = "购物车";
		}

	}
	checkUserStat();
	
</script>