<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!doctype html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>详细信息</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
		<script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
		<!-- 引入自定义css文件 style.css -->
		<link rel="stylesheet" href="css/style.css" type="text/css" />

		<style>
			body {
				margin-top: 20px;
				margin: 0 auto;
			}
			
			.carousel-inner .item img {
				width: 100%;
				height: 300px;
			}
		</style>
	</head>

	<body>
	<%@ include file="head.jsp" %>
		



		<div class="container">
			<div style="width:950px;margin:0 auto;">
				<ul class="breadcrumb">
					<li><a href="index.jsp">首页</a></li>
					<li><a href="PetAbout?cmd=list&sort=<%
						String sort = request.getParameter("sort");
						out.print(sort);%>">宠物<%
						//String sort = request.getParameter("sort");
						if (sort.equals("dog")){
							out.print("狗");
						} else if (sort.equals("cat")){
							out.print("猫");
						} else if (sort.equals("rabbit")){
							out.print("兔");
						} else if (sort.equals("mouse")){
							out.print("仓鼠");
						}
					%></a></li>
					<li>${pet.name }</li>
				</ul>
			</div>

				<div style="margin:0 auto;width:950px;">
					<div class="col-md-6">
						<img style="opacity: 1;width:400px;height:350px;" title="" class="medium" src="${pet.picture }">
					</div>

					<div class="col-md-6">
						<div><strong>宠物品种：${pet.breed }</strong></div>
						<div style="border-bottom: 1px dotted #dddddd;width:350px;margin:10px 0 10px 0;">
							<div>编号：${pet.id }</div>
						</div>

						<div style="margin:10px 0 10px 0;">宠物价格: <strong style="color:#ef0101;">￥：${pet.price }</strong> 
						</div>

						<div style="margin:10px 0 10px 0;">宠物名字:&emsp;${pet.name }</div>
						<div style="margin:10px 0 10px 0;">备注:&emsp;${pet.describe }</div>

						<div style="padding:10px;border:1px solid #e7dbb1;width:330px;margin:15px 0 10px 0;;background-color: #fffee6;">

							欢迎加入购物车购买：
							<div style="margin:20px 0 10px 0;;text-align: center;">
								<a href="UserAbout?cmd=addPetToCart&pid=${pet.id }">
									<input style="background: url('./images/product.gif') no-repeat scroll 0 -600px rgba(0, 0, 0, 0);height:36px;width:127px;" value="加入购物车" type="button">
								</a></div>
						</div>
						
					</div>
				</div>
				<div class="clear"></div>
				<div style="width:950px;margin:0 auto;">
					<div style="background-color:#F5F5F5;width:930px;padding:10px 10px;margin:10px 0 10px 0;">想要购买的话可以加入购物车哦~</div>
				

			
		</div>



<%@ include file="tail.jsp" %>
	</body>

</html>