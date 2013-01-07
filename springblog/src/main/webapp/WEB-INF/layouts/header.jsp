<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/> 
	<div class="navbar">
		<div class="navbar-inner">
			<div class="container">
				<a class="brand">星晴的博客</a>
				<p class="navbar-text pull-right">
					<shiro:notAuthenticated>
						<a href="${ctx }/user/login">登录</a>
					</shiro:notAuthenticated>
					<shiro:authenticated>
						<a href="${ctx }/user/logout">退出</a>
					</shiro:authenticated>
					<a href="">关于</a>
				</p>
			</div>
		</div>
	</div>