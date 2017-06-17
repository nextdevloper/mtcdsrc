package org.x.material.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.143+0900")
public final class _MStructAcc extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.x.material.entity.MStructAcc> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _MStructAcc __singleton = new _MStructAcc();

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("mtcddb.m_account_rec_id_seq");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the defaultLocale */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $defaultLocale = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$defaultLocale, null, "defaultLocale", "default_locale", true, true);

    /** the delFlg */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $delFlg = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$delFlg, null, "delFlg", "del_flg", true, true);

    /** the exCnt */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.math.BigDecimal, java.lang.Object> $exCnt = new org.seasar.doma.jdbc.entity.VersionPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.math.BigDecimal, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$exCnt, null, "exCnt", "ex_cnt");

    /** the insAcc */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $insAcc = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$insAcc, null, "insAcc", "ins_acc", true, true);

    /** the insDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.util.Date, java.lang.Object> $insDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.util.Date, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$insDate, null, "insDate", "ins_date", true, true);

    /** the mailaddress */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $mailaddress = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$mailaddress, null, "mailaddress", "mailaddress", true, true);

    /** the note */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $note = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$note, null, "note", "note", true, true);

    /** the password */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $password = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$password, null, "password", "password", true, true);

    /** the recId */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.Long, java.lang.Object> $recId = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.Long, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$recId, null, "recId", "rec_id", __idGenerator);

    /** the strctId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $strctId = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$strctId, null, "strctId", "strct_id", true, true);

    /** the structKind */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $structKind = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$structKind, null, "structKind", "struct_kind", true, true);

    /** the structNm */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $structNm = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$structNm, null, "structNm", "struct_nm", true, true);

    /** the structNmKana */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $structNmKana = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$structNmKana, null, "structNmKana", "struct_nm_kana", true, true);

    /** the structNmNick */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $structNmNick = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$structNmNick, null, "structNmNick", "struct_nm_nick", true, true);

    /** the structStat */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $structStat = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$structStat, null, "structStat", "struct_stat", true, true);

    /** the tel1 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $tel1 = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$tel1, null, "tel1", "tel1", true, true);

    /** the tel2 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $tel2 = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$tel2, null, "tel2", "tel2", true, true);

    /** the updAcc */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $updAcc = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$updAcc, null, "updAcc", "upd_acc", true, true);

    /** the updDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.util.Date, java.lang.Object> $updDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, java.util.Date, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, org.x.material.entity._MStructure.getSingletonInternal().$updDate, null, "updDate", "upd_date", true, true);

    /** the accId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $accId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "accId", "acc_id", true, true);

    /** the accKind */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $accKind = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "accKind", "acc_kind", true, true);

    /** the adminFlg */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object> $adminFlg = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructAcc, java.lang.String, java.lang.Object>(org.x.material.entity.MStructAcc.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "adminFlg", "admin_flg", true, true);

    private final org.x.material.entity.MStructAccListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructAcc, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructAcc, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructAcc, ?>> __entityPropertyTypeMap;

    private _MStructAcc() {
        __listener = new org.x.material.entity.MStructAccListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "MStructAcc";
        __catalogName = "";
        __schemaName = "";
        __tableName = "MStructAcc";
        __qualifiedTableName = "MStructAcc";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructAcc, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructAcc, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructAcc, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructAcc, ?>>(22);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructAcc, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructAcc, ?>>(22);
        __list.add($defaultLocale);
        __map.put("defaultLocale", $defaultLocale);
        __list.add($delFlg);
        __map.put("delFlg", $delFlg);
        __list.add($exCnt);
        __map.put("exCnt", $exCnt);
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
        __list.add($strctId);
        __map.put("strctId", $strctId);
        __list.add($structKind);
        __map.put("structKind", $structKind);
        __list.add($structNm);
        __map.put("structNm", $structNm);
        __list.add($structNmKana);
        __map.put("structNmKana", $structNmKana);
        __list.add($structNmNick);
        __map.put("structNmNick", $structNmNick);
        __list.add($structStat);
        __map.put("structStat", $structStat);
        __list.add($tel1);
        __map.put("tel1", $tel1);
        __list.add($tel2);
        __map.put("tel2", $tel2);
        __list.add($updAcc);
        __map.put("updAcc", $updAcc);
        __list.add($updDate);
        __map.put("updDate", $updDate);
        __list.add($accId);
        __map.put("accId", $accId);
        __list.add($accKind);
        __map.put("accKind", $accKind);
        __list.add($adminFlg);
        __map.put("adminFlg", $adminFlg);
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
    public void preInsert(org.x.material.entity.MStructAcc entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.x.material.entity.MStructAcc> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.x.material.entity.MStructAcc entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.x.material.entity.MStructAcc> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.x.material.entity.MStructAcc entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.x.material.entity.MStructAcc> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.x.material.entity.MStructAcc entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.x.material.entity.MStructAcc> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.x.material.entity.MStructAcc entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.x.material.entity.MStructAcc> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.x.material.entity.MStructAcc entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.x.material.entity.MStructAcc> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructAcc, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructAcc, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructAcc, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, ?, ?> getGeneratedIdPropertyType() {
        return $recId;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<org.x.material.entity.MStructure, org.x.material.entity.MStructAcc, ?, ?> getVersionPropertyType() {
        return $exCnt;
    }

    @Override
    public org.x.material.entity.MStructAcc newEntity() {
        return new org.x.material.entity.MStructAcc();
    }

    @Override
    public org.x.material.entity.MStructAcc newEntity(java.util.Map<String, Object> __args) {
        return new org.x.material.entity.MStructAcc();
    }

    @Override
    public Class<org.x.material.entity.MStructAcc> getEntityClass() {
        return org.x.material.entity.MStructAcc.class;
    }

    @Override
    public org.x.material.entity.MStructAcc getOriginalStates(org.x.material.entity.MStructAcc __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.x.material.entity.MStructAcc __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MStructAcc getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MStructAcc newInstance() {
        return new _MStructAcc();
    }

}
