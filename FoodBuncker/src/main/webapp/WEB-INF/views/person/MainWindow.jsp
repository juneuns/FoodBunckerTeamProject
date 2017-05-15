
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!doctype html>
<html class="no-js" lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>FOOD BUNCKER | Homepage</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- FAVICONS -->
        <link rel="shortcut icon" href="../resources/img/favicon.ico" type="image/x-icon">
        <link rel="apple-touch-icon" href="img/apple-touch-icon.png">

        <!-- FONTS -->
        <link href='https://fonts.googleapis.com/css?family=Raleway:400,500,600,700,800' rel='stylesheet' type='text/css'>
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
    <body class="homepage">
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

        <!-- SECTION 1 - HERO SPLASH -->
        <section class="hero-splash">
            <h3 class="hidden">Hero Slider Images</h3>
            <div class="owl-carousel splash-slider">
                <!-- SLIDE -->
                <div>
                    <img src="../resources/img/banner1.jpg" alt="About the image">
                </div>

                <!-- SLIDE -->
                <div>
                    <img src="../resources/img/banner2.jpg" alt="About the image">
                </div>

				<div>
                    <img src="../resources/img/banner3.jpg" alt="About the image">
                </div>
            </div>

            <div class="container-fluid">
                <div class="row">
                    <div class="align">
                        <img src="../resources/img/splash-logo.png" alt="Coffee's splash logo">
                    </div>
                </div><!-- // .row -->
            </div><!-- // .container -->
        </section><!-- // SECTION 1 -->

        <!-- SECTION 2 -->
        <section class="welcome space">
            <div class="container">
                <div class="row">
                    <div class="section-headline">
                        <h3>FOOD TRUCK CHEF의 약속 </h3>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-4">
                        <div class="item">
                            <div class="img">
                                <img src="../resources/img/special300.jpg" alt="About the image">
                            </div>
                            <h4>Special</h4>
                            <p>기존의 레스토랑에서는 맛볼 수 없는 특별한 메뉴를 당신만을 위해 준비했습니다. 외국을 돌아다니며 국내에 새로운 외국의 메뉴를 선보이거나 새로운 레시피를 개발하여 선보입니다.</p>
                        </div>
                    </div>

                    <div class="col-md-4">
                        <div class="item">
                            <div class="img">
                                <img src="../resources/img/imchef300.jpg" alt="About the image">
                            </div>
                            <h4>I'm Chef</h4>
                            <p>푸드트럭은 모든 음식은 쉐프의 손길로 만들어집니다. 쉐프만의 전문성과 노력, 끊임없는 개발을 하여 누구라도 맛을 통한 즐거움을 제공합니다.</p>
                        </div>
                    </div>

                    <div class="col-md-4">
                        <div class="item">
                            <div class="img">
                                <img src="../resources/img/always300.jpg" alt="About the image">
                            </div>
                            <h4>Always Your Side</h4>
                            <p>푸드트럭은 항상 여러분의 옆에 있습니다. 높은 품질의 음식, 훌륭한 쉐프의 손길로 만들어진 음식을 쉽게 다가갈 수 있게 항상 움직이고 다가갑니다.</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- // SECTION 2 -->

        <!-- SECTION 3 - BANNER -->
        
