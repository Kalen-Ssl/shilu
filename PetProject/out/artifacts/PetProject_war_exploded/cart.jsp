<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>购物车</title>
	<meta charset="utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
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
	 </style>
</head>
<body background="img/bk.jpg">

<%@ include file="head.jsp" %>

	<div class="container">
			<div class="row">

				<div style="margin:0 auto; margin-top:10px;width:950px;">
					<strong style="font-size:16px;margin:5px 0;">订单详情</strong>
					<table class="table table-bordered">
						<tbody>
							<tr bgcolor="#FFC0CB">
								<th>图片</th>
								<th>名称</th>
								<th>价格</th>
								<th>操作</th>
							</tr>
							<!-- 循环产生所有的宠物 -->
							<c:forEach items="${pets }" var="pet">
								<tr bgcolor="#FFE4E1">
									<td width="60" width="40%">
										<input type="hidden" name="id" value="22">
										<img src="${pet.picture }" width="70" height="60">
									</td>
									<td width="30%">${pet.name }</td>
									<td width="30%">￥<span name="price">${pet.price }</span></td>
	
									<td>
										<a href="UserAbout?cmd=removeOne&pid=${pet.id }" class="delete">删除</a>
									</td>
								</tr>
							</c:forEach>
								
						</tbody>
					</table>
				</div>
			</div>

			<div style="margin-right:130px;">
				<div style="text-align:right;">
					 合计: <strong style="color:#ff6600;" id="count"></strong>
				</div>
				<div style="text-align:right;margin-top:10px;margin-bottom:10px;">
					<a href="UserAbout?cmd=removeAll" id="clear" class="clear">清空购物车</a>
					<a href="UserAbout?cmd=buybuybuy">
						<input onclick="return checkEmpty()" type=button width="100" value="购买" name="submit" border="0" style="background: url('./images/register.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0);
						height:35px;width:100px;color:white;">
					</a>
				</div>
			</div>

		</div>

	<%@ include file="tail.jsp" %>
	</body>

</html>
	
<script>
//获取购物车列表中每个宠物的价格，计算总价
function figureCount(){
	
	var pets = document.getElementsByName("price");
	var sum = 0;//总价
	for (var i = 0; i < pets.length; ++i){
		sum += Number(pets[i].innerHTML);
		console.log(pets[i].innerHTML);
	}
	//alert(sum);
	document.getElementById("count").innerHTML = "￥" + sum;
}

//点击购买按钮是先计算一下购物车是否为空
function checkEmpty(){
	var pets = document.getElementsByName("price");
	if (0 == pets.length){
		alert("购物车竟然是空的，再忙，也要记得买点什么犒劳自己~");
		return false;
	}
	return true;
}
figureCount();

</script>