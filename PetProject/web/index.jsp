<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>首页</title>
</head>
<body>
	<%@ include file="head.jsp" %>
	<!-- 主页 -->
	<!--
            	描述：轮播条
            -->
 		<div class="container-fluid">
				<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
						<li data-target="#carousel-example-generic" data-slide-to="1"></li>
						<li data-target="#carousel-example-generic" data-slide-to="2"></li>
					</ol>

					<!-- Wrapper for slides -->
					<div class="carousel-inner" role="listbox">
						<div class="item active">
							<img src="img/index06.jpg" style="width: 100%;height: 360px;">
							<div class="carousel-caption">

							</div>
						</div>
						<div class="item" >
							<img src="img/index02.jpg" style="width: 100%;height: 360px;">
							<div class="carousel-caption">

							</div>
						</div>
						<div class="item">
							<img src="img/index01.jpg" style="width: 100%;height: 360px;">
							<div class="carousel-caption">

							</div>
						</div>
					</div>

					<!-- Controls -->
					<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
						<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a>
					<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
						<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
				</div>
			</div>
			
			
			<!--
            	描述：商品显示
            -->
			<div class="container-fluid">
				<div class="col-md-12">
					<div style="margin:10px 0 10px 0;">欢迎惠顾宠物商城，和你的它，来一次缘分的邂逅吧！！</a> </div>
				</div>
				<div class="col-md-12">
					<h2>最新商品&nbsp;&nbsp;<img src="img/title.jpg"/></h2>
				</div>
				<div class="col-md-2" style="border:1px solid #E7E7E7;border-right:0;padding:0;">
					<img src="img/cwg0005.jpg" width="205" height="380" style="display: inline-block;"/>
				</div>
				<div class="col-md-10">
					
					
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="#">
							<img src="img/dog1.jpg" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="#" style='color:#666'>吉娃娃</a></p>
						<p><font color="#E4393C" style="font-size:16px">&yen;1299.00</font></p>
					</div>
					
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="#">
							<img src="img/dog2.jpg" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="product_info.html" style='color:#666'>哈士奇</a></p>
						<p><font color="#E4393C" style="font-size:16px">&yen;1299.00</font></p>
					</div>
					
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="#">
							<img src="img/cat1.jpg" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="#" style='color:#666'>哈士奇</a></p>
						<p><font color="#E4393C" style="font-size:16px">&yen;1299.00</font></p>
					</div>
				
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="#">
							<img src="img/cwg00001.jpg" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="#" style='color:#666'>柴犬</a></p>
						<p><font color="#E4393C" style="font-size:16px">&yen;1299.00</font></p>
					</div>
	
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="#">
							<img src="img/cwg0002.jpg" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="#" style='color:#666'>黑背</a></p>
						<p><font color="#E4393C" style="font-size:16px">&yen;2299.00</font></p>
					</div>

					<div class="col-md-2 yes-right-border" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="#">
							<img src="img/cwg0003.jpg" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="#" style='color:#666'>柯基</a></p>
						<p><font color="#E4393C" style="font-size:16px">&yen;299.00</font></p>
					</div>
					
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="#">
							<img src="img/cwm0004.jpg" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="#" style='color:#666'>美国短毛猫</a></p>
						<p><font color="#E4393C" style="font-size:16px">&yen;11299.00</font></p>
					</div>
	
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="#">
							<img src="img/cwm0002.jpg" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="#" style='color:#666'>金渐层幼猫</a></p>
						<p><font color="#E4393C" style="font-size:16px">&yen;2299.00</font></p>
					</div>

					<div class="col-md-2 yes-right-border" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="#">
							<img src="img/cwm0003.jpg" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="#" style='color:#666'>俄罗斯蓝猫</a></p>
						<p><font color="#E4393C" style="font-size:16px">&yen;99.00</font></p>
					</div>
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="#">
							<img src="img/cwt0001.jpg" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="#" style='color:#666'>大流士兔</a></p>
						<p><font color="#E4393C" style="font-size:16px">&yen;1111.00</font></p>
					</div>
	
					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="#">
							<img src="img/cwt0002.jpg" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="#" style='color:#666'>喜马拉雅巨兔</a></p>
						<p><font color="#E4393C" style="font-size:16px">&yen;2299.00</font></p>
					</div>

					<div class="col-md-2" style="text-align:center;height:200px;padding:10px 0px;">
						<a href="#">
							<img src="img/cwt0003.jpg" width="130" height="130" style="display: inline-block;">
						</a>
						<p><a href="#" style='color:#666'>道奇猫猫兔</a></p>
						<p><font color="#E4393C" style="font-size:16px">&yen;299.00</font></p>
					</div>
					

				</div>
				<div class="col-md-12">
					  <h2>萌宠乐园&nbsp;&nbsp;</h2>
				  </div>
				</div>
				<div class="col-md-12">
					<img src="img/b2.jpg" style="width: 100%;height: 320px;">
				    </div>
					
			</div>
	<%@ include file="tail.jsp" %>
</body>
</html>

<script>



</script>