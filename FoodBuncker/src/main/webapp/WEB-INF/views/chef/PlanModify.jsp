<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
        <meta name="author" content="Coderthemes">

        <link rel="shortcut icon" href="../resources/assets/images/favicon.ico">

        <title>Adminto - Responsive Admin Dashboard Template</title>

        <!--calendar css-->
        <link href="../resources/assets/plugins/fullcalendar/dist/fullcalendar.css" rel="stylesheet" />

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
                        <h4 class="page-title">Calendar</h4>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="row">
                            <div class="col-md-3">
                                <div class="widget">
                                    <div class="widget-body">
                                        <div class="row">
                                            <div class="col-md-6 col-sm-6 col-xs-6">
                                                <div id="external-events" class="m-t-20">
                                                    <p>해당되는 위치를 원하는 날짜로 드래그 하세요.</p></br>
													드래그 후 클릭하여 반드시 저장해야 합니다.
<!-- ---------------------------------------    foreach문으로 반복 시작--------------------------------------- --> 	       													
												<c:forEach var="data" items="${ALLPLACE }">
													<c:if test="${data.pno%5 == 0}">
														<div class="external-event bg-danger" data-class="bg-danger" name="${data.pno }">
													</c:if>
													<c:if test="${data.pno%5 == 1}">
														<div class="external-event bg-success" data-class="bg-success" name="${data.pno }">
													</c:if>
													<c:if test="${data.pno%5 == 2}">
														<div class="external-event bg-purple" data-class="bg-purple" name="${data.pno }">
													</c:if>
													<c:if test="${data.pno%5 == 3}">
														<div class="external-event bg-info" data-class="bg-info" name="${data.pno }"> 
													</c:if>
													<c:if test="${data.pno%5 == 4}">
														<div class="external-event bg-warning" data-class="bg-warning" name="${data.pno }">
													</c:if>
                                                    
                                                        <i class="fa fa-move"></i>${data.pname }
                                                    </div>
