<%@ page language="java" contentType="text/plain; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
	{"menuadd" : [
					{"tno":"3","name":"스테이크","price":"3000","body":"맛있어요","imgname":"***.jpg"},
					{},
					{},
					...
				]
	}

--%>
{"menuadd" : [
				<c:forEach var="data" items="${LIST }" varStatus="st">
					<c:if test="${st.last eq false }">
					{"tno" : "${data.tno }", "price" : "${data.price }", "body" : "${data.body }", "imgname" : "${data.imgname }","nowPage":"${nowPage }"},
					</c:if>
					<c:if test="${st.last ne false }">
					{"tno" : "${data.tno }", "price" : "${data.price }", "body" : "${data.body }", "imgname" : "${data.imgname }","nowPage":"${nowPage }"}
					</c:if>
				</c:forEach>

			]
}