<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js" lang="">
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>FOOD BUNCKER | About</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- FAVICONS -->
<link rel="shortcut icon" href="../resources/img/favicon.ico"
	type="image/x-icon">
<link rel="apple-touch-icon"
	href="../resources/img/apple-touch-icon.png">

<!-- FONTS -->
<link
	href='https://fonts.googleapis.com/css?family=Raleway:400,500,600,700'
	rel='stylesheet' type='text/css'>
<link
	href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,400italic,600italic'
	rel='stylesheet' type='text/css'>

<!-- FONT AWESOME -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">

<!-- STYLESHEETS -->
<link rel="stylesheet" href="../resources/css/vendor.css">
<link rel="stylesheet" href="../resources/css/base.css">
<link rel="stylesheet" href="../resources/css/layout.css">
<link rel="stylesheet" href="../resources/css/components.css">
<link rel="stylesheet" href="../resources/css/pages.css">

<!-- MODERNIZR -->
<script src="../resources/js/vendor/modernizr-2.8.3.min.js"></script>
</head>
<body class="about">
	<!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

	<!-- PRELOADER -->
	<div id="preloader">
		<div class="spinner"></div>
	</div>
	<!-- // PRELOADER -->

	<header>
	<div class="container">
		<div class="row">
			<div class="col-xs-12">
				<div class="logo">
					<a href="#"><img src="../resources/img/logo.png" alt="Logo"></a>
				</div>

				<button class="toggle" type="button">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
		</div>
	</div>

	<nav class="sidebar">
	<ul class="list">
		<li><a href="../person/MainWindow.food">Home</a></li>
		<li><a href="../person/About.food">About</a></li>
		<li><a href="../person/Gallery.food">Gallery</a></li>
		<li><a href="../person/Menu.food">Menu</a></li>
		<li><a href="../person/Search.food">Search</a></li>
	</ul>
	<ul class="list social">
		<li><a href="#"><i class="fa fa-facebook"></i></a></li>
		<li><a href="#"><i class="fa fa-twitter"></i></a></li>
		<li><a href="#"><i class="fa fa-envelope"></i></a></li>
	</ul>
	<a href="../chef/LoginForm.food" class="btn btn-default btn-colored">CHEF
		IN</a> </nav> </header>

	<!-- SECTION 1 - HERO TITLE -->
	<c:forEach var="data" items="${MLIST}">
	
	<section class="hero-title"
		style="background-image:url(../image/${data.sname});">
	<div class="container">
		
		<div class="row">
			<h2>${data.name}</h2>
		</div>
	</c:forEach>
		<!-- // .row -->
	</div>
	<!-- // .container --> </section>
	<!-- // SECTION 1 -->

	<!-- SECTION 2 -->
	<section class="space">
	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<div class="imgbox style4">
					<c:forEach var="data" items="${CLIST}">
					<div class="img">
						<img src="../image/${data.sname}"
							alt="About the image">
					</div>
					
					<div class="align">
						<h3>Chef - ${data.chef}</h3>
						<p>${data.imgbody}</p>
					</div>
					</c:forEach>
				</div>
			</div>
			
			<div class="col-md-4">
				<div class="imgbox style4">
					<c:forEach var="data" items="${MLIST}">
					<div class="img">
						<img src="../image/${data.sname}"
							alt="About the image">
					</div>

					<div class="align">
						<h3>Food Truck - ${data.name}</h3>
						<p>${data.imgbody}</p>
					</div>
					</c:forEach>
				</div>
			</div>
			
			<div class="col-md-4">
				<div class="imgbox style4">
					<c:forEach var="data" items="${MMLIST}">
					<div class="img">
						<img src="../image/${data.sname}"
							alt="1895X1000 About the image" height="190px" width="395px">
					</div>

					<div class="align">
						<h3>Main Menu - ${data.mname}</h3>
						<p>${data.body}</p>
					</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!-- // SECTION 2 -->

	<!-- SECTION 3 -->
	<section class="space space-dark">
	<div class="container">
		<div class="row">
			<div class="col-sm-6 col-md-3">
				<div class="countbox">
					<h4>35</h4>
					<p>서울 내 영업장소 수</p>
				</div>
			</div>

			<div class="col-sm-6 col-md-3">
				<div class="countbox">
					<h4>1426</h4>
					<p>총 고객방문 수</p>
				</div>
			</div>

			<div class="col-sm-6 col-md-3">
				<div class="countbox">
					<h4>2789</h4>
					<p>총 메뉴판매 수</p>
				</div>
			</div>

			<div class="col-sm-6 col-md-3">
				<div class="countbox">
					<h4>${KM}</h4>
					<p>총 운행거리</p>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!-- // SECTION 3 -->

	<!-- SECTION 4 -->
	<section class="space">
	<div class="container">
		<div class="row">
			<c:forEach var="data" items="${LIST}" varStatus="st">
			<c:if test="${st.first eq true}">
			<div class="section-headline">
				<h3>${data.tname} MENU</h3>
			</div>
		</div>
		<div class="row">
			</c:if>
			<!-- -----------------------  foreach문으로 반복---------------------------------------- -->
			
			<div class="col-sm-4">
				<figure class="person style3">
				<div class="person-img">
					<img src="../image/${data.sname}"
						alt="300x300 Person's Name">
				</div>
				<figcaption>
				<h4>${data.mname}</h4>
				<p>${data.body}</p>
				<p>${data.price}원</p>
				<a href="#"><i class="fa fa-twitter"></i></a> </figcaption> </figure>
			</div>
			</c:forEach>
			<!-- -----------------------  foreach문으로 끝---------------------------------------- -->

			<!-- -----------------------  위의 foreach문 완성시 삭제해야 할 부분 시작--------------------------------------- 
			<div class="col-sm-4">
				<figure class="person style3">
				<div class="person-img">
					<img src="../resources/img/detailviewmenu2.jpg" alt="Person's Name">
				</div>

				<figcaption>
				<h4>등심스테이크</h4>
				<p>1++등급의 한우 등심을 철판에 구워 소고기 고유의 맛을 간직한 요리</p>
				<p>8,000원</p>
				<a href="#"><i class="fa fa-twitter"></i></a> </figcaption> </figure>
			</div>

			<div class="col-sm-4">
				<figure class="person style3">
				<div class="person-img">
					<img src="../resources/img/detailviewmenu3.jpg" alt="Person's Name">
				</div>

				<figcaption>
				<h4>안심스테이크</h4>
				<p>1++의 한우 안심을 철판에 구워 연하고 부드러운 소고기 요리</p>
				<p>8,000원</p>
				<a href="#"><i class="fa fa-twitter"></i></a> </figcaption> </figure>
			</div>
			-->
			<!-- -----------------------  위의 foreach문 완성시 삭제해야 할 부분 끝--------------------------------------- -->

		</div>
	</div>
	</section>
	<!-- // SECTION 4 -->

	<!-- SECTION 5 -->
	<div class="space space-dark">
		<div class="container">
			<div class="row">
			<c:forEach var="data" items="${LIST2}" varStatus="st">
				<c:if test="${st.first eq true}">
				<div class="section-headline">
					<h3>${data.name} Customer Feedback</h3>
				</div>
			</div>
			<div class="row">
				<div class="col-md-8 col-md-offset-2">
					<div class="owl-carousel testimonials-slider">
				</c:if>
						<!-- ----------------------- foreach문 으로 반복--------------------------------------- -->
						<div>
							<div class="testimonial">
								<p>${data.body}</p>
								<h4>${data.showdate}</h4>
							</div>
						</div>
			</c:forEach>			
						<!-- -----------------------  위의 foreach문 반복 끝--------------------------------------- -->
						<!-- -----------------------  위의 foreach문 완성시 삭제해야 할 부분 시작--------------------------------------- -->
						<!-- 
						<div>
							<div class="testimonial">
								<p>소스안에 대체 뭐가 들어간거지?고급 소고기의 맛을 그대로 나타내주면서 필요 없는 맛은 없애주는...
									알고싶어요.</p>
								<h4>2017년 4월 8일 종로</h4>
							</div>
						</div>
						<div>
							<div class="testimonial">
								<p>가격이 비싸서 하나로 둘이 먹었는데 결국은 하나 더 주문했네요. 먹고 나면 가격이 절대 비싸다는 생각이
									안듭니다.</p>
								<h4>2017년 3월 29일 대학로</h4>
							</div>
						</div>
						 -->
						<!-- -----------------------  위의 foreach문 완성시 삭제해야 할 부분 끝--------------------------------------- -->
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-8 col-md-offset-2">
			<ul class="timeline">
				<!-- timeline time label -->
				<span><input class="btn btn-primary" id="repliesBtn"
					value="더 많이 보기"></span>
			</ul>
		</div>
	</div>
	<!-- // SECTION 5 -->

	<!-- SECTION 6 -->
	<section class="space">
	<div class="container">
		<div class="row">

			<!-- ----------------------- foreach문으로 반복-------------------------------------- -->
			<c:forEach var="data" items="${GLIST}">
			<div class="col-md-6">
				<div class="imgbox style4">
					<div class="img">
						<img src="../image/${data.sname}"
							alt="1895x1000 About the image">
					</div>

					<div class="align">
						<!-- 
						<h3>푸드트럭 옆면사진</h3>
						 -->
						<p>${data.imgbody}</p>
					</div>
				</div>
			</div>
			</c:forEach>
			<!-- -----------------------  위의 foreach문으로 반복 끝--------------------------------------- -->
			<!-- -----------------------  위의 foreach문 완성시 삭제해야 할 부분 시작--------------------------------------- -->
			<!-- 

			<div class="col-md-6">
				<div class="imgbox style4">
					<div class="img">
						<img src="../resources/img/detailviewgallery2.jpg"
							alt="About the image">
					</div>

					<div class="align">
						<h3>둘의 호흡척척</h3>
						<p>2017년 4월 22일 군포시 산본</p>
					</div>
				</div>
			</div>
			 -->
			<!-- -----------------------  위의 foreach문 완성시 삭제해야 할 부분 끝--------------------------------------- -->

		</div>
	</div>
	</section>
	<!-- // SECTION 6 -->

	<footer>
	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				<div class="footer-brand">
					<img src="../resources/img/logo.png" alt="About the image">
				</div>
			</div>
			<div class="col-sm-4">
				<div class="footer-social">
					<ul class="social">
						<li><a href="#"><i class="fa fa-facebook"></i></a></li>
						<li><a href="#"><i class="fa fa-twitter"></i></a></li>
						<li><a href="#"><i class="fa fa-instagram"></i></a></li>
						<li><a href="#"><i class="fa fa-pinterest"></i></a></li>
					</ul>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="footer-copyright">
					<p>© Zawia</p>
				</div>

			</div>
		</div>
	</div>
	</footer>

	<!-- JQUERY / PLUGINS -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script>
		window.jQuery
				|| document
						.write(
								'<script src="../resources/js/vendor/jquery-1.11.3.min.js"><\/script>')
	</script>
	<script src="../resources/js/vendor/bootstrap.min.js"></script>
	<script src="../resources/js/vendor/owl.carousel.min.js"></script>
	<script src="../resources/js/vendor/jquery.magnific-popup.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>

	<!-- MAIN JS FOLDER -->
	<script src="../resources/js/main.js"></script>

	<!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
	<script>
		(
								function(b, o, i, l, e, r) {
									b.GoogleAnalyticsObject = l;
									b[l] || (b[l] = function() {
										(b[l].q = b[l].q || []).push(arguments)
									});
									b[l].l = +new Date;
									e = o.createElement(i);
									r = o.getElementsByTagName(i)[0];
									e.src = 'https://www.google-analytics.com/analytics.js';
									r.parentNode.insertBefore(e, r)
								}(window, document, 'script', 'ga'));
		ga('create', 'UA-XXXXX-X', 'auto');
		ga('send', 'pageview');
	</script>
	<script type="text/x-handlebars-template" id="template">
			<li class="replyLi">
				<i class="fa fa-comments bg-blue"></i>
				<div class="timeline-item">
					<span class="time">
						<i class="fa fa-clock-o"></i>{{regdate}}
					</span>
					<h5>{{place}}</h5>
					<div class="timeline-body"><h5 class="timeline-header">{{text}}</h5></div>
				</div>
			</li>
		</script>
	<script>
		$("#repliesBtn").click(function() {
			var source = $("#template").html();
			var template = Handlebars.compile(source);
			var data = {
				regdate : "2017/04/11",
				place : "신촌",
				text : "고기의 맛이 최고예요. 강추합니다."
			};
			$(".timeline").html(template(data));
		});
	</script>
</body>
</html>
