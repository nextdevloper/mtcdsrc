package org.x.material.entity;


import org.seasar.doma.Entity;
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.SelectOptions;

/**
 * アカウントマスタ	 アカウントブロック情報を定義する。尚、アカウントには、運営アカウントを含む。.
 *
 * @author  nakada
 * @since   XXXXXXXX.01.00
 * @version 20141029.00.01
 */
@Entity(listener = MAccountAccountBlockListener.class)
public class MAccountAccountBlock extends MAccount {

    /** 検索 アカウントID. */
	@Transient
    private String srcAccId;

    /** SelectOptions. */
    @Transient
    private SelectOptions options;

    /**
     * Returns the srcAccId.
     *
     * @return the srcAccId
     */
    public final String getSrcAccId() {
        return srcAccId;
    }

    /**
     * Sets the srcAccId.
     *
     * @param prmAccid the srcAccId
     */
    public final void setSrcAccId(final String prmAccid) {
        this.srcAccId = prmAccid;
    }

}