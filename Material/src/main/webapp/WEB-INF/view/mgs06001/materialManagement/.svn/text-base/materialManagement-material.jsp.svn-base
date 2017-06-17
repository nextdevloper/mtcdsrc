<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--タイトルなどの可変値を外から設定するのに使える。
<tiles:getAsString name="title" />
--%>
<%--業務固有部 - 開始--%>
	<div id="breadNavi"><s:link href="/mgs01001/news/init">HOME</s:link>&nbsp;&gt;&gt;&nbsp;<s:link href="/mgs06001/materialManagement/init">マテリアル管理</s:link>&nbsp;&gt;&gt;&nbsp;現在のページ </div>
	<h1>マテリアル管理</h1>
<s:form>
<table class="table">
	<tr>
		<td class="tb" >
			照会/修正<br>
		</td>
		<td>
			<html:radio property="material" value="1" disabled="true"/><font size="1">ロケーション</font>
			<html:radio property="material" value="2" disabled="true"/><font size="1">ボックス</font>
			<html:radio property="material" value="3" disabled="true"/><font size="1">マテリアル</font>
			<br>
			<html:text property="srcKey" disabled="true"/>
			<s:submit property="regSearch" value="照会" disabled="true"/>
		</td>
	</tr>
</table>
</s:form>
<div class="contentswrap">
	<div id="id2" >
<s:form>
		<h2>ロケーション/ボックス</h2>
			<table class="table">
				<tr>
					<td class="tb">ロケーション<br>ID:${f:h(locId)}</td>
					<td><s:link href="locDetailSearch?srcLocKey=${f:h(locId)}">${f:h(locNm)}</s:link>
						<br>${f:h(locKindStr)}</td>
				</tr>
				<tr>
					<td class="tb">ボックス<br>ID:${f:h(boxId)}</td>
					<td><s:link href="boxDetailSearch?srcBoxKey=${f:h(boxId)}">${f:h(boxNm)}</s:link>
						<br>${f:h(boxKindStr)}</td>
				</tr>
			</table>
		<h2>マテリアル（一覧表示）</h2>
		<div class="fakelist" align="left">
			<html:hidden property="srcBoxKey" value="${f:h(boxId)}" />
			<s:submit property="matInsProc" value="マテリアル追加" />&nbsp;
			<s:submit property="matDelProc" value="マテリアル削除" />&nbsp;
			${f:h(resultDelMsg)}&nbsp;
			${f:h(resultListMsg)}
		</div>
		${locationLink}
		<div class="fakeContainer">
			<table id="demoTable2">
				<thead>
					<tr>
						<th><html:checkbox styleId="checkbox" property="checkbox" value="1"  onclick="doChkSet()" /></th>
						<th>ボックス名</th>
						<th>マテリアル名</th>
						<th>ステータス</th>
						<th>追加タグ（リンク）</th>
						<th>追加タグ（コメント）</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="e" varStatus="s" items="${matListItems}">
					<tr>
						<td><html:multibox property="mbox" value="${f:h(e.mtId)}" /></td>
						<td>${f:h(e.boxNm)}<br>（${f:h(e.boxKind)}）</td>
						<td>
							<s:link href="matDetailSearch?srcMatKey=${f:h(e.mtId)}">${f:h(e.mtNm)}</s:link>
						</td>
						<td>${f:h(e.mtKind1)}</td>
						<td>${f:h(e.tagA)}</td>
						<td>${f:h(e.tagB)}</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
</s:form>
<%-- 詳細画面 --%>
<s:form>
		<html:hidden property="srcBoxKey" value="${f:h(boxId)}" />
		<div id="B01" style="display:${f:h(matDetailDisplay)};">
			<h2>マテリアル（詳細表示）</h2>
			<hr>
			ロケーション名：${f:h(locNm)}（ID:${f:h(locId)}/${f:h(locKindStr)}）<br>
			ボックス名：${f:h(boxNm)}（ID:${f:h(boxId)}/${f:h(boxKindStr)}）
			<hr>
			<div class="fakelist" align="left">
				<s:link href="matUpdProc?srcMatKey=${f:h(matId)}">マテリアル編集</s:link><br>
			</div>
			${f:h(resultMsg)}
			<html:errors />
			<table class="table">
				<tr>
					<td class="tb">マテリアル情報：<br>${f:h(matId)}</td>
					<td>${f:h(matNm)}<br>（${f:h(matKind1Str)}）</td>
				</tr>
				<tr>
					<td class="tb">マテリアルオーナー情報</td>
					<td> ${f:h(matOnrId)}：${f:h(matOnrNm)} </td>
				</tr>
				<tr>
					<td class="tb">追加タグ（リンク）</td>
					<td>${f:h(tagA)}</td>
				</tr>
				<tr>
					<td class="tb">追加タグ（コメント）</td>
					<td>${f:h(tagB)}</td>
				</tr>
			</table>
		</div>
