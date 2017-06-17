<%@page contentType="text/html" pageEncoding="UTF-8"%>
<tiles:insert template="/WEB-INF/view/common/L001-layout.jsp" flush="true">
<%--タイトルなどの可変値を外から設定するのに使える。
<tiles:put name="title"  value="Tiles"/>
--%>
<tiles:put name="content" type="string">
<%--業務固有部 - 開始--%>
			<div id="breadNavi"> パスワード再発行　&gt;&gt;　パスワード再発行完了 </div>
			<h1>パスワード再発行</h1>
			<div class="contentswrap">
				<h2>パスワード再発行</h2>
				パスワードを指定したアドレスに仮パスワードを再発行しました。<br>
				次回ログイン時にパスワード変更が必要になります。
				<table class="table">
					<tr>
						<td class="tb">メールアドレス</td>
						<td>${f:h(mailAddr)}</td>
					</tr>
				</table>
				<%-- <input type="submit" value="ログインページへ戻る" onclick="location.href='../login.htm'" />--%>
				<s:form>
					<s:submit property="toLogin" value="ログインページへ戻る" />
				</s:form>
			</div>
<%--業務固有部 - 終了--%>
</tiles:put>
</tiles:insert>