<!-- -------------------------------------- --- foreach문으로 반복 끝--------------------------------------- -->
                                           	</c:forEach>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div> <!-- end col-->
                            <div class="col-md-9">
                                <div class="card-box">
                                    <div id="calendar"></div>
                                </div>
                            </div> <!-- end col -->
                        </div>  <!-- end row -->

                        <!-- BEGIN MODAL -->
                        <div class="modal fade none-border" id="event-modal">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                        <h4 class="modal-title"><strong>Delete Event</strong></h4>
                                    </div>
                                    <div class="modal-body"></div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">Close</button>
                                        <!-- 
                                        <button type="button" class="btn btn-success save-event waves-effect waves-light">Create event</button>
                                        -->
                                        <button type="button" class="btn btn-danger delete-event waves-effect waves-light" data-dismiss="modal">Delete</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <!-- Modal Add Category --><!-- 
                        <div class="modal fade none-border" id="add-category">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                        <h4 class="modal-title"><strong>Add a category </strong></h4>
                                    </div>
                                    <div class="modal-body">
                                        <form role="form">
                                            <div class="row">
                                                <div class="col-md-6">
                                                    <label class="control-label">Category Name</label>
                                                    <input class="form-control form-white" placeholder="Enter name" type="text" name="category-name"/>
                                                </div>
                                                <div class="col-md-6">
                                                    <label class="control-label">Choose Category Color</label>
                                                    <select class="form-control form-white" data-placeholder="Choose a color..." name="category-color">
                                                        <option value="success">Success</option>
                                                        <option value="danger">Danger</option>
                                                        <option value="info">Info</option>
                                                        <option value="pink">Pink</option>
                                                        <option value="primary">Primary</option>
                                                        <option value="warning">Warning</option>
                                                        <option value="inverse">Inverse</option>
                                                    </select>
                                                </div>
                                            </div>
                                        </form>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default waves-effect" data-dismiss="modal">Close</button>
                                        <button type="button" class="btn btn-danger waves-effect waves-light save-category" data-dismiss="modal">Save</button>
                                    </div>
                                </div>
                            </div>
                        </div> -->
                        <!-- END MODAL -->
                    </div>
                    <!-- end col-12 -->
                </div> <!-- end row -->


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

        <!-- App js -->
        <script src="../resources/assets/js/jquery.core.js"></script>
        <script src="../resources/assets/js/jquery.app.js"></script>

        <!-- Jquery-Ui -->
        <script src="../resources/assets/plugins/jquery-ui/jquery-ui.min.js"></script>

        <!-- BEGIN PAGE SCRIPTS -->
        <script src="../resources/assets/plugins/moment/moment.js"></script>
        <script src='../resources/assets/plugins/fullcalendar/dist/fullcalendar.min.js'></script>
      <!-- 	<script src="../resources/assets/pages/jquery.fullcalendar.js"></script>  -->

		<script>
		var CalendarApp = function() {
	        this.$body = $("body")
	        this.$modal = $('#event-modal'),
	        this.$event = $('#external-events div.external-event'),
	        this.$calendar = $('#calendar'),
	        this.$saveCategoryBtn = $('.save-category'),
	        this.$categoryForm = $('#add-category form'),
	        this.$extEvents = $('#external-events'),
	        this.$calendarObj = null
	    };

		$(document).ready(function(){	
			$('#calendar').fullCalendar({
				//	defaultDate: '2017-04-12',
					editable: true,
					eventLimit: true, // allow "more" link when too many events
					droppable: true, // this allows things to be dropped onto the calendar !!!
	    	        selectable: true,
	        	    drop: function(date) { 
	        	    		var eventObj = $(this);
            				var originalEventObject = eventObj.data('eventObject');
            				var $categoryClass = eventObj.attr('data-class');
            				var pno = eventObj.attr('name');
            				var copiedEventObject = $.extend({}, originalEventObject);
            				copiedEventObject.start = date;
           				 	if ($categoryClass)
                				copiedEventObject['className'] = [$categoryClass];
           				 	$.ajax({
           				 		data : "temp="+ new Date() + "&pno="+pno+"&pdate="+date,
           				 		dataType : "json",
           				 		type : "GET",
           				 		url : "../chef/PlanModifyProc.food",
           				 		success : function(){},
           				 		error : function(){	}
           				 	});
           				 	$('#calendar').fullCalendar('renderEvent', copiedEventObject, true);
				 			alert("저장되었습니다.");
	        	    	},
	            	select: function (start, end, allDay) { $this.onSelect(start, end, allDay); },
	           		eventClick: function(calEvent, jsEvent, view) {
	           			//var eventObj = $(calEvent);
	           			var pname = calEvent.title;
	           			var pdate = calEvent.start;
	           			//var date = eventObj.attr('date');
	           			//alert(pname);
	           			//alert(pdate);
	           			var $this = this;
	                    var form = $("<form></form>");
	                    form.append("<label>Delete를 클릭하면 선택하신 일정이 삭제됩니다.</label>");
	                    form.append("<div class='input-group'><input class='form-control' type=text value='" + calEvent.title + "' readonly /></div>");
	                    $('#event-modal').modal({
	                        backdrop: 'static'
	                    });
	                    $('#event-modal').find('.delete-event').show().end().find('.save-event').hide().end().find('.modal-body').empty().prepend(form).end().find('.delete-event').unbind('click').click(function () {
	                    	$.ajax({
           				 		data : "temp="+ new Date() + "&pname="+pname+"&pdate="+pdate,
           				 		dataType : "json",
           				 		type : "GET",
           				 		url : "../chef/PlanDeleteProc.food",
           				 		success : function(){},
           				 		error : function(){}
           				 	});
	                    	$('#calendar').fullCalendar('removeEvents', function (ev) {
	                            return (ev._id == calEvent._id);
	                        });
	                        $('#event-modal').modal('hide');
	                    });
	               //     $('#event-modal').find('form').on('submit', function () {
	               //        calEvent.title = form.find("input[type=text]").val();
	               //         $('#calendar').fullCalendar('updateEvent', calEvent);
	               //         $('#event-modal').modal('hide');
	               //         return false;
	               //     });
	           		},
					events: [
						<c:forEach items="${ONETPLAN}" var="data" varStatus="st"> 
						{
							title: '${data.pname}',
							start: '${data.pdate}',
							<c:if test="${data.pno%5 == 0}">
								className: 'bg-danger'
							</c:if>
							<c:if test="${data.pno%5 == 1}">
								className: 'bg-success'
							</c:if>
							<c:if test="${data.pno%5 == 2}">
								className: 'bg-purple'
							</c:if>
							<c:if test="${data.pno%5 == 3}">
								className: 'bg-info'
							</c:if>
							<c:if test="${data.pno%5 == 4}">
								className: 'bg-warning'
							</c:if>
							
							<c:if test="${st.last eq true}">
								}
							</c:if>
							<c:if test="${st.last eq false}">
								},
							</c:if>
						</c:forEach>
					]
				});
			
			 $('#external-events div.external-event').each(function () {
		            // create an Event Object (http://arshaw.com/fullcalendar/docs/event_data/Event_Object/)
		            // it doesn't need to have a start or end
		            var eventObject = {
		                title: $.trim($(this).text()) // use the element's text as the event title
		            };
		            // store the Event Object in the DOM element so we can get to it later
		            $(this).data('eventObject', eventObject);
		            // make the event draggable using jQuery UI
		            $(this).draggable({
		                zIndex: 999,
		                revert: true,      // will cause the event to go back to its
		                revertDuration: 0  //  original position after the drag
		            });
		        });
		});
		</script>
    </body>
</html>