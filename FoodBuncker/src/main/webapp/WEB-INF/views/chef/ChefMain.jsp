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

        <title>Chef Main Page</title>

        <!--Morris Chart CSS -->
		<link rel="stylesheet" href="assets/plugins/morris/morris.css">

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
                        <a href="../" class="logo"><span>Food<span>Buncker</span></span></a>
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
                           <a href="../chef/OrderBoard.food"><button type="button" class="btn btn-danger waves-effect w-md waves-light m-b-5" aria-expanded="false" id="startBtn">Order Board <span class="m-l-5"><i class="dripicons-cutlery"></i></span></button></a>
                        </div>
                        <h4 class="page-title">Dashboard</h4>
                    </div>
                </div>


                 <div class="row">
                     <div class="col-lg-3 col-md-6">
                         <div class="card-box">
                             <div class="dropdown pull-right">
                                 <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown"
                                    aria-expanded="false">
                                     <i class="zmdi zmdi-more-vert"></i>
                                 </a>
                                 <ul class="dropdown-menu" role="menu">
                                     <li><a href="#">Action</a></li>
                                     <li><a href="#">Another action</a></li>
                                     <li><a href="#">Something else here</a></li>
                                     <li class="divider"></li>
                                     <li><a href="#">Separated link</a></li>
                                 </ul>
                             </div>

                             <h4 class="header-title m-t-0 m-b-30">Total Revenue</h4>

                             <div class="widget-chart-1">
                                 <div class="widget-chart-box-1">
                                     <input data-plugin="knob" data-width="80" data-height="80" data-fgColor="#f05050 "
                                            data-bgColor="#F9B9B9" value="58"
                                            data-skin="tron" data-angleOffset="180" data-readOnly=true
                                            data-thickness=".15"/>
                                 </div>

                                 <div class="widget-detail-1">
                                     <h2 class="p-t-10 m-b-0"> 256 </h2>
                                     <p class="text-muted">Revenue today</p>
                                 </div>
                             </div>
                         </div>
                     </div><!-- end col -->

                     <div class="col-lg-3 col-md-6">
                         <div class="card-box">
                             <div class="dropdown pull-right">
                                 <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown"
                                    aria-expanded="false">
                                     <i class="zmdi zmdi-more-vert"></i>
                                 </a>
                                 <ul class="dropdown-menu" role="menu">
                                     <li><a href="#">Action</a></li>
                                     <li><a href="#">Another action</a></li>
                                     <li><a href="#">Something else here</a></li>
                                     <li class="divider"></li>
                                     <li><a href="#">Separated link</a></li>
                                 </ul>
                             </div>

                             <h4 class="header-title m-t-0 m-b-30">Sales Analytics</h4>

                             <div class="widget-box-2">
                                 <div class="widget-detail-2">
                                     <span class="badge badge-success pull-left m-t-20">32% <i
                                             class="zmdi zmdi-trending-up"></i> </span>
                                     <h2 class="m-b-0"> 8451 </h2>
                                     <p class="text-muted m-b-25">Revenue today</p>
                                 </div>
                                 <div class="progress progress-bar-success-alt progress-sm m-b-0">
                                     <div class="progress-bar progress-bar-success" role="progressbar"
                                          aria-valuenow="77" aria-valuemin="0" aria-valuemax="100"
                                          style="width: 77%;">
                                         <span class="sr-only">77% Complete</span>
                                     </div>
                                 </div>
                             </div>
                         </div>
                     </div><!-- end col -->

                     <div class="col-lg-3 col-md-6">
                         <div class="card-box">
                             <div class="dropdown pull-right">
                                 <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown"
                                    aria-expanded="false">
                                     <i class="zmdi zmdi-more-vert"></i>
                                 </a>
                                 <ul class="dropdown-menu" role="menu">
                                     <li><a href="#">Action</a></li>
                                     <li><a href="#">Another action</a></li>
                                     <li><a href="#">Something else here</a></li>
                                     <li class="divider"></li>
                                     <li><a href="#">Separated link</a></li>
                                 </ul>
                             </div>

                             <h4 class="header-title m-t-0 m-b-30">Statistics</h4>

                             <div class="widget-chart-1">
                                 <div class="widget-chart-box-1">
                                     <input data-plugin="knob" data-width="80" data-height="80" data-fgColor="#ffbd4a"
                                            data-bgColor="#FFE6BA" value="80"
                                            data-skin="tron" data-angleOffset="180" data-readOnly=true
                                            data-thickness=".15"/>
                                 </div>
                                 <div class="widget-detail-1">
                                     <h2 class="p-t-10 m-b-0"> 4569 </h2>
                                     <p class="text-muted">Revenue today</p>
                                 </div>
                             </div>
                         </div>
                     </div><!-- end col -->

                     <div class="col-lg-3 col-md-6">
                         <div class="card-box">
                             <div class="dropdown pull-right">
                                 <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown"
                                    aria-expanded="false">
                                     <i class="zmdi zmdi-more-vert"></i>
                                 </a>
                                 <ul class="dropdown-menu" role="menu">
                                     <li><a href="#">Action</a></li>
                                     <li><a href="#">Another action</a></li>
                                     <li><a href="#">Something else here</a></li>
                                     <li class="divider"></li>
                                     <li><a href="#">Separated link</a></li>
                                 </ul>
                             </div>

                             <h4 class="header-title m-t-0 m-b-30">Daily Sales</h4>

                             <div class="widget-box-2">
                                 <div class="widget-detail-2">
                                     <span class="badge badge-pink pull-left m-t-20">32% <i
                                             class="zmdi zmdi-trending-up"></i> </span>
                                     <h2 class="m-b-0"> 158 </h2>
                                     <p class="text-muted m-b-25">Revenue today</p>
                                 </div>
                                 <div class="progress progress-bar-pink-alt progress-sm m-b-0">
                                     <div class="progress-bar progress-bar-pink" role="progressbar"
                                          aria-valuenow="77" aria-valuemin="0" aria-valuemax="100"
                                          style="width: 77%;">
                                         <span class="sr-only">77% Complete</span>
                                     </div>
                                 </div>
                             </div>
                         </div>
                     </div><!-- end col -->

                 </div>
                <!-- end row -->

                <div class="row">
                    <div class="col-lg-4">
                        <div class="card-box">
                            <div class="dropdown pull-right">
                                <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown"
                                   aria-expanded="false">
                                    <i class="zmdi zmdi-more-vert"></i>
                                </a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="#">Action</a></li>
                                    <li><a href="#">Another action</a></li>
                                    <li><a href="#">Something else here</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">Separated link</a></li>
                                </ul>
                            </div>

                            <h4 class="header-title m-t-0">Daily Sales</h4>

                            <div class="widget-chart text-center">
                                <div id="morris-donut-example" style="height: 245px;"></div>
                                <ul class="list-inline chart-detail-list m-b-0">
                                    <li>
                                        <h5 style="color: #ff8acc;"><i class="fa fa-circle m-r-5"></i>Series A</h5>
                                    </li>
                                    <li>
                                        <h5 style="color: #5b69bc;"><i class="fa fa-circle m-r-5"></i>Series B</h5>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div><!-- end col -->

                    <div class="col-lg-4">
                        <div class="card-box">
                            <div class="dropdown pull-right">
                                <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown"
                                   aria-expanded="false">
                                    <i class="zmdi zmdi-more-vert"></i>
                                </a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="#">Action</a></li>
                                    <li><a href="#">Another action</a></li>
                                    <li><a href="#">Something else here</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">Separated link</a></li>
                                </ul>
                            </div>
                            <h4 class="header-title m-t-0">Statistics</h4>
                            <div id="morris-bar-example" style="height: 280px;"></div>
                        </div>
                    </div><!-- end col -->

                    <div class="col-lg-4">
                        <div class="card-box">
                            <div class="dropdown pull-right">
                                <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown"
                                   aria-expanded="false">
                                    <i class="zmdi zmdi-more-vert"></i>
                                </a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="#">Action</a></li>
                                    <li><a href="#">Another action</a></li>
                                    <li><a href="#">Something else here</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">Separated link</a></li>
                                </ul>
                            </div>
                            <h4 class="header-title m-t-0">Total Revenue</h4>
                            <div id="morris-line-example" style="height: 280px;"></div>
                        </div>
                    </div><!-- end col -->
                </div>
                <!-- end row -->

				<!-- 후기 리스트 -->
                <div class="row">
                    <div class="col-lg-4">
                        <div class="card-box">
                            <h4 class="header-title m-t-0 m-b-30">후기</h4>
                            <div class="inbox-widget nicescroll" style="height: 315px;">
                            
 <!-- -----------------------   foreach문 사용하여  반복--------------------------------------- --> 	                           
                                <a href="../chef/Review.food">
                                    <div class="inbox-item">                                  
                                        <p class="inbox-item-author">대학로</p>
                                        <p class="inbox-item-text">연극공연이 끝나고 나서 또 한편의 연극을 보는 듯한 뜨거운 트낌...</p>
                                        <p class="inbox-item-date">2017/04/22 13:40 PM</p>
                                    </div>
                                </a>
 <!-- -----------------------   foreach문 사용하여  반복 끝--------------------------------------- --> 	                               
 <!-- -----------------------   위의 foreach문 완성시 삭제 부분 시작--------------------------------------- --> 	                               
                                <a href="reviewboard.html">
                                    <div class="inbox-item">
                                        <p class="inbox-item-author">종로</p>
                                        <p class="inbox-item-text">스테이크의 새로운 맛을 보았습니다. 많이 파세요.</p>
                                        <p class="inbox-item-date">2017/04/17 13:34 PM</p>
                                    </div>
                                </a>
                                <a href="reviewboard.html">
                                    <div class="inbox-item">
                                        <p class="inbox-item-author">구로1동</p>
                                        <p class="inbox-item-text">강추합니다. 돈이 절대 아깝지 않아요.</p>
                                        <p class="inbox-item-date">2017/04/13 13:17 PM</p>
                                    </div>
                                </a>
                                <a href="reviewboard.html">
                                    <div class="inbox-item">
                                        <p class="inbox-item-author">대학로</p>
                                        <p class="inbox-item-text">고기가 약간 푸석푸석한 느낌이지만 소스가 깊숙이 들어가 있어 맛있습니다. 잘 먹었습니다.</p>
                                        <p class="inbox-item-date">2017/04/02 12:20 PM</p>
                                    </div>
                                </a>
                                <a href="reviewboard.html">
                                    <div class="inbox-item">
                                        <p class="inbox-item-author">이태원</p>
                                        <p class="inbox-item-text">Oh!!! good. its fantastic tasty!!! and chef is handsome!!!</p>
                                        <p class="inbox-item-date">2017/03/29 10:15 AM</p>
                                    </div>
                                </a>
