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
			<html:radio property="material" value="1" /><font size="1">ロケーション</font>
			<html:radio property="material" value="2" /><font size="1">ボックス</font>
			<html:radio property="material" value="3" /><font size="1">マテリアル</font>
			<br>
 			<html:text property="srcKey" /> 
			<s:submit property="regSearch" value="照会" />
		</td>
	</tr>
	<tr>
		<td class="tb">
			新規追加
		</td>
		<td>
			<s:link href="locInsProc">ロケーション新規追加</s:link><br>
			<s:link href="boxInsProc">ボックス新規追加</s:link><br>
			<s:link href="matInsProc">マテリアル新規追加</s:link>
		</td>
	</tr>
</table>
</s:form>
<div class="contentswrap">
	<div id="id1">
<s:form>
		<h2>ロケーション一覧</h2>
		<div class="fakelist" align="left">
			<s:submit property="locInsProc" value="ロケーション追加" />&nbsp;
			<s:submit property="locDelProc" value="ロケーション削除" />&nbsp;
			${f:h(resultDelMsg)}&nbsp;
			${f:h(resultListMsg)}
		</div>
		${locationLink}
		<div class="fakeContainer">
			<table id="demoTable">
				<thead>
					<tr>
						<th><html:checkbox styleId="checkbox" property="checkbox" value="1"  onclick="doChkSet()" /></th>
						<th>ロケーション情報</th>
						<th>所有者情報</th>
						<th>住所</th>
						<th>備考</th>
						<th>追加タグ（リンク）</th>
						<th>追加タグ（コメント）</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="e" varStatus="s" items="${locListItems}">
					<tr>
						<td><html:multibox property="lbox" value="${f:h(e.locId)}" /></td>
						<td>
							<s:link href="locDetailSearch?srcLocKey=${f:h(e.locId)}">${f:h(e.locNm)}</s:link><br>
							<s:link href="boxSearch?srcLocKey=${f:h(e.locId)}">（ボックス設定）</s:link>
						</td>
						<td>${f:h(e.locOnrId)}<br>
							${f:h(e.locKind)}</td>
						<td>〒${f:h(e.postcd)}<br>
						${f:h(e.address)}</td>
						<td>${f:h(e.note)}</td>
						<td><s:link href="${f:h(e.tagA)}">${f:h(e.tagA)}</s:link></td>
						<td>${f:h(e.tagB)}</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<html:errors property="noitem" />
		</div>
</s:form>
<%-- 詳細画面 --%>
<s:form>
		<div id="L1" style="display:${f:h(locDetailDisplay)};">
			<h2>ロケーション詳細</h2>
			<div class="fakelist" align="left">
				<s:link href="locUpdProc?srcLocKey=${f:h(locId)}">ロケーション編集</s:link><br>
				<s:link href="boxSearch?srcLocKey=${f:h(locId)}">ボックス編集</s:link><br>
			</div>
			${f:h(resultMsg)}
			<html:errors />
			<table class="table">
				<tr>
					<td class="tb">ロケーション情報</td>
					<td> ${f:h(locId)} : ${f:h(locNm)}<br>
						(${f:h(locKindStr)})</td>
				</tr>
				<tr>
					<td class="tb">ロケーションオーナー情報</td>
					<td> ${f:h(locOnrId)}：${f:h(locOnrNm)} </td>
				</tr>
				<tr>
					<td class="tb">住所</td>
					<td>〒 ${f:h(postcd)} <br>
						${f:h(address) }</td>
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
		<div id="L1" style="display:${f:h(locInsDisplay)};">
			<h2>ロケーション登録</h2>
			${f:h(resultMsg)}
			<html:errors />
			<table class="table">
				<tr>
					<td class="tb"><font color=red>*</font>ロケーションID
						<br>（自動採番）</td>
					<td>
						${f:h(locId)}
						<html:hidden property="locId" />
						<html:hidden property="locOnrId" />
						<html:errors property="locId" />
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>ロケーション名b</td>
					<td>
						<html:errors property="locNm" />
						<html:text property="locNm" />
						<html:checkbox styleId="checkbox" property="locKind" /><font size="1" color="blue">公開</font>
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
					<td class="tb">住所（郵便番号）<br>(例 123-4567)</td>
					<td>
						〒<html:text property="postcd" size="8" maxlength="8" /><html:errors property="postcd" />
					</td>
				</tr>
				<tr>
					<td class="tb">住所（住所）</td>
					<td>
						<html:errors property="address" />
						<html:text property="address" />
					</td>
				</tr>
				<tr>
					<td class="tb">住所（宛先名）</td>
					<td>
						<html:errors property="recipient" />
						<html:text property="recipient" />
					</td>
				</tr>
				<tr>
					<td class="tb">住所（電話番号）</td>
					<td>
						<html:errors property="tel1" />
						<html:text property="tel1" />
					</td>
				</tr>
			</table>
			<s:submit property="locInsCheck" value="登録" />
		</div>
