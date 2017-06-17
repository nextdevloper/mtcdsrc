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
			<html:text property="srcKey" />
			<s:submit property="regSearch" value="照会" />
		</td>
	</tr>
</table>
</s:form>
<div class="contentswrap">
	<div id="id2" >
<s:form>
		ロケーション名：<s:link href="locDetailSearch?srcLocKey=${f:h(locId)}">${f:h(locNm)}</s:link><br>
		<br>
		（ID:${f:h(locId)}/${f:h(locKindStr)}）
		<h2>ボックス管理</h2>
		<div class="fakelist" align="left">
			<html:hidden property="srcLocKey" value="${f:h(locId)}" />
			<s:submit property="boxInsProc" value="ボックス追加" />&nbsp;
			<s:submit property="boxDelProc" value="ボックス削除" />&nbsp;
			${f:h(resultDelMsg)}&nbsp;
			${f:h(resultListMsg)}
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
						<th>追加タグ（リンク）</th>
						<th>追加タグ（コメント）</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="e" varStatus="s" items="${boxListItems}">
					<tr>
						<td><html:multibox property="bbox" value="${f:h(e.boxId)}" /></td>
						<td>${f:h(e.locNm)}<br>（ID:${f:h(e.locId)}/${f:h(e.locKind)}）</td>
						<td><s:link href="boxDetailSearch?srcBoxKey=${f:h(e.boxId)}">${f:h(e.boxNm)}</s:link><br>
							<s:link href="matSearch?srcBoxKey=${f:h(e.boxId)}">（マテリアル設定）</s:link>
						</td>
						<td>${f:h(e.boxKind)}/ボックス状態１</td>
						<td>${f:h(e.capaInd)}</td>
						<td>${f:h(e.note)}</td>
						<td><html:link href="${f:h(e.tagA)}" target="_blank">${f:h(e.tagA)}</html:link></td>
						<td>${f:h(e.tagB)}</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
</s:form>
<%-- 詳細画面 --%>
<s:form>
		<html:hidden property="srcLocKey" value="${f:h(locId)}" />
		<div id="B1" style="display:${f:h(boxDetailDisplay)};">
			<h2>ボックス詳細</h2>
			ロケーション名：${f:h(locNm)}<br>
			（ID:${f:h(locId)}/${f:h(locKindStr)}）
			<html:errors />
			<div class="fakelist" align="left">
				<s:link href="boxUpdProc?srcBoxKey=${f:h(boxId)}">ボックス編集</s:link><br>
			</div>
			<table class="table">
				<tr>
					<td class="tb">ボックス情報：<br>${f:h(boxId)}</td>
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
					<td class="tb">追加タグ（リンク）</td>
					<td><html:link href="${f:h(tagA)}" target="_blank">${f:h(tagA)}</html:link></td>
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
		<html:hidden property="srcLocKey" value="${f:h(locId)}" />
		<div id="B1" style="display:${f:h(boxInsDisplay)};">
			<h2>ボックス登録</h2>
			${f:h(resultMsg)}
			<html:errors />
			<table class="table">
				<tr>
					<td class="tb">ロケーション情報</td>
					<td><html:text property="locId" /><br>
						(${f:h(locKindStr)})${f:h(locNm)}
						<html:errors property="locId" />
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>ボックスID（自動採番）</td>
					<td>
						${f:h(boxId)}
						<html:hidden property="boxId" />
						<html:errors property="boxId" />
						<html:checkbox styleId="checkbox" property="boxKind" /><font size="1" color="blue">公開</font>
						<html:hidden property="boxOnrId" />
						<html:errors property="boxOnrId" />
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
				<tr>
					<td class="tb">備考</td>
					<td>
						<html:errors property="note" />
						<html:text property="note" />
					</td>
				</tr>
			</table>
			（追加情報）
			<table class="table">
				<tr>
					<td class="tb">容量種別</td>
					<td>
						<html:errors property="capaInd" />
						<html:text property="capaInd" />
					</td>
				</tr>
			</table>
			<s:submit property="boxInsCheck" value="登録" />
		</div>
</s:form>
<%-- 新規登録確認画面 --%>
<s:form>
		<html:hidden property="srcLocKey" value="${f:h(locId)}" />
		<html:hidden property="locId" />
		<html:hidden property="boxId" />
		<html:hidden property="boxOnrId" />
		<html:hidden property="boxNm" />
		<html:hidden property="boxKind" />
		<html:hidden property="note" />
		<html:hidden property="capaInd" />
		<html:hidden property="tagA" />
		<html:hidden property="tagB" />
		<div id="B2" style="display:${f:h(boxInsConfirmDisplay)};">
			<h2>ボックス登録</h2>
			<html:errors />
			${f:h(resultMsg)}
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
					<td class="tb">備考</td>
					<td>${f:h(note)}</td>
				</tr>
				<tr>
					<td class="tb">追加タグ（リンク）</td>
					<td><html:link href="${f:h(tagA)}" target="_blank">${f:h(tagA)}</html:link></td>
				</tr>
				<tr>
					<td class="tb">追加タグ（コメント）</td>
					<td>${f:h(tagB)}</td>
				</tr>
			</table>
			（追加情報）
			<table class="table">
				<tr>
					<td class="tb">容量種別</td>
					<td>${f:h(capaInd)}</td>
				</tr>
			</table>
			<s:submit property="boxInsReg" value="確認" />
		</div>
</s:form>
<%-- 更新登録画面 --%>
<s:form>
		<html:hidden property="srcLocKey" value="${f:h(locId)}" />
		<div id="B2" style="display:${f:h(boxUpdDisplay)};">
			<h2>ボックス更新</h2>
			<html:errors />
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
						<html:hidden property="boxId" />
						<html:checkbox styleId="checkbox" property="boxKind" /><font size="1" color="blue">公開</font>
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
			<s:submit property="boxUpdCheck" value="更新" />
		</div>
</s:form>
<%-- 更新登録確認画面 --%>
<s:form>
		<html:hidden property="srcLocKey" value="${f:h(locId)}" />
		<html:hidden property="locId" />
		<html:hidden property="boxId" />
		<html:hidden property="boxOnrId" />
		<html:hidden property="boxNm" />
		<html:hidden property="boxKind" />
		<html:hidden property="note" />
		<html:hidden property="capaInd" />
		<html:hidden property="tagA" />
		<html:hidden property="tagB" />
		<div id="B3" style="display:${f:h(boxUpdConfirmDisplay)};">
			<h2>ボックス更新</h2>
			<html:errors />
			${f:h(resultMsg)}
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
					<td class="tb">追加タグ（リンク）</td>
					<td>${f:h(tagA)}</td>
				</tr>
				<tr>
					<td class="tb">追加タグ（コメント）</td>
					<td>${f:h(tagB)}</td>
				</tr>
			</table>
			<s:submit property="boxUpdReg" value="確認" />
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
