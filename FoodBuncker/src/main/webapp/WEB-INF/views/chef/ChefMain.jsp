<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<link rel="stylesheet" href="../resources/assets/plugins/morris/morris.css">

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
                                <a href="../chef/Main.food?tno=${TNO }"><i class="zmdi zmdi-view-dashboard"></i> <span> MainPage </span> </a>
                            </li>
                            <li class="has-submenu">
                                <a href="../chef/PlanModify.food?tno=${TNO }"><i class="zmdi zmdi-invert-colors"></i> <span> 일정계획입력 및 수정 </span> </a>                                
                            </li>

                            <li class="has-submenu">
                                <a href="../chef/Review.food?tno=${TNO }"><i class="zmdi zmdi-collection-text"></i><span>후기 및 답변달기 </span> </a>                                
                            </li>

                            <li class="has-submenu">
                                <a href="#"><i class="zmdi zmdi-view-list"></i> <span> 판매 통계 </span> </a>
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
                        <div class="btn-group pull-right m-t-15">
                           <a href="../chef/OrderBoard.food?tno=${TNO }"><button type="button" class="btn btn-danger waves-effect w-md waves-light m-b-5" aria-expanded="false" id="startBtn">Order Board <span class="m-l-5"><i class="dripicons-cutlery"></i></span></button></a>
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
                                     <li>연평균매출액:${YEARSALERATIO.YAVG }</li>
                                 </ul>
                             </div>

                             <h4 class="header-title m-t-0 m-b-30">연평균 대비 현재 매출현황</h4>

                             <div class="widget-box-2">
                                 <div class="widget-detail-2">
                                     <span class="badge badge-danger pull-left m-t-20">${YEARSALERATIO.RATIO }% <i
                                             class="zmdi zmdi-trending-up"></i> </span>
                                     <h2 class="m-b-0"> ${YEARSALERATIO.YEARSUM } </h2>
                                     <p class="text-muted m-b-25">${YEARSALERATIO.YEARNAME }년 매출</p>
                                 </div>
                                 <div class="progress progress-bar-danger-alt progress-sm m-b-0">
                                     <div class="progress-bar progress-bar-danger" role="progressbar"
                                          aria-valuenow="${YEARSALERATIO.RATIO }" aria-valuemin="0" aria-valuemax="100"
                                          style="width: ${YEARSALERATIO.RATIO }%;">
                                         <span class="sr-only">${YEARSALERATIO.RATIO }% Complete</span>
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
                                     <li>${MONTHSALERATIO.MONTHNAME}월평균매출액:${MONTHSALERATIO.MAVG }</li>
                                 </ul>
                             </div>

                             <h4 class="header-title m-t-0 m-b-30">월평균대비 매출현황</h4>

                             <div class="widget-box-2">
                                 <div class="widget-detail-2">
                                     <span class="badge badge-success pull-left m-t-20">${MONTHSALERATIO.RATIO }% <i
                                             class="zmdi zmdi-trending-up"></i> </span>
                                     <h2 class="m-b-0"> ${MONTHSALERATIO.MONTHSUM } </h2>
                                     <p class="text-muted m-b-25">${MONTHSALERATIO.MONTHNAME }월 매출</p>
                                 </div>
                                 <div class="progress progress-bar-success-alt progress-sm m-b-0">
                                     <div class="progress-bar progress-bar-success" role="progressbar"
                                          aria-valuenow="${MONTHSALERATIO.RATIO }" aria-valuemin="0" aria-valuemax="100"
                                          style="width: ${MONTHSALERATIO.RATIO }%;">
                                         <span class="sr-only">${MONTHSALERATIO.RATIO }% Complete</span>
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
                                     <li>${DAYSALERATIO.DAYNAME }일평균매출액:${DAYSALERATIO.DAVG }</li>
                                 </ul>
                             </div>

                             <h4 class="header-title m-t-0 m-b-30">일평균대비 매출현황</h4>

                             <div class="widget-box-2">
                                 <div class="widget-detail-2">
                                     <span class="badge badge-warning pull-left m-t-20">${DAYSALERATIO.RATIO }% <i
                                             class="zmdi zmdi-trending-up"></i> </span>
                                     <h2 class="m-b-0"> ${DAYSALERATIO.DAYSUM } </h2>
                                     <p class="text-muted m-b-25">${DAYSALERATIO.DAYNAME }일 매출</p>
                                 </div>
                                 <div class="progress progress-bar-warning-alt progress-sm m-b-0">
                                     <div class="progress-bar progress-bar-warning" role="progressbar"
                                          aria-valuenow="${DAYSALERATIO.RATIO }" aria-valuemin="0" aria-valuemax="100"
                                          style="width: ${DAYSALERATIO.RATIO }%;">
                                         <span class="sr-only">${DAYSALERATIO.RATIO }% Complete</span>
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
                                     <li>${HOURSALERATIO.HOURNAME }시 평균매출:${HOURSALERATIO.HAVG }</li>
                                 </ul>
                             </div>

                             <h4 class="header-title m-t-0 m-b-30">시간대 평균대비 매출현황</h4>

                             <div class="widget-box-2">
                                 <div class="widget-detail-2">
                                     <span class="badge badge-pink pull-left m-t-20">${HOURSALERATIO.RATIO }% <i
                                             class="zmdi zmdi-trending-up"></i> </span>
                                     <h2 class="m-b-0"> ${HOURSALERATIO.HOURSUM } </h2>
                                     <p class="text-muted m-b-25">${HOURSALERATIO.HOURNAME }시 매출</p>
                                 </div>
                                 <div class="progress progress-bar-pink-alt progress-sm m-b-0">
                                     <div class="progress-bar progress-bar-pink" role="progressbar"
                                          aria-valuenow="${HOURSALERATIO.RATIO }" aria-valuemin="0" aria-valuemax="100"
                                          style="width: ${HOURSALERATIO.RATIO }%;">
                                         <span class="sr-only">${HOURSALERATIO.RATIO }% Complete</span>
                                     </div>
                                 </div>
                             </div>
                         </div>
                     </div><!-- end col -->

                 </div>
                <!-- end row -->

                <div class="row">
                    <div class="col-lg-6">
                        <div class="card-box">
                            <h4 class="header-title m-t-0">메뉴별 판매비중</h4>
                            <div class="widget-chart text-center">
                                <div id="morris-donut-example-menu" style="height: 245px;"></div>
                                <ul class="list-inline chart-detail-list m-b-0">
                                <c:forEach var="data" items="${MENUCOUNTRATIO }" varStatus="st">
                                    <li>
                                        <h5 style="color: ${COLORCODE[st.count-1]};"><i class="fa fa-circle m-r-5"></i>${data.mname }</h5>
                                    </li>
                              	</c:forEach>
                                </ul>
                            </div>
                        </div>
                    </div><!-- end col -->
                    
                    <div class="col-lg-6">
                        <div class="card-box">
                            <h4 class="header-title m-t-0">요일별 판매비중</h4>
                            <div class="widget-chart text-center">
                                <div id="morris-donut-example-week" style="height: 245px;"></div>
                                <ul class="list-inline chart-detail-list m-b-0">
                                <c:forEach var="data" items="${WEEKSALERATIO }" varStatus="st">
                                    <li>
                                        <h5 style="color: ${COLORCODE[st.count-1]};"><i class="fa fa-circle m-r-5"></i>${data.weekname }</h5>
                                    </li>
                              	</c:forEach>
                                </ul>
                            </div>
                        </div>
                    </div><!-- end col -->
           		</div>
           		
           		<div class="row">
                    <div class="col-lg-6">
                        <div class="card-box">
                            <h4 class="header-title m-t-0">성별 판매비중</h4>
                            <div class="widget-chart text-center">
                                <div id="morris-donut-example-gender" style="height: 245px;"></div>
                                <ul class="list-inline chart-detail-list m-b-0">
                                <c:forEach var="data" items="${GENDERSALERATIO }" varStatus="st">
                                    <li>
                                        <h5 style="color: ${COLORCODE[st.count-1]};"><i class="fa fa-circle m-r-5"></i>${data.gender }</h5>
                                    </li>
                              	</c:forEach>
                                </ul>
                            </div>
                        </div>
                    </div><!-- end col -->
                    
                    <div class="col-lg-6">
                        <div class="card-box">
                            <h4 class="header-title m-t-0">연령대별 판매비중</h4>
                            <div class="widget-chart text-center">
                                <div id="morris-donut-example-age" style="height: 245px;"></div>
                                <ul class="list-inline chart-detail-list m-b-0">
                                <c:forEach var="data" items="${AGESALERATIO }" varStatus="st">
                                    <li>
                                        <h5 style="color: ${COLORCODE[st.index]};"><i class="fa fa-circle m-r-5"></i>${data.age }</h5>
                                    </li>
                              	</c:forEach>
                                </ul>
                            </div>
                        </div>
                    </div><!-- end col -->
           		</div>
           		
           		
             	<div class="row">
                    <div class="col-lg-12">
                        <div class="card-box">
                            <h4 class="header-title m-t-0">장소별 판매현황</h4>
                            <div id="morris-bar-example" style="height: 280px;"></div>
                        </div>
                    </div><!-- end col -->
               </div>
               
               <div class="row">
                    <div class="col-lg-12">
                        <div class="card-box">
                            <h4 class="header-title m-t-0">일자별 판매현황(<span><font color="#9f5ec9">2017</font></span>,<span><font color="#989add">2016</font></span>,<span><font color="#dfd79f">2015</font></span>) </h4>
                            <div id="morris-line-example" style="height: 280px;"></div>
                        </div>
                    </div><!-- end col -->
                </div>
                <!-- end row -->

				<!-- 후기 리스트 -->
                <div class="row">
                    

                    <div class="col-lg-12">
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

                            <h4 class="header-title m-t-0 m-b-30">장소별 예상매출(2017-05-15)</h4>

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
      <!--   <script src="../resources/assets/pages/jquery.dashboard.js"></script>   -->

        <!-- App js -->
        <script src="../resources/assets/js/jquery.core.js"></script>
        <script src="../resources/assets/js/jquery.app.js"></script>

    </body>

	<script>
	$(document).ready(function(){
		var colorarr = ["#349D4B","#818e2f","#9ed98c", "#dfd79f", "#e9c9be","#cab3e6","#b3bee6","#989add","#9f5ec9","#934bc3","#4051bf","#201849","#58281d"]
		var $barData  = [
			<c:forEach var="data" items="${PLACESALESUM}" varStatus="st">
			<c:if test="${st.last eq false}">
            	{ y: '${data.pname}', a: ${data.salesum} },
            </c:if>
            <c:if test="${st.last ne false}">
            	{ y: '${data.pname}', a: ${data.salesum} }
            </c:if>
            </c:forEach>           
        ];
        createBarChart('morris-bar-example', $barData, 'y', ['a'], ['Statistics'], [colorarr[7]]);

        //create line chart
        var $data  = [
        	<c:forEach var="data" items="${DAYSALESUM}" varStatus="st">
        	<c:if test="${st.last eq false}">
            	{ y: '${data.sdate}', a: ${data.s2015}, b: ${data.s2016}, c:${data.s2017} },
            </c:if>
            <c:if test="${st.last ne false}">
            	{ y: '${data.sdate}', a: ${data.s2015}, b: ${data.s2016}, c:${data.s2017} }
            </c:if>
           	</c:forEach>
         
          ];
        createLineChart('morris-line-example', $data, 'y', ['a','b','c'], ['2015년','2016년','2017년'],['0.9'],[colorarr[1]],[colorarr[2]], [colorarr[3],colorarr[7],colorarr[8]]);

        //creating donut chart
        var $donutDataMenu = [
        	<c:forEach var="data" items="${MENUCOUNTRATIO}" varStatus="st">
        	<c:if test="${st.last eq false}">
                {label: "${data.mname}", value: ${data.ratio}},
          	</c:if>
            <c:if test="${st.last ne false}">
            	{label: "${data.mname}", value: ${data.ratio}}
          	</c:if>
          	</c:forEach>
            ];
        createDonutChart('morris-donut-example-menu', $donutDataMenu, [
        	<c:forEach var="data" items="${MENUCOUNTRATIO}" varStatus="st">
        	<c:if test="${st.last eq false}">	
        		colorarr[${st.index}],
        	</c:if>	
        	<c:if test="${st.last ne false}">	
        		colorarr[${st.index}]
        	</c:if>
        	</c:forEach>
        	]);
        
        var $donutDataWeek = [
        	<c:forEach var="data" items="${WEEKSALERATIO}" varStatus="st">
            <c:if test="${st.last eq false}">
        		{label: "${data.weekname}", value: ${data.ratio}},
        	</c:if>
        	<c:if test="${st.last ne false}">
         		{label: "${data.weekname}", value: ${data.ratio}}
         	</c:if>
           </c:forEach>
        ];
    	createDonutChart('morris-donut-example-week', $donutDataWeek, [
    		<c:forEach var="data" items="${WEEKSALERATIO}" varStatus="st">
    		<c:if test="${st.last eq false}">
    			colorarr[${st.index}],
    		</c:if>
    		<c:if test="${st.last ne false}">
    			colorarr[${st.index}]
    		</c:if>
    		</c:forEach>
    	]);
    	
   		 var $donutDataGender = [
   			<c:forEach var="data" items="${GENDERSALERATIO}" varStatus="st">
   			<c:if test="${st.last eq false}">
        		{label: "${data.gender}", value: ${data.ratio}},
        	</c:if>
        	<c:if test="${st.last ne false}">
        		{label: "${data.gender}", value: ${data.ratio}}
        	</c:if>
        	</c:forEach>
        	
    	];
		createDonutChart('morris-donut-example-gender', $donutDataGender, [
			<c:forEach var="data" items="${GENDERSALERATIO}" varStatus="st">
			<c:if test="${st.last eq false}">
				colorarr[${st.index}],
			</c:if>
			<c:if test="${st.last ne false}">
				colorarr[${st.index}]
			</c:if>
			</c:forEach>
		]);
		
		var $donutDataAge = [
			<c:forEach var="data" items="${AGESALERATIO}" varStatus="st">
			<c:if test="${st.last eq false}">
        		{label: "${data.age*10}", value: ${data.ratio}},
        	</c:if>
        	<c:if test="${st.last ne false}">
        		{label: "${data.age*10}", value: ${data.ratio}}
        	</c:if>
        	</c:forEach>
    	];
		createDonutChart('morris-donut-example-age', $donutDataAge, [
			<c:forEach var="data" items="${AGESALERATIO}" varStatus="st">
			<c:if test="${st.last eq false}">
				colorarr[${st.index}],
			</c:if>
			<c:if test="${st.last ne false}">
				colorarr[${st.index}]
			</c:if>
			</c:forEach>
		]);
	});
	var createBarChart  = function(element, data, xkey, ykeys, labels, lineColors) {
	        Morris.Bar({
	            element: element,
	            data: data,
	            xkey: xkey,
	            ykeys: ykeys,
	            labels: labels,
	            hideHover: 'auto',
	            resize: true, //defaulted to true
	            gridLineColor: '#eeeeee',
	            barSizeRatio: 0.2,
	            barColors: lineColors
	        });
	    };
	 
	var createLineChart = function(element, data, xkey, ykeys, labels, opacity, Pfillcolor, Pstockcolor, lineColors) {
	        Morris.Line({
	          element: element,
	          data: data,
	          parseTime: false,
	          xkey: xkey,
	          xLabels: 'day',
	          ykeys: ykeys,
	          labels: labels,
	          fillOpacity: opacity,
	          pointFillColors: Pfillcolor,
	          pointStrokeColors: Pstockcolor,
	          behaveLikeLine: false,
	          gridLineColor: '#eef0f2',
	          hideHover: 'auto',
	          resize: true, //defaulted to true
	          pointSize: 0,
	          lineColors: lineColors,
	          continuousLine: false
	        });
	};
	
	
	var createDonutChart = function(element, data, colors) {
        Morris.Donut({
            element: element,
            data: data,
            resize: true, //defaulted to true
            colors: colors
        });
    };


	</script>
</html>