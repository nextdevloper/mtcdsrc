package org.x.material.entity;

import java.math.BigDecimal;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * ID採番管理	 IDの採番管理テーブル.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20150829.00.01
 */
@Entity(listener = IdNumberingListener.class)
@Table(name = "id_numbering")
public class IdNumbering {

    /** ID種別	 IDの種別キー. */
    @Id
    @Column(name = "id_kind")
    private String idKind;

    /** 採番値	 割り振られた値. */
    @Column(name = "id_number")
    private BigDecimal idNumber;

    /** レコードID	 レコード編集用ID. */
    @Column(name = "rec_id")
    private Long recId;

    /**
     * Returns the idKind.
     *
     * @return the idKind
     */
    public final String getIdKind() {
        return idKind;
    }

    /**
     * Sets the idKind.
     *
     * @param prmIdKind the idKind
     */
    public final void setIdKind(final String prmIdKind) {
        this.idKind = prmIdKind;
    }


    /**
     * Returns the idNumber.
     *
     * @return the idNumber
     */
    public final BigDecimal getIdNumber() {
        return idNumber;
    }

    /**
     * Sets the idNumber.
     *
     * @param prmIdNumber the idNumber
     */
    public final void setidNumber(final BigDecimal prmIdNumber) {
        this.idNumber = prmIdNumber;
    }

    /**
     * Returns the recId.
     *
     * @return the recId
     */
    public final Long getRecId() {
        return recId;
    }

    /**
     * Sets the recId.
     *
     * @param prmRecId the recId
     */
    public final void setRecId(final Long prmRecId) {
        this.recId = prmRecId;
    }
}