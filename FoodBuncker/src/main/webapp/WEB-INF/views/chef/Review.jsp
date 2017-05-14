<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
                                <a href="../chef/ChefMain.food?tno=${TNO }"><i class="zmdi zmdi-view-dashboard"></i> <span> MainPage </span> </a>
                            </li>
                            <li class="has-submenu">
                                <a href="../chef/PlanModify.food?tno=${TNO }"><i class="zmdi zmdi-invert-colors"></i> <span> 일정계획입력 및 수정 </span> </a>                                
                            </li>

                            <li class="has-submenu">
                                <a href="../chef/Review.food?tno=${TNO }"><i class="zmdi zmdi-collection-text"></i><span>후기 및 답변달기 </span> </a>                                
                            </li>
                            <li class="has-submenu">
                                <a href="#"><i class="zmdi zmdi-chart"></i><span> 메뉴 및 사진 등록 </span> </a>
                                <ul class="submenu">
                                    <li><a href="../chef/MenuModify.food?tno=${TNO }">메뉴 등록 및 수정</a></li>
                                    <li><a href="../chef/PhotoUpload.food?tno=${TNO }">기타 사진 등록</a></li>
                                </ul>
                            </li>

                            <li class="has-submenu">
                                <a href="../chef/InfoModify.food?tno=${TNO }"><i class="zmdi zmdi-collection-item"></i><span> 개인정보수정 </span> </a>                                
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
                                
<!-- -----------------------    foreach문으로 반복 시작--------------------------------------- --> 
								<c:forEach var="data" items="${LIST }">                                       
                                    <tr>
                                        <th scope="row">${data.rno }</th>
                                        <td>${data.pname }</td>
                                        <td>${data.reviewBody }</td>
                                        <td>${data.reviewTime }</td>
                                    </tr>
                              	</c:forEach>	
<!-- -----------------------   위의 foreach문으로 반복 끝--------------------------------------- --> 
								<div class="text-center">
									<ul class="pagination">
										<c:if test="${PINFO.startPage ne 1}">
											<li><a href="../chef/Review.food?nowPage=${PINFO.startPage - 1}&tno=${TNO}">&laquo;</a></li>
										</c:if>
										<c:forEach var="page" begin="${PINFO.startPage}" end="${PINFO.endPage}">
										<li>
											<a href="../chef/Review.food?nowPage=${page}&tno=${TNO}">${page}</a>
										</li>
										</c:forEach>
										<c:if test="${PINFO.endPage ne PINFO.totalPage}">
											<li><a href="../chef/Review.food?nowPage=${PINFO.endPage + 1}&tno=${TNO}">&raquo;</a></li>
										</c:if>	
									</ul>
								</div>	

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