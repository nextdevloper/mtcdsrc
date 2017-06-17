<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--タイトルなどの可変値を外から設定するのに使える。
<tiles:put name="title"  value="Tiles"/>
--%>
<%--業務固有部 - 開始--%>
			<div id="breadNavi"><s:link href="/mgs01001/news/init">HOME</s:link>　&gt;&gt;　<s:link href="/mgs03001/accountManagement/init">お知らせ 一覧</s:link>　&gt;&gt;　現在のページ </div>
			<h1>アカウント/グループ管理</h1>
			<div class="contentswrap">
				<h2>アカウント管理</h2>
				<s:link href="/mgs03001/accountManagement/input">編集</s:link>
				<div id="accountDetails">
				<html:errors />
				<table class="table">
					<tr>
						<td class="tb">アカウント情報（ID:${f:h(user_id_label)}）
							<br>ニックネーム
							<br>アカウント種別/ステータス
							<br>生年月日/性別
						</td>
						<td>${f:h(user_name_knj_label)}
							<c:if test="${user_name_kana_label !=''}">
								(${f:h(user_name_kana_label)})
							</c:if>
							<br>${f:h(user_name_nick_label)}
							<br>${f:h(user_kind_label)}/${f:h(user_status_label)}
							<br>
							<c:if test="${birthdateYYYY_label !=''}">
								西暦${f:h(birthdateYYYY_label)}年${f:h(birthdateMM_label)}月${f:h(birthdateDD_label)}日/
							</c:if>
							${f:h(seibetu_label)}
						</td>
					</tr>
					<tr>
						<td class="tb">メールアドレス</td>
						<td>${f:h(mail_addr_label)}</td>
					</tr>
					<tr>
						<td class="tb">電話番号（固定/携帯）</td>
						<td>${f:h(tel1_label)}<br>${f:h(tel2_label)}</td>
					</tr>
					<tr>
						<td class="tb">備考</td>
						<td>${f:h(note_label)}</td>
					</tr>
				</table>
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
    function doRef(index){
        var params={};
        params["account_list_index"]=index;
    	$('#accountDetails').load('${f:url('/mgs02001/accountManager/ref')}', params);
    }
</script>
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
<%--業務固有部 - 終了--%>
