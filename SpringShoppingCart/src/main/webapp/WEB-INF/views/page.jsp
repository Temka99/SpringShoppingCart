<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />


<c:set var="contextRoot" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online shopping - ${title}</title>
<script>
	window.menu = '${title}'
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap-theme CSS -->
<link href="${css}/bootstrap-theam.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/mycss.css" rel="stylesheet">

</head>

<body>
	<!-- NavBar -->
	<%@ include file="./shared/navbar.jsp"%>

	<c:if test="${userClickHome == true}">
		<!-- Page Content -->
		<%@include file="home.jsp"%>
	</c:if>



	<!-- Loading when user click about -->
	<c:if test="${userClickAbout == true}">
		<!-- Page Content -->
		<%@include file="about.jsp"%>
	</c:if>

	<!-- Loading when user click contact -->
	<c:if test="${userClickContact == true}">
		<!-- Page Content -->
		<%@include file="contact.jsp"%>
	</c:if>

	<!-- Footer -->
	<%@ include file="./shared/foooter.jsp"%>
	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.min.js"></script>
	<script src="${js}/bootstrap.bundle.min.js"></script>
	<script src="${js}/myapp.js"></script>




</body>

</html>
