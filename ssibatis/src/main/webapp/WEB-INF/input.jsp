<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-type" content="text/html;charset=utf-8"></meta>
<title>ssibatis test</title>
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="css/bootstrap-responsive.min.css" rel="stylesheet"
	type="text/css" />
<link href="css/bootstrap-datepicker.css" rel="stylesheet"
	type="text/css" media="screen"/>
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
						<li><a href="index.action">首页</a></li>
						<li class="active"><a href="index_preadd.action">添加&编辑信息</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<div class="page_container">
		<div class="wrap">
			<s:if test="#request.result != null">
			<div class="alert">
				<s:property value="#request.result"/>
			</div>
			</s:if>
			<form class="form-horizontal" name="form1" id="form1" method="post" action="index_save.action">
				<div class="control-group">
					<input type="hidden" name="id" value="<s:property value="#request.content.id" default="0"/>"/>
					<label class="control-label" for="inputTitle">标题</label>
					<div class="controls">
						<input type="text" name="title" id="inputTitle" placeholder="请输入标题" value="<s:property value="#request.content.title"/>"/> <i class="icon-star"></i>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputEmail">邮箱</label>
					<div class="controls">
						<input type="text" name="email" id="inputEmail" placeholder="请输入邮箱" value="<s:property value="#request.content.email"/>" />
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputUrl">网站</label>
					<div class="controls">
						<input type="text" name="url" id="inputUrl" placeholder="请输入网站" value="<s:property value="#request.content.url"/>"></input>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputContent">内容</label>
					<div class="controls">
						<textarea name="content" class="span4" id="inputContent" rows="5" placeholder="请填写内容"><s:property value="#request.content.content"/></textarea> <i class="icon-star"></i>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label" for="inputDate">时间</label>
					<div class="controls">
						<input type="text" name="date" id="inputDate" readonly="readonly" data-date-format="yyyy-mm-dd" placeholder="请选择时间" value='<s:date name="#request.content.date" format="yyyy-MM-dd"/>'></input>
					</div>
				</div>
				<div class="control-group">
					<div class="controls">
						<button type="submit" class="btn btn-primary" id="save">保存信息</button>
						<button type="reset" class="btn">重新填写</button>
					</div>
				</div>
			</form>
		</div>
	</div>

	<script src="js/jquery.min.js" type="text/javascript" lang="javascript"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"
		lang="javascript"></script>
	<script src="js/bootstrap-carousel.js" type="text/javascript"
		lang="javascript"></script>
	<script src="js/bootstrap-datepicker.js" type="text/javascript"
		lang="javascript"></script>
	<script type="text/javascript">
	$(document).ready(function(){
		$('#inputDate').datepicker();
		$("#save").click(function(){
			if($("#inputTitle").val() == ""){
				alert("请输入标题");
				return false;
			}
			if($("#inputContent").val() == ""){
				alert("请输入内容");
				return false;
			}
			if($("#inputDate").val() == ""){
				alert("请选择时间");
				return false;
			}
		});
	});
    </script>
	
</body>
</html>
