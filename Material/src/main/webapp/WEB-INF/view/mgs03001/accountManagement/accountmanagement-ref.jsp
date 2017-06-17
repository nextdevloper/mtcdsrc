<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--タイトルなどの可変値を外から設定するのに使える。
<tiles:put name="title"  value="Tiles"/>
--%>
<%--業務固有部 - 開始--%>
			<div id="breadNavi"><s:link href="/mgs01001/news/init">HOME</s:link>　&gt;&gt;　<s:link href="/mgs03001/accountManagement/init">お知らせ 一覧</s:link>　&gt;&gt;　現在のページ </div>
			<h1>アカウント/グループ管理</h1>
			<div class="contentswrap">
				<div id="accountDetails">
				<table class="table">
				<html:errors />
					<tr>
						<td class="tb">ユーザID</td>
						<td>${f:h(user_id_label)}</td>
					</tr>
					<tr>
						<td class="tb">ユーザ種別</td>
						<td>${f:h(user_kind_label)}</td>
					</tr>
					<tr>
						<td class="tb">ユーザ名/ニックネーム</td>
						<td>
							${f:h(user_name_knj)}
							<c:if test="${user_name_kana_label !=''}">
								(${f:h(user_name_kana_label)})
							</c:if>
							/${f:h(user_name_nick)}
						</td>
					</tr>
					<tr>
						<td class="tb">メールアドレス</td>
						<td>${f:h(mail_addr)}</td>
					</tr>
					<tr>
						<td class="tb">パスワード</td>
						<td>（安全のため表示されません）</td>
					</tr>
					<tr>
						<td class="tb">性別</td>
						<%-- <td>${f:h(seibetu)}</td>--%>
						<td>${f:h(seibetu_label)}</td>
					</tr>
					<tr>
						<td class="tb">生年月日</td>
						<td>西暦${f:h(seinengappi_YYYY)}年${f:h(seinengappi_MM)}月${f:h(seinengappi_DD)}日</td>
					</tr>
					<tr>
						<td class="tb">電話番号（固定）</td>
						<td>${f:h(tel_kotei)}</td>
					</tr>
					<tr>
						<td class="tb">電話番号（携帯）</td>
						<td>${f:h(tel_keitai)}</td>
					</tr>
					<tr>
						<td class="tb">備考</td>
						<td>${f:br(f:nbsp(f:h(biko)))}</td>
					</tr>
					<tr>
						<td class="tb">追加タグA</td>
						<td>追加タグAの内容（TODO 実装予定）</td>
					</tr>
					<tr>
						<td class="tb">追加タグB</td>
						<td>追加タグBの内容（TODO 実装予定）</td>
					</tr>
				</table>
				<s:form>
					<s:submit property="backToInput" value="戻る" />
					<s:submit property="reg" value="確定" />
				</s:form>
				</div>
				<div id="subnavi"> </div>
			</div>
<script type="text/javascript">
    function doAjax(){
        //var params={};
        //params["name"]=$("#name").val();
        //params["departmentName"]=$("#departmentName").val();
        //params["salary"]=$("#salary").val();
        //$('#accountDetails').load('${f:url('/mgs02001/accountManager/input')}', params);
    	$('#accountDetails').load('${f:url('/mgs02001/accountManager/input')}');
    }
</script>