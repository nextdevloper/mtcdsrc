<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--タイトルなどの可変値を外から設定するのに使える。
<tiles:getAsString name="title" />
--%>
<div id="breadNavi"><s:link href="/mgs01001/news/init">HOME</s:link>&nbsp;&gt;&gt;&nbsp;<s:link href="/mgs01001/news/init">お知らせ 一覧</s:link>&nbsp;&gt;&gt;&nbsp;組織登録</div>
<h1>組織管理(STEP1)</h1>
<s:form>
<div class="contentswrap">
	<div id="id1">
		<h2>組織管理(STEP1)</h2>
		<div class="fakelist" align="left">
			<s:link href="strctInsProc">組織登録</s:link>&nbsp;<s:submit property="strctDelProc" value="組織削除" />
		</div>
		${locationLink}
		<div class="fakeContainer">
			<table id="demoTable">
				<thead>
					<tr>
						<th><input type="checkbox"></th>
						<th>組織名</th>
						<th>ステータス</th>
						<th><font size="1">キャッシュポイント(CP)<br>トレードポイント(TP)</font></th>
						<th>メールアドレス</th>
						<th>備考</th>
						<th>追加タグA</th>
						<th>追加タグB</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="e" varStatus="s" items="${strctListItems}">
					<tr>
						<td><html:multibox property="chkStrct" value="${f:h(e.strctId)}" /></td>
						<td>
							<s:link href="strctDetailSearch?strctkey=${f:h(e.strctId)}">${f:h(e.structNm)}</s:link><br>
							<s:link href="attcSearch?strctkey=${f:h(e.strctId)}">所属追加削除</s:link>
						</td>
						<td>${f:h(e.structKind)}：${f:h(e.structStat)}</td>
						<td>CP:0pt<br>TP:0pt</td>
						<td>${f:h(e.mailaddress)}</td>
						<td>${f:h(e.note)}</td>
						<td>追加タグAの内容</td>
						<td>追加タグBの内容</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div id="id1">
			<h2>組織登録</h2>
			<table class="table">
				<tr>
					<td class="tb"><font color=red>*</font>組織属性ID<br><font size="1" color="blue">一度登録すると変更はできません</font></td>
					<td>
						<html:errors property="strctId" />
						<html:text property="strctId" />
						<html:checkbox styleId="checkbox" property="strctStatus" value="01" /><font size="1" color="blue">公開</font>
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>組織種別</td>
					<td>
						<html:select property="strctKind">
							<html:options collection="strctKindList"
								property="codeId"
								labelProperty="codeNm" />
						</html:select>
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>組織名（漢字）</td>
					<td>
						<html:errors property="strctNm" />
						<html:text property="strctNm" />
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>組織名（かな）<br></td>
					<td>
						<html:errors property="strctNmKana" />
						<html:text property="strctNmKana" />
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>組織名（略称）<br></td>
					<td>
						<html:errors property="strctNmNick" />
						<html:text property="strctNmNick" />
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>メールアドレス</td>
					<td>
						<html:errors property="mailAddress" />
						<html:text property="mailAddress" />
					</td>
				</tr>
				<tr>
					<td class="tb"><font color=red>*</font>メールアドレス（確認用）</td>
					<td>
						<html:errors property="mailAddressConfirm" />
						<html:text property="mailAddressConfirm" />
					</td>
				</tr>
				<tr>
					<td class="tb">電話番号（固定）</td>
					<td>
						<html:errors property="tel1" />
						<html:text property="tel1" />
					</td>
				</tr>
				<tr>
					<td class="tb">電話番号（携帯）</td>
					<td>
						<html:errors property="tel2" />
						<html:text property="tel2" />
					</td>
				</tr>
				<tr>
					<td class="tb">備考</td>
					<td>
						<html:errors property="note" />
						<html:textarea property="note" />
					</td>
				</tr>
				<tr>
					<td class="tb">追加タグA</td>
					<td>
						<html:errors property="tagA" />
						<html:textarea property="tagA" />
					</td>
				</tr>
				<tr>
					<td class="tb">追加タグB</td>
					<td>
						<html:errors property="tagB" />
						<html:textarea property="tagB" />
					</td>
				</tr>
			</table>
			<s:submit property="strctInsCheck" value="登録" />
		</div>
	</div>
	<div id="subnavi"> </div>
</div>
</s:form>
<hr>




<div id="testDiv" style="display:none;float:left;margin:40px;width:400px;height:300px;background-color:#f1f1f1;"></div>

<script type="text/javascript" src="../javascripts/superTables.js"></script>
<script type="text/javascript">
//<![CDATA[

(function () {
    new superTable("demoTable", {
    	cssSkin : "sSky",
        fixedCols : 2
    });

})();

//]]>
</script>
