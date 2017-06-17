package org.x.material.service.mgs06001;

import static org.x.material.condition.MaterialConstants.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.seasar.doma.jdbc.NoResultException;
import org.seasar.doma.jdbc.SelectOptions;
import org.x.material.common.util.DateUtil;
import org.x.material.condition.MaterialConstants.DefDelFlg;
import org.x.material.dao.MAccountDao;
import org.x.material.dao.MBoxDao;
import org.x.material.dao.MBoxMaterialDao;
import org.x.material.dao.MLocationBoxDao;
import org.x.material.dao.MLocationDao;
import org.x.material.dao.MMaterialDao;
import org.x.material.dao.MRBoxmaterialDao;
import org.x.material.dao.MRLocboxDao;
import org.x.material.dao.impl.MAccountDaoImpl;
import org.x.material.dao.impl.MBoxDaoImpl;
import org.x.material.dao.impl.MBoxMaterialDaoImpl;
import org.x.material.dao.impl.MLocationBoxDaoImpl;
import org.x.material.dao.impl.MLocationDaoImpl;
import org.x.material.dao.impl.MMaterialDaoImpl;
import org.x.material.dao.impl.MRBoxmaterialDaoImpl;
import org.x.material.dao.impl.MRLocboxDaoImpl;
import org.x.material.dto.BoxMaterialDto;
import org.x.material.dto.LocationBoxDto;
import org.x.material.dto.LocationDto;
import org.x.material.dto.UserDto;
import org.x.material.entity.MAccount;
import org.x.material.entity.MBox;
import org.x.material.entity.MBoxMaterial;
import org.x.material.entity.MLocation;
import org.x.material.entity.MLocationBox;
import org.x.material.entity.MMaterial;
import org.x.material.entity.MRBoxmaterial;
import org.x.material.entity.MRLocbox;
import org.x.material.form.mgs06001.MaterialManagementForm;

/**
 * マテリアル管理サービス..
 *
 * @author  nakada
 * @since   20141026.01.00
 * @version 20141026.00.01
 */
public class MaterialManagementService {

	/** 取得件数. */
	private long cnt;

// 110.情報取得：文字列検索
	/**
	 * ロケーション情報検索.
	 * ・アカウントID、ロケーション名をKEYにロケーション情報をLike検索する。
	 *
	 * @param locOnrId オーナアカウント
	 * @param locNm 検索ロケーション名
	 * @param pageno   取得ページ番号
	 * @param perpage  ページあたりの件数
	 * @return List<MLocation>
	 */
	public final List<MLocation> findByLocationWithInsideMatching(final String locOnrId, final String locNm, final String pageno, final int perpage) {

		SelectOptions options = SelectOptions.get().offset((Integer.parseInt(pageno) - 1) * perpage).limit(perpage).count();
		MLocationDao dao = new MLocationDaoImpl();
		List<MLocation> list = dao.selectByLocNmWithInsideMatching(locOnrId, locNm, options);
		this.cnt = options.getCount();

		return list;

	}

	/**
	 * ボックス情報検索.
	 * ・アカウントID、ボックス名をKEYにボックス一覧情報をLike検索する。
	 *
	 * @param locOnrId オーナアカウント
	 * @param boxNm 検索ボックス名
	 * @param pageno   取得ページ番号
	 * @param perpage  ページあたりの件数
	 * @return List<MLocationBox> ボックス一覧
	 */
	public final List<MLocationBox> findByBoxWithInsideMatching(final String locOnrId, final String boxNm, final String pageno, final int perpage) {

		SelectOptions options = SelectOptions.get().offset((Integer.parseInt(pageno) - 1) * perpage).limit(perpage).count();
		MLocationBoxDao dao = new MLocationBoxDaoImpl();
		List<MLocationBox> list = dao.selectByBoxNmWithInsideMatching(locOnrId, boxNm, null, options);
		this.cnt = options.getCount();

		return list;

	}
	/**
	 * マテリアル情報検索.
	 * ・アカウントID、マテリアル名をKEYにマテリアル一覧情報をLike検索する。
	 *
	 * @param boxOnrId オーナアカウント
	 * @param materialNm 検索マテリアル名
	 * @param pageno   取得ページ番号
	 * @param perpage  ページあたりの件数
	 * @return List<MBoxMaterial> 一覧
	 */
	public final List<MBoxMaterial> findByMaterialWithInsideMatching(final String boxOnrId, final String materialNm, final String pageno, final int perpage) {
		SelectOptions options = SelectOptions.get().offset((Integer.parseInt(pageno) - 1) * perpage).limit(perpage).count();
		MBoxMaterialDao dao = new MBoxMaterialDaoImpl();
		List<MBoxMaterial> list = dao.selectByMaterialNmWithInsideMatching(boxOnrId, materialNm, null, options);
		this.cnt = options.getCount();

		return list;

	}
	
// 120.情報取得：ID検索
	
