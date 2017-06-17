package org.x.material.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.175+0900")
public final class _MAccountAccountBlock extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.x.material.entity.MAccountAccountBlock> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _MAccountAccountBlock __singleton = new _MAccountAccountBlock();

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("mtcddb.m_account_rec_id_seq");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the accId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $accId = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$accId, null, "accId", "acc_id", true, true);

    /** the accKind */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $accKind = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$accKind, null, "accKind", "acc_kind", true, true);

    /** the accNm */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $accNm = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$accNm, null, "accNm", "acc_nm", true, true);

    /** the accNmKana */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $accNmKana = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$accNmKana, null, "accNmKana", "acc_nm_kana", true, true);

    /** the accNmNick */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $accNmNick = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$accNmNick, null, "accNmNick", "acc_nm_nick", true, true);

    /** the accStat */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $accStat = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$accStat, null, "accStat", "acc_stat", true, true);

    /** the birthdate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $birthdate = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$birthdate, null, "birthdate", "birthdate", true, true);

    /** the defaultLocale */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $defaultLocale = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$defaultLocale, null, "defaultLocale", "default_locale", true, true);

    /** the delFlg */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $delFlg = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$delFlg, null, "delFlg", "del_flg", true, true);

    /** the exCnt */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.math.BigDecimal, java.lang.Object> $exCnt = new org.seasar.doma.jdbc.entity.VersionPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.math.BigDecimal, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$exCnt, null, "exCnt", "ex_cnt");

    /** the gender */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $gender = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$gender, null, "gender", "gender", true, true);

    /** the insAcc */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $insAcc = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$insAcc, null, "insAcc", "ins_acc", true, true);

    /** the insDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.util.Date, java.lang.Object> $insDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.util.Date, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$insDate, null, "insDate", "ins_date", true, true);

    /** the mailaddress */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $mailaddress = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$mailaddress, null, "mailaddress", "mailaddress", true, true);

    /** the note */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $note = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$note, null, "note", "note", true, true);

    /** the password */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $password = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$password, null, "password", "password", true, true);

    /** the recId */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.Long, java.lang.Object> $recId = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.Long, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$recId, null, "recId", "rec_id", __idGenerator);

    /** the tel1 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $tel1 = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$tel1, null, "tel1", "tel1", true, true);

    /** the tel2 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $tel2 = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$tel2, null, "tel2", "tel2", true, true);

    /** the updAcc */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object> $updAcc = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.lang.String, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$updAcc, null, "updAcc", "upd_acc", true, true);

    /** the updDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.util.Date, java.lang.Object> $updDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, java.util.Date, java.lang.Object>(org.x.material.entity.MAccountAccountBlock.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, org.x.material.entity._MAccount.getSingletonInternal().$updDate, null, "updDate", "upd_date", true, true);

    private final org.x.material.entity.MAccountAccountBlockListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MAccountAccountBlock, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MAccountAccountBlock, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MAccountAccountBlock, ?>> __entityPropertyTypeMap;

    private _MAccountAccountBlock() {
        __listener = new org.x.material.entity.MAccountAccountBlockListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "MAccountAccountBlock";
        __catalogName = "";
        __schemaName = "";
        __tableName = "MAccountAccountBlock";
        __qualifiedTableName = "MAccountAccountBlock";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MAccountAccountBlock, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MAccountAccountBlock, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MAccountAccountBlock, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MAccountAccountBlock, ?>>(21);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MAccountAccountBlock, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MAccountAccountBlock, ?>>(21);
        __list.add($accId);
        __map.put("accId", $accId);
        __list.add($accKind);
        __map.put("accKind", $accKind);
        __list.add($accNm);
        __map.put("accNm", $accNm);
        __list.add($accNmKana);
        __map.put("accNmKana", $accNmKana);
        __list.add($accNmNick);
        __map.put("accNmNick", $accNmNick);
        __list.add($accStat);
        __map.put("accStat", $accStat);
        __list.add($birthdate);
        __map.put("birthdate", $birthdate);
        __list.add($defaultLocale);
        __map.put("defaultLocale", $defaultLocale);
        __list.add($delFlg);
        __map.put("delFlg", $delFlg);
        __list.add($exCnt);
        __map.put("exCnt", $exCnt);
        __list.add($gender);
        __map.put("gender", $gender);
        __list.add($insAcc);
        __map.put("insAcc", $insAcc);
        __list.add($insDate);
        __map.put("insDate", $insDate);
        __list.add($mailaddress);
        __map.put("mailaddress", $mailaddress);
        __list.add($note);
        __map.put("note", $note);
        __list.add($password);
        __map.put("password", $password);
        __idList.add($recId);
        __list.add($recId);
        __map.put("recId", $recId);
        __list.add($tel1);
        __map.put("tel1", $tel1);
        __list.add($tel2);
        __map.put("tel2", $tel2);
        __list.add($updAcc);
        __map.put("updAcc", $updAcc);
        __list.add($updDate);
        __map.put("updDate", $updDate);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return __tableName;
    }

    @Override
    public String getQualifiedTableName() {
        return __qualifiedTableName;
    }

    @Override
    public void preInsert(org.x.material.entity.MAccountAccountBlock entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.x.material.entity.MAccountAccountBlock> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.x.material.entity.MAccountAccountBlock entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.x.material.entity.MAccountAccountBlock> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.x.material.entity.MAccountAccountBlock entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.x.material.entity.MAccountAccountBlock> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.x.material.entity.MAccountAccountBlock entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.x.material.entity.MAccountAccountBlock> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.x.material.entity.MAccountAccountBlock entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.x.material.entity.MAccountAccountBlock> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.x.material.entity.MAccountAccountBlock entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.x.material.entity.MAccountAccountBlock> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MAccountAccountBlock, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MAccountAccountBlock, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MAccountAccountBlock, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, ?, ?> getGeneratedIdPropertyType() {
        return $recId;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<org.x.material.entity.MAccount, org.x.material.entity.MAccountAccountBlock, ?, ?> getVersionPropertyType() {
        return $exCnt;
    }

    @Override
    public org.x.material.entity.MAccountAccountBlock newEntity() {
        return new org.x.material.entity.MAccountAccountBlock();
    }

    @Override
    public org.x.material.entity.MAccountAccountBlock newEntity(java.util.Map<String, Object> __args) {
        return new org.x.material.entity.MAccountAccountBlock();
    }

    @Override
    public Class<org.x.material.entity.MAccountAccountBlock> getEntityClass() {
        return org.x.material.entity.MAccountAccountBlock.class;
    }

    @Override
    public org.x.material.entity.MAccountAccountBlock getOriginalStates(org.x.material.entity.MAccountAccountBlock __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.x.material.entity.MAccountAccountBlock __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MAccountAccountBlock getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MAccountAccountBlock newInstance() {
        return new _MAccountAccountBlock();
    }

}
