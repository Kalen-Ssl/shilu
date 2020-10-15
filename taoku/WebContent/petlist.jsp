<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!doctype html>
<html>

	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>宠物<%
			String sort = request.getParameter("sort");
			if (sort.equals("dog")){
				out.print("狗");
			} else if (sort.equals("cat")){
				out.print("猫");
			}
		%>列表</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
		<script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
		<!-- 引入自定义css文件 style.css -->
		<link rel="stylesheet" href="css/style.css" type="text/css" />

		<style>
			body {
				margin-top: 20px;
				margin: 0 auto;
				width: 100%;
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
		<div>
			<ul class="breadcrumb">
				<li><a href="index.jsp">首页</a></li>
				<li><a href="#">宠物<%
					//String sort = request.getParameter("sort");
					if (sort.equals("dog")){
						out.print("狗");
					} else if (sort.equals("cat")){
						out.print("猫");
					}
				%></a></li>
			</ul>
		</div>

		<div class="row">
			<!-- 循环产生所有的宠物 -->
			<c:forEach items="${pets }" var="pet">
				<div class="col-md-2">
					<a href="PetAbout?cmd=detail&sort=${pet.sort }&id=${pet.id }">
						<img src="products/1/${pet.picture }.jpg" width="170" height="170" style="display: inline-block;">
					</a>
					<p>${pet.name }</p>
					<p color="#FF0000">价格：&yen;${pet.price }</p>
				</div>
			</c:forEach>
		</div>
			
		
		<div class="row">
			<!--分页 -->
			<div style="width:380px;margin:0 auto;margin-top:50px;">
				<ul class="pagination" style="text-align:center; margin-top:10px;">
					<li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">&laquo;</span></a></li>
					<li class="active"><a href="#">1</a></li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">6</a></li>
					<li>
						<a href="#" aria-label="Next">
							<span aria-hidden="true">&raquo;</span>
						</a>
					</li>
				</ul>
			</div>
			<!-- 分页结束=======================        -->
		</div>

		


		<%@ include file="tail.jsp" %>
	</body>

</html>