<!-- -----------------------   위의 foreach문 완성시 삭제 부분 끝--------------------------------------- --> 	                                       
                                
                            </div>
                        </div>
                    </div><!-- end col -->

                    <div class="col-lg-8">
                        <div class="card-box">
                            <div class="dropdown pull-right">
                                <a href="#" class="dropdown-toggle card-drop" data-toggle="dropdown"
                                   aria-expanded="false">
                                    <i class="zmdi zmdi-more-vert"></i>
                                </a>
                                <ul class="dropdown-menu" role="menu">
                                    <li><a href="#">Action</a></li>
                                    <li><a href="#">Another action</a></li>
                                    <li><a href="#">Something else here</a></li>
                                    <li class="divider"></li>
                                    <li><a href="#">Separated link</a></li>
                                </ul>
                            </div>

                            <h4 class="header-title m-t-0 m-b-30">Latest Projects</h4>

                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                    <tr>
                                        <th>#</th>
                                        <th>Project Name</th>
                                        <th>Start Date</th>
                                        <th>Due Date</th>
                                        <th>Status</th>
                                        <th>Assign</th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr>
                                        <td>1</td>
                                        <td>Adminto Admin v1</td>
                                        <td>01/01/2016</td>
                                        <td>26/04/2016</td>
                                        <td><span class="label label-danger">Released</span></td>
                                        <td>Coderthemes</td>
                                    </tr>
                                    <tr>
                                        <td>2</td>
                                        <td>Adminto Frontend v1</td>
                                        <td>01/01/2016</td>
                                        <td>26/04/2016</td>
                                        <td><span class="label label-success">Released</span></td>
                                        <td>Adminto admin</td>
                                    </tr>
                                    <tr>
                                        <td>3</td>
                                        <td>Adminto Admin v1.1</td>
                                        <td>01/05/2016</td>
                                        <td>10/05/2016</td>
                                        <td><span class="label label-pink">Pending</span></td>
                                        <td>Coderthemes</td>
                                    </tr>
                                    <tr>
                                        <td>4</td>
                                        <td>Adminto Frontend v1.1</td>
                                        <td>01/01/2016</td>
                                        <td>31/05/2016</td>
                                        <td><span class="label label-purple">Work in Progress</span>
                                        </td>
                                        <td>Adminto admin</td>
                                    </tr>
                                    <tr>
                                        <td>5</td>
                                        <td>Adminto Admin v1.3</td>
                                        <td>01/01/2016</td>
                                        <td>31/05/2016</td>
                                        <td><span class="label label-warning">Coming soon</span></td>
                                        <td>Coderthemes</td>
                                    </tr>

                                    <tr>
                                        <td>6</td>
                                        <td>Adminto Admin v1.3</td>
                                        <td>01/01/2016</td>
                                        <td>31/05/2016</td>
                                        <td><span class="label label-primary">Coming soon</span></td>
                                        <td>Adminto admin</td>
                                    </tr>

                                    <tr>
                                        <td>7</td>
                                        <td>Adminto Admin v1.3</td>
                                        <td>01/01/2016</td>
                                        <td>31/05/2016</td>
                                        <td><span class="label label-primary">Coming soon</span></td>
                                        <td>Adminto admin</td>
                                    </tr>

                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div><!-- end col -->

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

        <!-- KNOB JS -->
        <!--[if IE]>
        <script type="text/javascript" src="assets/plugins/jquery-knob/excanvas.js"></script>
        <![endif]-->
        <script src="../resources/assets/plugins/jquery-knob/jquery.knob.js"></script>

        <!--Morris Chart-->
		<script src="../resources/assets/plugins/morris/morris.min.js"></script>
		<script src="../resources/assets/plugins/raphael/raphael-min.js"></script>

        <!-- Dashboard init -->
        <script src="../resources/assets/pages/jquery.dashboard.js"></script>

        <!-- App js -->
        <script src="../resources/assets/js/jquery.core.js"></script>
        <script src="../resources/assets/js/jquery.app.js"></script>

    </body>

	<script>
	$(document).ready(function(){
		//$("#startBtn").click(function(){
			
		//});
	});
	</script>
</html>