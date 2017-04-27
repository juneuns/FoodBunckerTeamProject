<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
        <meta name="author" content="Coderthemes">

        <link rel="shortcut icon" href="../resources/assets/images/favicon.ico">

        <title>Order Board</title>

        <link href="../resources/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="../resources/assets/css/core.css" rel="stylesheet" type="text/css" />
        <link href="../resources/assets/css/components.css" rel="stylesheet" type="text/css" />
        <link href="../resources/assets/css/icons.css" rel="stylesheet" type="text/css" />
        <link href="../resources/assets/css/pages.css" rel="stylesheet" type="text/css" />
        <link href="../resources/assets/css/menu.css" rel="stylesheet" type="text/css" />
        <link href="../resources/assets/css/responsive.css" rel="stylesheet" type="text/css" />

        <!-- HTML5 Shiv and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->

        <script src="../resources/assets/js/modernizr.min.js"></script>


    </head>


    <body>

       <!-- Navigation Bar-->
        <header id="topnav">
			<div class="topbar-main">
                <div class="container">

					<!-- LOGO -->
                    <div class="topbar-left">
                        <a href="index.html" class="logo"><span>Food<span>Buncker</span></span></a>
                    </div>
                    <!-- End Logo container-->
                    <div class="menu-extras">                        
                        <div class="menu-item">
                            <!-- Mobile menu toggle-->
                            <a class="navbar-toggle">
                                <div class="lines">
                                    <span></span>
                                    <span></span>
                                    <span></span>
                                </div>
                            </a>
                            <!-- End mobile menu toggle-->
                        </div>
                    </div>
                </div>
            </div>

            <div class="navbar-custom">
                <div class="container">
                    <div id="navigation">
                        <!-- Navigation Menu-->
                        <ul class="navigation-menu">
                            <li>
                                <a href="../chef/Main.food"><i class="zmdi zmdi-view-dashboard"></i> <span> MainPage </span> </a>
                            </li>
                            <li class="has-submenu">
                                <a href="../chef/PlanModify.food"><i class="zmdi zmdi-invert-colors"></i> <span> 일정계획입력 및 수정 </span> </a>                                
                            </li>

                            <li class="has-submenu">
                                <a href="../chef/Review.food"><i class="zmdi zmdi-collection-text"></i><span>후기 및 답변달기 </span> </a>                                
                            </li>

                            <li class="has-submenu">
                                <a href="#"><i class="zmdi zmdi-view-list"></i> <span> 판매 통계 </span> </a>
                            </li>

                            <li class="has-submenu">
                                <a href="#"><i class="zmdi zmdi-chart"></i><span> 메뉴 및 사진 등록 </span> </a>
                                <ul class="submenu">
                                    <li><a href="../chef/MenuModify.food">메뉴 등록 및 수정</a></li>
                                    <li><a href="../chef/PhotoUpload.food">기타 사진 등록</a></li>
                                </ul>
                            </li>

                            <li class="has-submenu">
                                <a href="../chef/InfoModify.food"><i class="zmdi zmdi-collection-item"></i><span> 개인정보수정 </span> </a>                                
                            </li>

                            <li class="has-submenu">
                                <a href="../person/MainWindow.food"><i class="zmdi zmdi-layers"></i><span>HOME </span> </a>
                            </li>
                        </ul>
                        <!-- End navigation menu  -->
                    </div>
                </div>
            </div>
        </header>
        <!-- End Navigation Bar-->

        <div class="wrapper">
            <div class="container">

                <!-- Page-Title -->
                <div class="row">
                    <div class="col-sm-12">
                        <div class="btn-group pull-right m-t-15">
                            <button type="button" class="btn btn-custom dropdown-toggle waves-effect waves-light" data-toggle="dropdown" aria-expanded="false">상태변경 <span class="m-l-5"><i class="fa fa-cog"></i></span></button>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="#">시작</a></li>
                                <li><a href="#">잠깐 정지</a></li>
                                <li><a href="#">종료</a></li>
                            </ul>
                        </div>
                        <h4 class="page-title">Order Board</h4>
                    </div>
                </div>


                <div class="row m-t-10">
                    <div class="col-md-10 col-md-offset-1">
                        <div class="row">

                            <!--Pricing Column-->
                            
 <!-- -----------------------    foreach문으로 반복 시작------------------------------------------------- --> 	                                  
                            <article class="pricing-column col-lg-3 col-sm-6" >
                                <div class="inner-box card-box" style="height:500px;">
                                    <div class="plan-header text-center">
                                        <h3 class="plan-title">주문No</h3>
                                        <h2 class="plan-price">19</h2>
                                        <div class="plan-duration">주문시간 10:12</div>
                                    </div>
									<div class="text-center">
                                        <a href="../chef/Invoice.food" class="btn btn-success btn-bordred btn-rounded waves-effect waves-light">결제</a>
                                    </div>
                                    <ul class="plan-stats list-unstyled text-center">
                                        <li>찹스테이크 2</li>
                                        <li>콜라 2</li>
                                    </ul>
                                </div>
                            </article>