	/**
	 * ロケーション情報取得.
	 * ・ロケーションIDをKEYにロケーション情報を検索する。
	 *
	 * @param locId ロケーションID
	 * @return MLocation Entity
	 */
	public final MLocation findByLocId(final String locId) {
		return findByLocId(DefDelFlg.NOTDEL.getVal(), locId);
	}
	/**
	 * ロケーション情報取得.（削除フラグ指定あり）
	 * ・ロケーションIDをKEYにロケーション情報を検索する。
	 *
	 * @param locId ロケーションID
	 * @param delFlg 削除フラグ
	 * @return MLocation Entity
	 */
	public final MLocation findByLocId(final String delFlg,final String locId) {

		MLocationDao dao = new MLocationDaoImpl();
		return dao.selectByLocId(delFlg, locId);
	}

	/**
	 * ボックス情報取得.
	 * ・ボックスIDをKEYにボックス情報を検索する。
	 *
	 * @param boxId ボックスID
	 * @return MLocationBox Entity
	 */
	public final MLocationBox findByBoxId(final String boxId) {

		MLocationBoxDao dao = new MLocationBoxDaoImpl();
		return dao.selectByBoxId(boxId);
	}
	
	/**
	 * マテリアル情報取得.
	 * ・マテリアルIDをKEYにマテリアル情報を検索する。
	 *
	 * @param materialId マテリアルID
	 * @return MBoxMaterial Entity
	 */
	public final MBoxMaterial findByMatId(final String matId) {

		MBoxMaterialDao dao = new MBoxMaterialDaoImpl();
		return dao.selectByMaterialId(matId);
	}
	/**
	 * マテリアル情報取得.
	 * ・マテリアルIDをKEYにマテリアル情報を検索する。
	 *
	 * @param materialId マテリアルID
	 * @return MBoxMaterial Entity
	 */
	public final MAccount selectByIdWithEnsureResult(final String accId) {
		MAccountDao dao = new MAccountDaoImpl();
		return dao.selectByIdWithEnsureResult(accId);
	}
	
	/**
	 * ロケーションボックス情報検索.
	 * ・アカウントID、ロケーションIDをKEYにボックス一覧情報をLike検索する。
	 *
	 * @param locOnrId オーナアカウント
	 * @param locId ロケーションID
	 * @param pageno   取得ページ番号
	 * @param perpage  ページあたりの件数
	 * @return List<MLocationBox> ボックス一覧
	 */
	public final List<MLocationBox> findByLocIdWithInsideMatching(final String locOnrId, final String locId, final String pageno, final int perpage) {

		SelectOptions options = SelectOptions.get().offset((Integer.parseInt(pageno) - 1) * perpage).limit(perpage).count();
		MLocationBoxDao dao = new MLocationBoxDaoImpl();
		List<MLocationBox> list = dao.selectByBoxNmWithInsideMatching(locOnrId, null, locId, options);
		this.cnt = options.getCount();

		return list;

	}
	
	/**
	 * ボックスマテリアル情報検索.
	 * ・アカウントID、ロケーションIDをKEYにボックス一覧情報をLike検索する。
	 *
	 * @param boxOnrId オーナアカウント
	 * @param boxId ボックスID
	 * @param pageno   取得ページ番号
	 * @param perpage  ページあたりの件数
	 * @return List<MBoxMaterial> マテリアル一覧
	 */
	public final List<MBoxMaterial> findByBoxIdWithInsideMatching(final String boxOnrId, final String boxId, final String pageno, final int perpage) {

		SelectOptions options = SelectOptions.get().offset((Integer.parseInt(pageno) - 1) * perpage).limit(perpage).count();
		MBoxMaterialDao dao = new MBoxMaterialDaoImpl();
		List<MBoxMaterial> list = dao.selectByMaterialNmWithInsideMatching(boxOnrId, null, boxId, options);
		this.cnt = options.getCount();

		return list;

	}
	
