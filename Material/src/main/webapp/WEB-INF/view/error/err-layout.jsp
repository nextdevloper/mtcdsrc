<html>
<head>
<title><tiles:getAsString name="title" /></title>
<meta http-equiv="Content-Style-Type" content="text/css">
<link href="${f:url('/css/ErrorPageStyle.css')}" rel="stylesheet" type="text/css">
</head>
<body>
  <div id="header">
    <div id="header_title">マテリアルコックピット</div>
  </div>
  <br>
  <div id="contents">
    <table>
      <tr><td colspan="2"><tiles:insert page="/WEB-INF/view/error/err-header.jsp" /></td></tr>
      <tr>
        <td width="30%"><tiles:insert page="/WEB-INF/view/error/err-menu.jsp" /></td>
        <td><tiles:insert attribute="content" /></td>
      </tr>
      <tr><td colspan="2"><tiles:insert page="/WEB-INF/view/error/err-footer.jsp" /></td></tr>
    </table>
  </div>
</body>
</html>

