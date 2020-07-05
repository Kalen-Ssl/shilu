<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>购买历史记录</title>
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
<body>

<%@ include file="head.jsp" %>

	<div class="container">
			<div class="row">

				<div style="margin:0 auto; margin-top:10px;width:950px;">
					<strong style="font-size:16px;margin:5px 0;">历史记录</strong>
					<table class="table table-bordered table-hover">
						<tbody>
							<tr class="warning">
								<th>图片</th>
								<th>名称</th>
								<th>品种</th>
								<th>价格</th>
								<th>购买时间</th>
							</tr>
							<!-- 循环产生所有的宠物 -->
							<c:forEach items="${records }" var="record">
								<tr>
									<td width="60" width="40%">
										<input type="hidden" name="id" value="22">
										<img src="${record.picture }" width="70" height="60">
									</td>
									<td width="20%">${record.name }</td>
									<td width="20%"><span>${record.breed }</span></td>
									<td width="20%">￥<span name="price">${record.price }</span></td>
	
									<td width="20%"><span>${record.time }</span></td>
								</tr>
							</c:forEach>
								
						</tbody>
					</table>
				</div>
			</div>



		</div>
	<%@ include file="tail.jsp" %>
	</body>

</html>
	
<script>


</script>