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
        
    </div>
  </div>

  <div class="page_container">
    <div class="wrap">
		<div class="alert alert-error span8">
			错误提示：
			<s:fielderror></s:fielderror>
			<a href="javascript:history.go(-1);">返回上一步</a>
		</div>
    </div>
  </div>
  
  <script src="js/jquery.min.js" type="text/javascript" lang="javascript"></script>
  <script src="js/bootstrap.min.js" type="text/javascript" lang="javascript"></script>
  <script src="js/bootstrap-carousel.js" type="text/javascript" lang="javascript"></script>
</body>
</html>
