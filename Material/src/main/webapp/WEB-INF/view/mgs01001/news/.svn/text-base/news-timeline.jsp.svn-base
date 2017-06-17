<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--タイトルなどの可変値を外から設定するのに使える。
<tiles:getAsString name="title" />
--%>
<div id="breadNavi"> <s:link href="init">HOME</s:link>　&gt;&gt;　お知らせ/タイムライン </div>
<h1>おしらせ/タイムライン </h1>
<div class="contentswrap">
  <h2>おしらせ/タイムライン（最大100件表示）</h2>
  <%--おしらせのアウトラインの編集 --%>
  <div id="newsbox">
    <dl>
      <dt>おしらせ</dt>
    </dl>
    <dl>
	<c:forEach var="e" varStatus="s" items="${timelinenewsItem}">
      <dt><fmt:formatDate value="${e.insDate}" pattern="yyyy/MM/dd" /></dt>
      <dd class="link"><a href="selnewsmsgdt?newsmsgno=${f:h(e.msgNo)}" >${f:h(e.msgTitle)}</a></dd>
    </c:forEach>
    </dl>
  </div>
  <%-- お知らせの明細の編集 --%>
  <c:if test="${dnitemnews != null}">
    <div id="xid1" style="display:block;">
    <table class="table">
      <tr>
        <td class="tb">受信時刻</td>
        <td><fmt:formatDate value="${dnitemnews.insDate}" pattern="yyyy/MM/dd HH:mm:ss" /></td>
      </tr>
      <tr>
        <td class="tb">タイトル</td>
        <td>${f:h(dnitemnews.msgTitle)}</td>
      </tr>
      <tr>
        <td colspan="2">メッセージ:<br>${f:br(f:h(dnitemnews.msgNote)) }</td>
      </tr>
    </table>
    </div>
  </c:if>

  <%-- 過去タイムライン条件入力の編集  --%>
  <div id="id2" style="display:${f:h(resultSrcCond)};">
    <s:form>
    <table class="table3">
      <tr>
        <th>結果報告検索条件<br><s:submit property="inquiry" value="照会" /></th>
        <td>
          <html:errors property="startYearResult"/>
          <html:errors property="startMonResult"/>
          <html:errors property="startDayResult"/>
          <html:errors property="startHourResult"/>
          <html:errors property="startMinitResult"/>
          <html:errors property="startSecResult"/>
          <html:errors property="endYearResult"/>
          <html:errors property="endMonResult"/>
          <html:errors property="endDayResult"/>
          <html:errors property="endHourResult"/>
          <html:errors property="endMinitResult"/>
          <html:errors property="endSecResult"/>
      </tr>
      <tr>
        <td class="tb">検索条件（開始日時）</td>
        <td>
          <html:text property="startYearResult" maxlength="4" size="5" />/
          <html:text property="startMonResult" maxlength="2" size="3" />/
          <html:text property="startDayResult" maxlength="2" size="3" />　
          <html:text property="startHourResult" maxlength="2" size="2" />:
          <html:text property="startMinitResult" maxlength="2" size="2" />:
          <html:text property="startSecResult" maxlength="2" size="2" />
        </td>
      </tr>
      <tr>
        <td class="tb">検索条件（終了日時）</td>
        <td>
          <html:text property="endYearResult" maxlength="4" size="5" />/
          <html:text property="endMonResult" maxlength="2" size="3" />/
          <html:text property="endDayResult" maxlength="2" size="3" />　
          <html:text property="endHourResult" maxlength="2" size="2" />:
          <html:text property="endMinitResult" maxlength="2" size="2" />:
          <html:text property="endSecResult" maxlength="2" size="2" />
        </td>
      </tr>
    </table>
    </s:form>
  </div>
  <%--結果報告のアウトラインの編集 --%>
  <div id="newsbox">
    <dl>
      <dt>結果報告</dt>
    </dl>
    <dl>
	<c:forEach var="e" varStatus="s" items="${timelineresultItem}">
      <dt><fmt:formatDate value="${e.insDate}" pattern="yyyy/MM/dd" />（${f:h(e.accId)}）</dt>
      <dd class="link"><a href="selresultmsg?resultmsgno=${f:h(e.msgNo)}" >${f:h(e.msgTitle)}</a></dd>
    </c:forEach>
    </dl>
    <div id="sid2" style="display:block;">
      <ul class="toInfo">
        <li><a href="#" onclick="document.getElementById('id2').style.display = 'block';document.getElementById('sid2').style.display = 'none';">過去のタイムライン</a></li>
      </ul>
    </div>
  </div>
  <%-- 結果報告の明細の編集 --%>
  <c:if test="${dnitemresult != null}">
    <div id="xid1" style="display:block;">
    <table class="table">
      <tr>
        <td class="tb">受信時刻/送信元アカウントID</td>
        <td><fmt:formatDate value="${dnitemresult.insDate}" pattern="yyyy/MM/dd HH:mm:ss" /> / ${f:h(dnitemresult.accId)}</td>
      </tr>
      <tr>
        <td class="tb">タイトル</td>
        <td>${f:h(dnitemresult.msgTitle)}</td>
      </tr>
      <tr>
        <td colspan="2">メッセージ:<br>${f:br(f:h(dnitemresult.msgNote)) }</td>
      </tr>
    </table>
    </div>
  </c:if>

  <%-- 過去タイムライン条件入力の編集  --%>
  <div id="id3" style="display:${f:h(normalSrcCond)};">
    <s:form>
    <table class="table3">
      <tr>
        <th>メッセージ検索条件<br><s:submit property="inquiry" value="照会" /></th>
        <td>
          <html:errors property="startYearNormal"/>
          <html:errors property="startMonNormal"/>
          <html:errors property="startDayNormal"/>
          <html:errors property="startHourNormal"/>
          <html:errors property="startMinitNormal"/>
          <html:errors property="startSecNormal"/>
          <html:errors property="endYearNormal"/>
          <html:errors property="endMonNormal"/>
          <html:errors property="endDayNormal"/>
          <html:errors property="endHourNormal"/>
          <html:errors property="endMinitNormal"/>
          <html:errors property="endSecNormal"/>
        </td>
      </tr>
      <tr>
        <td class="tb">検索条件（開始日時）</td>
        <td>
          <html:text property="startYearNormal" maxlength="4" size="5" />/
          <html:text property="startMonNormal" maxlength="2" size="3" />/
          <html:text property="startDayNormal" maxlength="2" size="3" />　
          <html:text property="startHourNormal" maxlength="2" size="2" />:
          <html:text property="startMinitNormal" maxlength="2" size="2" />:
          <html:text property="startSecNormal" maxlength="2" size="2" />
        </td>
      </tr>
      <tr>
        <td class="tb">検索条件（終了日時）</td>
        <td>
          <html:text property="endYearNormal" maxlength="4" size="5" />/
          <html:text property="endMonNormal" maxlength="2" size="3" />/
          <html:text property="endDayNormal" maxlength="2" size="3" />　
          <html:text property="endHourNormal" maxlength="2" size="2" />:
          <html:text property="endMinitNormal" maxlength="2" size="2" />:
          <html:text property="endSecNormal" maxlength="2" size="2" />
        </td>
      </tr>
    </table>
    </s:form>
  </div>
  <%--メッセージのアウトラインの編集 --%>
  <div id="newsbox">
    <dl>
      <dt>メッセージ</dt>
    </dl>
    <dl>
	<c:forEach var="e" varStatus="s" items="${timelinenormalItem}">
      <dt><fmt:formatDate value="${e.insDate}" pattern="yyyy/MM/dd HH:mm:ss" />（${f:h(e.accId)}）</dt>
      <dd class="link"><a href="selnormalmsg?normalmsgno=${f:h(e.msgNo)}" >${f:h(e.msgTitle)}</a></dd>
    </c:forEach>
    </dl>
    <div id="sid3" style="display:block;">
      <ul class="toInfo">
        <li><a href="#" onclick="document.getElementById('id3').style.display = 'block';document.getElementById('sid3').style.display = 'none';">過去のタイムライン</a></li>
      </ul>
    </div>
  </div>
  <%-- メッセージの明細の編集 --%>
  <c:if test="${dnitemnormal != null}">
    <div id="xid3" style="display:block;">
    <table class="table">
      <tr>
        <td class="tb">受信時刻/送信元アカウントID</td>
        <td><fmt:formatDate value="${dnitemnormal.insDate}" pattern="yyyy/MM/dd HH:mm:ss" /> / ${f:h(dnitemnormal.accId)}</td>
      </tr>
      <tr>
        <td class="tb">タイトル</td>
        <td>${f:h(dnitemnormal.msgTitle)}</td>
      </tr>
      <tr>
        <td colspan="2">メッセージ:<br>${f:br(f:h(dnitemnormal.msgNote)) }</td>
      </tr>
    </table>
    </div>
  </c:if>
  <h2>メッセージ送信</h2>
    <%-- フッタ（送信部分の編集) --%>
    <s:form>
    <html:errors property="sndmessageErr"/>
    <table class="table">
      <tr>
        <td class="tb">送信先アカウントID</td>
        <td><html:errors property="sendaccid"/><html:text property="sendaccid"  value="${f:h(defaultAccId)}" />&nbsp;<a href="/Material/mgs02001/accountSearch/init"><font size="1">照会</font></a></td>
      </tr>
      <tr>
        <td class="tb">タイトル</td>
        <td><html:errors property="msgtitle"/><html:text property="msgtitle" /></td>
      </tr>
      <tr>
        <td class="tb">メッセージ</td>
        <td><html:errors property="txtmsg"/><html:textarea property="txtmsg" /></td>
      </tr>
    </table>
    <s:submit property="sndnmsg" value="送信" />
    </s:form>
  <h2>メッセージ送信履歴</h2>
  <%--メッセージ送信履歴のアウトラインの編集 --%>
  <div id="newsbox">
    <dl>
      <dt>メッセージ送信履歴（最大100件表示）</dt>
    </dl>
    <dl>
	<c:forEach var="e" varStatus="s" items="${timelinenormalHistoryItem}">
      <dt><fmt:formatDate value="${e.insDate}" pattern="yyyy/MM/dd HH:mm:ss" />（${f:h(e.accIdSend)}）</dt>
      <dd class="link"><a href="selnormalhistorymsg?normalhistorymsgno=${f:h(e.msgNo)}" >${f:h(e.msgTitle)}</a></dd>
    </c:forEach>
    </dl>
    <div id="sid3" style="display:block;">
      <ul class="toInfo">
      </ul>
    </div>
  </div>
  <%-- メッセージの明細の編集 --%>
  <c:if test="${dnitemnormalhistory != null}">
    <div id="xid3" style="display:block;">
    <table class="table">
      <tr>
        <td class="tb">送信時刻/送信先アカウントID</td>
        <td><fmt:formatDate value="${dnitemnormalhistory.insDate}" pattern="yyyy/MM/dd HH:mm:ss" /> / ${f:h(dnitemnormalhistory.accIdSend)}</td>
      </tr>
      <tr>
        <td class="tb">タイトル</td>
        <td>${f:h(dnitemnormalhistory.msgTitle)}</td>
      </tr>
      <tr>
        <td colspan="2">メッセージ:<br>${f:br(f:h(dnitemnormalhistory.msgNote)) }</td>
      </tr>
    </table>
    </div>
  </c:if>
    <div id="subnavi"> </div>
    </div>
