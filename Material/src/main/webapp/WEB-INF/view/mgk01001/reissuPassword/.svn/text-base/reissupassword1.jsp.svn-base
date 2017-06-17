<%@page contentType="text/html" pageEncoding="UTF-8"%>
<tiles:insert template="/WEB-INF/view/common/L001-layout.jsp" flush="true">
<%--タイトルなどの可変値を外から設定するのに使える。
<tiles:put name="title"  value="Tiles"/>
--%>
<tiles:put name="content" type="string">
<%--業務固有部 - 開始--%>
			<div id="breadNavi"> パスワード再発行　&gt;&gt;　メールアドレス入力 </div>
			<h1>パスワード再発行</h1>
			<div class="contentswrap">
				<h2>パスワード再発行</h2>
				<html:errors />
				パスワード再発行のための情報を入力してください
				<s:form>
				<table class="table">
					<tr>
						<td class="tb">メールアドレス</td>
						<%-- <td><input type="text" /></td>--%>
						<td><html:errors property="mailAddr" />
						<html:text property="mailAddr" /></td>
					</tr>
					<tr>
						<td class="tb">メールアドレス（確認用）</td>
						<%-- <td><input type="text" /></td>--%>
						<td><html:errors property="mailAddrKakunin" />
						<html:text property="mailAddrKakunin" /></td>
					</tr>
				</table>
				<%-- <input type="submit" value="パスワード再発行" onclick="location.href='ReissuPassword2.htm'" />--%>
				<s:submit property="reReg" value="パスワード再発行" />
				</s:form>
			</div>
<%--業務固有部 - 終了--%>
</tiles:put>
</tiles:insert>