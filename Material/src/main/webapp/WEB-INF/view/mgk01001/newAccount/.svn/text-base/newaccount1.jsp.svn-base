<%@page contentType="text/html" pageEncoding="UTF-8"%>
<tiles:insert template="/WEB-INF/view/common/L001-layout.jsp" flush="true">
<%--タイトルなどの可変値を外から設定するのに使える。
<tiles:put name="title"  value="Tiles"/>
--%>
<tiles:put name="content" type="string">
<%--業務固有部 - 開始--%>
			<div id="breadNavi"> 新規登録　&gt;&gt;　登録内容入力 </div>
			<h1>新規登録</h1>
			<div class="contentswrap">
				<s:form>
				<h2>新規登録</h2>
				新規登録のための情報を入力してください<br>
				<html:errors property="other_err"/>
				<font color=red>*</font>必須入力
				<table class="table">
					<tr>
						<td class="tb"><font color=red>*</font>ユーザID</td>
						<td>
							<html:errors property="userId" />
							<html:text property="userId" />
						</td>
					</tr>
					<tr>
						<td class="tb"><font color=red>*</font>ユーザ種別</td>
						<td>
							<html:select property="userKind">
								<html:options collection="userKindList"
									property="codeId"
									labelProperty="codeNm" />
							</html:select>
						</td>
					</tr>
					<tr>
						<td class="tb"><font color=red>*</font>ユーザステータス</td>
						<td>
							<html:select property="userStatus">
								<html:options collection="userStatusList"
									property="codeId"
									labelProperty="codeNm" />
							</html:select>
						</td>
					</tr>
					<tr>
						<td class="tb"><font color=red>*</font>氏名（漢字）<br><font size="1" color="blue">※姓と名の間は1文字開けてください</font></td>
						<td><html:errors property="userNameKnj" /><br>
							<html:text property="userNameKnj" />
						</td>
					</tr>
					<tr>
						<td class="tb">氏名（かな）<br><font size="1" color="blue">※姓と名の間は1文字開けてください</font></td>
						<td><html:text property="userNameKana" /></td>
					</tr>
					<tr>
						<td class="tb">ニックネーム<br></td>
						<td><html:text property="userNameNick" /></td>
					</tr>
					<tr>
						<td class="tb"><font color=red>*</font>メールアドレス</td>
						<td><html:errors property="mailAddr" />
							<html:text property="mailAddr" />
						</td>
					</tr>
					<tr>
						<td class="tb"><font color=red>*</font>メールアドレス（確認用）</td>
						<td><html:errors property="mailAddrKakunin" />
							<html:text property="mailAddrKakunin" />
						</td>
					</tr>
					<tr>
						<td class="tb"><font color=red>*</font>パスワード</td>
						<td><html:errors property="password" />
							<html:password property="password" />
						</td>
					</tr>
					<tr>
						<td class="tb"><font color=red>*</font>パスワード（確認用）</td>
						<td><html:errors property="passwordKakunin" />
							<html:password property="passwordKakunin" />
						</td>
					</tr>
					<tr>
						<td class="tb">性別</td>
						<td>
							<html:select property="seibetu">
								<html:options collection="seibetuList"
									property="codeId"
									labelProperty="codeNm" />
							</html:select>
						</td>
					</tr>
					<tr>
						<td class="tb">生年月日</td>
						<td>
						    <html:errors property="date_other_err" />
							<html:errors property="seinengappiYYYY" /><html:errors property="seinengappiMM" /><html:errors property="seinengappiDD" /><html:errors property="dateOtherErr" />
							西暦<html:text property="seinengappiYYYY" size="4"/>年<html:text property="seinengappiMM" size="2"/>月<html:text property="seinengappiDD" size="2"/>日
						</td>
					</tr>
					<tr>
						<td class="tb">電話番号（固定）</td>
						<td><html:errors property="telKotei"/>
							<html:text property="telKotei" />
						</td>
					</tr>
					<tr>
						<td class="tb">電話番号（携帯）</td>
						<td><html:errors property="telKeitai"/>
							<html:text property="telKeitai" />
						</td>
					</tr>
					<tr>
						<td class="tb">備考</td>
						<td><html:textarea property="biko" /></td>
					</tr>
				</table>
				<s:submit property="check" value="登録" />
				</s:form>
			</div>
<%--業務固有部 - 終了--%>
</tiles:put>
</tiles:insert>