</s:form>
<%-- 新規登録確認画面 --%>
<s:form>
		<html:hidden property="locId" />
		<html:hidden property="locOnrId" />
		<html:hidden property="locNm" />
		<html:hidden property="locKind" />
		<html:hidden property="note" />
		<html:hidden property="tagA" />
		<html:hidden property="tagB" />
		<html:hidden property="postcd" />
		<html:hidden property="address" />
		<html:hidden property="recipient" />
		<html:hidden property="tel1" />
		<div id="L2" style="display:${f:h(locInsConfirmDisplay)};">
			<h2>ロケーション登録</h2>
			${f:h(resultMsg)}
			<html:errors />
			<table class="table">
				<tr>
					<td class="tb">ロケーション情報</td>
					<td> ${f:h(locId)} <br>
						(${f:h(locKindStr)})${f:h(locNm)}</td>
				</tr>
				<tr>
					<td class="tb">追加タグ（リンク）</td>
					<td>${f:h(tagA)}</td>
				</tr>
				<tr>
					<td class="tb">追加タグ（コメント）</td>
					<td>${f:h(tagB)}</td>
				</tr>
				<tr>
					<td class="tb">備考</td>
					<td>${f:h(note)}</td>
				</tr>
			</table>
			（追加情報）
			<table class="table">
				<tr>
					<td class="tb">（追加情報）住所</td>
					<td>
						〒 ${f:h(postcd)}<br>
						${f:h(address) }<br>
						${f:h(recipient) }<br>
					</td>
				</tr>
			</table>
			<s:submit property="locInsReg"   value="登録" />
			<s:submit property="locInsreinput" value="戻る" />
		</div>
</s:form>
<%-- 更新登録画面 --%>
<s:form>
		<div id="L2" style="display:${f:h(locUpdDisplay)};">
			<h2>ロケーション更新</h2>
			<html:errors />
			${f:h(resultMsg)}
			<table class="table">
				<tr>
					<td class="tb"><font color=red>*</font>ロケーションID</td>
					<td>
						${f:h(locId)}
						<html:hidden property="locId" />
						<html:errors property="locId" />
						
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>ロケーション名</td>
					<td>
						<html:errors property="locNm" />
						<html:text property="locNm" />
						<html:checkbox styleId="checkbox" property="locKind" /><font size="1" color="blue">公開</font>
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>ロケーションオーナー</td>
					<td>
						${f:h(locOnrId)}:${f:h(locOnrNm)}
						<html:text property="locOnrId" />
						<html:errors property="locOnrId" />
						<html:hidden property="locOnrNm" />
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
					<td class="tb">住所（郵便番号）<br>(例 123-4567)</td>
					<td>
						〒<html:text property="postcd" size="8" maxlength="8" />
						<html:errors property="postcd" />
					</td>
				</tr>
				<tr>
					<td class="tb">住所（住所）</td>
					<td>
						<html:errors property="address" />
						<html:text property="address" />
					</td>
				</tr>
				<tr>
					<td class="tb">住所（宛先名）</td>
					<td>
						<html:errors property="recipient" />
						<html:text property="recipient" />
					</td>
				</tr>
				<tr>
					<td class="tb">住所（電話番号）</td>
					<td>
						<html:errors property="tel1" />
						<html:text property="tel1" />
					</td>
				</tr>
			</table>
			<s:submit property="locUpdCheck" value="更新" />
		</div>
</s:form>
<%-- 更新登録確認画面 --%>
<s:form>
		<html:hidden property="locId" />
		<html:hidden property="locOnrId" />
		<html:hidden property="locNm" />
		<html:hidden property="locKind" />
		<html:hidden property="note" />
		<html:hidden property="tagA" />
		<html:hidden property="tagB" />
		<html:hidden property="postcd" />
		<html:hidden property="address" />
		<html:hidden property="recipient" />
		<html:hidden property="tel1" />
		<div id="L3" style="display:${f:h(locUpdConfirmDisplay)};">
			<h2>ロケーション更新</h2>
			<html:errors />
			${f:h(resultMsg)}
			<table class="table">
				<tr>
					<td class="tb">ロケーション情報</td>
					<td> ${f:h(locId)} <br>
						(${f:h(locKindStr)})${f:h(locNm)}</td>
				</tr>
				<tr>
					<td class="tb">ロケーションオーナー情報</td>
					<td> ${f:h(locOnrId)}：${f:h(locOnrNm)} </td>
				</tr>
				<tr>
					<td class="tb">追加タグ（リンク）</td>
					<td>${f:h(tagA)}</td>
				</tr>
				<tr>
					<td class="tb">追加タグ（コメント）</td>
					<td>${f:h(tagB)}</td>
				</tr>
				<tr>
					<td class="tb">備考</td>
					<td>${f:h(note)}</td>
				</tr>
			</table>
			（追加情報）
			<table class="table">
				<tr>
					<td class="tb">（追加情報）住所</td>
					<td>
						〒 ${f:h(postcd)}<br>
						${f:h(address) }<br>
						${f:h(recipient) }<br>
					</td>
				</tr>
			</table>
			<s:submit property="locUpdReg" value="更新確定" />
			<s:submit property="locUpdreinput" value="戻る" />
		</div>
</s:form>
	</div>
	<div id="subnavi"> </div>
</div>

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
