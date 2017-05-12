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
        <title>Register Review</title>

        <!-- App CSS -->
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
<script>


</script>
    <body>	
        <div class="account-pages"></div>
        <div class="clearfix"></div>
        <div class="wrapper-page">
            <div class="text-center">
                <a href="../person/MainWindow.food" class="logo"><span>Food<span>Buncker</span></span></a>
                <h5 class="text-muted m-t-0 font-600">회원가입내용확인</h5>
            </div>
		</div>
        <!-- end wrapper page -->	
		<div class="wrapper">
			<div class="container">
				<div class="row">
                    <div class="col-sm-12">
                        <div class="card-box">
							<h4 class="m-b-30 m-t-0 header-title"><b>기본내용</b></h4>
							
								<form method="POST" action="#" class="form-horizontal" id="frm" name="frm" enctype="multipart/form-data">
									
									<input type="hidden" id="num" name="num">
									<input type="hidden" id="chef" name="chef">
									<input type="hidden" id="name" name="name">
									<input type="hidden" id="phone" name="phone">
									<input type="hidden" id="email" name="email">
									<input type="hidden" id="open" name="open">
									<input type="hidden" id="id" name="id">
									<input type="hidden" id="chefComment" name="chefComment">
									<input type="hidden" id="truckComment" name="truckComment">
									<input type="hidden" id="mmenuName" name="mmenuName">
									<input type="hidden" id="strPrice" name="strPrice">
									<input type="hidden" id="mmenuComment" name="mmenuComment">
									<input type="hidden" id="keyword" name="keyword">
									<input type="hidden" id="oldChefImg" name="oldChefImg" value="${DATA.chefImgName}">
									<input type="hidden" id="oldTruckImg" name="oldTruckImg" value="${DATA.truckImgName}">
									<input type="hidden" id="oldMenuImg" name="oldMenuImg" value="${DATA.mmenuImgName}" >
									
									<div class="form-group">
										<label class="col-sm-6 control-label">사업주이름</label>
										<div class="col-sm-6">
											<a href="#" id="tchef" name="tchef" data-type="text" data-pk="1" >${DATA.chef}</a>
                    </div>
                  </div>

									<div class="form-group">
										<label class="col-sm-6 control-label">I D</label>
                    <div class="col-sm-6">
											<a href="#" id="tid" name="tid" data-type="text" data-pk="1">${DATA.id}</a>
										</div>
									</div>
										
									<div class="form-group">
										<label class="col-sm-6 control-label">상호명(트럭명)</label>
                  	<div class="col-sm-6">
											<a href="#" id="tname" name="tname" data-type="text" data-pk="1">${DATA.name}</a>
                  	</div>
                  </div>                                        

									<div class="form-group">
										<label class="col-sm-6 control-label">사업자번호</label>
                    <div class="col-sm-6">
											<a href="#" id="tnum" name="tnum" data-type="text" data-pk="1" data-placement="right" data-placeholder="Required" data-title="Enter your firstname">${DATA.num}</a>
                    </div>
                  </div>

									<div class="form-group">
										<label class="col-sm-6 control-label">전화번호</label>
                    <div class="col-sm-6">
											<a href="#" id="tphone" name="tphone" data-type="text" data-pk="1">${DATA.phone}</a>
                     </div>
                    </div>   

									<div class="form-group">
										<label class="col-sm-6 control-label">이메일</label>
                    <div class="col-sm-6">
											<a href="#" id="temail" name="temail" data-type="text" data-pk="1">${DATA.email}</a>
                    </div>
                  </div> 
										
									<div class="form-group">
										<label class="col-sm-6 control-label">개업일</label>
                    <div class="col-sm-6">
											<a href="#" id="topen" name="topen" data-type="text" data-pk="1">${DATA.open}</a>
                    </div>
									</div>

									<h4 class="m-b-30 m-t-0 header-title"><b>쉐프이미지</b></h4>
									<input type="file" class="dropify" id="chefImg" name="chefImg" data-default-file="../image/${DATA.chefImgName}">

									<br>
									<div class="form-group">
										<label class="col-sm-12 control-label" style="text-align:center;">쉐프 한마디</label>
                    <div class="col-sm-12" style="text-align:center;">
											<a href="#" id="tchefComment" name="tchefComment" data-type="text" data-pk="1">${DATA.chefComment}</a>
										</div>
                  </div>

									<h4 class="m-b-30 m-t-0 header-title"><b>트럭이미지</b></h4>
									<input type="file" class="dropify" id="truckImg" name="truckImg" data-default-file="../image/${DATA.truckImgName}">

									<div class="form-group">
										<label class="col-sm-12 control-label" style="text-align:center;">트럭 설명</label>
                      <div class="col-sm-12" style="text-align:center;">
											<a href="#" id="ttruckComment" name="ttruckComment" data-type="text" data-pk="1">${DATA.truckComment}</a>
										</div>
									</div>

									<%-- <div class="form-group">
										<label class="col-sm-5 control-label">검색키워드</label>
                                        <div class="col-sm-7">
											<a href="#" id="keyword" data-type="text" data-pk="1">${DATA.keyword}</a>
										</div>
									</div>
 --%>
									<h4 class="m-b-30 m-t-0 header-title"><b>주메뉴 이미지</b></h4>
									<input type="file" class="dropify" id="mmenuImg" name="mmenuImg" data-default-file="../image/${DATA.mmenuImgName}">
									
									<div class="form-group">
										<label class="col-sm-12 control-label" style="text-align:center;">주메뉴 설명</label>
                    					<div class="col-sm-12" style="text-align:center;">
											<a href="#" id="tmmenuComment" name="tmmenuComment" data-type="text" data-pk="1">${DATA.mmenuComment}</a>
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-sm-6 control-label">주메뉴 이름</label>
                    <div class="col-sm-6">
											<a href="#" id="tmmenuName" name="tmmenuName" data-type="text" data-pk="1">${DATA.mmenuName}</a>
										</div>
									</div>

									<div class="form-group">
										<label class="col-sm-6 control-label">주메뉴 가격(원)</label>
                    <div class="col-sm-6">
											<a href="#" id="tmmenuPrice" name="tmmenuPrice" data-type="text" data-pk="1">${DATA.mmenuPrice}</a>
										</div>
									</div>

