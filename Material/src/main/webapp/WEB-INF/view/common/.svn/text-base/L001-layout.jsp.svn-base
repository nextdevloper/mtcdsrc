<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
<title>マテリアルコックピット</title>
<meta name="keywords" content="">
<meta name="description" content="">
<meta http-equiv="Content-Style-Type" content="text/css">
<link href="${f:url('/css/NewAccountStyle.css')}" rel="stylesheet" type="text/css">
</head>
<body>
<!-- #page ページの整形：中央寄せとか -->
<div id="page">
	<!-- #headerer 画面上部のヘッド部分 -->
	<div id="header">
		<%-- <div id="header_title">マテリアルコックピット</div>--%>
		<tiles:insert page="L001-header.jsp" />
	</div>
	<hr>
	<div id="contents">
		<!-- #main 本文スペース -->
		<div id="main">
			<tiles:insert attribute="content" />
			<%-- 
			<div id="breadNavi"> 新規登録　&gt;&gt;　登録内容入力 </div>
			<h1>新規登録</h1>
			<div class="contentswrap">
				<h2>新規登録</h2>
				新規登録のための情報を入力してください
				<table class="table">
					<tr>
						<td class="tb">ユーザID</td>
						<td><input type="text" /></td>
					</tr>
					<tr>
						<td class="tb">ユーザ種別</td>
						<td>
							<select name="kamoku2" size="1">
								<option value="個人" selected="selected">個人</option>
								<option value="法人">法人</option>
								<option value="倉庫業者">倉庫業者</option>
								<option value="運送業者">運送業者</option>
								<option value="連携システム">連携システム</option>
							</select>
						</td>
					</tr>
					<tr>
						<td class="tb">ユーザ名（漢字）<br><font size="1" color="blue">※姓と名の間は1文字開けてください</font></td>
						<td><input type="text" /></td>
					</tr>
					<tr>
						<td class="tb">ユーザ名（かな）<br><font size="1" color="blue">※姓と名の間は1文字開けてください</font></td>
						<td><input type="text" /></td>
					</tr>
					<tr>
						<td class="tb">ユーザ名（ニックネーム）<br><font size="1" color="blue">※姓と名の間は1文字開けてください</font></td>
						<td><input type="text" /></td>
					</tr>
					<tr>
						<td class="tb">メールアドレス</td>
						<td><input type="text" /></td>
					</tr>
					<tr>
						<td class="tb">メールアドレス（確認用）</td>
						<td><input type="text" /></td>
					</tr>
					<tr>
						<td class="tb">パスワード</td>
						<td><input type="password" /></td>
					</tr>
					<tr>
						<td class="tb">性別</td>
						<td>
							<select name="kamoku3" size="1">
								<option value="未指定" selected="selected">未指定</option>
								<option value="男">男</option>
								<option value="女">女</option>
							</select>
						</td>
					</tr>
					<tr>
						<td class="tb">生年月日</td>
						<td>西暦<input type="text" size=4 />年<input type="text" size=2 />月<input type="text" size=2 />日</td>
					</tr>
					<tr>
						<td class="tb">電話番号（固定）</td>
						<td><input type="text" /></td>
					</tr>
					<tr>
						<td class="tb">電話番号（携帯）</td>
						<td><input type="text" /></td>
					</tr>
					<tr>
						<td class="tb">備考</td>
						<td><textarea></textarea></td>
					</tr>
				</table>
				<input type="submit" value="登録" onclick="location.href='NewAccount2.htm'" />
			</div>
		--%>
		</div>
		<hr>
	</div>
	<!-- #footer　フッタースペース -->
	<div id="footer">
		<tiles:insert page="L001-footer.jsp" />
		<%-- <p>Copyright (c) 20XX yourname</p>--%>
	</div>
	<div id="templatelink"> HTML &amp; CSS template by <a href="http://www.shoshinsha.com/hp/template/">CSSデザインテンプレート</a> </div>
</div>

<div id="testDiv" style="display:none;float:left;margin:40px;width:400px;height:300px;background-color:#f1f1f1;"></div>

<script type="text/javascript" src="${f:url('/js/superTables.js')}"></script>
<script type="text/javascript">
//<![CDATA[

(function () {
    new superTable("demoTable", {
    	cssSkin : "sSky",
        fixedCols : 2
    });
    new superTable("demoTable2", {
    	cssSkin : "sSky",
        fixedCols : 2
    });
})();

var allInputs = $(":input");
var formChildren = $("form > *");
$("div1")
  .text("Found " + allInputs.length + " inputs and the form has " + formChildren.length + " children.")
  .css("color", "red");
$("form")
  .submit(function () { return false; }); // so it won't submit

[
//]]>
</script>
</body>
</html>

<%-- 
<html>
<head>
<title><tiles:getAsString name="title" /></title>
</head>
<body>
<table width="100%">
  <tr><td colspan="2"><tiles:insert page="/common/header.jsp" /></td></tr>
  <tr>
    <td width="20%"><tiles:insert page="/common/menu.jsp" /></td>
    <td><tiles:insert attribute="content" /></td>
  </tr>
  <tr><td colspan="2"><tiles:insert page="/common/footer.jsp" /></td></tr>
</table>
</body>
</html>
--%>