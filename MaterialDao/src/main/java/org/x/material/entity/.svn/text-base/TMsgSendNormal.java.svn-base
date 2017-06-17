package org.x.material.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.SequenceGenerator;
import org.seasar.doma.Table;
import org.seasar.doma.Transient;
import org.seasar.doma.Version;

/**
 * メッセージ送信履歴（通常メッセージ）	 通常メッセージの送信履歴.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
@Entity(listener = TMsgSendNormalListener.class)
@Table(name = "t_msg_send_normal")
public class TMsgSendNormal {

    /** アカウントID. */
    @Column(name = "acc_id")
    private String accId;

    /** アカウントID（送信先）	 アカウントIDを指定. */
    @Column(name = "acc_id_send")
    private String accIdSend;

    /** メッセージ番号	 連番. */
    @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequence = "mtcddb.t_msg_send_normal_msg_no_seq")
    @Column(name = "msg_no")
    private Long msgNo;

    /** メッセージタイトル. */
    @Column(name = "msg_title")
    private String msgTitle;

    /** メッセージ内容. */
    @Column(name = "msg_note")
    private String msgNote;

    /** 標準ロケールID	 言語コードを設定（当面は、日本（ja）固定）. */
    @Column(name = "default_locale")
    private String defaultLocale;

    /** 排他制御カウンタ	 登録されるごとに＋１する. */
	@Version
    @Column(name = "ex_cnt")
	private BigDecimal exCnt;

    /** 登録アカウント	 登録時のアカウント. */
    @Column(name = "ins_acc")
    private String insAcc;

    /** 登録日時	 登録した日時. */
    @Column(name = "ins_date")
    private Date insDate;

    /** 更新アカウント	 更新時のアカウント（初回は登録時と同じ）. */
    @Column(name = "upd_acc")
    private String updAcc;

    /** 更新日時	 更新した日時（初回は登録時と同じ）. */
    @Column(name = "upd_date")
    private Date updDate;

    /** 削除フラグ	 1になると論理削除. */
    @Column(name = "del_flg")
    private String delFlg;

    /** 検索 開始日付. */
	@Transient
	private Date startDate;

    /** 検索 終了日付. */
	@Transient
	private Date endDate;

    /**
     * Returns the accId.
     *
     * @return the accId
     */
    public final String getAccId() {
        return accId;
    }

    /**
     * Sets the accId.
     *
     * @param prmAccId the accId
     */
    public final void setAccId(final String prmAccId) {
        this.accId = prmAccId;
    }

    /**
     * Returns the accIdSend.
     *
     * @return the accIdSend
     */
    public final String getAccIdSend() {
        return accIdSend;
    }

    /**
     * Sets the accIdSend.
     *
     * @param prmAccIdSend the accIdSend
     */
    public final void setAccIdSend(final String prmAccIdSend) {
        this.accIdSend = prmAccIdSend;
    }

    /**
     * Returns the msgNo.
     *
     * @return the msgNo
     */
    public final Long getMsgNo() {
        return msgNo;
    }

    /**
     * Sets the msgNo.
     *
     * @param prmMsgNo the msgNo
     */
    public final void setMsgNo(final Long prmMsgNo) {
        this.msgNo = prmMsgNo;
    }

    /**
     * Returns the msgTitle.
     *
     * @return the msgTitle
     */
    public final String getMsgTitle() {
        return msgTitle;
    }

    /**
     * Sets the msgTitle.
     *
     * @param prmMsgTitle the msgTitle
     */
    public final void setMsgTitle(final String prmMsgTitle) {
        this.msgTitle = prmMsgTitle;
    }

    /**
     * Returns the msgNote.
     *
     * @return the msgNote
     */
    public final String getMsgNote() {
        return msgNote;
    }

    /**
     * Sets the msgNote.
     *
     * @param prmMsgNote the msgNote
     */
    public final void setMsgNote(final String prmMsgNote) {
        this.msgNote = prmMsgNote;
    }

    /**
     * Returns the defaultLocale.
     *
     * @return the defaultLocale
     */
    public final String getDefaultLocale() {
        return defaultLocale;
    }

    /**
     * Sets the defaultLocale.
     *
     * @param prmDefaultLocale the defaultLocale
     */
    public final void setDefaultLocale(final String prmDefaultLocale) {
        this.defaultLocale = prmDefaultLocale;
    }

    /**
     * Returns the exCnt.
     *
     * @return the exCnt
     */
    public final BigDecimal getExCnt() {
        return exCnt;
    }

    /**
     * Sets the exCnt.
     *
     * @param prmExCnt the exCnt
     */
    public final void setExCnt(final BigDecimal prmExCnt) {
        this.exCnt = prmExCnt;
    }

    /**
     * Returns the insAcc.
     *
     * @return the insAcc
     */
    public final String getInsAcc() {
        return insAcc;
    }

    /**
     * Sets the insAcc.
     *
     * @param prmInsAcc the insAcc
     */
    public final void setInsAcc(final String prmInsAcc) {
        this.insAcc = prmInsAcc;
    }

    /**
     * Returns the insDate.
     *
     * @return the insDate
     */
    public final Date getInsDate() {
        return insDate;
    }

    /**
     * Sets the insDate.
     *
     * @param prmInsDate the insDate
     */
    public final void setInsDate(final Date prmInsDate) {
        this.insDate = prmInsDate;
    }

    /**
     * Returns the updAcc.
     *
     * @return the updAcc
     */
    public final String getUpdAcc() {
        return updAcc;
    }

    /**
     * Sets the updAcc.
     *
     * @param prmUpdAcc the updAcc
     */
    public final void setUpdAcc(final String prmUpdAcc) {
        this.updAcc = prmUpdAcc;
    }

    /**
     * Returns the updDate.
     *
     * @return the updDate
     */
    public final Date getUpdDate() {
        return updDate;
    }

    /**
     * Sets the updDate.
     *
     * @param prmUpdDate the updDate
     */
    public final void setUpdDate(final Date prmUpdDate) {
        this.updDate = prmUpdDate;
    }

    /**
     * Returns the delFlg.
     *
     * @return the delFlg
     */
    public final String getDelFlg() {
        return delFlg;
    }

    /**
     * Sets the delFlg.
     *
     * @param prmDelFlg the delFlg
     */
    public final void setDelFlg(final String prmDelFlg) {
        this.delFlg = prmDelFlg;
    }

    /**
     * Returns the startDate.
     *
     * @return the startDate
     */
    public final Date getStartDate() {
    	return this.startDate;
    }

    /**
     * Sets the startDate.
     *
     * @param prmStartDate the startDate
     */
    public final void setStartDate(final Date prmStartDate) {
    	this.startDate = prmStartDate;
    }

    /**
     * Returns the endDate.
     *
     * @return the endDate
     */
    public final Date getEndDate() {
    	return this.endDate;
    }

    /**
     * Sets the endDate.
     *
     * @param prmEndDate the endDate
     */
    public final void setEndDate(final Date prmEndDate) {
    	this.endDate = prmEndDate;
    }
}