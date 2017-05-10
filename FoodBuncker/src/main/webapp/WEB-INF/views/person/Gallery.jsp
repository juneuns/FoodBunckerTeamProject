<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js" lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>FOOD BUNCKER  | Shop</title>
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

        <!-- MODERNIZR -->
        <script src="../resources/js/vendor/modernizr-2.8.3.min.js"></script>
    </head>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>    
    <body class="shop">
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
                            <a href="../person/MainWindow.food">
                            	<img src="../resources/img/logo.png" alt="Logo">
                            </a>
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
                    <h2>Food Truck Gallery</h2>
                </div><!-- // .row -->
            </div><!-- // .container -->
        </section>
        <!-- // SECTION 1 -->

        <!-- SECTION 2 - GALLERY -->
        <section class="gallery space">
            <div class="container">
            
<!-- -----------------------   foreach문으로 1단 반복, 총 사진 갯수 알아내어 반복 횟수 정해야 함--------------------------------------- -->             
                <div class="row">
                
<!-- -----------------------  foreach문으로 1단 1열 반복-------------------------------------- -->                 
                    <c:forEach var="data" items="${ILIST}">
                    <div class="col-sm-6">
                        <div class="item">
                            <img src="../image/${data.sname}" alt="1895x1000 About te image">
                            <div class="caption">
                                <div class="align">
                                    <a href="../person/DetailView.food?tno=${data.tno}"><i class="fa fa-link"></i></a>
                                    <a href="../image/${data.sname}" class="popup"><i class="fa fa-search"></i></a>
                                    <h3>${data.name}</h3>
                                </div>    
                            </div>
                        </div>
                    </div>
                    </c:forEach>
                    <div class="row" id="loadmore">
                    </div>
<!-- ----------------------- foreach문으로 1단 2열 반복-------------------------------------- --> 
                	<!-- 
					 <div class="col-sm-6">
                        <div class="item">
                            <img src="../resources/img/detailviewgallery2.jpg" alt="About te image">
                            <div class="caption">
                                <div class="align">
                                    <a href="../person/DetailView.food"><i class="fa fa-link"></i></a>
                                    <a href="../resources/img/detailviewgallery2.jpg" class="popup"><i class="fa fa-search"></i></a>
                                    <h3>Cicago Moons2</h3>
                                </div>    
                            </div>
                        </div>
                    </div>
                     -->
 <!-- -----------------------  foreach문 1단 2열 끝--------------------------------------- -->                    
<!-- -----------------------   foreach문 1단 반복 끝--------------------------------------- -->                 
                
<!-- -----------------------  위의 foreach문 완성시 삭제해야 할 부분 시작--------------------------------------- -->
				<!--  
                <div class="row">
                    <div class="col-sm-6">
                        <div class="item">
                            <img src="../resources/img/abouthead.jpg" alt="About te image">

                            <div class="caption">
                                <div class="align">
                                    <a href="../person/DetailView.food"><i class="fa fa-link"></i></a>
                                    <a href="../resources/img/abouthead.jpg" class="popup"><i class="fa fa-search"></i></a>
                                    <h3>Cicago Moons3</h3>
                                </div>    
                            </div>
                        </div>
                    </div>

                    <div class="col-sm-6">
                        <div class="item">
                            <img src="../resources/img/detailviewgallery1.jpg" alt="About te image">

                            <div class="caption">
                                <div class="align">
                                    <a href="../person/DetailView.food"><i class="fa fa-link"></i></a>
                                    <a href="../resources/img/detailviewgallery1.jpg" class="popup"><i class="fa fa-search"></i></a>
                                    <h3>Cicago Moons4</h3>
                                </div>    
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-sm-6">
                        <div class="item">
                            <img src="../resources/img/detailviewgallery2.jpg" alt="About te image">

                            <div class="caption">
                                <div class="align">
                                    <a href="../person/DetailView.food"><i class="fa fa-link"></i></a>
                                    <a href="../resources/img/detailviewgallery2.jpg" class="popup"><i class="fa fa-search"></i></a>
                                    <h3>Cicago Moons5</h3>
                                </div>    
                            </div>
                        </div>
                    </div>

                    <div class="col-sm-6">
                        <div class="item">
                            <img src="../resources/img/abouthead.jpg" alt="About te image">

                            <div class="caption">
                                <div class="align">
                                    <a href="../person/DetailView.food"><i class="fa fa-link"></i></a>
                                    <a href="../resources/img/abouthead.jpg" class="popup"><i class="fa fa-search"></i></a>
                                    <h3>Cicago Moons6</h3>
                                </div>    
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-sm-6">
                        <div class="item">
                            <img src="../resources/img/detailviewgallery1.jpg" alt="About te image">

                            <div class="caption">
                                <div class="align">
                                    <a href="../person/DetailView.food"><i class="fa fa-link"></i></a>
                                    <a href="../resources/img/detailviewgallery1.jpg" class="popup"><i class="fa fa-search"></i></a>
                                    <h3>Cicago Moons7</h3>
                                </div>    
                            </div>
                        </div>
                    </div>

                    <div class="col-sm-6">
                        <div class="item">
                            <img src="../resources/img/detailviewgallery2.jpg" alt="About te image">

                            <div class="caption">
                                <div class="align">
                                    <a href="../person/DetailView.food"><i class="fa fa-link"></i></a>
                                    <a href="../resources/img/detailviewgallery2.jpg" class="popup"><i class="fa fa-search"></i></a>
                                    <h3>Cicago Moons8</h3>
                                </div>    
                            </div>
                        </div>
                    </div>
                </div>
                 -->
<!-- -----------------------  위의 foreach문 완성시 삭제해야 할 부분 끝--------------------------------------- -->                 
                

                <div class="row">
                    <div class="text-center">
                        <input type="button" class="btn btn-default btn-colored" id="lBtn" value="Load More">
                    </div>
                </div>
            </div>
        </section>
<script>
	var moreImage = 0;
	$(document).ready(function(){
		$("#lBtn").click(function(){
			moreImage = moreImage + 1;
			$.ajax({
				data : "temp=" + new Date() + "&nowPage=" + (moreImage+1),
				dataType : "json",
				error : function(){
					alert("에러");
				},
				success : addImage,
				type : "GET",
				url : "../person/moreGallery.food"
			});
		});
	});
	function addImage(data){
		var str = "";
		var addImage = data.moregallery
		var i = 0;
		$.each(addImage, function(key, temp){
			var tno = temp.tno;
			var nowPage = temp.nowPage;
			var sname = temp.sname;
			var name = temp.name;
			str += "<div class='col-sm-6'>"
				+ "<div class='item'>"
				+ "<img src='../image/"+sname+"' alt='1895x1000 About te image'>"
				+ "<div class='caption'>"
				+ "<div class='align'>"
            	+ "<a href='../person/DetailView.food?tno="+tno+"'><i class='fa fa-link'></i></a>"
                + "<a href='../image/"+sname+"' class='popup'><i class='fa fa-search'></i></a>"
                + "<h3>"+name+"</h3>"
                + "</div>"    
                + "</div>"       
                + "</div>"
                + "</div>"
		});
		$("#loadmore").append(str);
	}
</script>        
        <!-- SECTION 2 -->

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
    </body>
</html>