	/**
	 * ユーザ情報検索.
	 * ・アカウントIDをKEYにアカウント情報を検索する。
	 *
	 * @param accId アカウントID
	 * @param perpage 削除フラグ
	 * @return List<MAccount> アカウント一覧
	 */
	public final List<MAccount> selectByIdWithOutDelFlg(String accId) {

//		SelectOptions options = SelectOptions.get().offset((Integer.parseInt(pageno) - 1) * perpage).limit(perpage).count();
		MAccountDao dao = new MAccountDaoImpl();
		List<MAccount> list = dao.selectByIdWithOutDelFlg(accId);
//		this.cnt = options.getCount();
		return list;

	}
	
// 210.情報登録
	/**
	 * ロケーション情報登録.
	 * ・主キーをKEYにロケーション情報を登録する。
	 *
	 * @param prmForm ロケーション画面情報
	 * @param userDto ユーザ情報
	 */
	public final void locInsReg(final MaterialManagementForm prmForm, final UserDto userDto) {

        // aptで生成されたDaoの実装クラスを生成
		MLocationDao dao = new MLocationDaoImpl();

		MLocation newdata = new MLocation();

    	newdata.setLocId(prmForm.getLocId());
		newdata.setLocKind(prmForm.getLocKind());
		newdata.setLocNm(prmForm.getLocNm());
		newdata.setLocOnrId(userDto.getAccid());
		newdata.setPostcd(prmForm.getPostcd());
		newdata.setAddress(prmForm.getAddress());
		newdata.setRecipient(prmForm.getRecipient());
		newdata.setTel1(prmForm.getRecipient());
		newdata.setNote(prmForm.getNote());
		newdata.setTagA(prmForm.getTagA());
		newdata.setTagB(prmForm.getTagB());
		newdata.setDefaultLocale(DEFAULTLOCALE);
		newdata.setExCnt(new BigDecimal("1"));
		newdata.setInsAcc(userDto.getAccid());
		newdata.setInsDate(new Date());
		newdata.setUpdAcc(userDto.getAccid());
		newdata.setUpdDate(new Date());
		newdata.setDelFlg(DefDelFlg.NOTDEL.getVal());

		dao.insert(newdata);

	}

	/**
	 * ボックス情報登録.
	 * ・主キーをKEYにロケーション情報を登録する。
	 *
	 * @param prmForm ボックス画面情報
	 * @param userDto ユーザ情報
	 */
	public final void boxInsReg(final MaterialManagementForm prmForm, final UserDto userDto) {

        // aptで生成されたDaoの実装クラスを生成
		MBoxDao dao = new MBoxDaoImpl();

		MBox newdata = new MBox();

    	newdata.setBoxId(prmForm.getBoxId());
		newdata.setBoxKind(prmForm.getBoxKind());
		newdata.setBoxOnrId(prmForm.getBoxOnrId());
		newdata.setCapaInd(prmForm.getCapaInd());
		newdata.setBoxNm(prmForm.getBoxNm());
		newdata.setNote(prmForm.getNote());
		newdata.setDefaultLocale(DEFAULTLOCALE);
		newdata.setExCnt(new BigDecimal("1"));
		newdata.setInsAcc(userDto.getAccid());
		newdata.setInsDate(new Date());
		newdata.setUpdAcc(userDto.getAccid());
		newdata.setUpdDate(new Date());
		newdata.setDelFlg(DefDelFlg.NOTDEL.getVal());

		dao.insert(newdata);

	}
	
