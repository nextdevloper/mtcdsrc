<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>マテリアルコックピット</title>
<link href="${f:url('/css/loginstyle.css')}" media="screen, projection" rel="stylesheet" type="text/css">
<link href="${f:url('/css/stylet.css')}" rel="stylesheet" type="text/css">
<link href="${f:url('/css/superTables.css')}" rel="stylesheet" type="text/css">
<script type="text/javascript" src="${f:url('/js/jquery.js')}"></script>
<script type="text/javascript" src="${f:url('/js/superTables.js')}"></script>
<script type="text/javascript" src="${f:url('/js/material.js')}"></script>
</head>
<body>
<div id="container">
  <div id="topnav" class="topnav">
        <s:link href="/mgk01001/newAccount/init" styleClass="XXXX"><span>新規登録</span></s:link>
        <s:link href="login" styleClass="signin"><span>ログイン</span></s:link>
  </div>
  <fieldset id="signin_menu">
      <s:form>
        <p>
        <label for="username">アカウント名</label>
          <html:text property="username" tabindex="4" styleId="username"/>
        </p>
        <p>
          <label for="password">パスワード</label>
          <html:password property="password" title="password" tabindex="5" styleId="password"/>
        </p>
        <p>
        <html:errors />
        </p>
       <p class="remember">
          <s:submit property="login" styleId="signin_submit" value="ログイン" tabindex="6" ></s:submit>
        </p>
        <p class="forgot-username"><s:link styleId="forgot_username_link" title="E-MAIL宛てにパスワードの再発行を行います。" href="/mgk01001/reissuPassword/init">アカウント名/パスワードを忘れた方はこちら</s:link></p>
      </s:form>
  </fieldset>

  <h1>マテリアルコックピット${dbKindName}</h1>
  <s:form>
    <table class="table">
      <tr>
        <td class="tb">
          ロケーション
        </td>
        <td>
          <html:text property="srcKey1" />
        </td>
        <td rowspan="3">
	  	<s:submit property="regSearch" value="照会" />
        </td>
      </tr>
      <tr>
        <td class="tb">
          ボックス
        </td>
        <td>
          <html:text property="srcKey2" />
        </td>
      </tr>
      <tr>
        <td class="tb">
          マテリアル
        </td>
        <td>
          <html:text property="srcKey3" />
        </td>
      </tr>
    </table>
  </s:form>

  <div class="contentswrap">

     ${link}
     <div class="fakeContainer">
     <table id="demoTable">
         <tr>
           <th>ロケーション名</th>
           <th>ボックス名</th>
           <th>マテリアル名</th>
           <th>ステータス</th>
           <th>追加タグA</th>
           <th>追加タグB</th>
         </tr>
         <c:forEach var="mt" varStatus="s" items="${listItemsMt}">
           <tr>
             <td>${f:h(mt.locLocNm)}<br>
                 (ID:${f:h(mt.mrlLocId)}/${f:h(mt.locLocKind)})
             </td>

             <c:if test="${empty mt.boxBoxNm}" >
             <td>登録はありません<br>
             </td>
             </c:if>
             <c:if test="${!empty mt.boxBoxNm}" >
             <td>${f:h(mt.boxBoxNm)}<br>
                 (ID:${f:h(mt.mrlBoxId)}/${f:h(mt.boxBoxKind)})
             </td>
             </c:if>

             <c:if test="${empty mt.mtMtNm}" >
             <td>登録はありません<br>
             </td>
             </c:if>
             <c:if test="${!empty mt.mtMtNm}" >
             <td>${f:h(mt.mtMtNm)}<br>
                （${f:h(mt.mtMtKind2)}）
             </td>
             </c:if>
             <td>${f:h(mt.mtMtKind1)}</td>
             <td>${f:h(mt.mtTagA)}</td>
             <td>${f:h(mt.mtTagB)}</td>
           </tr>
         </c:forEach>
     </table>
     </div>
</div>

<script src="${f:url('/js/jquery.js')}" type="text/javascript"></script>
<script type="text/javascript">
        $(document).ready(function() {

            $(".signin").click(function(e) {
                e.preventDefault();
                $("fieldset#signin_menu").toggle();
                $(".signin").toggleClass("menu-open");
            });

            $("fieldset#signin_menu").mouseup(function() {
                return false
            });
            $(document).mouseup(function(e) {
                if($(e.target).parent("a.signin").length==0) {
                    $(".signin").removeClass("menu-open");
                    $("fieldset#signin_menu").hide();
                }
            });

        });
</script>
<script src="${f:url('/js/jquery.tipsy.js')}" type="text/javascript"></script>
<script type='text/javascript'>
    $(function() {
      $('#forgot_username_link').tipsy({gravity: 'w'});
    });
  </script>

<script type="text/javascript" src="../js/superTables.js"></script>
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

</script>
</body>
</html>