package org.x.material.dto;

import java.util.List;

import org.seasar.mai.mail.AttachedFile;
import org.seasar.mai.mail.MailAddress;
/**
 * メール送信設定情報.
 *
 * @author nakada
 * @since   20140501.0.0
 * @version 20141016.0.1
 */
public class MailDto {
	/** SMTPサーバアドレス. */
	private String host = "mail.reve-gift.co.jp";
	/** SMTPポート. */
	private String port = "587";
	/** 送信ユーザ名. */
	private String userName = "info";
	/** 送信ユーザパスワード. */
	private String password = "infopass";
	/** 送信先メールアドレス(未対応）.*/
	private MailAddress[] to;
	/** CCメールアドレス(未対応）. */
	private MailAddress[] cc;
	/** BCCメールアドレス(未対応）. */
	private MailAddress[] bcc;
	/** 送信者メールアドレス(未対応）. */
	private MailAddress from;
	/** 件名(未対応）. */
	private String subject;
	/** 返信先メールアドレス(未対応）. */
	private String replyTo;
	/** メール本文(未対応）. */
	private String body;

	/** 拡張用1(未対応）. */
	private String extendValue1;
	/** 拡張用2(未対応）. */
	private String extendValue2;
	/** 拡張用3(未対応）. */
	private String extendValue3;
	/** 拡張用4(未対応）. */
	private String extendValue4;
	/** 拡張用5(未対応）. */
	private String extendValue5;

	/** 更新アカウントリスト. */
	private String[] accList;
	/** 添付ファイルリスト(未使用). */
	private List<AttachedFile> fileList;
	/** 名前(未使用). */
	private String name;

