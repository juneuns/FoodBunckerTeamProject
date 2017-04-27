<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js" lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>FOOD BUNCKER  | Coffees</title>
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
    <body class="coffees">
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
                    <h2>Food Truck Menu</h2>
                </div><!-- // .row -->
            </div><!-- // .container -->
        </section>
        <!-- // SECTION 1 -->

        <!-- SECTION 2 - COFFEE ITEMS -->
        <section class="space" >
            <div class="container">
				<div class="row">
					<div class="col-lg-6">
						<form class="form-horizontal" role="form" id="frm" action="">
							<div class="form-group">
								<label class="col-md-2 control-label">검색어</label>
								<div class="col-md-10">
									<input type="text" class="form-control" value="검색어를 입력해 주세요.">
									<input type="submit" class="btn btn-primary" value="검색">
								</div>
							</div>
						</form>
					</div>
				</div>
                <div class="row">
                    <div class="col-md-4">
                        <div class="item">
                            <div class="align">
                               <div class="item-thumbnail">
                                 <img src="../resources/img/menu1_200.jpg" alt="About the image">
                               </div>
                               <h4>Beef Steak</h4>
                               <p>한우 등심을 직화로 구워 소스를 입힌 요리</p>
                            </div>
                            <span class="price">10,000원</span>
                        </div>
                    </div>

                    <div class="col-md-4">
                         <div class="item">
                                    <div class="align">
                                         <div class="item-thumbnail">
                                            <img src="../resources/img/menu2_200.jpg" alt="About the image">
                                        </div>
                                        <h4>Hambuger</h4>
                                        <p>천연 효모 빵과 신선한 야채, 수제 패티를 넣은 고급의 와퍼</p>
                                    </div>
                                    <span class="price">6,000원</span>
                                </div>
                    </div>

                    <div class="col-md-4">
                        <div class="item">
                                    <div class="align">
                                         <div class="item-thumbnail">
                                            <img src="../resources/img/menu3_200.jpg" alt="About the image">
                                        </div>
                                        <h4>Italian Noddle </h4>
                                        <p>파스타 면을 적절히 삶아 이탈리아식으로 야채 및 향로를 뿌린 요리</p>
                                    </div>
                                    <span class="price">8,000원</span>
                                </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-4">
                        <div class="item">
                                    <div class="align">
                                         <div class="item-thumbnail">
                                            <img src="../resources/img/menu4_200.jpg" alt="About the image">
                                        </div>
                                        <h4>Green Grape Pizza</h4>
                                        <p>얇고 바삭한 도우 위에 청포도를 올려 청정한 맛을 느낄 수 있는 피자</p>
                                    </div>
                                    <span class="price">6,000원</span>
                                </div>
                    </div>

                    <div class="col-md-4">
                         <div class="item">
                                    <div class="align">
                                         <div class="item-thumbnail">
                                            <img src="../resources/img/menu5_200.jpg" alt="About the image">
                                        </div>
                                        <h4>red vegitable 피자</h4>
                                        <p>채소와 곡류로만 만들고 빨간 피망으로 포인트롤 준 피자</p>
                                    </div>
                                    <span class="price">8,000원</span>
                                </div>
                    </div>

                    <div class="col-md-4">
                        <div class="item">
                                    <div class="align">
                                         <div class="item-thumbnail">
                                            <img src="../resources/img/menu6_200.jpg" alt="About the image">
                                        </div>
                                        <h4>Tomato Pizza</h4><br>
                                        <p>토마토가 올려진 기본 피자</p>
                                    </div>
                                    <span class="price">5,000원</span>
                                </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-md-4">
                        <div class="item">
                                    <div class="align">
                                         <div class="item-thumbnail">
                                            <img src="../resources/img/menu8_200.jpg" alt="About the image">
                                        </div>
                                        <h4>Salmon Steak</h4>
                                        <p>싱싱한 연어를 직화로 구워 고유의 맛을 살린 요리</p>
                                    </div>
                                    <span class="price">10,000원</span>
                                </div>
                    </div>

                    <div class="col-md-4">
                       <div class="item">
                                    <div class="align">
                                         <div class="item-thumbnail">
                                            <img src="../resources/img/menu1_200.jpg" alt="About the image">
                                        </div>
                                        <h4>Beef Steak</h4>
                                        <p>한우 등심을 직화로 구워 소스를 입힌 요리</p>
                                    </div>
                                    <span class="price">10,000원</span>
                                </div>
                    </div>

                    <div class="col-md-4">
                         <div class="item">
                                    <div class="align">
                                         <div class="item-thumbnail">
                                            <img src="../resources/img/menu2_200.jpg" alt="About the image">
                                        </div>
                                        <h4>Hambuger</h4>
                                        <p>천연 효모 빵과 신선한 야채, 수제 패티를 넣은 고급의 와퍼</p>
                                    </div>
                                    <span class="price">6,000원</span>
                                </div>
                    </div>
                </div>
            </div>
        </section>
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
