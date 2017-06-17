package org.x.material.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

/**
 * 環境	 DBの環境設定.
 *
 * @author  nakada
 * @since   20160604.01.00
 * @version 20160604.01.00
 */
@Entity(listener = MDBEnviromentListener.class)
@Table(name = "MDBEnviroment")
public class MDBEnviroment {

	/** 種別. */
    @Column(name = "db_kind")
    private String dbKind;

	/**
	 * Get dbKind.
	 *
	 * @return dbKind
	 */
	public final String getDbKind() {
		return dbKind;
	}

	/**
	 * Set dbKind.
	 *
	 * @param prmDbKind セットする dbKind
	 */
	public final void setDbKind(final String prmDbKind) {
		this.dbKind = prmDbKind;
	}


}
