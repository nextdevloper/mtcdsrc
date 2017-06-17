package org.x.material.condition;

/**
 * Material 共通コンスタント定義.
 *
 * @author  nakada
 * @since   20141029.00.01
 * @version 20151025.01.00
 */
public final class MaterialConstants {

	/**
	 * Don't let anyone instantiate this class.
	 */
	private MaterialConstants() { }

	/**
	 * 定数定義.
	 */
	/** マテリアルクラウドシステムプロパティ. */
	public static final String MATERIALPROPERTY = "material.properties";
	/** 0. */
	public static final int DEFINTZERO = 0;

	/** システムアカウント定義. */
	public static final String SYSTEMACC = "system";

	/** アカウントブロック表示文字定義 -ブロック中. */
	public static final String ACCBLOCK = "ブロック中";

	/** アカウントブロック表示文字定義 -通常. */
	public static final String ACCNOBLOCK = "通常";

	/** コードマスタ種別定義. */
	public enum MCodeKind {
		/** ユーザ種別. */
		KIND_ACC("MC0101")
		/** ユーザステータス. */
		, STATUS_ACC("MC0102")
		/** 組織ステータス. */
		, STRUCTSTAT("MC0201")
		/** 組織種別. */
		, STRUCTKIND("MC0202")
		/** ロケーション種別. */
		, LOCKIND("MC0301")
		/** ボックス種別. */
		, BOXKIND("MC0401")
		/** ボックス状態. */
		, BOXSTAT("MC0501")
		/** マテリアル種別1. */
		, MTKIND1("MC0601")
		/** マテリアル種別2. */
		, MTKIND2("MC0602")
		/** マテリアル状態1. */
		, MTKSTAT1("MC0701")
		/** マテリアル状態2. */
		, MTKSTAT2("MC0702")
		/** マテリアル状態3. */
		, MTKSTAT3("MC0703")
		/** マテリアル状態4. */
		, MTKSTAT4("MC0704")
		/** ポイント種別. */
		, POINTKIND("MC0801")
		/** 契約状態. */
		, CONTRTSTAT("MC0901")
		/** 預かり種別. */
		, RENTKIND("MC1001")
		/** 性別. */
		, GENDER("MC1101")
		/** 可否. */
		, PROSCONS("MC9001")
		/** 要不要. */
		, NEEDUNNEC("MC9002")
		/** 有無. */
		, PRESENCE("MC9003");
		/** 種別コード返却用. */
		private String name;
	    /**
	     * Sets the MCodeKind.
	     *
	     * @param prmName the MCodeKind
	     */
		MCodeKind(final String prmName) { this.name = prmName; }
		/**
	     * Returns the MCodeKind.
	     *
	     * @return MCodeKinde
	     */
		public String getName() { return name; }
	}

	/**
	 *  ID種別定義.<BR>
	 *  各ＩＤの先頭につける接頭語
	 *  この接頭語を含め20文字以内とする
	 */
	public enum IdKind {
		/** ロケーション. */
		LOCATION("loc")
		/** ユーザステータス. */
		, BOX("box")
		/** 性別. */
		, MATERIAL("mat")
		/** 組織ステータス. */
		, AGREEMENT("agr")
		/** 組織種別. */
		, TRADING("trd")
		/** ロケーション種別. */
		, SETTLEMENT("set");
		/** ID種別返却用. */
		private String name;
	    /**
	     * Sets the IdKind.
	     *
	     * @param prmName the IdKind
	     */
		IdKind(final String prmName) { this.name = prmName; }
		/**
	     * Returns the IdKind.
	     *
	     * @return IdKind
	     */
		public String getName() { return name; }
	}

	/** 削除フラグ定義. */
	public enum DefDelFlg {
		/** 未削除. */
		NOTDEL("0")
		/** 削除済. */
		, DEL("1");

		/** DEL返却用. */
		private String val;
	    /**
	     * Sets the DefDelFlg.
	     *
	     * @param prmVal the DefDelFlg
	     */
		DefDelFlg(final String prmVal) { this.val = prmVal; }
		/**
	     * Returns the MCodeKind.
	     *
	     * @return MCodeKinde
	     */
		public String getVal() { return val; }
	}

	/** 管理者フラグ定義. */
	public enum DefAdminFlg {
		/** 非管理者. */
		NORMAL("0")
		/** 管理者. */
		, ADMIN("1");

