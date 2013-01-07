<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span9">
				<c:forEach var="entry" items="${entries }">
					<div>
						<div class="page-header">
						<h3>
							<a href="${ctx }/entry/item?id=${entry.id}">${entry.subject }</a>
						</h3>
						</div>
						<p>${entry.body }</p>
						<div>
							<span class="pull-right"><a href="${ctx }/entry/item?id=${entry.id}">阅读全文</a></span>
							<span><i class="icon-eye-open"></i> 浏览：999</span>&nbsp;&nbsp;
							<span><i class="icon-comment"></i> 评论：14</span>						
						</div>
						<hr/>
					</div>				
				</c:forEach>
				<div class="pagination pagination-centered">
					<ul>
						<li><a href="#">&lt;&lt;</a></li>
						<li><a href="#">1</a></li>
						<li><a href="#">2</a></li>
						<li><a href="#">3</a></li>
						<li><a href="#">&gt;&gt;</a></li>
					</ul>
				</div>
			</div>
			<div class="span3">
				<form action="" class="form-search">
					<input type="text" class="input-medium search-query"/>
					<button type="submit" class="btn">搜索</button>
				</form>
				<div>
					<h4>文章分类</h4>
					<ul class="nav nav-list">
						<li><a href="#" class="">java</a></li>
						<li><a href="#" class="">js</a></li>
						<li><a href="#" class="">c#</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</body>
</html>