	/**
	 * マテリアル情報登録.
	 * ・主キーをKEYにロケーション情報を登録する。
	 *
	 * @param prmForm ボックス画面情報
	 * @param userDto ユーザ情報
	 */
	public final void matInsReg(final MaterialManagementForm prmForm, final UserDto userDto) {

        // aptで生成されたDaoの実装クラスを生成
		MMaterialDao dao = new MMaterialDaoImpl();

		MMaterial newdata = new MMaterial();

    	newdata.setMtId(prmForm.getMatId());
		newdata.setMtOnrId(userDto.getAccid());
		newdata.setMtKind1(prmForm.getMatKind1());
		newdata.setMtKind2(prmForm.getMatKind2());
		newdata.setMtNm(prmForm.getMatNm());
		newdata.setTagA(prmForm.getTagA());
		newdata.setTagB(prmForm.getTagB());
		newdata.setDefaultLocale(DEFAULTLOCALE);
		newdata.setExCnt(new BigDecimal("1"));
		newdata.setInsAcc(userDto.getAccid());
		newdata.setInsDate(new Date());
		newdata.setUpdAcc(userDto.getAccid());
		newdata.setUpdDate(new Date());
		newdata.setDelFlg(DefDelFlg.NOTDEL.getVal());

		dao.insert(newdata);

	}

	
	/**
	 * ロケーションボックス関連マスタ情報登録.
	 * ・主キーをKEYにロケーション情報を登録する。
	 *
	 * @param prmForm ボックス画面情報
	 * @param userDto ユーザ情報
	 */
	public final void rlocBoxInsReg(final MaterialManagementForm prmForm, final UserDto userDto) {

        // aptで生成されたDaoの実装クラスを生成
		MRLocboxDao dao = new MRLocboxDaoImpl();

		MRLocbox newdata = new MRLocbox();

    	newdata.setLocId(prmForm.getLocId());
    	newdata.setBoxId(prmForm.getBoxId());
		newdata.setTagA(prmForm.getTagA());
		newdata.setTagB(prmForm.getTagB());
		newdata.setDefaultLocale(DEFAULTLOCALE);
		newdata.setExCnt(new BigDecimal("1"));
		newdata.setInsAcc(userDto.getAccid());
		newdata.setInsDate(new Date());
		newdata.setUpdAcc(userDto.getAccid());
		newdata.setUpdDate(new Date());
		newdata.setDelFlg(DefDelFlg.NOTDEL.getVal());

		dao.insert(newdata);

	}
	/**
	 * ボックスマテリアル関連マスタ情報登録.
	 * ・主キーをKEYにロケーション情報を登録する。
	 *
	 * @param prmForm ボックス画面情報
	 * @param userDto ユーザ情報
	 */
	public final void rboxMatInsReg(final MaterialManagementForm prmForm, final UserDto userDto) {

        // aptで生成されたDaoの実装クラスを生成
		MRBoxmaterialDao dao = new MRBoxmaterialDaoImpl();

		MRBoxmaterial newdata = new MRBoxmaterial();
		
    	newdata.setBoxId(prmForm.getBoxId());
    	newdata.setMtId(prmForm.getMatId());
		newdata.setTagA(prmForm.getTagA());
		newdata.setTagB(prmForm.getTagB());
		newdata.setDefaultLocale(DEFAULTLOCALE);
		newdata.setExCnt(new BigDecimal("1"));
		newdata.setInsAcc(userDto.getAccid());
		newdata.setInsDate(new Date());
		newdata.setUpdAcc(userDto.getAccid());
		newdata.setUpdDate(new Date());
		newdata.setDelFlg(DefDelFlg.NOTDEL.getVal());

		dao.insert(newdata);

	}

// 220.情報更新
	/**
	 * ロケーション情報更新.
	 * ・主キーをKEYにロケーション情報を更新する。
	 *
	 * @param prmForm ロケーション画面情報
	 * @param userDto ユーザ情報
	 * @param locationDto ロケーションテーブル情報
	 */
	public final void locUpdReg(MaterialManagementForm prmForm, final UserDto userDto, final LocationDto locationDto) {

        // aptで生成されたDaoの実装クラスを生成
		MLocationDao dao = new MLocationDaoImpl();

		MLocation newdata = new MLocation();

    	newdata.setLocId(prmForm.getLocId());
		newdata.setLocKind(prmForm.getLocKind());
		newdata.setLocNm(prmForm.getLocNm());
		newdata.setLocOnrId(prmForm.getLocOnrId());
		newdata.setPostcd(prmForm.getPostcd());
		newdata.setAddress(prmForm.getAddress());
		newdata.setRecipient(prmForm.getRecipient());
		newdata.setTel1(prmForm.getRecipient());
		newdata.setTagA(prmForm.getTagA());
		newdata.setTagB(prmForm.getTagB());
		newdata.setNote(prmForm.getNote());
		newdata.setDefaultLocale(DEFAULTLOCALE);
		newdata.setExCnt(new BigDecimal(locationDto.getExCnt()));
		newdata.setInsAcc(locationDto.getInsAcc());
		newdata.setInsDate(DateUtil.toDate(locationDto.getInsDate()));
		newdata.setUpdAcc(userDto.getAccid());
		newdata.setUpdDate(new Date());
		newdata.setDelFlg(locationDto.getDelFlg());
		newdata.setRecId(Long.valueOf(locationDto.getRecId()));

		dao.update(newdata);

	}

