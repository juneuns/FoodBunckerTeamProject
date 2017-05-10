<%@ page language="java" contentType="text/plain; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

{
	"moregallery" : 
		[
		<c:forEach var="data" items="${ILIST}" varStatus="st">
			<c:if test="${st.last eq false}">
				{"tno" : "${data.tno}", "sname" : "${data.sname}", "nowPage" : "${nowPage}", "name" : "${data.name}"},
			</c:if>
			<c:if test="${st.last ne false}">
				{"tno" : "${data.tno}", "sname" : "${data.sname}", "nowPage" : "${nowPage}", "name" : "${data.name}"}
			</c:if>
		</c:forEach>	 
		]	
}