<!-- ---------------------------            지도위에 푸드트럭의 현재 위치 표시, 표시된 마커 클릭하면 해당 트럭 상세보기로 이동 ------------------------------------------>
        <section>
			<div class="section-headline">
                 <h3>WHERE ARE FOOD TRUCKS?</h3>
            </div>
            <h3 class="hidden">One For Me</h3>
            <div class="container">
                <div class="row">
                    <div class="text-center">
                        <img src="../resources/img/map.jpg" alt="About the image">
                    </div>
					<p><a class="btn btn-primary" href="../person/Search.food">상세검색&raquo;</a></p>
                </div>
            </div>
        </section>
        
        
        <!-- // SECTION 3 -->

        <!-- SECTION 4 - MENU -->
        <section class="menu space">
            <div class="container">
                <div class="row">
                    <div class="section-headline">
                        <h3>FOOD Menu</h3>
                    </div>
                </div>

                <div class="owl-carousel gallery-slider">
                    <!-- SLIDE -->
                    
                    
                    <c:forEach var="data" items="${LIST}" varStatus="st">
                    <c:if test="${st.first eq true}">
                    <div><!-- 슬라이드 -->
                    </c:if>
                    <c:if test="${st.count eq 7}">
                    <div><!-- 슬라이드 -->
                    </c:if>
                    <c:if test="${st.count eq 13}">
                    <div><!-- 슬라이드 -->
                    </c:if>
                    	<c:if test="${st.count % 2 eq 1 }">
                    	<div class="row"><!-- 줄바꾸는거 -->
                    	</c:if>
                            <div class="col-md-6" >
                                <div class="item" style="height:150px;">
                                    <div class="align">
                                         <div class="item-thumbnail">
                                            <img src="../image/${data.sname}" alt="About the image">
                                        </div>
                                        <h5>${data.name}</h5><br>
                                        <p>${data.body}</p>
                                    </div>
                                    <span class="price">${data.price}원</span>
                                </div>
                            </div>
         	        	<c:if test="${st.count % 2 eq 0}">	
                       	</div><!-- 줄 -->
                    	</c:if>
                    <c:if test="${st.count eq 6}">
                    </div><!-- 슬라이드 -->
                    </c:if>	
                    <c:if test="${st.count eq 12}">
                    </div><!-- 슬라이드 -->
                    </c:if>
                    <c:if test="${st.last eq true}">	
                    </div><!-- 슬라이드 -->
                    </c:if>
                    </c:forEach>
                    
                            
                    
                </div>
            </div>
        </section>
        <!-- // SECTION 4 -->

        <!-- SECTION 5 -->
        <div class="space space-dark">
            <div class="container">
                <div class="row">
                    <div class="section-headline">
                        <h3>Customer Feedback</h3>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-8 col-md-offset-2">
                        <div class="owl-carousel testimonials-slider">
                        
  <!------------------------------- foreach문 시작 ------------------------------------------------------------------------------------->
  						<c:forEach var="data" items="${LIST2}">
                            <div>
                                <div class="testimonial">
                                    <p>${data.body}</p>
                                    <h4>${data.tname}</h4>
                                </div>
                            </div>
						</c:forEach>                            
   <!------------------------------- foreach문 종료 -------------------------------------------------------------------------------------->
   
 <!-- ----------------------------위 foreach문 완성시 삭제해야할 부분 시작 ------------------------------------------------------------------------>
 <!-- ----------------------------위 foreach문 완성시 삭제해야할 부분 끝 ------------------------------------------------------------------------>                           
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- // SECTION 5 -->

        <!-- SECTION 6 - GALLERY -->
        <section class="space gallery">
            <div class="container">
                <div class="row">
                    <div class="section-headline">
                        <h3>LOOK FOOD TRUCK</h3>
                    </div>
                </div>
                
 <!---------------------------  foreach사용하여 1단 표시, 전체 메뉴개수로 foreach 반복 횟수 정해야 함. ------------------->
 
                <div class="row">
                
<!------------------------------- foreach 사용하여 1단의 1,2칸 표시 ----------------------------------------------->
                    
<!---------------------------------  foreach 1단 1칸 종료 ----------------------------------------------------->

				<c:forEach var="data" items="${LIST3}">
                    <div class="col-sm-6">
                        <div class="item">
                            <img src="../image/${data.sname}" alt="About te image">

                            <div class="caption">
                                <div class="align">
                                    <a href="../person/DetailView.food?tno=${data.no}"><i class="fa fa-link"></i></a>
                                    <a href="../image/${data.sname}" class="popup"><i class="fa fa-search"></i></a>
                                    <h3>${data.name}</h3>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>    
                
                </div>
                
<!----------------------------------- foreach 1단 종료 ------------------------------------------------------>
                
 <!-- -------------------------------위의 foreach문 완성시 삭제해야할 부분 시작----------------------------------- -->               
 <!-- -------------------------------위의 foreach문 완성시 삭제해야할 부분 끝----------------------------------- -->                
            </div>
        </section>
        <!-- // SECTION 6 -->

        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-sm-4">
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
