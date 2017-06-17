<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--タイトルなどの可変値を外から設定するのに使える。
<tiles:getAsString name="title" />
--%>
<%--業務固有部 - 開始--%>
			<div id="breadNavi"><s:link href="/mgs01001/news/init">HOME</s:link>　&gt;&gt;　<s:link href="/mgs01001/news/init">お知らせ 一覧</s:link>　&gt;&gt;　現在のページ </div>
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
	<div id="id2" >
		<h2>ボックス管理</h2>
		<div class="fakelist" align="left">
			<s:submit property="boxInsProc" value="追加" />&nbsp;<s:submit property="boxDelProc" value="削除" />
		</div>
		${locationLink}
		<div class="fakeContainer">
			<table id="demoTable2">
				<thead>
					<tr>
						<th><html:checkbox styleId="checkbox" property="checkbox" value="1"  onclick="doChkSet()" /></th>
						<th>ロケーション名</th>
						<th>ボックス名</th>
						<th>ステータス</th>
						<th>サイズ</th>
						<th>備考</th>
						<th>条件指定</th>
						<th>追加タグA</th>
						<th>追加タグB</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="e" varStatus="s" items="${boxListItems}">
					<tr>
						<td><html:multibox property="bbox" value="${f:h(e.boxId)}" /></td>
						<td>${f:h(e.locNm)}<br>（ID:${f:h(e.locId)}/${f:h(e.locKind)}）</td>
						<td><s:link href="boxDetailSearch?srckey=${f:h(e.boxId)}">${f:h(e.boxNm)}</s:link></td>
						<td>${f:h(e.boxKind)}/ボックス状態１</td>
						<td>${f:h(e.capaInd)}</td>
						<td>${f:h(e.note)}</td>
						<td>
							<a href="#"
							 onclick="document.getElementById('id1').style.display = 'none';
							 document.getElementById('id2').style.display = 'none';
							 document.getElementById('id3').style.display = 'block';
							 document.getElementById('id4').style.display = 'none';
							 document.getElementById('RT1').style.display = 'block';
							 document.getElementById('RT2').style.display = 'none';
							 ">提供条件指定</a>
							<br>
							<a href="#"
							 onclick="document.getElementById('id1').style.display = 'none';
							 document.getElementById('id2').style.display = 'none';
							 document.getElementById('id3').style.display = 'none';
							 document.getElementById('id4').style.display = 'block';
							 ">移動条件指定</a>
						</td>
						<td>${f:h(e.tagA)}</td>
						<td>${f:h(e.tagB)}</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div id="subnavi"> </div>
	</div>
</div>
</s:form>


<div id="testDiv" style="display:none;float:left;margin:40px;width:400px;height:300px;background-color:#f1f1f1;"></div>

<script type="text/javascript" src="../javascripts/superTables.js"></script>
<script type="text/javascript">

(function () {
    new superTable("demoTable2", {
    	cssSkin : "sSky",
        fixedCols : 3
    });
})();
function doChkSet(){
	var chk = document.getElementById("checkbox").checked;
	var tbl = document.getElementsByName("bbox");
	for (var i=0; i<document.getElementsByName("bbox").length; i++){
    		if(chk == true){
        		tbl[i].checked=true;
    		}else{
        		tbl[i].checked=false;
    		}
	}
}

</script>
