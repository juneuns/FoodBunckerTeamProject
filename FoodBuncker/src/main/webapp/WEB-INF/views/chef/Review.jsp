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

        <title>Chef Review Board</title>

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
                                <a href="chefmain.html"><i class="zmdi zmdi-view-dashboard"></i> <span> MainPage </span> </a>
                            </li>
                            <li class="has-submenu">
                                <a href="chefplan.html"><i class="zmdi zmdi-invert-colors"></i> <span> 일정계획입력 및 수정 </span> </a>                                
                            </li>

                            <li class="has-submenu">
                                <a href="reviewboard.html"><i class="zmdi zmdi-collection-text"></i><span>후기 및 답변달기 </span> </a>                                
                            </li>

                            <li class="has-submenu">
                                <a href="#"><i class="zmdi zmdi-view-list"></i> <span> 판매 통계 </span> </a>
                            </li>

                            <li class="has-submenu">
                                <a href="#"><i class="zmdi zmdi-chart"></i><span> 메뉴 및 사진 등록 </span> </a>
                                <ul class="submenu">
                                    <li><a href="menuupload.html">메뉴 등록 및 수정</a></li>
                                    <li><a href="photoupload.html">기타 사진 등록</a></li>
                                </ul>
                            </li>

                            <li class="has-submenu">
                                <a href="chefmodify.html"><i class="zmdi zmdi-collection-item"></i><span> 개인정보수정 </span> </a>                                
                            </li>

                            <li class="has-submenu">
                                <a href="index.html"><i class="zmdi zmdi-layers"></i><span>HOME </span> </a>
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
                        <h4 class="page-title">Review Board</h4>
                    </div>
                </div>
                    <div class="col-lg-12">
                        <div class="card-box table-responsive">
                            <table class="table table-hover m-0 ">
                                <thead>
                                    <tr>
                                        <th></th>
                                        <th>장소</th>
                                        <th>내용</th>
                                        <th>일시</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th scope="row">1</th>
                                        <td>대학로</td>
                                        <td>국내 패스트 푸드에서 파는 햄버거와는 질적인 차이가 있습니다. 직접 만든 빵은 부드럽고 야채는 신선하여 그 모양을 유지하고 아삭아삭 소리가 납니다. 정말 맛있어요.</td>
                                        <td>2017/04/22</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">2</th>
                                        <td>종로</td>
                                        <td>이런 고급스러운 요리를 쉽게 만날 수 있다는 것이 행복합니다. 쉐프님의 손길 하나하나가 정성이 많이 들어 있네요.</td>
                                        <td>2017/04/21</td>
                                    </tr>
                                    <tr>
                                        <th scope="row">3</th>
                                        <td>보라매공원</td>
                                        <td>이제 바다 요리를 먹으러 바다까지 갈 필요가 없네요. 쉐프님이 직접 재료를 매일마다 골라온다고 합니다. 직접 눈으로 확인해 보세요. 강추합니다.</td>
                                        <td>2017/04/20</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div><!-- end col -->
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