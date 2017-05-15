<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
        <meta name="author" content="Coderthemes">

        <link rel="shortcut icon" href="../resources/assets/images/favicon.ico">

        <title>Chef Menu Upload</title>

        <!-- form Uploads -->
        <link href="../resources/assets/plugins/fileuploads/css/dropify.min.css" rel="stylesheet" type="text/css" />

		<!-- X-editable css -->
        <link type="text/css" href="../resources/assets/plugins/x-editable/dist/bootstrap3-editable/css/bootstrap-editable.css" rel="stylesheet">


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
                                <a href="../chef/ChefMain.food"><i class="zmdi zmdi-view-dashboard"></i> <span> MainPage </span> </a>
                            </li>
                            <li class="has-submenu">
                                <a href="../chef/PlanModify.food"><i class="zmdi zmdi-invert-colors"></i> <span> 일정계획입력 및 수정 </span> </a>                                
                            </li>

                            <li class="has-submenu">
                                <a href="../chef/Review.food"><i class="zmdi zmdi-collection-text"></i><span>후기 및 답변달기 </span> </a>                                
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
                        <!-- <div class="btn-group pull-right m-t-15">
                            <button type="button" class="btn btn-custom dropdown-toggle waves-effect waves-light" data-toggle="dropdown" aria-expanded="false" id="sBtn" name="sBtn">저장 <span class="m-l-5"><i class="fa fa-cog"></i></span></button>
                        </div> -->
                        <h4 class="page-title">메뉴 등록</h4>
                    </div>
                </div>

			<form method="POST" action="#" class="form-horizontal" id="mfrm" name="mfrm" enctype="multipart/form-data">
					<input type="hidden" id="tino" name="tino" value="${DATA.tino}">
					<input type="hidden" id="oldMenuImg" name="oldMenuImg" value="${DATA.mImgName}">
					<input type="hidden" id="mmenuName" name="mmenuName">
					<input type="hidden" id="strPrice" name="strPrice">
					<input type="hidden" id="mmenuComment" name="mmenuComment">
					<input type="hidden" id="keyword" name="keyword">
					
                <div class="row">
                    <div class="col-sm-12">
                        <div class="card-box">
                        <div class="col-sm-10">
													<h4 class="header-title m-t-0 m-b-30">메인메뉴(1895X1000)</h4>
												</div>
									<div class="col-sm-2" style="text-align:right;">
										<button type="button" class="btn btn-custom dropdown-toggle waves-effect waves-light" data-toggle="dropdown" aria-expanded="false" id="msBtn" name="msBtn">저장 <span class="m-l-5"><i class="fa fa-cog"></i></span></button>
									</div>
                            <input type="file" class="dropify" id="mmImg" name="mmenuImg" data-height="300" data-default-file="../image/${DATA.mImgName}"/>
							<div class="row">
								<div class="form-group">
									<label class="col-sm-5 control-label">주메뉴이름</label>
									<div class="col-sm-5">
										<a href="#" class="mmmenuName" id="mmName" name="mmmenuName" data-type="text" data-pk="1">${DATA.mmenuName}</a>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label">주메뉴가격(원)</label>
								    <div class="col-sm-7">
										<a href="#" class="mmmenuPrice" id="mmPrice" name="mmmenuPrice" data-type="text" data-pk="1">${DATA.mmenuPrice}</a>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label">주메뉴설명</label>
									<div class="col-sm-7">
										<a href="#" class="mmmenuComment" id="mmComment" name="mmmenuComment" data-type="text" data-pk="1">${DATA.mmenuComment}</a>
									</div>
								</div>
									<div class="form-group">
										<label class="col-sm-5 control-label">검색키워드</label>
										<div class="col-sm-1">
											<a href="#" class="keyword" id="mmkeyword1" name="keyword1" data-type="text" data-pk="1">${DATA.keyword1}</a>
										</div>
										<div class="col-sm-1">
											<a href="#" class="keyword" id="mmkeyword2" name="keyword2" data-type="text" data-pk="1">${DATA.keyword2}</a>
										</div>
										<div class="col-sm-1">
											<a href="#" class="keyword" id="mmkeyword3" name="keyword3" data-type="text" data-pk="1">${DATA.keyword3}</a>
										</div>
										<div class="col-sm-1">
											<a href="#" class="keyword" id="mmkeyword4" name="keyword4" data-type="text" data-pk="1">${DATA.keyword4}</a>
										</div>
										<div class="col-sm-1">
											<a href="#" class="keyword" id="mmkeyword5" name="keyword5" data-type="text" data-pk="1">${DATA.keyword5}</a>
										</div>
										<c:if test="${data.keyword6 ne null }">
										<div class="col-sm-1">
											<a href="#" class="keyword" id="mmkeyword6" name="keyword6" data-type="text" data-pk="1">${DATA.keyword6}</a>
										</div>
										</c:if>
								</div>
							</div>
                        </div>
                    </div><!-- end col -->
                </div>
                <!-- end row -->
        </form>        
        
