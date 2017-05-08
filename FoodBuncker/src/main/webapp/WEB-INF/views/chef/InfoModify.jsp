<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
        <meta name="author" content="Coderthemes">

        <!-- App Favicon -->
        <link rel="shortcut icon" href="../resources/assets/images/favicon.ico">

        <!-- App title -->
        <title>Chef Information Modify</title>

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

    <body>	
        <div class="account-pages"></div>
        <div class="clearfix"></div>
        <div class="wrapper-page">
            <div class="text-center">
                <a href="index.html" class="logo"><span>Food<span>Buncker</span></span></a>
                <h5 class="text-muted m-t-0 font-600">개인정보수정</h5>
            </div>
				</div>
        <!-- end wrapper page -->	
		<div class="wrapper">
			<div class="container">
				<div class="row">
                    <div class="col-sm-12">
                        <div class="card-box">
							<h4 class="m-b-30 m-t-0 header-title"><b>기본내용</b></h4>
								<form method="POST" action="#" class="form-horizontal" id="frm" name="frm">
									<div class="form-group">
										<label class="col-sm-5 control-label">사업주이름</label>
										<div class="col-sm-7">
											<a href="#" id="chef" name=="chef" data-type="text" data-pk="1" >${DATA.chef}</a>
                                        </div>
                                    </div>
									<div class="form-group">
										<label class="col-sm-5 control-label">상호명(트럭명)</label>
                                        <div class="col-sm-7">
											<a href="#" id="name" name="name" data-type="text" data-pk="1">${DATA.name}</a>
                                        </div>
                                    </div>                                        

									<div class="form-group">
										<label class="col-sm-5 control-label">사업자번호</label>
                                        <div class="col-sm-7">
											<a href="#" id="num" name="num" data-type="text" data-pk="1" data-placement="right" data-placeholder="Required" data-title="Enter your firstname">${DATA.num}</a>
                                        </div>
                                    </div>

									<div class="form-group">
										<label class="col-sm-5 control-label">전화번호</label>
                                        <div class="col-sm-7">
											<a href="#" id="phone" name="phone" data-type="text" data-pk="1">${DATA.phone}</a>
                                        </div>
                                    </div>   

									<div class="form-group">
										<label class="col-sm-5 control-label">이메일</label>
                                        <div class="col-sm-7">
											<a href="#" id="email" name="email" data-type="text" data-pk="1">${DATA.email}</a>
                                        </div>
                                    </div> 
										
									<div class="form-group">
										<label class="col-sm-5 control-label">개업일</label>
                                        <div class="col-sm-7">
											<a href="#" id="open" name="open" data-type="text" data-pk="1">${DATA.open}</a>
                                        </div>
                                    </div>

									<div class="form-group">
										<label class="col-sm-5 control-label">ID</label>
                                        <div class="col-sm-7">
											<a href="#" id="id" name="id" data-type="text" data-pk="1">${DATA.id}</a>
										</div>
									</div>
								</form>
								<div class="btn-group btn-group-justified m-b-10">
                                <a class="btn btn-primary waves-effect waves-light" role="button" href="../chef/InfoModifyProc.food" id="finalReg">최종수정</a>
                                <a class="btn btn-warning waves-effect waves-light" role="button" href="../chef/ChefMain.food">CHef Main</a>
                                <a class="btn btn-danger waves-effect waves-light" id="cBtn" role="button" href="#">보류</a>
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
			$('#number').editable({mode: 'inline'});
			$('#chefName').editable({mode: 'inline'});
			$('#truckName').editable({mode: 'inline'});
			$('#phone').editable({mode: 'inline'});
			$('#email').editable({mode: 'inline'});
			$('#openDate').editable({mode: 'inline'});
			$('#id').editable({mode: 'inline'});
			$('#chefComment').editable({mode: 'inline'});
			$('#truckComment').editable({mode: 'inline'});
			$('#keyword').editable({mode: 'inline'});
			$('#mmenuName').editable({mode: 'inline'});
			$('#mmenuPrice').editable({mode: 'inline'});
			$('#mmenuComment').editable({mode: 'inline'});
			$('#mmenukeyword').editable({mode: 'inline'});
			$('#finalReg').click(function(){
				alert("수정된 정보가 저장되었습니다.");
				$(location).attr("href","chefmain.html");
			});

			$('#cBtn').click(function(){
				alert("수정된 내용이 저장되지 않았습니다.쉐프 메인 페이지로 이동합니다.");
				var tmp = $('#chef').val();
		 		$('#chef').val(tmp);
		 		alert("이건 나와라!!" + tmp);
				/* $(location).attr("href","chefmain.html"); */
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