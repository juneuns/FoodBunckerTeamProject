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
                        <a href="../Person/MainWindow.food" class="logo"><span>Food<span>Buncker</span></span></a>
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
                        <div class="btn-group pull-right m-t-15">
                            <button type="button" class="btn btn-custom dropdown-toggle waves-effect waves-light" data-toggle="dropdown" aria-expanded="false">저장 <span class="m-l-5"><i class="fa fa-cog"></i></span></button>
                        </div>
                        <h4 class="page-title">메뉴 등록</h4>
                    </div>
                </div>

			<form action="#" class="form-horizontal" id="frm" name="frm" enctype="multipart/form-data">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="card-box">
													<h4 class="header-title m-t-0 m-b-30">메인메뉴(1895X1000)</h4>
                            <input type="file" class="dropify" data-height="300" data-default-file="../image/${DATA.mImgName}"/>
							<div class="row">
								<div class="form-group">
									<label class="col-sm-5 control-label">주메뉴이름</label>
									<div class="col-sm-7">
										<a href="#" id="mmenuName" data-type="text" data-pk="1">${DATA.mmenuName}</a>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label">주메뉴가격(원)</label>
								    <div class="col-sm-7">
										<a href="#" id="mmenuPrice" data-type="text" data-pk="1">${DATA.mmenuPrice}</a>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label">주메뉴설명</label>
									<div class="col-sm-7">
										<a href="#" id="mmenuComment" data-type="text" data-pk="1">${DATA.mmenuComment}</a>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label">검색키워드</label>
									<div class="col-sm-7">
										<a href="#" id="mmenukeyword" data-type="text" data-pk="1">${DATA.keyword}</a>
									</div>
								</div>
							</div>
                        </div>
                    </div><!-- end col -->
                </div>
                <!-- end row -->
				<c:forEach var="data" items="${LIST}">
				 <div class="row">
                    <div class="col-sm-12">
                        <div class="card-box">
							<h4 class="header-title m-t-0 m-b-30">서브메뉴(300X300)</h4>
                            <input type="file" class="dropify" data-height="200" data-default-file="../image/${data.sname}"/>
							<div class="row">
								<div class="form-group">
									<label class="col-sm-5 control-label">메뉴이름</label>
									<div class="col-sm-7">
										<a href="#" id="${data.mNo}mName" data-type="text" data-pk="1">${data.mmenuName}</a>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label">메뉴가격(원)</label>
								    <div class="col-sm-7">
										<a href="#" id="${data.mNo}price" data-type="text" data-pk="1">${data.mmenuPrice}</a>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label">메뉴설명</label>
									<div class="col-sm-7">
										<a href="#" id="${data.mNo}imgbody" data-type="text" data-pk="1">${data.mmenuComment}</a>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label">검색키워드</label>
									<div class="col-sm-7">
										<a href="#" id="${data.mNo}keyword" data-type="text" data-pk="1">${data.keyord}</a>
									</div>
								</div>
							</div>
                        </div>
                    </div><!-- end col -->
                </div>
                <!-- end row -->
              </c:forEach>
              
              
              
				
				 <div class="row">
                    <div class="col-sm-12">
                        <div class="card-box">
							<h4 class="header-title m-t-0 m-b-30">서브메뉴(300X300)</h4>
                            <input type="file" class="dropify" data-height="200" data-default-file="../image/"/>
							<div class="row">
								<div class="form-group">
									<label class="col-sm-5 control-label">메뉴이름</label>
									<div class="col-sm-7">
										<a href="#" id="" data-type="text" data-pk="1"></a>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label">메뉴가격(원)</label>
								    <div class="col-sm-7">
										<a href="#" id="" data-type="text" data-pk="1"></a>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label">메뉴설명</label>
									<div class="col-sm-7">
										<a href="#" id="" data-type="text" data-pk="1"></a>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-5 control-label">검색키워드</label>
									<div class="col-sm-7">
										<a href="#" id="" data-type="text" data-pk="1"></a>
									</div>
								</div>
							</div>
                        </div>
                    </div><!-- end col -->
                </div>
                <!-- end row -->
			</form>
                <!-- Footer -->
                <footer class="footer text-right">
                    <div class="container">
                        <div class="row">
                            <div class="col-xs-6">
                                2016 - 2017 © Adminto.
                            </div>
                            <div class="col-xs-6">
                                <ul class="pull-right list-inline m-b-0">
                                    <li>
                                        <a href="#">About</a>
                                    </li>
                                    <li>
                                        <a href="#">Help</a>
                                    </li>
                                    <li>
                                        <a href="#">Contact</a>
                                    </li>
                                </ul>
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
			$('#mmenuName').editable({mode: 'inline'});
			$('#mmenuPrice').editable({mode: 'inline'});
			$('#mmenuComment').editable({mode: 'inline'});
			$('#mmenukeyword').editable({mode: 'inline'});
			$('#smenuName1').editable({mode: 'inline'});
			$('#smenuPrice1').editable({mode: 'inline'});
			$('#smenuComment1').editable({mode: 'inline'});
			$('#smenukeyword1').editable({mode: 'inline'});
			$('#smenuName2').editable({mode: 'inline'});
			$('#smenuPrice2').editable({mode: 'inline'});
			$('#smenuComment2').editable({mode: 'inline'});
			$('#smenukeyword2').editable({mode: 'inline'});
			$('#smenuName3').editable({mode: 'inline'});
			$('#smenuPrice3').editable({mode: 'inline'});
			$('#smenuComment3').editable({mode: 'inline'});
			$('#smenukeyword3').editable({mode: 'inline'});
			$('#smenuName4').editable({mode: 'inline'});
			$('#smenuPrice4').editable({mode: 'inline'});
			$('#smenuComment4').editable({mode: 'inline'});
			$('#smenukeyword4').editable({mode: 'inline'});

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