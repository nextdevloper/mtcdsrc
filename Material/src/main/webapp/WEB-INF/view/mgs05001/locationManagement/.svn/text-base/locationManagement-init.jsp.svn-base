<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--タイトルなどの可変値を外から設定するのに使える。
<tiles:getAsString name="title" />
--%>
<%--業務固有部 - 開始--%>
<div id="breadNavi"><s:link href="/mgs01001/news/init">HOME</s:link>&nbsp;&gt;&gt;&nbsp;<s:link href="/mgs01001/news/init">お知らせ 一覧</s:link>&nbsp;&gt;&gt;&nbsp;現在のページ </div>
<h1>ロケーション管理</h1>
<s:form>
<table class="table">
	<tr>
		<td class="tb"  rowspan="2">
			ロケーション/ボックス
		</td>
		<td>
			<html:radio property="material" value="1" /><font size="1">ロケーション</font>
			<html:radio property="material" value="2" /><font size="1">ボックス</font>
		</td>
		<td rowspan="2">
			<s:submit property="regSearch" value="照会" />
		</td>
	</tr>
	<tr>
		<td rowspan="2">
			<html:text property="srcLocBox" />
		</td>
	</tr>
</table>
<div class="contentswrap">
	<div id="id1">
		<h2>ロケーション管理</h2>
		<div class="fakelist" align="left">
			<s:submit property="locInsProc" value="追加"/>&nbsp;<s:submit property="locDelProc" value="削除" />
		</div>
		${locationLink}
		<div class="fakeContainer">
			<table id="demoTable">
				<thead>
					<tr>
						<th><html:checkbox styleId="checkbox" property="checkbox" value="1"  onclick="doChkSet()" /></th>
						<th>ロケーション名</th>
						<th>ステータス</th>
						<th>住所</th>
						<th>備考</th>
						<th>追加タグA</th>
						<th>追加タグB</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="e" varStatus="s" items="${locListItems}">
					<tr>
						<td><html:multibox property="lbox" value="${f:h(e.locId)}" /></td>
						<td>
							<s:link href="locDetailSearch?srckey=${f:h(e.locId)}">${f:h(e.locNm)}</s:link><br>
							<s:link href="boxSearch?srcboxlockey=${f:h(e.locId)}">（ボックス設定）</s:link>
						</td>
						<td>${f:h(e.locKind)}</td>
						<td>〒${f:h(e.postcd)}<br>
						${f:h(e.address)}</td>
						<td>${f:h(e.note)}</td>
						<td>追加タグAの内容</td>
						<td>追加タグBの内容</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<html:errors property="noitem" />
		</div>
	</div>
	<div id="subnavi"> </div>
</div>
</s:form>



<div id="testDiv" style="display:none;float:left;margin:40px;width:400px;height:300px;background-color:#f1f1f1;"></div>

<script type="text/javascript" src="../javascripts/superTables.js"></script>
<script type="text/javascript">

(function () {
    new superTable("demoTable", {
    	cssSkin : "sSky",
        fixedCols : 2
    });
    new superTable("demoTable2", {
    	cssSkin : "sSky",
        fixedCols : 2
    });
    new superTable("demoTable3", {
    	cssSkin : "sSky",
        fixedCols : 2
    });
    new superTable("demoTable4", {
    	cssSkin : "sSky",
        fixedCols : 2
    });
})();
function doChkSet(){
	var chk = document.getElementById("checkbox").checked;
	var tbl = document.getElementsByName("lbox");
	for (var i=0; i<document.getElementsByName("lbox").length; i++){
    		if(chk == true){
        		tbl[i].checked=true;
    		}else{
        		tbl[i].checked=false;
    		}
	}
}

</script>
