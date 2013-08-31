<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta http-equiv="Content-type" content="text/html;charset=utf-8"></meta>
  <title>ssibatis test</title>
  <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
  <link href="css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
  <link href="css/common.css" rel="stylesheet" type="text/css" />
  <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->
</head>
<body>
  <div class="header">
    <div class="wrap">
        <div class="navbar">
		  <div class="navbar-inner">
		    <a class="brand" href="index.action">SSIBATIS</a>
		    <ul class="nav">
		      <li class="active"><a href="index.action">首页</a></li>
		      <li><a href="index_preadd.action">添加&编辑信息</a></li>
		    </ul>
		  </div>
		</div>
    </div>
  </div>

  <div class="page_container">
    <div class="wrap">
        <table class="table table-striped">
        	<tr>
        		<th>ID</th>
        		<th>标题</th>
        		<th>邮箱</th>
        		<th>网址</th>
        		<th>内容</th>
        		<th>时间</th>
        		<th>操作</th>
        	</tr>
        	<s:iterator value="#request.contents" var="content">
        	<tr>
        		<td><s:property value="#content.id"/></td>
        		<td><s:property value="#content.title"/></td>
        		<td><s:property value="#content.email"/></td>
        		<td><s:property value="#content.url"/></td>
        		<td><s:property value="#content.content"/></td>
        		<td><s:date name="#content.date" format="yyyy-MM-dd"/></td>
        		<td><a href="index_preedit.action?id=<s:property value="#content.id"/>" target="_blank">编辑 </a>| 
        		<a href="index_del.action?id=<s:property value="#content.id"/>" onclick="return confirm('是否确认删除该信息？');">删除</a></td>
        	</tr>
        	</s:iterator>
		</table>
		<s:property value="#request.page" escapeHtml="false"/>
    </div>
  </div>

  <script src="js/jquery.min.js" type="text/javascript" lang="javascript"></script>
  <script src="js/bootstrap.min.js" type="text/javascript" lang="javascript"></script>
  <script src="js/bootstrap-carousel.js" type="text/javascript" lang="javascript"></script>
</body>
</html>
