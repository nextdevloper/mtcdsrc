package org.x.material.service.mgs05001;

import static org.x.material.condition.MaterialConstants.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.seasar.doma.jdbc.NoResultException;
import org.seasar.doma.jdbc.SelectOptions;
import org.x.material.common.util.DateUtil;
import org.x.material.condition.MaterialConstants.DefDelFlg;
import org.x.material.dao.MBoxDao;
import org.x.material.dao.MLocationBoxDao;
import org.x.material.dao.MLocationDao;
import org.x.material.dao.MRLocboxDao;
import org.x.material.dao.impl.MBoxDaoImpl;
import org.x.material.dao.impl.MLocationBoxDaoImpl;
import org.x.material.dao.impl.MLocationDaoImpl;
import org.x.material.dao.impl.MRLocboxDaoImpl;
import org.x.material.dto.LocationBoxDto;
import org.x.material.dto.LocationDto;
import org.x.material.dto.UserDto;
import org.x.material.entity.MBox;
import org.x.material.entity.MLocation;
import org.x.material.entity.MLocationBox;
import org.x.material.entity.MRLocbox;
import org.x.material.form.mgs05001.LocationManagementForm;

/**
 * ロケーション管理サービス..
 *
 * @author  nakada
 * @since   20141026.01.00
 * @version 20141026.00.01
 */
public class LocationManagementService {

	/** 取得件数. */
	private long cnt;

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
	 * ロケーション情報取得.
	 * ・ロケーションIDをKEYにロケーション情報を検索する。
	 *
	 * @param locId ロケーションID
	 * @return MLocation Entity
	 */
	public final MLocation findByLocId(final String locId) {

		MLocationDao dao = new MLocationDaoImpl();
		return dao.selectByLocId(DefDelFlg.NOTDEL.getVal(), locId);
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
	 * ロケーション情報更新.
	 * ・主キーをKEYにロケーション情報を更新する。
	 *
	 * @param prmForm ロケーション画面情報
	 * @param userDto ユーザ情報
	 * @param locationDto ロケーションテーブル情報
	 */
	public final void locUpdReg(final LocationManagementForm prmForm, final UserDto userDto, final LocationDto locationDto) {

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
	public final void boxUpdReg(final LocationManagementForm prmForm, final UserDto userDto, final LocationBoxDto locationBoxDto) {

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
	 * ロケーションボックス関連マスタ情報更新.
	 * ・主キーをKEYにロケーション情報を登録する。
	 *
	 * @param prmForm ボックス画面情報
	 * @param userDto ユーザ情報
	 * @param locationBoxDto ロケーションボックステーブル情報
	 */
	public final void rlocBoxUpdReg(final LocationManagementForm prmForm, final UserDto userDto, final LocationBoxDto locationBoxDto) {

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
	 * ロケーション情報登録.
	 * ・主キーをKEYにロケーション情報を登録する。
	 *
	 * @param prmForm ロケーション画面情報
	 * @param userDto ユーザ情報
	 */
	public final void locInsReg(final LocationManagementForm prmForm, final UserDto userDto) {

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
	public final void boxInsReg(final LocationManagementForm prmForm, final UserDto userDto) {

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
	 * ロケーションボックス関連マスタ情報登録.
	 * ・主キーをKEYにロケーション情報を登録する。
	 *
	 * @param prmForm ボックス画面情報
	 * @param userDto ユーザ情報
	 */
	public final void rlocBoxInsReg(final LocationManagementForm prmForm, final UserDto userDto) {

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
     * Returns the cnt.
	 * ・アカウント検索（findByAccountWithInsideMatching）実施後に取得する
	 *
	 * @return the cnt 件数
	 */
	public final long getCount() {
		return cnt;
	}

}
