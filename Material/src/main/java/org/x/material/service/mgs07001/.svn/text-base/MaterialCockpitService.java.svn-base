package org.x.material.service.mgs07001;

import java.util.List;

import org.seasar.doma.jdbc.SelectOptions;
import org.x.material.dao.MLocationBoxMaterialDao;
import org.x.material.dao.impl.MLocationBoxMaterialDaoImpl;
import org.x.material.entity.MLocationBoxMaterial;

/**
 * マテリアルコックピットサービス.
 *
 * @author  nakada
 * @since   20151017.00.01
 * @version 20151017.00.01
 */
public class MaterialCockpitService {

	/**
	 *  取得件数.
	 */
	private long cnt;

	/**
	 * ロケーションボックスマテリアル情報検索.
	 * ・ロケーション名、ボックス名、マテリアル名をKEYに情報をLike検索する。
	 *
	 * @param locNm 検索ロケーション名
	 * @param boxNm 検索ボックス名
	 * @param mtrNm 検索マテリアル名
	 * @param pageno   取得ページ番号
	 * @param perpage  ページあたりの件数
	 * @return List<MLocation>
	 */
	public final List<MLocationBoxMaterial> findByLocBoxMatWithInsideMatching(
			final String userId,
			final String locNm,
			final String boxNm,
			final String mtrNm,
			final String pageno,
			final int perpage) {

		SelectOptions options = SelectOptions.get().offset((Integer.parseInt(pageno) - 1) * perpage).limit(perpage).count();
		MLocationBoxMaterialDao dao = new MLocationBoxMaterialDaoImpl();
		List<MLocationBoxMaterial> list = dao.selectByLocationWithInsideMatching(userId, locNm, boxNm, mtrNm, options);
		this.cnt = options.getCount();

		return list;

	}

	/**
	 * 件数取得.
	 * ・アカウント検索（findByAccountWithInsideMatching）実施後に取得する
	 * @return long 件数
	 */
	public final long getCount() {
		return cnt;
	}


}
