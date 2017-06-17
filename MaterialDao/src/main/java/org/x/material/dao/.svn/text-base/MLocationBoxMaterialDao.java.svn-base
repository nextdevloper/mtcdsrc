package org.x.material.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.jdbc.SelectOptions;
import org.x.material.condition.AppConfig;
import org.x.material.entity.MLocationBoxMaterial;

/**
 * ロケーション/ボックス/マテリアル情報取得.
 * （情報の取得のみ使用）
 *
 * @author  nakada
 * @since   20151017.00.01
 * @version 20151017.00.01
 */
@Dao(config = AppConfig.class)
public interface MLocationBoxMaterialDao {

	/**
	 * ロケーション/ボックス/マテリアル情報一覧取得.
	 * ensureResult = false
	 *
	 * @param accId    オーナーIDチェック用文字列
	 * @param srcLocNm ローケーション検索文字列
	 * @param srcBoxNm ボックス検索文字列
	 * @param srcMtrNm マテリアル検索文字列
	 * @param options  検索オプション
	 * @return List<MLocationBoxMaterial>
	 */
    @Select(ensureResult = false)
    List<MLocationBoxMaterial> selectByLocationWithInsideMatching(
    		String accId, String srcLocNm, String srcBoxNm, String srcMtrNm, SelectOptions options);

}
