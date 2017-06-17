<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
<title>マテリアルコックピット</title>
<meta name="keywords" content="">
<meta name="description" content="">
<meta http-equiv="Content-Style-Type" content="text/css">
<link href="${f:url('/css/stylet.css')}" rel="stylesheet" type="text/css">
<link href="${f:url('/css/superTables.css')}" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${f:url('/js/jquery.js')}"></script>
<script type="text/javascript" src="${f:url('/js/superTables.js')}"></script>
<script type="text/javascript" src="${f:url('/js/material.js')}"></script>
</head>
<body onload="init();">
<!-- #page ページの整形：中央寄せとか -->
<div id="page">
	<!-- #headerer 画面上部のヘッド部分 -->
	<div id="header">
		<tiles:insert page="L002-header.jsp" />
	</div>
	<!-- #menu トップメニュー -->
	<div id="menu">
		 <tiles:insert page="L002-menu-top.jsp" />
	</div>
	<div id="contents">
		<div id="menuL">
			 <tiles:insert page="L002-menu-left.jsp" />
		</div>
		<!-- #main 本文スペース -->
		<div id="main">
			<tiles:insert attribute="content" />
		</div>
		<hr>
	</div>
	<!-- #footer　フッタースペース -->
	<div id="footer">
		<%-- <p>Copyright (c) 20XX yourname</p>--%>
		<tiles:insert page="L002-footer.jsp" />
	</div>
	<div id="templatelink"> HTML &amp; CSS template by <a href="http://www.shoshinsha.com/hp/template/">CSSデザインテンプレート</a> </div>
</div>
<div id="testDiv" style="display:none;float:left;margin:40px;width:400px;height:300px;background-color:#f1f1f1;"></div>
</body>
</html>