	/**
	 *  アクセッサメソッド.
	 *  以下Getter, Setter
	 *  S2MaiがGetterを要するため
	 */
    /**
     * Returns the host.
     *
     * @return the host
     */
	  public final String getHost() {
	    return host;
	  }
	 /**
	  * Sets the host.
	  *
	  * @param prmHost
	  */
	  public final void setHost(final String prmHost) {
		  this.host = prmHost;
	  }
	 /**
	  * Returns the port.
	  *
	  * @return the port
	  */
	  public final String getPort() {
	    return port;
	  }
	 /**
	  * Sets the port.
	  *
	  * @param prmPort
	  */
	  public final void setPort(final String prmPort) {
		this.port = prmPort;
	  }
	 /**
	  * Returns the userName.
	  *
	  * @return the userName
	  */
	  public final String getUserName() {
	    return userName;
	  }
	 /**
	  * Sets the userName.
	  *
	  * @param prmUserName
	  */
	  public final void setUserName(final String prmUserName) {
		this.userName = prmUserName;
	  }
	 /**
	  * Returns the password.
	  *
	  * @return the password
	  */
	  public final String getPassword() {
	    return password;
	  }
	 /**
	  * Sets the password.
	  *
	  * @param prmPassword
	  */
	  public final void setPassword(final String prmPassword) {
		    this.password = prmPassword;
	  }
	 /**
	  * Returns the to.
	  *
	  * @return the to
	  */
	  public final MailAddress[] getTo() {
	    return to;
	  }
	 /**
	  * Sets the to.
	  *
	  * @param prmTo
	  */
	  public final void setTo(final MailAddress[] prmTo) {
		this.to = prmTo;
	  }
	 /**
	  * Returns the cc.
	  *
	  * @return the cc
	  */
	  public final MailAddress[] getCc() {
	    return cc;
	  }
	 /**
	  * Sets the cc.
	  *
	  * @param prmCc
	  */
	  public final void setCc(final MailAddress[] prmCc) {
		this.cc = prmCc;
	  }
	 /**
	  * Returns the bcc.
	  *
	  * @return the bcc
	  */
	  public final MailAddress[] getBcc() {
	    return bcc;
	  }
	 /**
	  * Sets the bcc.
	  *
	  * @param prmBcc
	  */
	  public final void setBcc(final MailAddress[] prmBcc) {
		  this.bcc = prmBcc;
	  }
	 /**
	  * Returns the from.
	  *
	  * @return the from
	  */
	  public final MailAddress getFrom() {
	    return from;
	  }
	 /**
	  * Sets the from.
	  *
	  * @param prmFrom
	  */
	  public final void setFrom(final MailAddress prmFrom) {
		    this.from = prmFrom;
	  }
	 /**
	  * Returns the returnPath.
	  *
	  * @return the returnPath
	  */
	  public final String getReturnPath() {
		  if (from != null) {
			  return from.getAddress();
		  } else {
			  return null;
		  }
	  }
	 /**
	  * Returns the subject.
	  *
	  * @return the subject
	  */
	  public final String getSubject() {
	    return subject;
	  }
	 /**
	  * Sets the subject.
	  *
	  * @param prmSubject
	  */
	  public final void setSubject(final String prmSubject) {
		this.subject = prmSubject;
	  }
	 /**
	  * Returns the replyTo.
	  *
	  * @return the replyTo
	  */
	  public final String getReplyTo() {
	    return replyTo;
	  }
	 /**
	  * Sets the replyTo.
	  *
	  * @param prmReplyTo
	  */
	  public final void setReplyTo(final String prmReplyTo) {
		  this.replyTo = prmReplyTo;
	  }
	 /**
	  * Returns the body.
	  *
	  * @return the body
	  */
	  public final String getBody() {
	    return body;
	  }
	 /**
	  * Sets the body.
	  *
	  * @param prmBody
	  */
	  public final void setBody(final String prmBody) {
		this.body = prmBody;
	  }
	 /**
	  * Returns the extendValue1.
	  *
	  * @return the extendValue1
	  */
	  public final String getExtendValue1() {
	    return extendValue1;
	  }
	 /**
	  * Sets the extendValue1.
	  *
	  * @param prmExtendValue1
	  */
	  public final void setExtendValue1(final String prmExtendValue1) {
		this.extendValue1 = prmExtendValue1;
	  }
	 /**
	  * Returns the extendValue2.
	  *
	  * @return the extendValue2
	  */
	  public final String getextendValue2() {
	    return extendValue2;
	  }
	 /**
	  * Sets the extendValue2.
	  *
	  * @param prmExtendValue2
	  */
	  public final void setExtendValue2(final String prmExtendValue2) {
		this.extendValue2 = prmExtendValue2;
	  }
	 /**
	  * Returns the extendValue3.
	  *
	  * @return the extendValue3
	  */
	  public final String getExtendValue3() {
	    return extendValue3;
	  }
	 /**
	  * Sets the extendValue3.
	  *
	  * @param prmExtendValue3
	  */
	  public final void setExtendValue3(final String prmExtendValue3) {
		this.extendValue3 = prmExtendValue3;
	  }
	 /**
	  * Returns the extendValue4.
	  *
	  * @return the extendValue4
	  */
	  public final String getextendValue4() {
	    return extendValue4;
	  }
	 /**
	  * Sets the extendValue4.
	  *
	  * @param prmExtendValue4
	  */
	  public final void setExtendValue4(final String prmExtendValue4) {
		this.extendValue4 = prmExtendValue4;
	  }
	 /**
	  * Returns the extendValue5.
	  *
	  * @return the extendValue5
	  */
	  public final String getextendValue5() {
	    return extendValue5;
	  }
	 /**
	  * Sets the extendValue5.
	  *
	  * @param prmExtendValue5
	  */
	  public final void setExtendValue5(final String prmExtendValue5) {
		this.extendValue5 = prmExtendValue5;
	  }
	 /**
	  * Returns the accList.
	  *
	  * @return the accList
	  */
	  public final String[] getAccList() {
		return accList;
	  }
	 /**
	  * Sets the accList.
	  *
	  * @param prmAccList
	  */
	  public final void setAccList(final String[] prmAccList) {
		this.accList = prmAccList;
	  }
	 /**
	  * Returns the fileList.
	  *
	  * @return the fileList
	  */
	  public final List<AttachedFile> fileList() {
	    return fileList;
	  }
	 /**
	  * Sets the fileList.
	  *
	  * @param prmFileList
	  */
	  public final void fileList(final List<AttachedFile> prmFileList) {
		    this.fileList = prmFileList;
		  }
	 /**
	  * Returns the name.
	  *
	  * @return the name
	  */
	  public final String getName() {
		  return name;
	  }
	 /**
	  * Sets the name.
	  *
	  * @param prmName
	  */
	  public final void setName(final String prmName) {
		  this.name = prmName;
	  }

}
