<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js" lang="">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>FOOD BUNCKER  | Coffees</title>
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

        <!-- MODERNIZR -->
        <script src="../resources/js/vendor/modernizr-2.8.3.min.js"></script>
    </head>
    <body class="coffees">
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
                    <h2>Food Truck Menu</h2>
                </div><!-- // .row -->
            </div><!-- // .container -->
        </section>
        <!-- // SECTION 1 -->

        <!-- SECTION 2 - COFFEE ITEMS -->
        <section class="space" >
            <div class="container">
				<div class="row">
					<div class="col-lg-6">
						<form class="form-horizontal" role="form" id="frm" action="">
							<div class="form-group">
								<label class="col-md-2 control-label">검색어</label>
								<div class="col-md-10">
									<input type="text" class="form-control" value="검색어를 입력해 주세요.">
									<input type="submit" class="btn btn-primary" value="검색">
								</div>
							</div>
						</form>
					</div>
				</div>
				
			
         
           	<div class="row">
                <c:forEach var="data" items="${LIST }" varStatus="temp">
                    <div class="col-md-4">
                        <div class="item">
                            <div class="align">
                               <div class="item-thumbnail">
                               	<a href="../person/DetailView.food?tno=${data.tno }&nowPage=${PINFO.nowPage }">
                                 <img src="../image/${data.imgname }" alt="About the image"></a>
                               </div>
                               <h4>${data.name }</h4>
                               <p>${data.body }</p>
                            </div>
                            <span class="price">${data.price }원</span>
                        </div>
                    </div>
              		<c:if test="${temp.count % 3 eq 0 }">
              			<c:if test="${temp.last eq false }">
              				</div>
              				<div class="row">
              			</c:if>
              		</c:if>                    
             	</c:forEach> 
           	</div>
           	<div class="row" id="moreMenu">
           	
           	</div>
           	
        <c:if test="${PINFO.nowPage ne PINFO.totalPage }">   	
     		<div class="row">
            	<div class="text-center">
                	<input type="button" class="btn btn-default btn-colored" id="lBtn" value="Load More">
              	</div>
          	</div>
		</c:if>	                
	                
      	</div>
        </section>
        <!-- SECTION 2 -->

        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-sm-4">
                        <div class="footer-social">
                        </div>
                    </div>
                    <div class="col-sm-4">
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
        
        
        <script>
        var menuPage=0;
        $(document).ready(function(){
        	$("#lBtn").click(function(){
        		menuPage = menuPage+1;
        		//var nowPage=${PINFO.nowPage}+1;
         		$.ajax({
        			type : "GET",
        			url : "../person/MenuAddView.food",
        			data : "temp=" + new Date() + "&nowPage="+(menuPage+1),
        			dataType : "json",
	       			success : setMenuView,
					error : function(){
        				alert("에러다"+menuPage);
        			} 
        		});
        	});        	
        });
        function setMenuView(data){
        	var str = "";
        	var addmenus = data.menuadd
        	var i = 0 ;
			$.each(addmenus,function(key,temp){
				var tno = temp.tno;
				var nowPage = temp.nowPage;
				var imgname = temp.imgname;
				var name = temp.name;
				var body = temp.body;
				var price = temp.price;
				i=i+1
				str +="<div class='col-md-4'>"
                	+	"<div class='item'>"
                	+		"<div class='align'>"
                   	+			"<div class='item-thumbnail'>"
                   	+				"<a href='../../person/DetailView.food?tno="+tno+"&nowPage="+nowPage+"'>"
                    +				"<img src='../image/"+imgname+"' alt='About the image'></a>"
                   	+			"</div>"
                   	+			"<h4>"+name+"</h4>"
                   	+			"<p>"+body+"</p>"
                	+		"</div>"
                	+		"<span class='price'>"+this.price+"원</span>"
            		+	"</div>"
        			+"</div>"
        		if(i % 3 == 0 ){
      				str +="</div>"
      					+ "<div class='row'>"
        		} 
			});
        	//alert(str);
			$("#moreMenu").append(str);
        }
        </script>
    </body>
</html>
