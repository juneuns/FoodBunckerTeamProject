<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Food Buncker</title>
</head>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<body>
	<table align="center">	
		<tr>
			<td align="center">
				<input type="button" id="hBtn" value="홈페이지 이동" ><br>
			<td>
		</tr>
		<tr>
			<td align="center">	
				<input type="button" id="mBtn" value="메뉴주문 하기" ><br>
			<td>
		</tr>
		<tr>
			<td align="center">	
				<input type="button" id="rBtn" value="후기 작성하기" >
			<td>
		</tr>
	</table>
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