<c:forEach var="data" items="${LIST}">
		<form method="POST" action="#" class="form-horizontal" id="sfrm" name="sfrm" enctype="multipart/form-data">	
				 <div class="row">
						<div class="col-sm-12">
               <div class="card-box">
									<h4 class="header-title m-t-0 m-b-30">서브 메뉴</h4>
                  <input type="file" id="${data.mNo}subMImg" name="subMImg" class="dropify" data-height="200" data-default-file="../image/${data.sname}"/>
							<div class="row">
								<div class="form-group">
									<label class="col-sm-5 control-label">메뉴이름</label>
									<div class="col-sm-7">
										<a href="#" class="mmenuName" id="${data.mNo}mName" name="mmenuName" data-type="text" data-pk="1">${data.mmenuName}</a>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label">메뉴가격(원)</label>
								    <div class="col-sm-7">
										<a href="#" class="mmenuPrice" id="${data.mNo}price" name="mmenuPrice" data-type="text" data-pk="1">${data.mmenuPrice}</a>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label">메뉴설명</label>
									<div class="col-sm-7">
										<a href="#" class="mmenuComment" id="${data.mNo}imgbody" name="imgbody" data-type="text" data-pk="1">${data.mmenuComment}</a>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label">검색키워드</label>
									<div class="col-sm-1">
											<a href="#" class="keyword" name="keyword1" data-type="text" data-pk="1">${data.keyword1}</a>
										</div>
										<div class="col-sm-1">
											<a href="#" class="keyword" name="keyword2" data-type="text" data-pk="1">${data.keyword2}</a>
										</div>
										<div class="col-sm-1">
											<a href="#" class="keyword" name="keyword3" data-type="text" data-pk="1">${data.keyword3}</a>
										</div>
										<div class="col-sm-1">
											<a href="#" class="keyword" name="keyword4" data-type="text" data-pk="1">${data.keyword4}</a>
										</div>
										<div class="col-sm-1">
											<a href="#" class="keyword" name="keyword5" data-type="text" data-pk="1">${data.keyword5}</a>
										</div>
										<%-- <c:if test="${data.keyword6 ne null }">
										<div class="col-sm-1">
											<a href="#" class="keyword" name="keyword6" data-type="text" data-pk="1">${data.keyword6}</a>
										</div>
										</c:if> --%>
								</div>
								</div>
							</div>
                        </div><!-- end col -->
                    </div><!-- end row --> 
			</form> 
