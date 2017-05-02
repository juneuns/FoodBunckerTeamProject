<%@ page language="java" contentType="text/plain; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
	{"truckplan" : 
					[
						{"pname" : "???", "pdate" : "???", "pno" : "???"},
						{"pname" : "???", "pdate" : "???", "pno" : "???"},
						{"pname" : "???", "pdate" : "???", "pno" : "???"}
					]
	}


--%>

	{"truckplan" : 
					[
						<c:forEach var="data" items="${ONETPLAN }" varStatus="st">
							<c:if test="${st.last eq true }">
								{"pname" : "${data.pname }", "pdate" : "${data.pdate }" , "pno" : "${data.pno }"}
							</c:if>
							<c:if test="${st.last eq false }">
								{"pname" : "${data.pname }", "pdate" : "${data.pdate }" , "pno" : "${data.pno }"},
							</c:if>
						</c:forEach>
					
					]
	}