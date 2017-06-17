<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--タイトルなどの可変値を外から設定するのに使える。
<tiles:getAsString name="title" />
--%>
<%--業務固有部 - 開始--%>
<div id="breadNavi"><s:link href="/mgs01001/news/init">HOME</s:link>&nbsp;&gt;&gt;&nbsp;<s:link href="/mgs01001/news/init">お知らせ 一覧</s:link>&nbsp;&gt;&gt;&nbsp;現在のページ </div>
<h1>マテリアルコックピット</h1>
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
</s:form>

<div id="testDiv" style="display:none;float:left;margin:40px;width:400px;height:300px;background-color:#f1f1f1;"></div>

<script type="text/javascript" src="../javascripts/superTables.js"></script>
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
