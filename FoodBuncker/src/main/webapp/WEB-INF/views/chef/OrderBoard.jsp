<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
        <meta name="author" content="Coderthemes">

        <link rel="shortcut icon" href="../resources/assets/images/favicon.ico">

        <title>${OPENCLOSEPLACE.tname }</title>

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
                        <a href="../person/MainWindow.food" class="logo"><span>Food<span>Buncker</span></span></a>
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
                    <c:if test="${OPENCLOSEPLACE.openTime ne OPENCLOSEPLACE.closeTime }">
                        <div class="btn-group pull-right m-t-15">
                            <button type="button" class="btn btn-custom waves-effect waves-light"  id="oBtn">영업시작입력 <span class="m-l-5"><i class="fa fa-cog"></i></span></button>
                        </div>
                  	</c:if>
                  	<c:if test="${OPENCLOSEPLACE.openTime eq OPENCLOSEPLACE.closeTime }">
                        <div class="btn-group pull-right m-t-15">
                            <button type="button" class="btn btn-danger waves-effect waves-light" id="cBtn">영업종료입력 <span class="m-l-5"><i class="fa fa-cog"></i></span></button>
                        </div>
                  	</c:if>
                        <h4 class="page-title">Order Board</h4>
                    </div>
                </div>


                <div class="row m-t-10">
                    <div class="col-md-10 col-md-offset-1">
                        <div class="row">

                            <!--Pricing Column-->
                            
 <!-- -----------------------    foreach문으로 반복 시작------------------------------------------------- --> 	                                  
                   		<c:forEach var="data" items="${ORDERLIST }">
                   			<article class="pricing-column col-lg-3 col-sm-6" >
                   			<c:if test="${data.orderTime  ne data.payTime }">
                   				<div class="ribbon"><span>조리중</span></div>
                   			</c:if>
                                <div class="inner-box card-box" style="height:500px;">
                                    <div class="plan-header text-center">
                                        <h3 class="plan-title">주문No</h3>
                                        <h2 class="plan-price">${data.ono }</h2>
                                        <div class="plan-duration">주문시간 ${data.orderTime }</div>
                                    </div>
									<div class="text-center">
									<c:if test="${data.orderTime  eq data.payTime }">
                                        <a href="../chef/Invoice.food?ono=${data.ono }" class="btn btn-success btn-bordred btn-rounded waves-effect waves-light">결제</a>
                                 	</c:if>
                                 	<c:if test="${data.orderTime ne data.payTime }">
                                        <a href="../chef/CookEndProc.food?ono=${data.ono }&tno=${data.tno}" class="btn btn-primary btn-bordred btn-rounded waves-effect waves-light">완료입력</a>
                                 	</c:if>
                                    </div>
                                    <ul class="plan-stats list-unstyled text-center">
                                    	<c:forEach var="data1" items="${ORDERMENULIST }">
                                    		<c:if test="${data.ono eq data1.ono }">
                                    			<li>${data1.mName }            ${data1.mnum }</li>
                                    		</c:if>
                                        </c:forEach>
                                    </ul>
                                </div>
                            </article>
                            
                  		</c:forEach>
<!-- -----------------------   foreach문으로 반복 끝----------------------------------------------------- --> 
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
        
        <script>
        $(document).ready(function(){
        	$("#oBtn").click(function(){
        		$(location).attr("href","../chef/OpenProc.food?tno="+${OPENCLOSEPLACE.tno}+"&pno="+${OPENCLOSEPLACE.pno});
        		alert("영업시작 입력이 되었습니다.")
        	});
        	$("#cBtn").click(function(){
        		$(location).attr("href","../chef/CloseProc.food?tno="+${OPENCLOSEPLACE.tno}+"&pno="+${OPENCLOSEPLACE.pno});
        	});
        });
        </script>

    </body>
</html>