<%-- 									<div class="form-group">
 										<label class="col-sm-5 control-label">검색키워드</label>
                    					<div class="col-sm-7">
											<a href="#" id="mmenukeyword" data-type="text" data-pk="1">${DATA.keyword}</a>
										</div>
									</div> --%>

 									<div class="form-group">
										<label class="col-sm-6 control-label">검색 키워드 1</label>
                    <div class="col-sm-6">
                    	<a href="#" id="keyword1" name="keyword1" data-type="text" data-pk="1">${DATA.keyword1}</a>
                    </div>
									</div>

									<div class="form-group">
										<label class="col-sm-6 control-label">검색 키워드 2</label>
                    <div class="col-sm-6">
                    	<a href="#" id="keyword2" name="keyword2" data-type="text" data-pk="1">${DATA.keyword2}</a>
                   	 </div>
									</div>

									<div class="form-group">
										<label class="col-sm-6 control-label">검색 키워드 3</label>
                    <div class="col-sm-6">
                    	<a href="#" id="keyword3" name="keyword3" data-type="text" data-pk="1">${DATA.keyword3}</a>
                    </div>
									</div>

									<div class="form-group">
										<label class="col-sm-6 control-label">검색 키워드 4</label>
                    <div class="col-sm-6">
                    	<a href="#" id="keyword4" name="keyword4" data-type="text" data-pk="1">${DATA.keyword4}</a>
                    </div>
									</div>

									<div class="form-group">
										<label class="col-sm-6 control-label">검색 키워드 5</label>
                    <div class="col-sm-6">
                    	<a href="#" id="keyword5" name="keyword5" data-type="text" data-pk="1">${DATA.keyword5}</a>
                    </div>
									</div>
									
								</form>
								<div class="btn-group btn-group-justified m-b-10">
                   <a class="btn btn-warning waves-effect waves-light" role="button" href="../person/MainWindow.food" id="hBtn">Home</a>
                   <a class="btn btn-primary waves-effect waves-light" role="button" id="finalReg" href="#">최종가입</a>
                  <!-- <a class="btn btn-danger waves-effect waves-light" id="cBtn" role="button" href="#">보류</a> -->
               </div>
							</div><!-- end col -->
						</div><!-- end row -->
					</div><!-- end col -->
                <!-- end row -->
			</div>
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


		<!-- XEditable Plugin -->
        <script src="../resources/assets/plugins/moment/moment.js"></script>
        <script type="text/javascript" src="../resources/assets/plugins/x-editable/dist/bootstrap3-editable/js/bootstrap-editable.min.js"></script>
        <script type="text/javascript" src="../resources/assets/pages/jquery.xeditable.js"></script>

		 <!-- Form wizard -->
        <script src="../resources/assets/plugins/bootstrap-wizard/jquery.bootstrap.wizard.js"></script>
        <script src="../resources/assets/plugins/jquery-validation/dist/jquery.validate.min.js"></script>
		
		<!-- file uploads js -->
        <script src="../resources/assets/plugins/fileuploads/js/dropify.min.js"></script>

        <!-- App js -->
        <script src="../resources/assets/js/jquery.core.js"></script>
        <script src="../resources/assets/js/jquery.app.js"></script>

		<script>
		$(document).ready(function(){
			$('#tnum').editable({mode: 'inline'});
			$('#tchef').editable({mode: 'inline'});
			$('#tname').editable({mode: 'inline'});
			$('#tphone').editable({mode: 'inline'});
			$('#temail').editable({mode: 'inline'});
			$('#topen').editable({mode: 'inline'});
			$('#tid').editable({mode: 'inline'});
			$('#tchefComment').editable({mode: 'inline'});
			$('#ttruckComment').editable({mode: 'inline'});
			$('#tmmenuName').editable({mode: 'inline'});
			$('#tmmenuPrice').editable({mode: 'inline'});
			$('#tmmenuComment').editable({mode: 'inline'});
			$('#keyword1').editable({mode: 'inline'});
			$('#keyword2').editable({mode: 'inline'});
			$('#keyword3').editable({mode: 'inline'});
			$('#keyword4').editable({mode: 'inline'});
			$('#keyword5').editable({mode: 'inline'});
			
			
			$('#finalReg').click(function(){
				alert("FOOD BUNCKER의 회원 가입을 환영합니다.");
				
				$('#num').val($('#tnum').text());
				$('#chef').val($('#tchef').text());
				$('#name').val($('#tname').text());
				$('#phone').val($('#tphone').text());
				$('#email').val($('#temail').text());
				$('#open').val($('#topen').text());
				$('#id').val($('#tid').text());
				$('#chefComment').val($('#tchefComment').text());
				$('#truckComment').val($('#ttruckComment').text());
				$('#mmenuName').val($('#tmmenuName').text());
				$('#mPrice').val($('#tmmenuPrice').text());
				$('#mmenuComment').val($('#tmmenuComment').text());

				/* alert("1 : " + $('#phone').val()); */
				var tk1 = $('#keyword1').text();
				var tk2 = $('#keyword2').text();
				var tk3 = $('#keyword3').text();
				var tk4 = $('#keyword4').text();
				var tk5 = $('#keyword5').text();
				/* alert("2 : " + $('#phone').val()); */
				
				/* '""#oldChefImg').val() = ${DATA.chefImgName}; */
				/* alert("3 : " + $('#phone').val()); */
				/* '""#oldTruckImg').val() = ${DATA.truckImgName};
				$('#oldMenuImg').val() = ${DATA.mmenuImgName}; */

				$('#keyword').val('#' + tk1 + '#' + tk2 + '#' + tk3 + '#' + tk4 + '#' + tk5) ;
				/* 
				alert($('#oldChefImg').val());
				alert("4 : " + $('#phone').val()); */
				
				$('#frm').attr("action", "../chef/RegProc.food").submit();
				/* $(location).attr("href","../chef/ChefMain.food"); */
			});

/* 			$('#hBtn').click(function(){
				
				$(location).attr("href","../person/MainWindow.food");
			}); */

/* 			$('#cBtn').click(function(){
				alert("수정된 내용이 저장되지 않았습니다.회원가입 페이지로 이동합니다.");
				$(location).attr("href","../person/MainWindow.food");
			});
 */
			$('#basicwizard').bootstrapWizard({'tabClass': 'nav nav-tabs navtab-wizard nav-justified bg-muted'});

                $('#progressbarwizard').bootstrapWizard({onTabShow: function(tab, navigation, index) {
                    var $total = navigation.find('li').length;
                    var $current = index+1;
                    var $percent = ($current/$total) * 100;
                    $('#progressbarwizard').find('.bar').css({width:$percent+'%'});
                },
                'tabClass': 'nav nav-tabs navtab-wizard nav-justified bg-muted'});

                $('#btnwizard').bootstrapWizard({'tabClass': 'nav nav-tabs navtab-wizard nav-justified bg-muted','nextSelector': '.button-next', 'previousSelector': '.button-previous', 'firstSelector': '.button-first', 'lastSelector': '.button-last'});

                var $validator = $("#commentForm").validate({
                    rules: {
                        emailfield: {
                            required: true,
                            email: true,
                            minlength: 3
                        },
                        namefield: {
                            required: true,
                            minlength: 3
                        },
                        urlfield: {
                            required: true,
                            minlength: 3,
                            url: true
                        }
                    }
                });

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
        
        
        

	</body>
     
</html>