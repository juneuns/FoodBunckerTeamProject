<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%-- 후기내용 출력 --%>
	<table boarder="1" align="left" width="1000">
		<c:forEach var="data" items="${TRLIST}">
		<tr>
			<td>	${data.body}</td>			
			<td>${data.showdate}</td>			
		</tr>
		</c:forEach>
	</table>
	
	<%-- 페이지 이동 기능 --%>
	<table width="1000" border="1" align="center">
		<tr>
			<td align="center">
			<c:if test="${PINFO.startPage eq 1}">
				[이전]
			</c:if>
			<c:if test="${PINFO.startPage ne 1}">
				<a href="../person/moreReview.food?nowPage=${PINFO.startPage - 1}&tno=${TNO}">[이전]</a>
			</c:if>
			<c:forEach var="page" begin="${PINFO.startPage}" 
										end="${PINFO.endPage}">
					<a href="../person/moreReview.food?nowPage=${page}&tno=${TNO}">[ ${page} ]</a>
			</c:forEach>
			<c:if test="${PINFO.endPage eq PINFO.totalPage}">
				[다음]
			</c:if>			
			<c:if test="${PINFO.endPage ne PINFO.totalPage}">
				<a href="../person/moreReview.food?nowPage=${PINFO.endPage + 1}&tno=${TNO}">[다음]</a>
			</c:if>			
			</td>
		</tr>
	</table>
</body>
</html>