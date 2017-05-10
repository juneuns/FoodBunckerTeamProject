<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js" lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>FOOD BUNCKER  | Shop</title>
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
        
        <link href="../resources/assets/plugins/bootstrap-tagsinput/dist/bootstrap-tagsinput.css" rel="stylesheet" />
        <link href="../resources/assets/plugins/multiselect/css/multi-select.css"  rel="stylesheet" type="text/css" />
        <link href="../resources/assets/plugins/select2/dist/css/select2.css" rel="stylesheet" type="text/css">
        <link href="../resources/assets/plugins/select2/dist/css/select2-bootstrap.css" rel="stylesheet" type="text/css">
        <link href="../resources/assets/plugins/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.css" rel="stylesheet" />
        <link href="../resources/assets/plugins/switchery/switchery.min.css" rel="stylesheet" />
        <link href="../resources/assets/plugins/timepicker/bootstrap-timepicker.min.css" rel="stylesheet">
		<link href="../resources/assets/plugins/mjolnic-bootstrap-colorpicker/dist/css/bootstrap-colorpicker.min.css" rel="stylesheet">
		<link href="../resources/assets/plugins/bootstrap-datepicker/dist/css/bootstrap-datepicker.min.css" rel="stylesheet">
		<link href="../resources/assets/plugins/bootstrap-daterangepicker/daterangepicker.css" rel="stylesheet">

        <link href="../resources/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="../resources/assets/css/core.css" rel="stylesheet" type="text/css" />
        <link href="../resources/assets/css/components.css" rel="stylesheet" type="text/css" />
        <link href="../resources/assets/css/icons.css" rel="stylesheet" type="text/css" />
        <link href="../resources/assets/css/pages.css" rel="stylesheet" type="text/css" />
        <link href="../resources/assets/css/menu.css" rel="stylesheet" type="text/css" />
        <link href="../resources/assets/css/responsive.css" rel="stylesheet" type="text/css" />

        <!-- MODERNIZR -->
        <script src="../resources/js/vendor/modernizr-2.8.3.min.js"></script>
    </head>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>    
    <body class="shop">
        <!--[if lt IE 8]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
        <![endif]-->

        <!-- PRELOADER -->
        <div id="preloader">
            <div class="spinner"></div>
        </div>
        <!-- // PRELOADER -->

      

        <!-- SECTION 1 - HERO TITLE -->
       
            <div class="container">
                <div class="row">
                    <h2>주문 입력</h2><br>
                    <h5>메뉴의 주문 숫자를 입력 확인 후 주문 버튼을 눌러주세요.</h5>
                </div><!-- // .row -->
            </div><!-- // .container -->
    
        <!-- // SECTION 1 -->

        <!-- SECTION 2 - GALLERY -->
        <section class="gallery space">
            <div class="container">
            
<!-- -----------------------   foreach문으로 1단 반복, 총 사진 갯수 알아내어 반복 횟수 정해야 함--------------------------------------- -->             
                <div class="row">
                <form id="frm">
<!-- -----------------------  foreach문으로 1단 1열 반복-------------------------------------- -->                 
                    
                    <div class="col-sm-6" align="center">
                    <c:forEach var="data" items="${LIST}">
                        <div class="card-box ">
                            <img src="../image/${data.savename}">
                            <div class="caption">
                                <div class="align">
                                    <h5>${data.mName}</h5><br>
                                    <h5>${data.price }원</h5>
                                </div>
                                <div class="row">
                                	<div class="col-md-6" align="center">
                                    	<div class="p-20">
                                    		<div class="form-group">
                                               	<label class="control-label">주문수량</label>
                                               	<input id="mnum" type="text" value="0" name="mnum" data-bts-min="0" data-bts-max="100" data-bts-init-val="" data-bts-step="1" data-bts-decimal="0" data-bts-step-interval="100" data-bts-force-step-divisibility="round" data-bts-step-interval-delay="500" data-bts-prefix="" data-bts-postfix="" data-bts-prefix-extra-class="" data-bts-postfix-extra-class="" data-bts-booster="true" data-bts-boostat="10" data-bts-max-boosted-step="false" data-bts-mousewheel="true" data-bts-button-down-class="btn btn-default" data-bts-button-up-class="btn btn-default"/>
                                           	</div>
                                    	</div>
                                	</div>    
                            	</div>
                        	</div>
                    	</div>
                    </c:forEach>
                   </form>
                    <div class="row" id="loadmore">
                    </div>
                <div class="row">
                    <div class="text-center">
                        <input type="button" class="btn btn-danger btn-colored" id="lBtn" value="주문">
                    </div>
                </div>
            </div>
        </section>
   
        <!-- JQUERY / PLUGINS -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="../resources/js/vendor/jquery-1.11.3.min.js"><\/script>')</script>
        <script src="../resources/js/vendor/bootstrap.min.js"></script>
        <script src="../resources/js/vendor/owl.carousel.min.js"></script>
        <script src="../resources/js/vendor/jquery.magnific-popup.min.js"></script>

        <!-- MAIN JS FOLDER -->
        <script src="../resources/js/main.js"></script>
        <!-- Plugins Js -->
        <script src="../resources/assets/plugins/bootstrap-touchspin/dist/jquery.bootstrap-touchspin.min.js" type="text/javascript"></script>
        <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
        <script>
            (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=
            function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;
            e=o.createElement(i);r=o.getElementsByTagName(i)[0];
            e.src='https://www.google-analytics.com/analytics.js';
            r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));
            ga('create','UA-XXXXX-X','auto');ga('send','pageview');
        </script>
        <script>
			$(document).ready(function(){
				$("#lBtn").click(function(){
					
				});
				$("input[name='mnum']").TouchSpin({
	                buttondown_class: "btn btn-primary",
	                buttonup_class: "btn btn-primary"
	            });

			});
	
</script> 
    </body>
</html>
