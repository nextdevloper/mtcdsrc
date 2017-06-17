package org.x.material.mai;

import org.seasar.mai.annotation.From;
import org.seasar.mai.annotation.MailAddr;
import org.x.material.dto.MailDto;

/**
 * メール送信インターフェース.
 *
 * @author nakada
 * @since   20140501.0.0
 * @version 20141016.0.1
 *
 */
@From(@MailAddr(address = "info@reve-gift.co.jp", personal = "ReveInfomation"))
public interface MailMai {
  //:TODO メールの種類によってメソッドを追加してください。
  // その際、メールテンプレート(.ftlファイル）も「MailMai_メソッド名.ftl」というファイル名で追加してください。
  /**
   *  返事メール送信. 
   * @param dto メール情報
   */
  void sendAuthMail(MailDto dto);
  /** 
   * パスワード変更メール送信. 
   * @param dto メール情報
   */
  void sendRegisterMail(MailDto dto);
  /**
   *  エラーメール送信.
   * @param dto  メール情報
   */
  void sendErrorMail(MailDto dto);
  /**
   *  サポートメール送信.
   *  @param dto メール情報
   */
  void sendSupportMail(MailDto dto);

}

