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
                <font size="3" color="red">메뉴 주문시 선택해 주셔야 주문이 가능합니다.</font><br>
                &nbsp성별을 선택해주세요.<br>
                &nbsp&nbsp<input type="radio" value="M" name="gender" class="gen" /> 남성  &nbsp&nbsp&nbsp&nbsp
                   	<input type="radio" value="F" name="gender" class="gen"/> 여성<br>
                &nbsp연령대를 선택해주세요.<br>
                &nbsp&nbsp<input type="radio" value="1" name="age" class="age" /> 10~19 &nbsp&nbsp&nbsp
                   	<input type="radio" value="2" name="age" class="age"/> 20~29 &nbsp&nbsp&nbsp
                   	<input type="radio" value="3" name="age" class="age"/> 30~39 &nbsp&nbsp&nbsp <br>
                &nbsp&nbsp<input type="radio" value="4" name="age" class="age"/> 40~49 &nbsp&nbsp&nbsp
                <input type="radio" value="5" name="age" class="age"/> 50~59 &nbsp&nbsp&nbsp
                <input type="radio" value="6" name="age" class="age"/> 60~
                   	
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
                   <c:if test="${ONUM ne null}">
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp주문번호 - ${ONUM}
                            </c:if>
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
			var gen = $(".gen:checked").val();
			var age = $(".age:checked").val();
			if(gen == null){
				alert("성별을 선택해주세요");
			}
			else if(age == null){
				alert("연령대를 선택해주세요");
			}
			else{
				$(location).attr("href","../chef/OrderInputForm.food?tno="+${TNO}+"&pno="+${PNO}+"&age="+age+"&gen="+gen);
			}
		});
		
		$("#rBtn").click(function(){
			$(location).attr("href","../person/reveiwForm.food?tno="+${TNO}+"&pno="+${PNO});
		});
	});
	</script>
	</body>

</html>