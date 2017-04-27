<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js" lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>FOOD BUNCKER  | About</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- FAVICONS -->
        <link rel="shortcut icon" href="../resources/img/favicon.ico" type="image/x-icon">
        <link rel="apple-touch-icon" href="../resources/img/apple-touch-icon.png">

        <!-- FONTS -->
        <link href='https://fonts.googleapis.com/css?family=Raleway:400,500,600,700' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,400italic,600italic' rel='stylesheet' type='text/css'>
        
        <!-- FONT AWESOME -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">

        <!-- STYLESHEETS -->
        <link rel="stylesheet" href="../resources/css/vendor.css">
        <link rel="stylesheet" href="../resources/css/base.css">
        <link rel="stylesheet" href="../resources/css/layout.css">
        <link rel="stylesheet" href="../resources/css/components.css">
        <link rel="stylesheet" href="../resources/css/pages.css">

		<!--calendar css-->
		
        <link href="../resources/assets/plugins/fullcalendar/dist/fullcalendar.css" rel="stylesheet" />     
        <link href="../resources/assets/css/core.css" rel="stylesheet" type="text/css" />      
        <link href="../resources/assets/css/pages.css" rel="stylesheet" type="text/css" />
		<link href="../resources/assets/plugins/select2/dist/css/select2.css" rel="stylesheet" type="text/css" />		
		
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
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
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
                <a href="../chef/LoginForm.food" class="btn btn-default btn-colored">CHEF IN</a>
            </nav>
        </header>

        <!-- SECTION 1 - HERO TITLE -->
        <section class="hero-title" style="background-image:url(../resources/img/abouthead.jpg);">
            <div class="container">
                <div class="row">
                    <h2>SEARCH FOOD TRUCK</h2>
                </div><!-- // .row -->
            </div><!-- // .container -->
        </section>
        <!-- // SECTION 1 -->

        <!-- SECTION 2 -->
        
<!-- ------------------지도 위에 당일 푸트트럭 위치 표시--------------------------------------------- -->        
        <section class="space">
            <div class="container">
				<div class="row">
					<div class="section-headline">
                        <h3>지도에서 위치 찾기</h3>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="imgbox style4">
                            <div class="img">
                                <img src="../resources/img/aboutmap.jpg" alt="1895x1000 About the image">
                            </div>
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
					<div class="section-headline">
                        <h3>일자별 위치 찾기</h3>
                    </div>
					<div class="table table-bordered">
                </div>
            </div>
			<div class="col-lg-12">
                        <div class="card-box">
                            <table class="table table table-hover m-0">
                                <thead>
									<tr>
<!----------------------------------------------당일부터 일주일간 표시--------------------------------------------------- -->
										<td colspan="8">2017년 4월 24일 - 2017년 4월 30일</td>
									</tr>
                                    <tr>
                                        <th></th>
                                        <th>24일(월)</th>
                                        <th>25일(화)</th>
                                        <th>26일(수)</th>
										<th>26일(목)</th>
										<th>26일(금)</th>
										<th>26일(토)</th>
										<th>26일(일)</th>
                                    </tr>
                                </thead>
                                <tbody>
                                
<!-- -----------------------   foreach문 사용하여  반복--------------------------------------- --> 	                                
                                    <tr>
                                        <th scope="row">truck1</th>
                                        <td>구로1동</td>
                                        <td>종로 신영동</td>
                                        <td>대학로</td>
										<td>구로1동</td>
                                        <td>종로 신영동</td>
                                        <td>대학로</td>
										<td>대학로</td>
                                    </tr>
                                    
<!-- -----------------------   foreach문 사용하여  반복 끝--------------------------------------- --> 