		/** 管理者フラグ返却用. */
		private String val;
	    /**
	     * Sets the DefAdminFlg.
	     *
	     * @param prmVal the DefAdminFlg
	     */
		DefAdminFlg(final String prmVal) { this.val = prmVal; }
		/**
	     * Returns the DefAdminFlg.
	     *
	     * @return DefAdminFlg
	     */
		public String getVal() { return val; }
	}

	/** ロケーション種別（パブリック）. */
	public static final String LOCATIONKINDPUBLIC = "01";

	/** ロケーション種別（プライベート）. */
	public static final String LOCATIONKINDPRIVATE = "02";

	/** ボックス種別（パブリック）. */
	public static final String BOXKINDPUBLIC = "01";

	/** ボックス種別（プライベート）. */
	public static final String BOXKINDPRIVATE = "02";

	/** マテリアル種別１（パブリック）. */
	public static final String MATERIALKINDPUBLIC = "01";

	/** マテリアル種別１（プライベート）. */
	public static final String MATERIALKINDPRIVATE = "02";

	/** 標準ロケーション. */
	public static final String DEFAULTLOCALE = "ja";

	/** チェックボックス(String) ON. */
	public static final String CHECKON = "on";

	/** チェックボックス(String) OFF. */
	public static final String CHECKOFF = "off";

	/** チェックボックス(boolean) ON. */
	public static final boolean BCHECKON = true;

	/** チェックボックス(boolean) OFF. */
	public static final boolean BCHECKOFF = false;


	/**
	 *  画面表示定義.
	 */

	/** ロケーション種別表示 非公開. */
	public static final String LOCPRIVATE = "非公開";

	/** ロケーション種別表示 公開. */
	public static final String LOCPUBLIC = "公開";

	/** ボックス種別表示 非公開. */
	public static final String BOXPRIVATE = "非公開";

	/** ボックス種別表示 公開. */
	public static final String BOXPUBLIC = "公開";


	/**
	 *  画面入力制御定義.
	 */

	/** 氏名 最大文字列長. */
	public static final int USERNAMEKNJMAX = 80;
	/** 氏名（かな）最大文字列長. */
	public static final int USERNAMEKANAMAX = 80;
	/** ニックネーム最大文字列長. */
	public static final int USERNAMENICKMAX = 80;
	/** メールアドレス最大文字列長. */
	public static final int MAILADDRMAX = 80;
	/** パスワード最小文字列長. */
	public static final int PASSWORDMIN = 5;
	/** パスワード最大文字列長. */
	public static final int PASSWORDMAX = 16;
	/** 電話番号（固定）. */
	public static final int TELKOTEIMAX = 12;
	/** 電話番号（携帯）. */
	public static final int TELKEITAIMAX = 13;
	/** 備考. */
	public static final int BIKOMAX = 250;


	/** ユーザID 最大文字列長. */
	public static final int USERIDMAX = 20;
	/** メッセージタイトル 最大文字列長. */
	public static final int MSGTITLEMAX = 250;
	/** テキストメッセージ 最大文字列長. */
	public static final int TXTMSGMAX = 1024;

	/** 組織ID　最大文字列長. */
	public static final int STRCTIDMAX = 20;
	/** 組織名（漢字）最大文字列長. */
	public static final int STRCTNMMAX = 80;
	/** 組織名（かな）最大文字列長. */
	public static final int STRCTNMKANAMAX = 80;
	/** 組織名（通称）最大文字列長. */
	public static final int STRCTNMNICKMAX = 80;


	/** ロケーションID　最大文字列長. */
	public static final int LOCIDMAX = 20;
	/** ロケーション名　最大文字列長. */
	public static final int LOCNMMAX = 20;
	/** 住所最大文字列長. */
	public static final int ADDRMAX = 250;
	/** 送付先最大文字列長. */
	public static final int RECIPMAX = 20;

	/** 追加タグA. */
	public static final int TAGAMAX = 256;
	/** 追加タグB. */
	public static final int TAGBMAX = 256;

	/** ボックスID　最大文字列長. */
	public static final int BOXIDMAX = 20;

	/** ボックス名　最大文字列長. */
	public static final int BOXNMMAX = 20;

	/** 容量種別　最大文字列長. */
	public static final int CAPAINDMAX = 4;

	/** マテリアルID　最大文字列長. */
	public static final int MATERIALIDMAX = 20;

	/** マテリアル名　最大文字列長. */
	public static final int MATERIALNMMAX = 20;

}
