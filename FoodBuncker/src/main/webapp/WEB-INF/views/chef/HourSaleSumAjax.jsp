<%@ page language="java" contentType="text/plain; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
{"salesum" : [
	<c:forEach var="data" items="${LIST }" varStatus="st">
		<c:if test="${st.last eq false }">
			{"y":"${data.shour }", "a":"${data.s2015 }", "b":"${data.s2016 }", "c":"${data.s2017 }"},
		</c:if>
		<c:if test="${st.last eq true }">
			{"y":"${data.shour }", "a":"${data.s2015 }", "b":"${data.s2016 }", "c":"${data.s2017 }"}
		</c:if>
	</c:forEach>
	]
}