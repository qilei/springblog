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
	
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span2">
			<ul class="nav nav-list">
				<li class="nav-header">文章</li>
				<li><a href="#">所有文章</a></li>
				<li class="active"><a href="#">写文章</a></li>
				<li><a href="#">分类</a></li>
				<li><a href="#">标签</a></li>
				<li class="divider"></li>
				<li class="nav-header">评论</li>
				<li><a href="#">所有评论</a></li>
				<li class="divider"></li>
			</ul>
			</div>
			<div class="span10">
				<sitemesh:write property='body'/>
			</div>
		</div>
	</div>
	
	<%@include file="/WEB-INF/layouts/footer.jsp"%>

	<script src="${ctx}/resources/js/jquery/1.7.2/jquery.js"></script>
	<script src="${ctx}/resources/bootstrap/js/bootstrap.min.js"></script>
	<script src="${ctx }/resources/js/jquery-validation/jquery.validate.min.js"></script>
	<script src="${ctx }/resources/js/jquery-validation/message_zh.js"></script>
</body>
</html>