	/**
	 * ボックス情報更新.
	 * ・主キーをKEYにボックス情報を登録する。
	 *
	 * @param prmForm ボックス画面情報
	 * @param userDto ユーザ情報
	 * @param locationBoxDto ロケーションボックステーブル情報
	 */
	public final void boxUpdReg(final MaterialManagementForm prmForm, final UserDto userDto, final LocationBoxDto locationBoxDto) {

        // aptで生成されたDaoの実装クラスを生成
		MBoxDao dao = new MBoxDaoImpl();

		MBox newdata = new MBox();

    	newdata.setBoxId(prmForm.getBoxId());
		newdata.setBoxKind(prmForm.getBoxKind());
		newdata.setBoxOnrId(prmForm.getBoxOnrId());
		newdata.setCapaInd(prmForm.getCapaInd());
		newdata.setBoxNm(prmForm.getBoxNm());
		newdata.setNote(prmForm.getNote());
		newdata.setDefaultLocale(DEFAULTLOCALE);
		newdata.setExCnt(locationBoxDto.getExCnt());
		newdata.setInsAcc(locationBoxDto.getInsAcc());
		newdata.setInsDate(locationBoxDto.getInsDate());
		newdata.setUpdAcc(userDto.getAccid());
		newdata.setUpdDate(new Date());
		newdata.setDelFlg(locationBoxDto.getDelFlg());
		newdata.setRecId(locationBoxDto.getRecId());

		dao.update(newdata);

	}
	
	/**
	 * マテリアル情報更新.
	 * ・主キーをKEYにボックス情報を登録する。
	 *
	 * @param prmForm マテリアル画面情報
	 * @param userDto ユーザ情報
	 * @param boxMaterialDto ロケーションボックステーブル情報
	 */
	public final void matUpdReg(final MaterialManagementForm prmForm, final UserDto userDto, final BoxMaterialDto boxMaterialDto) {

        // aptで生成されたDaoの実装クラスを生成
		MMaterialDao dao = new MMaterialDaoImpl();

		MMaterial newdata = new MMaterial();

    	newdata.setMtId(prmForm.getMatId());
		newdata.setMtOnrId(prmForm.getMatOnrId());
		newdata.setMtKind1(prmForm.getMatKind1());
		newdata.setMtKind2(prmForm.getMatKind2());
		newdata.setMtNm(prmForm.getMatNm());
		newdata.setTagA(prmForm.getTagA());
		newdata.setTagB(prmForm.getTagB());
		newdata.setDefaultLocale(DEFAULTLOCALE);
		newdata.setExCnt(boxMaterialDto.getExCnt());
		newdata.setInsAcc(boxMaterialDto.getInsAcc());
		newdata.setInsDate(boxMaterialDto.getInsDate());
		newdata.setUpdAcc(userDto.getAccid());
		newdata.setUpdDate(new Date());
		newdata.setDelFlg(boxMaterialDto.getDelFlg());
		newdata.setRecId(boxMaterialDto.getRecId());

		dao.update(newdata);

	}
	
