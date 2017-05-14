<%@ page language="java" contentType="text/plain; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
{"salesum" : 
	[
		<c:forEach var="data" items="${LIST }" varStatus="st">
			<c:if test="${st.last eq false }">
				{"y":"${data.smonth }", "a":"${data.totalsum }" },
			</c:if>
			<c:if test="${st.last ne false }">
				{"y":"${data.smonth }", "a":"${data.totalsum }"}
			</c:if>
		</c:forEach>
	]
}