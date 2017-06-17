<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--タイトルなどの可変値を外から設定するのに使える。
<tiles:put name="title"  value="Tiles"/>
--%>
<%--業務固有部 - 開始--%>
			<div id="breadNavi"> <s:link href="/mgs01001/news/init">HOME</s:link>　&gt;&gt;　アカウント/組織照会 </div>
			<h1>アカウント/組織照会</h1>
			<div class="contentswrap">
			<s:form >
				<h2>アカウント/組織照会</h2>
				<table class="table" >
					<tr>
						<td class="tb" >アカウント/組織<br><font size="1" color="blue">メールアドレスの指定も可能</font></td>
						<%-- <td><input type="text" /><input type="submit" value="照会" /></td> --%>
						<td><html:text property="srcUserId" /><s:submit property="regSearch" value="照会" /></td>
					</tr>
				</table>
				<div class="fakelist">
					アカウント/組織ブロック
					<br><font size="1" color="blue">指定したアカウント/組織をブロック</font>
				</div>
				<s:submit property="regBlock" value="設定" />
				<s:submit property="regFree" value="解除" /><br>
				${link}
				<div class="fakeContainer">
					<table id="demoTable">
						<tr>
							<th><html:checkbox styleId="checkbox" property="checkbox" value="1"  onclick="doChkSet()" /></th>
							<th>アカウント/組織名</th>
							<th>ステータス</th>
							<th>メールアドレス</th>
							<th>備考</th>
							<th>追加タグA</th>
							<th>追加タグB</th>
						</tr>
					<c:forEach var="e" varStatus="s" items="${listItems}">
						<tr>
							<td><html:multibox property="mbox" value="${f:h(e.accId)}" /></td>
						<%--	<td><a href="#" onclick="document.getElementById('${f:h(e.accId)}').style.display = 'block';">${f:h(e.accNm)}</a></td> --%>
							<td><s:link href="detailSearch?srckey=${f:h(e.accId)}">${f:h(e.accNm)}</s:link></td>
							<td>${f:h(e.AccStat)}</td>
							<td>${f:h(e.mailaddress)}</td>
							<td>${f:h(e.note)}</td>
							<td>追加タグAの内容</td>
							<td>追加タグBの内容</td>
						</tr>
					</c:forEach>
					</table>
 				</div>
				<html:errors />

				<c:forEach var="e" varStatus="s" items="${detailItems}">
				<div id="${f:h(e.accId)}" style="display:block;">
					<h2>アカウント/組織詳細</h2>
					<div class="fakelist" align="left">
						<s:link href="/mgs01001/news/init?key=${f:h(e.accId)}">メッセージを送る</s:link>
					</div>
					<table class="table">
						<tr>
							<td class="tb">ユーザ情報</td>
							<td><s:link href="/mgs01001/news/init?key=${f:h(e.accId)}">${f:h(e.accNm)}（${f:h(e.accKind)}）</s:link></td>
						</tr>
						<tr>
							<td class="tb">メールアドレス</td>
							<td>${f:h(e.mailaddress)}</td>
						</tr>
						<tr>
							<td class="tb">電話番号（固定/携帯）</td>
							<td>${f:h(e.tel1)}<br>${f:h(e.tel2)}</td>
						</tr>
						<tr>
							<td class="tb">追加タグA</td>
							<td>追加タグAの内容</td>
						</tr>
						<tr>
							<td class="tb">追加タグB</td>
							<td>追加タグBの内容</td>
						</tr>
					</table>
				</div>
				</c:forEach>
				<div id="subnavi"> </div>
			</s:form>
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
    function doChkSet(){
    	var chk = document.getElementById("checkbox").checked;
    	var tbl = document.getElementsByName("mbox");
    	for (var i=0; i<document.getElementsByName("mbox").length; i++){
        		if(chk == true){
            		tbl[i].checked=true;
        		}else{
            		tbl[i].checked=false;
        		}
    	}
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