	/**
	 * ロケーションボックス関連マスタ情報更新.
	 * ・主キーをKEYにロケーション情報を登録する。
	 *
	 * @param prmForm ボックス画面情報
	 * @param userDto ユーザ情報
	 * @param locationBoxDto ロケーションボックステーブル情報
	 */
	public final void rlocBoxUpdReg(final MaterialManagementForm prmForm, final UserDto userDto, final LocationBoxDto locationBoxDto) {

        // aptで生成されたDaoの実装クラスを生成
		MRLocboxDao dao = new MRLocboxDaoImpl();

		MRLocbox newdata = new MRLocbox();

    	newdata.setLocId(prmForm.getLocId());
    	newdata.setBoxId(prmForm.getBoxId());
		newdata.setTagA(prmForm.getTagA());
		newdata.setTagB(prmForm.getTagB());
		newdata.setDefaultLocale(DEFAULTLOCALE);
		newdata.setExCnt(locationBoxDto.getExCnt());
		newdata.setInsAcc(locationBoxDto.getInsAcc());
		newdata.setInsDate(locationBoxDto.getInsDate());
		newdata.setUpdAcc(userDto.getAccid());
		newdata.setUpdDate(new Date());
		newdata.setDelFlg(DefDelFlg.NOTDEL.getVal());
		newdata.setRecId(locationBoxDto.getRecId());

		dao.insert(newdata);

	}
	
//	/**
//	 * ロケーションボックス関連マスタ情報更新.
//	 * ・主キーをKEYにロケーション情報を登録する。
//	 *
//	 * @param prmForm ボックス画面情報
//	 * @param userDto ユーザ情報
//	 * @param locationBoxDto ロケーションボックステーブル情報
//	 */
//	public final void rboxMaterialUpdReg(final MaterialManagementForm prmForm, final UserDto userDto, final BoxMaterialDto boxMaterialDto) {
////TODO
//       // aptで生成されたDaoの実装クラスを生成
//		MRBoxmaterialDao dao = new MRBoxmaterialDaoImpl();
//
//		MRBoxmaterial newdata = new MRBoxmaterial();
//
//		newdata.setBoxId(prmForm.getBoxId());
//		newdata.setMtId(prmForm.getMaterialId());
//		newdata.setTagA(prmForm.getTagA());
//		newdata.setTagB(prmForm.getTagB());
//		newdata.setDefaultLocale(DEFAULTLOCALE);
//		newdata.setExCnt(boxMaterialDto.getExCnt());
//		newdata.setInsAcc(boxMaterialDto.getInsAcc());
//		newdata.setInsDate(boxMaterialDto.getInsDate());
//		newdata.setUpdAcc(userDto.getAccid());
//		newdata.setUpdDate(new Date());
//		newdata.setDelFlg(DefDelFlg.NOTDEL.getVal());
//		newdata.setRecId(boxMaterialDto.getRecId());
//
//		dao.insert(newdata);
//
//	}

// 220.情報削除
	/**
	 * ロケーション情報削除更新.
	 * ・主キーをKEYにロケーション情報を更新する。
	 *
	 * @param userDto ユーザ情報
	 * @param locationDto ロケーションテーブル情報
	 */
	public final void locDelUpdReg(final UserDto userDto, final LocationDto locationDto) {

        // aptで生成されたDaoの実装クラスを生成
		MLocationDao dao = new MLocationDaoImpl();

		MLocation newdata = new MLocation();

    	newdata.setLocId(locationDto.getLocId());
		newdata.setLocKind(locationDto.getLocKind());
		newdata.setLocNm(locationDto.getLocNm());
		newdata.setLocOnrId(locationDto.getLocOnrId());
		newdata.setPostcd(locationDto.getPostcd());
		newdata.setAddress(locationDto.getAddress());
		newdata.setRecipient(locationDto.getRecipient());
		newdata.setTel1(locationDto.getRecipient());
		newdata.setNote(locationDto.getNote());
		newdata.setDefaultLocale(DEFAULTLOCALE);
		newdata.setExCnt(new BigDecimal(locationDto.getExCnt()));
		newdata.setInsAcc(locationDto.getInsAcc());
		newdata.setInsDate(DateUtil.toDate(locationDto.getInsDate()));
		newdata.setUpdAcc(userDto.getAccid());
		newdata.setUpdDate(new Date());
		newdata.setDelFlg(DefDelFlg.DEL.getVal());
		newdata.setRecId(Long.valueOf(locationDto.getRecId()));

		dao.update(newdata);

	}

	/**
	 * ボックス情報削除更新.
	 * ・主キーをKEYにボックス情報を登録する。
	 *
	 * @param userDto ユーザ情報
	 * @param locationBoxDto ロケーションボックステーブル情報
	 */
	public final void boxDelUpdReg(final UserDto userDto, final LocationBoxDto locationBoxDto) {

        // aptで生成されたDaoの実装クラスを生成
		MBoxDao dao = new MBoxDaoImpl();

		MBox newdata = new MBox();

    	newdata.setBoxId(locationBoxDto.getBoxId());
		newdata.setBoxKind(locationBoxDto.getBoxKind());
		newdata.setBoxOnrId(locationBoxDto.getBoxOnrId());
		newdata.setCapaInd(locationBoxDto.getCapaInd());
		newdata.setBoxNm(locationBoxDto.getBoxNm());
		newdata.setNote(locationBoxDto.getNote());
		newdata.setDefaultLocale(DEFAULTLOCALE);
		newdata.setExCnt(locationBoxDto.getExCnt());
		newdata.setInsAcc(locationBoxDto.getInsAcc());
		newdata.setInsDate(locationBoxDto.getInsDate());
		newdata.setUpdAcc(userDto.getAccid());
		newdata.setUpdDate(new Date());
		newdata.setDelFlg(DefDelFlg.DEL.getVal());
		newdata.setRecId(locationBoxDto.getRecId());

		dao.update(newdata);

	}

