<%@page contentType="text/html" pageEncoding="UTF-8"%>
				<div id="accountDetails">
				<table class="table">
					<tr>
						<td class="tb">ユーザ情報：${f:h(user_id)}</td>
						<td>${f:h(user_name_knj)}/${f:h(seibetu_label)}/?/?<br>（個人/男/オーナーアカウント/公開）</td>
					</tr>
					<tr>
						<td class="tb">キャッシュポイント(CP)<br><font color="blue"><i>トレードポイント(TP)</i></font></td>
						<td>CP:1200pt<br><font color="blue">TP:<i><a href="#">900pt</a></i></font></td>
					</tr>
					<tr>
						<td class="tb">生年月日/メールアドレス</td>
						<td>西暦${f:h(seinengappi_YYYY)}年${f:h(seinengappi_MM)}月${f:h(seinengappi_DD)}日<br>${f:h(mail_addr)}</td>
					</tr>
					<tr>
						<td class="tb">電話番号（固定/携帯）</td>
						<td>${f:h(tel_kotei)}<br>${f:h(tel_keitai)}</td>
					</tr>
					<tr>
						<td class="tb">備考</td>
						<td>ログイン時のアカウントです。</td>
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