</s:form>
<%-- 新規登録画面 --%>
<s:form>
		<html:hidden property="srcBoxKey" value="${f:h(boxId)}" />
		<div id="B11" style="display:${f:h(matInsDisplay)};">
			<hr>
			ロケーション名：${f:h(locNm)}（ID:${f:h(locId)}/${f:h(locKindStr)}）<br>
			ボックス名：${f:h(boxNm)}（ID:${f:h(boxId)}/${f:h(boxKindStr)}）
			<hr>
			<h2>マテリアル（追加登録）</h2>
			${f:h(resultMsg)}
			<html:errors property="other_err"/>
			<table class="table">
				<tr>
					<td class="tb">ロケーションID</td>
					<td>
						<html:errors property="locId" />
						${f:h(locId)}
						${f:h(locKindStr)}
					</td>
				</tr>
				<tr>
					<td class="tb">ボックスオーナーID</td>
					<td>
						<html:errors property="boxOnrId" />
						${f:h(boxOnrId)}
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>ボックスID<br><font size="1">登録更新するまで反映されません</font></td>
					<td>
						<html:errors property="boxId" />
						${f:h(boxId)}
						<html:hidden property="boxId" />
						${f:h(boxKindStr)}
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>ボックス名</td>
					<td>
						<html:errors property="boxNm" />
						${f:h(boxNm)}
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>マテリアルオーナーID</td>
					<td>
						<html:errors property="matOnrId" />
						<html:hidden property="matOnrId" />
						${f:h(matOnrId)}
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>マテリアルID</td>
					<td>
						<html:errors property="matId" />
						<html:hidden property="matId" />
						${f:h(matId)}
						<html:checkbox styleId="checkbox" property="matKind1" value="01" /><font size="1" color="blue">公開</font>
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>マテリアル名</td>
					<td>
						<html:errors property="matNm" />
						<html:text property="matNm" />
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
					<td class="tb">追加タグ（コメント）</td>
					<td>
						<html:errors property="tagB" />
						<html:text property="tagB" />
					</td>
				</tr>
			</table>
			<s:submit property="matInsCheck" value="登録" />
		</div>
</s:form>
<%-- 新規登録確認画面 --%>
<s:form>
		<html:hidden property="srcBoxKey" value="${f:h(boxId)}" />
		<html:hidden property="boxId" />
		<html:hidden property="boxNm" />
		<html:hidden property="boxKind" />
		<html:hidden property="matId" />
		<html:hidden property="matNm" />
		<html:hidden property="matKind1" />
		<html:hidden property="matOnrId" />
		<html:hidden property="matOnrNm" />
		<html:hidden property="tagA" />
		<html:hidden property="tagB" />
		
		<div id="B12" style="display:${f:h(matInsConfirmDisplay)};">
			<h2>マテリアル（追加登録）</h2>
			<hr>
			ロケーション名：${f:h(locNm)}（ID:${f:h(locId)}/${f:h(locKindStr)}）<br>
			ボックス名：${f:h(boxNm)}（ID:${f:h(boxId)}/${f:h(boxKindStr)}）
			<hr>
			${f:h(resultMsg)}
			<html:errors />
			<table class="table">
				<tr>
					<td class="tb">ボックス情報：<br>${f:h(boxId)}</td>
					<td>${f:h(boxNm)}<br>（${f:h(boxKindStr)}）</td>
				</tr>
				<tr>
					<td class="tb">マテリアル情報：<br>${f:h(matId)}</td>
					<td>${f:h(matNm)}<br>（${f:h(matKind1Str)}</td>
				</tr>
				<tr>
					<td class="tb">マテリアルオーナー情報</td>
					<td> ${f:h(matOnrId)}：${f:h(matOnrNm)} </td>
				</tr>
				<tr>
					<td class="tb">追加タグ（リンク）</td>
					<td>${f:h(tagA)}</td>
				</tr>
				<tr>
					<td class="tb">追加タグ（コメント）</td>
					<td>${f:h(tagB)}</td>
				</tr>
			</table>
			<s:submit property="matInsReg" value="確認" />
		</div>