	/**
	 * マテリアル情報削除更新.
	 * ・主キーをKEYにボックス情報を登録する。
	 *
	 * @param userDto ユーザ情報
	 * @param boxMaterialDto ロケーションボックステーブル情報
	 */
	public final void matDelUpdReg(final UserDto userDto, final BoxMaterialDto boxMaterialDto) {

        // aptで生成されたDaoの実装クラスを生成
		MMaterialDao dao = new MMaterialDaoImpl();

		MMaterial newdata = new MMaterial();

    	newdata.setMtId(boxMaterialDto.getMtId());
		newdata.setMtKind1(boxMaterialDto.getMtKind1());
		newdata.setMtKind2(boxMaterialDto.getMtKind2());
		newdata.setMtOnrId(boxMaterialDto.getMtOnrId());
		newdata.setMtNm(boxMaterialDto.getMtNm());
		newdata.setTagA(boxMaterialDto.getTagA());
		newdata.setTagB(boxMaterialDto.getTagB());
		newdata.setDefaultLocale(DEFAULTLOCALE);
		newdata.setExCnt(boxMaterialDto.getExCnt());
		newdata.setInsAcc(boxMaterialDto.getInsAcc());
		newdata.setInsDate(boxMaterialDto.getInsDate());
		newdata.setUpdAcc(userDto.getAccid());
		newdata.setUpdDate(new Date());
		newdata.setDelFlg(DefDelFlg.DEL.getVal());
		newdata.setRecId(boxMaterialDto.getRecId());

		dao.update(newdata);

	}

	/**
	 * ロケーションボックス関連マスタ削除更新.
	 * ・主キーをKEYにロケーションボックス関連マスタ情報を更新する。
	 *
	 * @param userDto ユーザ情報
	 * @param locId ロケーションID
	 * @param boxId ボックスID
	 */
	public final void rlocBoxDelUpdReg(final UserDto userDto, final String locId, final String boxId) {

        // aptで生成されたDaoの実装クラスを生成
		MRLocboxDao dao = new MRLocboxDaoImpl();

		dao.updateDelFlg(DefDelFlg.DEL.getVal(), userDto.getAccid(), locId, boxId);

	}
	
	/**
	 * ボックスマテリアル関連マスタ削除更新.
	 * ・主キーをKEYにロケーションボックス関連マスタ情報を更新する。
	 *
	 * @param userDto ユーザ情報
	 * @param boxId ボックスID
	 * @param matId マテリアルID
	 */
	public final void rboxMatDelUpdReg(final UserDto userDto, final String boxId, final String matId) {

        // aptで生成されたDaoの実装クラスを生成
		MRBoxmaterialDao dao = new MRBoxmaterialDaoImpl();

		dao.updateDelFlg(DefDelFlg.DEL.getVal(), userDto.getAccid(), boxId,matId);

	}
	
// 220.情報削除
    /**
     * ロケーションIDの存在チェック.
     *
     * @param locid ロケーションID
     * @return Exist True/False
     */
	public final boolean locationIdExistCheck(final String locid) {

		try {
	        // aptで生成されたDaoの実装クラスを生成
			MLocationDao dao = new MLocationDaoImpl();

			// 検索(DEL_FLGを無視して検索結果取得）
			MLocation rec = dao.selectByLocId(null, locid);

			return true;

		} catch (NoResultException e) {
			return false;
		}

	}

   /**
     * ボックスIDの存在チェック.
     *
     * @param boxid ボックスID
     * @return Exist True/False
     */
	public final boolean boxIdExistCheck(final String boxid) {

		try {
	        // aptで生成されたDaoの実装クラスを生成
			MBoxDao dao = new MBoxDaoImpl();

			// 検索(DEL_FLGを無視して検索結果取得）
			MBox rec = dao.selectByBoxIdWithEnsureResult(null, boxid);

			return true;

		} catch (NoResultException e) {
			return false;
		}

	}
	
   /**
     * マテリアルIDの存在チェック.
     *
     * @param materialid ボックスID
     * @return Exist True/False
     */
	public final boolean materialIdExistCheck(final String materialid) {

		try {
	        // aptで生成されたDaoの実装クラスを生成
			MMaterialDao dao = new MMaterialDaoImpl();

			// 検索(DEL_FLGを無視して検索結果取得）
			MMaterial rec = dao.selectByMaterialIdWithEnsureResult(null, materialid);

			return true;

		} catch (NoResultException e) {
			return false;
		}

	}
	
