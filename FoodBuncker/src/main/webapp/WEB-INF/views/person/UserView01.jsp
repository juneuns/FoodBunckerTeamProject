<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
				<input type="button" id="hBtn" value="Ȩ������ �̵�" ><br>
			<td>
		</tr>
		<tr>
			<td align="center">	
				<input type="button" id="mBtn" value="�޴��ֹ� �ϱ�" ><br>
			<td>
		</tr>
		<tr>
			<td align="center">	
				<input type="button" id="rBtn" value="�ı� �ۼ��ϱ�" >
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