</s:form>
<%-- 更新登録画面 --%>
<s:form>
		<html:hidden property="srcBoxKey" value="${f:h(boxId)}" />
		<div id="B21" style="display:${f:h(matUpdDisplay)};">
			<h2>マテリアル（登録変更）</h2>
			<hr>
			ロケーション名：${f:h(locNm)}（ID:${f:h(locId)}/${f:h(locKindStr)}）<br>
			ボックス名：${f:h(boxNm)}（ID:${f:h(boxId)}/${f:h(boxKindStr)}）
			<hr>
			${f:h(resultMsg)}
			<html:errors property="other_err"/>
			<table class="table">
				<tr>
					<td class="tb"><font color=red>*</font>ロケーションID</td>
					<td>
						<html:errors property="locId" />
						${f:h(locId)}
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>ボックスオーナーID</td>
					<td>
						<html:errors property="boxOnrId" />
						${f:h(boxOnrId)}
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>ボックスID</td>
					<td>
						<html:errors property="boxId" />
						<html:text property="boxId" />
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>ボックス名</td>
					<td>
						<html:errors property="boxNm" />
						${f:h(boxNm)}
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>マテリアルオーナーID</td>
					<td>
						<html:errors property="matOnrId" />
						<html:text property="matOnrId" />
						${f:h(matOnrNm)}
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>マテリアルID</td>
					<td>
						<html:errors property="matId" />
						<html:hidden property="matId" />
						${f:h(matId)}
						<html:checkbox styleId="checkbox" property="matKind1" value="01" /><font size="1" color="blue">公開</font>
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>マテリアル名</td>
					<td>
						<html:errors property="matNm" />
						<html:text property="matNm" />
					</td>
				</tr>
				<tr>
					<td class="tb">追加タグ（リンク）</td>
					<td>
						<html:errors property="tagA" />
						<html:text property="tagA" />
					</td>
				</tr>
				<tr>
					<td class="tb">追加タグ（コメント）</td>
					<td>
						<html:errors property="tagB" />
						<html:text property="tagB" />
					</td>
				</tr>
			</table>
			<s:submit property="matUpdCheck" value="更新" />
		</div>
</s:form>
<%-- 更新登録確認画面 --%>
<s:form>
		<html:hidden property="srcBoxKey" value="${f:h(boxId)}" />
		<html:hidden property="boxId" />
		<html:hidden property="boxNm" />
		<html:hidden property="boxKind" />
		<html:hidden property="matId" />
		<html:hidden property="matNm" />
		<html:hidden property="matKind1" />
		<html:hidden property="matOnrId" />
		<html:hidden property="matOnrNm" />
		<html:hidden property="tagA" />
		<html:hidden property="tagB" />
		<div id="B22" style="display:${f:h(matUpdConfirmDisplay)};">
			<h2>マテリアル（登録変更）</h2>
			<hr>
			ロケーション名：${f:h(locNm)}（ID:${f:h(locId)}/${f:h(locKindStr)}）<br>
			ボックス名：${f:h(boxNm)}（ID:${f:h(boxId)}/${f:h(boxKindStr)}）
			<hr>
			${f:h(resultMsg)}
			<html:errors />
			<table class="table">
				<tr>
					<td class="tb">ボックス情報：<br>${f:h(boxId)}</td>
					<td>${f:h(boxNm)}<br>（${f:h(boxKindStr)}/ボックス状態）</td>
				</tr>
				<tr>
					<td class="tb">マテリアル情報：<br>${f:h(matId)}</td>
					<td>${f:h(matNm)}<br>（${f:h(matKind1Str)}/ボックス状態）</td>
				</tr>
				<tr>
					<td class="tb">マテリアルオーナー情報</td>
					<td> ${f:h(matOnrId)}：${f:h(matOnrNm)} </td>
				</tr>
				<tr>
					<td class="tb">追加タグ（リンク）</td>
					<td>${f:h(tagA)}</td>
				</tr>
				<tr>
					<td class="tb">追加タグ（コメント）</td>
					<td>${f:h(tagB)}</td>
				</tr>
			</table>
			<s:submit property="matUpdReg" value="確認" />
		</div>
</s:form>
		<div id="subnavi"> </div>
	</div>
</div>


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
	var tbl = document.getElementsByName("mbox");
	for (var i=0; i<document.getElementsByName("mbox").length; i++){
    		if(chk == true){
        		tbl[i].checked=true;
    		}else{
        		tbl[i].checked=false;
    		}
	}
	document.getElementByName("material")[2].checked=true;
}
window.onload = function (){
	document.getElementByName("material")[2].checked=true;
}
</script>