    /**
     * ロケーションIDの他オーナー非公開チェック
     *
     * @param locid ロケーションID
     * @return Exist True/False
     */
	public final boolean otherLocOnrIdPrivateExistCheck(final UserDto userDto,final String locid) {
		try {
	        // aptで生成されたDaoの実装クラスを生成
			MLocationDao dao = new MLocationDaoImpl();

			// 検索(DEL_FLGを無視して検索結果取得）
			MLocation rec = dao.selectByLocId(null, locid);

			if(rec.getLocOnrId().equals(userDto.getAccid())
				|| rec.getLocKind().equals(LOCATIONKINDPUBLIC)){
				return true;
			}else{
				return false;
			}

		} catch (NoResultException e) {
			return false;
		}
	}
    /**
     * ボックスIDの他オーナー非公開チェック
     *
     * @param boxid ボックスID
     * @return Exist True/False
     */
	public final boolean otherBoxOnrIdPrivateExistCheck(final UserDto userDto,final String boxid) {
		try {
	        // aptで生成されたDaoの実装クラスを生成
			MBoxDao dao = new MBoxDaoImpl();

			// 検索(DEL_FLGを無視して検索結果取得）
			MBox rec = dao.selectByBoxIdWithEnsureResult(null, boxid);

			if(rec.getBoxOnrId().equals(userDto.getAccid())
				|| rec.getBoxKind().equals(BOXKINDPUBLIC)){
				return true;
			}else{
				return false;
			}

		} catch (NoResultException e) {
			return false;
		}
	}
    /**
     * マテリアルIDの他オーナー非公開チェック
     *
     * @param matid マテリアルID
     * @return Exist True/False
     */
	public final boolean otherMatOnrIdPrivateExistCheck(final UserDto userDto,final String matid) {
		try {
	        // aptで生成されたDaoの実装クラスを生成
			MMaterialDao dao = new MMaterialDaoImpl();

			// 検索(DEL_FLGを無視して検索結果取得）
			MMaterial rec = dao.selectByMaterialIdWithEnsureResult(null, matid);

			if(rec.getMtOnrId().equals(userDto.getAccid())
				|| rec.getMtKind1().equals(MATERIALKINDPUBLIC)){
				return true;
			}else{
				return false;
			}

		} catch (NoResultException e) {
			return false;
		}
	}
    /**
     * ロケーションIDの他オーナーチェック
     *
     * @param locid ロケーションID
     * @return Exist True/False
     */
	public final boolean otherLocOnrIdExistCheck(final UserDto userDto,final String locid) {
		try {
	        // aptで生成されたDaoの実装クラスを生成
			MLocationDao dao = new MLocationDaoImpl();

			// 検索(DEL_FLGを無視して検索結果取得）
			MLocation rec = dao.selectByLocId(null, locid);

			if(rec.getLocOnrId().equals(userDto.getAccid())){
				return true;
			}else{
				return false;
			}

		} catch (NoResultException e) {
			return false;
		}

	}
    /**
     * ボックスIDの他オーナーチェック
     *
     * @param boxid ロケーションID
     * @return Exist True/False
     */
	public final boolean otherBoxOnrIdExistCheck(final UserDto userDto,final String boxid) {
		try {
	        // aptで生成されたDaoの実装クラスを生成
			MBoxDao dao = new MBoxDaoImpl();

			// 検索(DEL_FLGを無視して検索結果取得）
			MBox rec = dao.selectByBoxIdWithEnsureResult(null, boxid);

			if(rec.getBoxOnrId().equals(userDto.getAccid())){
				return true;
			}else{
				return false;
			}

		} catch (NoResultException e) {
			return false;
		}

	}
    /**
     * マテリアルIDの他オーナーチェック
     *
     * @param matid ロケーションID
     * @return Exist True/False
     */
	public final boolean otherMatOnrIdExistCheck(final UserDto userDto,final String matid) {
		try {
	        // aptで生成されたDaoの実装クラスを生成
			MMaterialDao dao = new MMaterialDaoImpl();

			// 検索(DEL_FLGを無視して検索結果取得）
			MMaterial rec = dao.selectByMaterialIdWithEnsureResult(null, matid);

			if(rec.getMtOnrId().equals(userDto.getAccid())){
				return true;
			}else{
				return false;
			}

		} catch (NoResultException e) {
			return false;
		}

	}
	/**
     * Returns the cnt.
	 * ・検索件数結果取得。検索実施後に取得する
	 *
	 * @return the cnt 件数
	 */
	public final long getCount() {
		return cnt;
	}

}
