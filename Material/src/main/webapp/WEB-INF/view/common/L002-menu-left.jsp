<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!-- #menuL 左サイドメニュー -->
<div class="subinfo">
	<p class="image"></p>
</div>
<div class="subinfo">
	<p class="label">メニュー</p>
	<ul>
		<li><s:link href="/mgs01001/news/init">お知らせ/タイムライン</s:link></li>
		<li><s:link href="/mgs02001/accountSearch/init">アカウント照会</s:link></li>
		<li><s:link href="/mgs03001/accountManagement/init">アカウント管理</s:link></li>
<!-- 		<li><s:link href="/mgs03001/structureManagement/init">組織管理</s:link></li>  -->
<!--		<li><s:link href="/mgs04001/pointExchange/init">取引管理</s:link></li> -->
<!-- 		<li><s:link href="/mgs05001/locationManagement/init">ロケーション/ボックス管理</s:link></li> -->
		<li><s:link href="/mgs06001/materialManagement/init">マテリアル管理</s:link></li>
		<li><s:link href="/mgs07001/materialCockpit/init">マテリアルコックピット</s:link></li>
	</ul>
</div>
<div class="menuInfo">
	<p class="label">メッセージ</p>
	<div id="newsbox">
		<dl>
			<dt>${f:h(resultMsgDate)}</dt>
			<c:forEach var="e" varStatus="s" items="${resultItems}">
				<dd class="link"><a href="/Material/mgs01001/news/selresultmsg?resultmsgno=${f:h(e.msgNo)}" >${f:h(e.msgTitle)}</a></dd>
			</c:forEach>
		</dl>
		<ul class="toInfo">
			<li><a href="/Material/mgs01001/news/initresult">メッセージ確認</a></li>
		</ul>
	</div>
	<p class="label">運営からのお知らせ</p>
	<p></p>
	<div id="newsbox">
		<dl>
			<dt>${f:h(newsMsgDate)}</dt>
			<c:forEach var="e" varStatus="s" items="${newsItems}">
				<dd class="link"><a href="/Material/mgs01001/news/selnewsmsgdt?newsmsgno=${f:h(e.msgNo)}" >${f:h(e.msgTitle)}</a></dd>
			</c:forEach>
		</dl>
	</div>
<!--				<div class="banner"><img src="img/btn_toiawase.png" alt="お問い合わせ" width="220" height="50"></div>
				<div class="banner"><img src="img/btn_map.png" alt="アクセスマップ" width="220" height="50"></div>
				<p>▲問い合わせ・アクセスマップ画像。新しく画像を作る場合は、imgフォルダ内のbtn_base_画像をご利用ください。</p>
-->
</div>