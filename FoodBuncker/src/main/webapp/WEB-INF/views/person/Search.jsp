<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js" lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>FOOD BUNCKER  | About</title>
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

		<!--calendar css-->
		
        <link href="../resources/assets/plugins/fullcalendar/dist/fullcalendar.css" rel="stylesheet" />     
        <link href="../resources/assets/css/core.css" rel="stylesheet" type="text/css" />      
        <link href="../resources/assets/css/pages.css" rel="stylesheet" type="text/css" />
		<link href="../resources/assets/plugins/select2/dist/css/select2.css" rel="stylesheet" type="text/css" />		
		
        <!-- MODERNIZR -->
        <script src="../resources/js/vendor/modernizr-2.8.3.min.js"></script>
	
    </head>
    <body class="about">
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
                    <h2>SEARCH FOOD TRUCK</h2>
                </div><!-- // .row -->
            </div><!-- // .container -->
        </section>
        <!-- // SECTION 1 -->

        <!-- SECTION 2 -->
        
<!-- ------------------지도 위에 당일 푸트트럭 위치 표시--------------------------------------------- -->        
        <section class="space">
            <div class="container">
				<div class="row">
					<div class="section-headline">
                        <h3>지도에서 위치 찾기</h3>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12" align="center">
                            <div id="map_canvas" style="width:1000px;height:400px;">
                            </div>
                    </div>                   
                </div>
            </div>
        </section>
        <!-- // SECTION 2 -->

        <!-- SECTION 3 -->
        <section class="space space-dark">
            <div class="container">
                <div class="row">
					<div class="section-headline">
                        <h3>일자별 위치 찾기</h3>
                    </div>
					<div class="table table-bordered">
                </div>
            </div>
			<div class="col-lg-12">
                        <div class="card-box">
                            <table class="table table table-hover m-0">
                                <thead>
									<tr>
<!----------------------------------------------당일부터 일주일간 표시--------------------------------------------------- -->
										<td colspan="8">${STARTDATE } - ${ENDDATE }</td>
									</tr>
                                    <tr>
                                        <th></th>
                                    <c:forEach var="data" items="${DAYWEEKLIST }">
                                        <th>${ data}</th>
                                     </c:forEach>
                                    </tr>
                                </thead>
                                <tbody>
                                
<!-- -----------------------   foreach문 사용하여  반복--------------------------------------- --> 
							                                
                                    <tr>
                            <c:forEach var="data" items="${TWEEKPLAN }" varStatus="st">
                            	<c:if test="${st.count%7 == 1 }">
                                        <th scope="row">${data.tname }</th>
                              	</c:if>
                                        <td>${data.pname }</td>
                                 <c:if test="${st.count%7 == 0 }">
                                    </tr>
                                    <tr>
                                 </c:if>
                           </c:forEach>	         
<!-- -----------------------   foreach문 사용하여  반복 끝--------------------------------------- --> 

                                
                                    
                                </tbody>
                            </table>

                        </div>
                    </div><!-- end col -->
        </section>
        <!-- // SECTION 3 -->

        <!-- SECTION 4 -->
        <section class="container">
            <div class="container">
                <div class="row">
                    <div class="section-headline">
                        <h3>FOOD TRUCK 별 위치 검색</h3>
                        <form class="form-horizontal" role="form" id="frm" action="">
							<div class="form-group">
								<div class="col-md-10">
									<select id="truckName">
									<option value=0>=======선택하세요==========</option>
										<c:forEach var="data" items="${ALLTRUCK }">
											<option value="${data.tno }">${data.tname }</option>
										</c:forEach>
									</select>
								</div>
							</div>
						</form> 
                    </div>
                </div>
            </div>
			<div class="col-md-12">
				<div class="card-box">
				  <div id="calendar"></div>
                </div>
            </div> <!-- end col -->
        </section>
        <!-- // SECTION 4 -->       
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
       
		<!-- BEGIN PAGE SCRIPTS -->
		<script src="../resources/assets/plugins/jquery-ui/jquery-ui.min.js"></script>
        <script src="../resources/assets/plugins/moment/moment.js"></script> 
        
        <script src='../resources/assets/plugins/fullcalendar/dist/fullcalendar.min.js'></script>
        <script src="../resources/assets/pages/jquery.fullcalendar.js"></script> 
		<!-- 달력내 일정 입력 jquery -->
        
        <script type="text/javascript" src="https://apis.daum.net/maps/maps3.js?apikey=dac3b6738ce771f13c325339b20d8183&libraries=services"></script>
		<script>
		$(document).ready(function(){
				//$('#calendar').fullCalendar('removeEvents');
				$('#calendar').fullCalendar({
				//	defaultDate: '2017-04-12',
				//	editable: true,
				//	eventLimit: true, // allow "more" link when too many events
					events: [
						{
							title: '대학로',
							start: '2017-04-25',
							className: 'bg-danger'
						}, 
						{
							title: '대학로',
							start:'2017-04-26',				
							className: 'bg-danger'
						}, 
						{
							title: '대학로',
							start:'2017-04-27',				
							className: 'bg-danger'
						}, 
						{
							title: '대학로',
							start:'2017-04-28',				
							className: 'bg-danger'
						}, 
						{
							title: '대학로',
							start:'2017-04-29',				
							className: 'bg-danger'
						}
					]
			});
			
			
			function init(){
    			map_initialize(37.5045083, 127.0489959);
    		}
			
    		window.onload=init();
    		var map;
    		
    		function map_initialize( myLat, myLng ){
    			console.log("map_initialize2");
    			var position = new daum.maps.LatLng(myLat,myLng);    			
    			map = new daum.maps.Map(document.getElementById('map_canvas'),{
    				center: position,
    				level: 9,
    				mapTypeId: daum.maps.MapTypeId.ROAD
    				
    			});
    			map.setDraggable(false);
    			map.setZoomable(false);
    			var tLat = new Array();
    			var tLng = new Array();
    			var tno = new Array();
    			var tname = new Array();
    			<c:forEach items="${TNOWLIST}" var="item">    			
    				tLat.push("${item.plat}");
    				tLng.push("${item.plng}");
    				tno.push("${item.tno}");
    				tname.push("${item.tname}");
    			</c:forEach>
    			for( var i=0 ; i < tLat.length ; i++){
    				addMarker(tLat[i],tLng[i],tno[i],tname[i]);
    			}
    			function addMarker(tLat,tLng,tno,tname){	
    				var geocoder = new daum.maps.services.Geocoder();
    				var coords=new daum.maps.LatLng(tLat, tLng);
    				var marker = new daum.maps.Marker({
    					map: map,
    					position: coords,
    					clickable: true
    				});
    				var contentname = tname;
    				var infowindow = new daum.maps.InfoWindow({
    					content : '<div style="padding:5px;"> <a href="../person/DetailView.hair?tno='+tno+'">'+tname+'</a></div>',
    					removable: true
    				});
    				daum.maps.event.addListener(marker,'click',function(){
    					infowindow.open(map, marker);
    				}); 
    			}
    		};

		});
		</script>
    </body>
</html>
