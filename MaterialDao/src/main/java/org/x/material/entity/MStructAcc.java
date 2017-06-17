package org.x.material.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Transient;
import org.seasar.doma.jdbc.SelectOptions;

/**
 * 組織情報マスタ	組織所属マスタ	 アカウントマスタ情報を定義する。.
 * 尚、アカウントには、運営アカウントを含む。.
 *
 * @author  nakada
 * @since   20150225.00.01
 * @version 20150225.00.01
 */
@Entity(listener = MStructAccListener.class)
public class MStructAcc extends MStructure {

    /** 管理者フラグ	 1:管理者. */
    @Column(name = "admin_flg")
    private String adminFlg;

    /** アカウントID. */
    @Column(name = "acc_id")
    private String accId;

    /** アカウント種別	 個人/法人/倉庫業者/運送業者/連携システム. */
    @Column(name = "acc_kind")
    private String accKind;

    /** 検索 組織ID. */
	@Transient
    private String srcStrctId;

     /** SelectOptions. */
    @Transient
    private SelectOptions options;

}
