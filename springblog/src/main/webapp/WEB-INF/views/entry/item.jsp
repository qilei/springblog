<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${entry.subject }</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span9">
				<div>
					<div class="page-header">
					<h3>
						${entry.subject }
					</h3>
					</div>
					<p>${entry.body }</p>
					<div>
						<span><i class="icon-eye-open"></i> 浏览：999</span>&nbsp;&nbsp;
						<span><i class="icon-comment"></i> 评论：14</span>						
					</div>
					<hr/>
				</div>
				<div>
					<h3>评论：3</h3>
					<hr/>
					<div class="comment">
						<p><span class="pull-right">2012年11月2日</span><span>张三 说：</span></p>
						<p>提了很多次了，还是没有改进，有道词典和有道云笔记不能很好的兼容，在有道云笔记中的词组无法很好的用云词典查出，在单词或词组加重后，基本上无法识别出。这个改进真的很困难吗？</p>
					</div>
					<div class="comment">
						<p><span class="pull-right">2012年11月2日</span><span>张三 说：</span></p>
						<p>提了很多次了，还是没有改进，有道词典和有道云笔记不能很好的兼容，在有道云笔记中的词组无法很好的用云词典查出，在单词或词组加重后，基本上无法识别出。这个改进真的很困难吗？</p>
					</div>
					<div class="comment">
						<p><span class="pull-right">2012年11月2日</span><span>张三 说：</span></p>
						<p>提了很多次了，还是没有改进，有道词典和有道云笔记不能很好的兼容，在有道云笔记中的词组无法很好的用云词典查出，在单词或词组加重后，基本上无法识别出。这个改进真的很困难吗？</p>
					</div>
				</div>
				<div>
					<form>
					<fieldset>
						<legend>发表评论</legend>
						<input type="text" id="userName" name="userName" placeholder="姓名"/><br/>
						<input type="text" id="email" name="email" placeholder="电子邮件"/><br/>
						<textarea rows="8" id="comment" name="comment" class="input-block-level"></textarea><br/>
						<button type="submit" class="btn">发表评论</button>
						</fieldset>
					</form>
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