<!-- -----------------------   위의 foreach문 완성시 삭제 부분 시작--------------------------------------- --> 		                                    
                                    <tr>
                                        <th scope="row">truck2</th>
                                        <td>구로1동</td>
                                        <td>종로 신영동</td>
                                        <td>대학로</td>
										<td>구로1동</td>
                                        <td>종로 신영동</td>
                                        <td>대학로</td>
										<td>대학로</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">truck3</th>
                                        <td>구로1동</td>
                                        <td>종로 신영동</td>
                                        <td>대학로</td>
										<td>구로1동</td>
                                        <td>종로 신영동</td>
                                        <td>대학로</td>
										<td>대학로</td>
                                    </tr>
									<tr>
                                        <th scope="row">truck4</th>
                                       <td>구로1동</td>
                                        <td>종로 신영동</td>
                                        <td>대학로</td>
										<td>구로1동</td>
                                        <td>종로 신영동</td>
                                        <td>대학로</td>
										<td>대학로</td>
                                    </tr>
									<tr>
                                        <th scope="row">truck5</th>
                                       <td>구로1동</td>
                                        <td>종로 신영동</td>
                                        <td>대학로</td>
										<td>구로1동</td>
                                        <td>종로 신영동</td>
                                        <td>대학로</td>
										<td>대학로</td>
                                    </tr>
									<tr>
                                        <th scope="row">truck6</th>
                                       <td>구로1동</td>
                                        <td>종로 신영동</td>
                                        <td>대학로</td>
										<td>구로1동</td>
                                        <td>종로 신영동</td>
                                        <td>대학로</td>
										<td>대학로</td>
                                    </tr>
									<tr>
                                        <th scope="row">truck7</th>
                                        <td>구로1동</td>
                                        <td>종로 신영동</td>
                                        <td>대학로</td>
										<td>구로1동</td>
                                        <td>종로 신영동</td>
                                        <td>대학로</td>
										<td>대학로</td>
                                    </tr>
									<tr>
                                        <th scope="row">truck8</th>
                                        <td>구로1동</td>
                                        <td>종로 신영동</td>
                                        <td>대학로</td>
										<td>구로1동</td>
                                        <td>종로 신영동</td>
                                        <td>대학로</td>
										<td>대학로</td>
                                    </tr>
<!-- -----------------------   foreach문 사용하여 1단 끝--------------------------------------- --> 	                                    
                                    
                                </tbody>
                            </table>

                        </div>
                    </div><!-- end col -->
        </section>
        <!-- // SECTION 3 -->

        <!-- SECTION 4 -->
        <section class="container">
            <div class="container">
                <div class="row">
                    <div class="section-headline">
                        <h3>FOOD TRUCK 별 위치 검색</h3>
                        <form class="form-horizontal" role="form" id="frm" action="">
							<div class="form-group">
								<div class="col-md-10">
									<input type="text" class="form-control" value="검색어를 입력해 주세요.">
									<input type="submit" class="btn btn-primary" value="검색">
								</div>
							</div>
						</form> 
                    </div>
                </div>
            </div>
			<div class="col-md-12">
				<div class="card-box">
				  <div id="calendar"></div>
                </div>
            </div> <!-- end col -->
        </section>
        <!-- // SECTION 4 -->       
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
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="../resources/js/vendor/jquery-1.11.3.min.js"><\/script>')</script>
        <script src="../resources/js/vendor/bootstrap.min.js"></script>
        <script src="../resources/js/vendor/owl.carousel.min.js"></script>
        <script src="../resources/js/vendor/jquery.magnific-popup.min.js"></script>

        <!-- MAIN JS FOLDER -->
        <script src="../resources/js/main.js"></script>

		<!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
        <script>
            (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=
            function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;
            e=o.createElement(i);r=o.getElementsByTagName(i)[0];
            e.src='https://www.google-analytics.com/analytics.js';
            r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));
            ga('create','UA-XXXXX-X','auto');ga('send','pageview');
        </script>
       
		<!-- BEGIN PAGE SCRIPTS -->
		<script src="../resources/assets/plugins/jquery-ui/jquery-ui.min.js"></script>
        <script src="../resources/assets/plugins/moment/moment.js"></script> 
        <script src='../resources/assets/plugins/fullcalendar/dist/fullcalendar.min.js'></script>
		<!-- 달력내 일정 입력 jquery -->
        <script src="../resources/assets/pages/jquery.fullcalendar.js"></script> 
		<script>
		$(document).ready(function(){
			var events = [{
					title: '대학로',
					start: '2017-04-25',
					className: 'bg-danger'
					}, {
					title: '대학로',
					start:'2017-04-26',				
					className: 'bg-danger'
					}, {
					title: '대학로',
					start:'2017-04-27',				
					className: 'bg-danger'
					}, {
					title: '대학로',
					start:'2017-04-28',				
					className: 'bg-danger'
					}, {
					title: '대학로',
					start:'2017-04-29',				
					className: 'bg-danger'
				}];
			//$('#calendar').fullCalendar('removeEvents');
			$('#calendar').fullCalendar({
			defaultDate: '2017-04-12',
			editable: true,
			eventLimit: true, // allow "more" link when too many events
			events: events
			});
		
	

		});
		</script>
    </body>
</html>
