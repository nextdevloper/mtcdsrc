<%@page contentType="text/html" pageEncoding="UTF-8"%>
<tiles:insert template="/WEB-INF/view/common/L001-layout.jsp" flush="true">
<%--タイトルなどの可変値を外から設定するのに使える。
<tiles:put name="title"  value="Tiles"/>
--%>
<tiles:put name="content" type="string">
<%--業務固有部 - 開始--%>
			<div id="breadNavi"> 新規登録　&gt;&gt;　登録完了  </div>
			<h1>新規登録</h1>
			<div class="contentswrap">
				<h2>新規登録</h2>
				登録完了しました。
				<table class="table">
					<tr>
						<td class="tb">ユーザID</td>
						<td>${f:h(userId)}</td>
					</tr>
					<tr>
						<td class="tb">ユーザ種別</td>
						<td>${f:h(userKindLabel)}</td>
					</tr>
					<tr>
						<td class="tb">ユーザ名/ニックネーム</td>
						<td>${f:h(userNameKnj)}（${f:h(userNameKana)}）/${f:h(userNameNick)}</td>
					</tr>
					<tr>
						<td class="tb">メールアドレス</td>
						<td>${f:h(mailAddr)}</td>
					</tr>
					<tr>
						<td class="tb">パスワード</td>
						<td>（安全のため表示されません）</td>
					</tr>
					<tr>
						<td class="tb">性別</td>
						<td>${f:h(seibetuLabel)}</td>
					</tr>
					<tr>
						<td class="tb">生年月日</td>
						<td>
							<c:if test="${seinengappiYYYY !=''}">
								 西暦${f:h(seinengappiYYYY)}年${f:h(seinengappiMM)}月${f:h(seinengappiDD)}日
							</c:if>
						</td>
					</tr>
					<tr>
						<td class="tb">電話番号（固定）</td>
						<td>${f:h(telKotei)}</td>
					</tr>
					<tr>
						<td class="tb">電話番号（携帯）</td>
						<td>${f:h(telKeitai)}</td>
					</tr>
					<tr>
						<td class="tb">備考</td>
						<td>${f:br(f:nbsp(f:h(biko)))}</td>
					</tr>
				</table>
				<s:form>
					<s:submit property="toMain" value="メイン画面へ進む" />
				</s:form>
			</div>
<%--業務固有部 - 終了--%>
</tiles:put>
</tiles:insert>