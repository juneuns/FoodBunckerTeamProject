<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
        <meta name="author" content="Coderthemes">

        <!-- App Favicon -->
        <link rel="shortcut icon" href="../resources/assets/images/favicon.ico">

        <!-- App title -->
        <title>Food Buncker User View</title>

        <!-- App CSS -->
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


        <div class="wrapper-page">
            <div class="text-center">
                <a href="../person/MainWindow.food" class="logo"><span>Food<span>Buncker</span></span></a>
                
            </div>
        	<div class="m-t-40 card-box">
                
                <div class="panel-body">
                   
                        <div class="form-group text-center m-t-30">
                            <div class="col-xs-12">
                                <button class="btn btn-custom btn-bordred btn-block waves-effect waves-light" type="button" id="hBtn"=><h3>HOME</h3></button>
                            </div>
                        </div>
                   </div>
                   <div class="panel-body">
                        <div class="form-group text-center m-t-30">
                            <div class="col-xs-12">
                                <button class="btn btn-custom btn-bordred btn-block waves-effect waves-light" type="button" id="mBtn"><h3>메뉴 주문</h3></button>
                            </div>
                        </div>
                   </div>
                   <div class="panel-body">
                        <div class="form-group text-center m-t-30">
                            <div class="col-xs-12">
                                <button class="btn btn-custom btn-bordred btn-block waves-effect waves-light" type="button" id="rBtn"><h3>후기 작성</h3></button>
                            </div>
                        </div>



                </div>
            </div>
            <!-- end card-box-->

        </div>
        <!-- end wrapper page -->
        

        
    	<script>
            var resizefunc = [];
        </script>

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
		$("#hBtn").click(function(){
			$(location).attr("href","../person/DetailView.food?tno="+${TNO}+"&pno="+${PNO});
		});
		
		$("#mBtn").click(function(){
			$(location).attr("href","../chef/OrderInputForm.food?tno="+${TNO}+"&pno="+${PNO});
		});
		
		$("#rBtn").click(function(){
			$(location).attr("href","../person/reveiwForm.food?tno="+${TNO}+"&pno="+${PNO});
		});
	});
	</script>
	</body>

</html>