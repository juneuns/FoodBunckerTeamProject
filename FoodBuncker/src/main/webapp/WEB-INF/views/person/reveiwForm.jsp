<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$("#sBtn").click(function(){
			var b = $("#body").val();
			if(b == ""){
				alert("내용을 입력해주세요.")
				return;
			}
			else{
				$("#frm").attr("action", "../person/reviewProc.food?tno=${TNO}&pno=${PNO}").submit();
			}
		});
		
		$("#cBtn").click(function(){
			$("#frm").attr("action", "../person/userView.food?tno=${TNO}&pno=${PNO}").submit();	
		});
	});
</script>
<body>
<form method="POST" action="" id="frm">
	<table>
		<tr>
			<td align="center">
				<font size="6">
					후기를 입력해주세요.
				</font>
			</td>	
		</tr>
		<tr>
			<td>
				<font size="5" color="red">
					<textarea id="body" name="body" cols="50" rows="15" size="5"></textarea>
				</font>	
			</td>
		</tr>
		<tr>
			<td align="center">
				<input type="button" value="작성" id="sBtn">
				<input type="button" value="취소" id="cBtn">
			</td>
		</tr>
	</table>
</form>
</body>
</html>