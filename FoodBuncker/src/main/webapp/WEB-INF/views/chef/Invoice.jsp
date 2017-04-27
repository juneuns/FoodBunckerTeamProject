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

        <title>Chef Invoice</title>

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
                            <a href="../chef/OrderBoard.food"><button type="button" class="btn btn-custom dropdown-toggle waves-effect waves-light" aria-expanded="false">이전화면으로 <span class="m-l-5"><i class="fa fa-cog"></i></span></button></a>
                        </div>
                        <h4 class="page-title">Invoice</h4>
                    </div>
                </div>


                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-default">
                            <!-- <div class="panel-heading">
                                <h4>Invoice</h4>
                            </div> -->
                            <div class="panel-body">
                                <div class="clearfix">
                                    <div class="pull-left">
                                        <h3 class="logo invoice-logo">Cicago Food</h3>
                                    </div>
                                    <div class="pull-right">
                                        <h4>Invoice # <br>
                                            <strong>2016-04-23654789</strong>
                                        </h4>
                                    </div>
                                </div>
                                <hr>
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="pull-right m-t-30">
                                            <p><strong>주문일: </strong> 2017/04/22</p>
                                            <p class="m-t-10"><strong>주문번호: </strong> #13</p>
                                        </div>
                                    </div><!-- end col -->
                                </div>
                                <!-- end row -->

                                <div class="m-h-50"></div>

                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="table-responsive">
                                            <table class="table m-t-30">
                                                <thead>
                                                    <tr>
														<th></th>
														<th>메뉴명</th>
														<th>수량</th>
														<th>단가</th>
														<th>합계</th>
													</tr>
												</thead>
                                                <tbody>
                                                    <tr>
                                                        <td>1</td>
                                                        <td>햄버거</td>
                                                        <td>2</td>
                                                        <td>5000원</td>
                                                        <td>10000원</td>
                                                    </tr>
                                                    <tr>
                                                        <td>2</td>
                                                        <td>콜라</td>
                                                        <td>2</td>
                                                        <td>1000원</td>
                                                        <td>2000원</td>
                                                    </tr>
                                                    <tr>
                                                        <td>3</td>
                                                        <td>샐러드</td>
                                                        <td>2</td>
                                                        <td>2000원</td>
                                                        <td>4000원</td>
                                                    </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col-md-6 col-sm-6 col-xs-6">
                                        <div class="clearfix m-t-40">
                                            <h5 class="small text-inverse font-600">PAYMENT TERMS AND POLICIES</h5>

                                            <small>
                                                All accounts are to be paid within 7 days from receipt of
                                                invoice. To be paid by cheque or credit card or direct payment
                                                online. If account is not paid within 7 days the credits details
                                                supplied as confirmation of work undertaken will be charged the
                                                agreed quoted fee noted above.
                                            </small>
                                        </div>
                                    </div>
                                    <div class="col-md-3 col-sm-6 col-xs-6 col-md-offset-3">
                                        <p class="text-right"><b>Sub-total:</b> 16000원</p>
                                        <p class="text-right">Discout: 0%</p>
                                        <p class="text-right">VAT: 0%</p>
                                        <hr>
                                        <h3 class="text-right">16000원</h3>
                                    </div>
                                </div>
                                <hr>
                                <div class="hidden-print">
                                    <div class="pull-right">
                                        <a href="../chef/PayProc.food" class="btn btn-primary waves-effect waves-light">결제</a>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>

                </div>
                <!-- end row -->


                <!-- Footer -->
                <footer class="footer text-right">
                    <div class="container">
                        <div class="row">
                            <div class="col-xs-6">
                                2016 - 2017 © Adminto.
                            </div>
                            <div class="col-xs-6">
                                <ul class="pull-right list-inline m-b-0">
                                    <li>
                                        <a href="#">About</a>
                                    </li>
                                    <li>
                                        <a href="#">Help</a>
                                    </li>
                                    <li>
                                        <a href="#">Contact</a>
                                    </li>
                                </ul>
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