<!-- -----------------------   foreach문으로 반복 끝----------------------------------------------------- --> 	       
<!-- -----------------------   위의 foreach문 완성시 삭제 부분 시작--------------------------------------- --> 	       
                            <!--Pricing Column-->
                            <article class="pricing-column col-lg-3 col-sm-6">
                                <div class="ribbon"><span>조리중</span></div>
                                <div class="inner-box card-box" style="height:500px;">
                                    <div class="plan-header text-center">
                                        <h3 class="plan-title">주문No</h3>
                                        <h2 class="plan-price">20</h2>
                                        <div class="plan-duration">주문시간 10:20</div>
                                    </div>
									<div class="text-center">
                                        <button class="btn btn-primary btn-bordred btn-rounded waves-effect waves-light">결제완료</button>
                                    </div>
                                    <ul class="plan-stats list-unstyled text-center">
                                        <li>햄버거 1</li>
                                        <li>콜라 1</li>
                                        <li>포테이토</li>
                                    </ul>
                                </div>
                            </article>


                            <!--Pricing Column-->
                            <article class="pricing-column col-lg-3 col-sm-6">
                                <div class="inner-box card-box" style="height:500px;">
                                    <div class="plan-header text-center">
                                        <h3 class="plan-title">주문No</h3>
                                        <h2 class="plan-price">21</h2>
                                        <div class="plan-duration">주문시간 10:30</div>
                                    </div>
									<div class="text-center">
                                        <a href="invoice.html" class="btn btn-success btn-bordred btn-rounded waves-effect waves-light">결제</a>
                                    </div>
                                    <ul class="plan-stats list-unstyled text-center">
                                        <li>햄버거 3</li>
                                        <li>샐러드 1</li>
                                        <li>콜라 3</li>
                                        <li>치즈스틱 3</li>
                                    </ul>
                                </div>
                            </article>

                            <!--Pricing Column-->
                            <article class="pricing-column col-lg-3 col-sm-6">
                                <div class="inner-box card-box" style="height:500px;">
                                    <div class="plan-header text-center">
                                        <h3 class="plan-title">주문No</h3>
                                        <h2 class="plan-price">23</h2>
                                        <div class="plan-duration">주문시간 10:42</div>
                                    </div>
									<div class="text-center">
                                        <a href="invoice.html" class="btn btn-success btn-bordred btn-rounded waves-effect waves-light">결제</a>
                                    </div>
                                    <ul class="plan-stats list-unstyled text-center">
                                        <li>스테이크 2</li>
                                        <li>샐러드 1</li>
                                        <li>콜라 2</li>
                                    </ul>
                                </div>
                            </article>
<!-- -----------------------   위의 foreach문 완성시 삭제 부분 끝--------------------------------------- --> 	       
                        </div><!-- end row -->
                    </div>
                </div>
                <!-- end row -->
                <!-- Footer -->
                <footer class="footer text-right">
                    <div class="container">
                        <div class="row">
                            <div class="col-xs-6">
                            </div>
                        </div>
                    </div>
                </footer>
                <!-- End Footer -->

            </div>
            <!-- end container -->

        </div>



        <!-- jQuery  -->
        <script src="../resources/assets/js/jquery.min.js"></script>
        <script src="../resources/assets/js/bootstrap.min.js"></script>
        <script src="../resources/assets/js/detect.js"></script>
        <script src="../resources/assets/js/fastclick.js"></script>
        <script src="../resources/assets/js/jquery.slimscroll.js"></script>
        <script src="../resources/assets/js/jquery.blockUI.js"></script>
        <script src="../resources/assets/js/waves.js"></script>
        <script src="../resources/assets/js/wow.min.js"></script>
        <script src="../resources/assets/js/jquery.nicescroll.js"></script>
        <script src="../resources/assets/js/jquery.scrollTo.min.js"></script>


        <!-- App js -->
        <script src="../resources/assets/js/jquery.core.js"></script>
        <script src="../resources/assets/js/jquery.app.js"></script>

    </body>
</html>