<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--タイトルなどの可変値を外から設定するのに使える。
<tiles:put name="title"  value="Tiles"/>
--%>
<%--業務固有部 - 開始--%>
			<div id="breadNavi"><s:link href="/mgs01001/news/init">HOME</s:link>　&gt;&gt;　<s:link href="/mgs03001/accountManagement/init">お知らせ 一覧</s:link>　&gt;&gt;　現在のページ </div>
			<h1>アカウント/グループ管理</h1>
			<div class="contentswrap">
				<div id="accountDetails">
				<h2>アカウント管理</h2>
				<s:form styleId="gyom">
				<html:errors />
				<font color=red>*</font>必須入力
				<table class="table">
					<tr>
						<td class="tb">ユーザID（変更不可）</td>
						<td>${f:h(user_id_label)}</td>
					</tr>
					<tr>
						<td class="tb"><font color=red>*</font>ユーザ種別</td>
						<td>
							<html:select property="user_kind" styleId="user_kind" value="${f:h(user_kindcd_label)}">
								<html:options collection="user_kind_list"
									property="codeId"
									labelProperty="codeNm"
								 />
							</html:select>
						</td>
					</tr>
					<tr>
						<td class="tb"><font color=red>*</font>ユーザ名（漢字）<br><font size="1" color="blue" >※姓と名の間は1文字開けてください</font></td>
						<td><html:text property="user_name_knj" styleId="user_name_knj" value="${f:h(user_name_knj_label)}"/></td>
					</tr>
					<tr>
						<td class="tb">ユーザ名（かな）<br><font size="1" color="blue">※姓と名の間は1文字開けてください</font></td>
						<td><html:text property="user_name_kana" styleId="user_name_kana" value="${f:h(user_name_kana_label)}"/></td>
					</tr>
					<tr>
						<td class="tb">ユーザ名（ニックネーム）<br><font size="1" color="blue">※姓と名の間は1文字開けてください</font></td>
						<td><html:text property="user_name_nick" styleId="user_name_nick" value="${f:h(user_name_nick_label)}"/></td>
					</tr>
					<tr>
						<td class="tb"><font color=red>*</font>メールアドレス</td>
						<td><html:text property="mail_addr" styleId="mail_addr" value="${f:h(mail_addr_label)}"/></td>
					</tr>
					<tr>
						<td class="tb"><font color=red>*</font>メールアドレス（確認用）</td>
						<td><html:text property="mail_addr_kakunin" styleId="mail_addr_kakunin" value="${f:h(mail_addr_label)}"/></td>
					</tr>
					<tr>
						<td class="tb"><font color=red>*</font>パスワード</td>
						<td><html:password property="password" styleId="password"/></td>
					</tr>
					<tr>
						<td class="tb"><font color=red>*</font>パスワード（確認用）</td>
						<td><html:password property="password_kakunin" styleId="password_kakunin"/></td>
					</tr>
					<tr>
						<td class="tb"><font color=red>*</font>性別</td>
						<td>
							<html:select property="seibetu" styleId="seibetu" value="${f:h(seibetucd_label)}">
								<html:options collection="seibetu_list"
									property="codeId"
									labelProperty="codeNm" />
							</html:select>
						</td>
					</tr>
					<tr>
						<td class="tb"><font color=red>*</font>生年月日</td>
						<td>西暦<html:text property="seinengappi_YYYY" styleId="seinengappi_YYYY" size="4" value="${f:h(birthdateYYYY_label)}"/>年
								<html:text property="seinengappi_MM" styleId="seinengappi_MM" size="2" value="${f:h(birthdateMM_label)}"/>月
								<html:text property="seinengappi_DD" styleId="seinengappi_DD" size="2" value="${f:h(birthdateDD_label)}"/>日</td>
					</tr>
					<tr>
						<td class="tb"><font color=red>*</font>電話番号（固定）</td>
						<td><html:text property="tel_kotei" styleId="tel_kotei" value="${f:h(tel1_label)}" /></td>
					</tr>
					<tr>
						<td class="tb">電話番号（携帯）</td>
						<td><html:text property="tel_keitai" styleId="tel_keitai" value="${f:h(tel2_label)}" /></td>
					</tr>
					<tr>
						<td class="tb">備考</td>
						<td><html:textarea property="biko" styleId="biko" value="${f:h(note_label)}"/></td>
					</tr>
				</table>
				<s:submit property="check" value="更新" />
				</s:form>
				</div>
				<div id="subnavi"> </div>
			</div>
<%--
<script type="text/javascript">
    function doAjax(){
        var params={};
        params["user_id"]=$("#user_id").val();
        params["user_kind"]=$("#user_kind").val();
        params["user_name_knj"]=$("#user_name_knj").val();
        params["user_name_kana"]=$("#user_name_kana").val();
        params["user_name_nick"]=$("#user_name_nick").val();
        params["mail_addr"]=$("#mail_addr").val();
        params["mail_addr_kakunin"]=$("#mail_addr_kakunin").val();
        params["password"]=$("#password").val();
        params["password_kakunin"]=$("#password_kakunin").val();
        params["seibetu"]=$("#seibetu").val();
        params["seinengappi_YYYY"]=$("#seinengappi_YYYY").val();
        params["seinengappi_MM"]=$("#seinengappi_MM").val();
        params["seinengappi_DD"]=$("#seinengappi_DD").val();
        params["tel_kotei"]=$("#tel_kotei").val();
        params["tel_keitai"]=$("#tel_keitai").val();
        params["biko"]=$("#biko").val();
    	$('#accountDetails').load('${f:url('/mgs03001/accountManagement/reg')}', params);
    }
</script>
 --%>