<%@page contentType="text/html" pageEncoding="UTF-8"%>
				<div id="accountDetails">
<%--				<s:form>--%>
				<s:form styleId="gyom">
				<table class="table">
					<tr>
						<td class="tb">ユーザID</td>
						<td><html:text property="user_id" styleId="user_id"/></td>
					</tr>
					<tr>
						<td class="tb">ユーザ種別</td>
						<td>
							<html:select property="user_sybt" styleId="user_sybt">
								<html:options collection="user_syubetu_list" 
									property="no" 
									labelProperty="value" />
							</html:select>
						</td>
					</tr>
					<tr>
						<td class="tb">ユーザ名（漢字）<br><font size="1" color="blue">※姓と名の間は1文字開けてください</font></td>
						<td><html:text property="user_name_knj" styleId="user_name_knj"/></td>
					</tr>
					<tr>
						<td class="tb">ユーザ名（かな）<br><font size="1" color="blue">※姓と名の間は1文字開けてください</font></td>
						<td><html:text property="user_name_kana" styleId="user_name_kana"/></td>
					</tr>
					<tr>
						<td class="tb">ユーザ名（ニックネーム）<br><font size="1" color="blue">※姓と名の間は1文字開けてください</font></td>
						<td><html:text property="user_name_nick" styleId="user_name_nick"/></td>
					</tr>
					<tr>
						<td class="tb">メールアドレス</td>
						<td><html:text property="mail_addr" styleId="mail_addr"/></td>
					</tr>
					<tr>
						<td class="tb">メールアドレス（確認用）</td>
						<td><html:text property="mail_addr_kakunin" styleId="mail_addr_kakunin"/></td>
					</tr>
					<tr>
						<td class="tb">パスワード</td>
						<td><html:password property="password" styleId="password"/></td>
					</tr>
					<tr>
						<td class="tb">パスワード（確認用）</td>
						<td><html:password property="password_kakunin" styleId="password_kakunin"/></td>
					</tr>
					<tr>
						<td class="tb">性別</td>
						<td>
							<html:select property="seibetu" styleId="seibetu">
								<html:options collection="seibetu_list" 
									property="no" 
									labelProperty="value" />
							</html:select>
						</td>
					</tr>
					<tr>
						<td class="tb">生年月日</td>
						<td>西暦<html:text property="seinengappi_YYYY" styleId="seinengappi_YYYY" size="4"/>年<html:text property="seinengappi_MM" styleId="seinengappi_MM" size="2"/>月<html:text property="seinengappi_DD" styleId="seinengappi_DD" size="2"/>日</td>
					</tr>
					<tr>
						<td class="tb">電話番号（固定）</td>
						<td><html:text property="tel_kotei" styleId="tel_kotei"/></td>
					</tr>
					<tr>
						<td class="tb">電話番号（携帯）</td>
						<td><html:text property="tel_keitai" styleId="tel_keitai"/></td>
					</tr>
					<tr>
						<td class="tb">備考</td>
						<td><html:textarea property="biko" styleId="biko"/></td>
					</tr>
				</table>
				<%-- 一先ずチェックなしに確定
				<s:submit property="check" value="登録" />
				 --%>
<%-- 				<input type="button" value="更新" onclick="doAjax();">--%>
<%--					<input type="button" value="更新" onclick="sendAjax('accountDetails','${f:url('/mgs02001/accountManager/reg')}','gyom');">--%>
						<input type="button" value="更新" onclick="sendAjax('main','${f:url('/mgs02001/accountManager/reg')}','gyom');">
<%--					<input type="button" value="更新" onclick="send('gyom')；">--%>
				</s:form>
				</div>
<%--
<script type="text/javascript">
    function doAjax(){
        var params={};
        params["user_id"]=$("#user_id").val();
        params["user_sybt"]=$("#user_sybt").val();
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
    	$('#accountDetails').load('${f:url('/mgs02001/accountManager/reg')}', params);
    }
</script>
 --%>