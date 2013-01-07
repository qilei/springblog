<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><sitemesh:write property='title'/></title>
<link href="${ctx}/resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="${ctx}/resources/style/style.css">
<sitemesh:write property='head'/>
</head>
<body>
	<%@include file="/WEB-INF/layouts/header.jsp"%>
	<sitemesh:write property='body'/>
	<%@include file="/WEB-INF/layouts/footer.jsp"%>

	<script src="${ctx}/resources/js/jquery/1.7.2/jquery.js"></script>
	<script src="${ctx}/resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>