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
<%-- 新規登録確認画面 --%>
		<div id="B1" style="display:${f:h(boxConfirmDisplay)};">
			<h2>ボックス登録</h2>
			新規登録します。よろしいですか？
			<table class="table">
				<tr>
					<td class="tb">ロケーションID</td>
					<td>${f:h(locId)}</td>
				</tr>
				<tr>
					<td class="tb">ボックス情報：${f:h(boxId)}</td>
					<td>${f:h(boxNm)}<br>（${f:h(boxKindStr)}/ボックス状態）</td>
				</tr>
				<tr>
					<td class="tb">容量種別</td>
					<td>${f:h(capaInd)}</td>
				</tr>
				<tr>
					<td class="tb">備考</td>
					<td>${f:h(note)}</td>
				</tr>
				<tr>
					<td class="tb">追加タグA</td>
					<td>${f:h(tagA)}</td>
				</tr>
				<tr>
					<td class="tb">追加タグB</td>
					<td>${f:h(tagB)}</td>
				</tr>
			</table>
			<s:submit property="boxInsReg" value="確認" />
		</div>
<%-- 新規登録画面 --%>
		<div id="B2" style="display:${f:h(boxInsDisplay)};">
			<h2>ボックス登録</h2>
			<html:errors property="other_err"/>
			<table class="table">
				<tr>
					<td class="tb"><font color=red>*</font>ロケーションID</td>
					<td>
						<html:errors property="locId" />
						<html:text property="locId" />
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>ボックスオーナーID</td>
					<td>
						<html:errors property="boxOnrId" />
						<html:text property="boxOnrId" />
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>ボックスID</td>
					<td>
						${f:h(boxId)}
						<html:checkbox styleId="checkbox" property="boxKind" value="01" /><font size="1" color="blue">公開</font>
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>ボックス名</td>
					<td>
						<html:errors property="boxNm" />
						<html:text property="boxNm" />
					</td>
				</tr>
				<tr>
					<td class="tb">容量種別</td>
					<td>
						<html:errors property="capaInd" />
						<html:text property="capaInd" />
					</td>
				</tr>
				<tr>
					<td class="tb">備考</td>
					<td>
						<html:errors property="note" />
						<html:text property="note" />
					</td>
				</tr>
				<tr>
					<td class="tb">追加タグA</td>
					<td>
						<html:errors property="tagA" />
						<html:text property="tagA" />
					</td>
				</tr>
				<tr>
					<td class="tb">追加タグB</td>
					<td>
						<html:errors property="tagB" />
						<html:text property="tagB" />
					</td>
				</tr>
			</table>
			<s:submit property="boxInsCheck" value="登録" />
		</div>
	</div>
	<div id="subnavi"> </div>
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