</c:forEach>
                       

				 <div class="row">
            <div class="col-sm-12">
		<form method="POST" class="form-horizontal" id="morefrm" name="morefrm" encType="multipart/form-data">	
                        
            <div class="card-box">
							<h4 class="header-title m-t-0 m-b-30">서브메뉴 추가(300X300)</h4>
                            <input type="file" id="menuImg" name="menuImg" class="dropify" data-height="200">						
							<div class="row">
							<br><br>

								<div class="form-group clearfix">
									<label class="col-lg-4 control-label" for="menuName">메뉴이름</label>
									<div class="col-lg-5">
										<input id="menuName" name="mmenuName" type="text" class="required form-control" placeholder="메뉴 이름">
									</div>
								</div>
								<div class="form-group clearfix">
									<label class="col-lg-4 control-label" for="menuPrice">메뉴가격(원)</label>
								    <div class="col-lg-5">
										<input id="menuPrice" name="mmenuPrice" type="text" class="required form-control" placeholder="가 격">
									</div>
								</div>
								<div class="form-group clearfix">
									<label class="col-lg-4 control-label" for="menuComment">메뉴설명</label>
									<div class="col-lg-5">
										<input id="menuComment" name="mmenuComment" type="text" class="required form-control" placeholder="설명을 입력해주세요!">
									</div>
								</div>
							
									<div class="form-group clearfix">
										<input type="hidden" id="kw" name="keyword">
										<label class="col-lg-4 control-label" for="keyword"> 검색키워드</label>
										<div class="col-lg-1">
											<input id="keyword1" name="keyword1" type="text" class="required form-control" placeholder="Keyword 1">
										</div>
										<div class="col-lg-1">
											<input id="keyword2" name="keyword2" type="text" class="required form-control" placeholder="Keyword 2">
										</div>
										<div class="col-lg-1">
											<input id="keyword3" name="keyword3" type="text" class="required form-control" placeholder="Keyword 3">
										</div>
										<div class="col-lg-1">
											<input id="keyword4" name="keyword4" type="text" class="required form-control" placeholder="Keyword 4">
										</div>
										<div class="col-lg-1">
											<input id="keyword5" name="keyword5" type="text" class="required form-control" placeholder="Keyword 5">
										</div>
									</div>
							<div style="text-align:center;">
								<div class="row btn-group">
                    <button type="button" href="#" id="sBtn" class="btn btn-custom dropdown-toggle waves-effect waves-light" data-toggle="dropdown" aria-expanded="false"> 메뉴 등록 <span class="m-l-5"><i class="fa fa-cog"></i></span></button>
                </div>
							</div>
									
							</div>	
						
          </div>
			</form>
    </div><!-- end col -->
 </div><!-- end row -->
 
 
         </div>
                <!-- Footer -->
                <footer class="footer text-right">
                    <div class="container">
                        
                    </div>
                </footer>
                <!-- End Footer -->

            </div>
            <!-- end container -->
        



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

        <!-- file uploads js -->
        <script src="../resources/assets/plugins/fileuploads/js/dropify.min.js"></script>

		<!-- XEditable Plugin -->
        <script src="../resources/assets/plugins/moment/moment.js"></script>
        <script type="text/javascript" src="../resources/assets/plugins/x-editable/dist/bootstrap3-editable/js/bootstrap-editable.min.js"></script>
        <script type="text/javascript" src="../resources/assets/pages/jquery.xeditable.js"></script>

        <!-- App js -->
        <script src="../resources/assets/js/jquery.core.js"></script>
        <script src="../resources/assets/js/jquery.app.js"></script>

        <script type="text/javascript">
            $('.dropify').dropify({
                messages: {
                    'default': 'Drag and drop a file here or click',
                    'replace': 'Drag and drop or click to replace',
                    'remove': 'Remove',
                    'error': 'Ooops, something wrong appended.'
                },
                error: {
                    'fileSize': 'The file size is too big (1M max).'
                }
            });
        </script>
		<script>
		$(document).ready(function(){
			$('.mmmenuName').editable({mode: 'inline'});
			$('.mmmenuPrice').editable({mode: 'inline'});
			$('.mmmenuComment').editable({mode: 'inline'});
			$('.keyword').editable({mode: 'inline'});
			$('.keyword1').editable({mode: 'inline'});
			$('.keyword2').editable({mode: 'inline'});
			$('.keyword3').editable({mode: 'inline'});
			$('.keyword4').editable({mode: 'inline'});
			$('.keyword5').editable({mode: 'inline'});
			$('.keyword6').editable({mode: 'inline'});
						
			
			$('#sBtn').click(function(){
				// 무결성 검사하기
				var tmmenuImg = $('#menuImg').val();
//				alert(tmmenuImg);
				var tmmenuName = $("#menuName").val();
//				alert(tmmenuName);
				var tmmenuPrice = $("#menuPrice").val();
//				alert(tmmenuPrice);
				var tmmenuComment = $('#menuComment').val();
//				alert(tmmenuComment);
				var tkw = "#" + $("#keyword1").val() + "#" + $("#keyword2").val() + "#" + $("#keyword3").val() + "#" + $("#keyword4").val() + "#" + $("#keyword5").val();

//				alert(tkw);
				
				$('#kw').val(tkw) ;
//				alert(tkw);
				if(tmmenuImg != '' && tmmenuName != '' && tmmenuPrice != '' && tmmenuComment != '' && tkw != ''){
					// 모든 사항이 입력된 경우 폼의 내용을 보내자.
//					alert(tkeyword);
					$("#morefrm").attr("action", "../chef/MenuModProc.food").submit();
				};
			});
			
			$('#msBtn').click(function(){
				// 무결성 검사하기
				var tmmenuImg = $("#mmImg").val();
				var tmmenuName = $("#mmName").text();
				var tmmenuPrice = $("#mmPrice").text();
				var tmmenuComment = $("#mmComment").text();
				var tkeyword = "#" + $("#mmkeyword1").text() + "#" + $("#mmkeyword2").text() + "#" + $("#mmkeyword3").text() + "#" + $("#mmkeyword4").text() + "#" + $("#mmkeyword5").text();

				$("#strPrice").val(tmmenuPrice);
				$("#mmenuName").val(tmmenuName);
				$("#keyword").val(tmmenuName);
				$("#mmenuComment").val(tmmenuComment);
				$("#keyword").val(tkeyword);
				
				if(tmmenuImg != "" && tmmenuName != "" && tmmenuPrice != "" && tmmenuComment != "" && tkeyword != ""){
					// 모든 사항이 입력된 경우 폼의 내용을 보내자.
					$('#mfrm').attr("action", "../chef/MMenuEditProc.food").submit();
				};
			});
			
			

			$('#basicwizard').bootstrapWizard({'tabClass': 'nav nav-tabs navtab-wizard nav-justified bg-muted'});

			$('#progressbarwizard').bootstrapWizard({onTabShow: function(tab, navigation, index) {
                    var $total = navigation.find('li').length;
                    var $current = index+1;
                    var $percent = ($current/$total) * 100;
                    $('#progressbarwizard').find('.bar').css({width:$percent+'%'});
                },
                'tabClass': 'nav nav-tabs navtab-wizard nav-justified bg-muted'});

			 $('#btnwizard').bootstrapWizard({'tabClass': 'nav nav-tabs navtab-wizard nav-justified bg-muted','nextSelector': '.button-next', 'previousSelector': '.button-previous', 'firstSelector': '.button-first', 'lastSelector': '.button-last'});

			 $('#rootwizard').bootstrapWizard({
                    'tabClass': 'nav nav-tabs navtab-wizard nav-justified bg-muted',
                    'onNext': function (tab, navigation, index) {
                        var $valid = $("#commentForm").valid();
                        if (!$valid) {
                            $validator.focusInvalid();
                            return false;
                        }
                    }
                });
		});
		
		</script>

    </body>
</html>