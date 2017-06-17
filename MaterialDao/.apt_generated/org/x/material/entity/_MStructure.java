package org.x.material.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.119+0900")
public final class _MStructure extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.x.material.entity.MStructure> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _MStructure __singleton = new _MStructure();

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("mtcddb.m_account_rec_id_seq");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the defaultLocale */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object> $defaultLocale = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object>(org.x.material.entity.MStructure.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "defaultLocale", "default_locale", true, true);

    /** the delFlg */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object> $delFlg = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object>(org.x.material.entity.MStructure.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "delFlg", "del_flg", true, true);

    /** the exCnt */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.math.BigDecimal, java.lang.Object> $exCnt = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.math.BigDecimal, java.lang.Object>(org.x.material.entity.MStructure.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "exCnt", "ex_cnt");

    /** the insAcc */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object> $insAcc = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object>(org.x.material.entity.MStructure.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "insAcc", "ins_acc", true, true);

    /** the insDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.util.Date, java.lang.Object> $insDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.util.Date, java.lang.Object>(org.x.material.entity.MStructure.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "insDate", "ins_date", true, true);

    /** the mailaddress */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object> $mailaddress = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object>(org.x.material.entity.MStructure.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "mailaddress", "mailaddress", true, true);

    /** the note */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object> $note = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object>(org.x.material.entity.MStructure.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "note", "note", true, true);

    /** the password */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object> $password = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object>(org.x.material.entity.MStructure.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "password", "password", true, true);

    /** the recId */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.Long, java.lang.Object> $recId = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.Long, java.lang.Object>(org.x.material.entity.MStructure.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "recId", "rec_id", __idGenerator);

    /** the strctId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object> $strctId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object>(org.x.material.entity.MStructure.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "strctId", "strct_id", true, true);

    /** the structKind */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object> $structKind = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object>(org.x.material.entity.MStructure.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "structKind", "struct_kind", true, true);

    /** the structNm */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object> $structNm = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object>(org.x.material.entity.MStructure.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "structNm", "struct_nm", true, true);

    /** the structNmKana */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object> $structNmKana = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object>(org.x.material.entity.MStructure.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "structNmKana", "struct_nm_kana", true, true);

    /** the structNmNick */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object> $structNmNick = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object>(org.x.material.entity.MStructure.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "structNmNick", "struct_nm_nick", true, true);

    /** the structStat */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object> $structStat = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object>(org.x.material.entity.MStructure.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "structStat", "struct_stat", true, true);

    /** the tel1 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object> $tel1 = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object>(org.x.material.entity.MStructure.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "tel1", "tel1", true, true);

    /** the tel2 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object> $tel2 = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object>(org.x.material.entity.MStructure.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "tel2", "tel2", true, true);

    /** the updAcc */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object> $updAcc = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.lang.String, java.lang.Object>(org.x.material.entity.MStructure.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updAcc", "upd_acc", true, true);

    /** the updDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.util.Date, java.lang.Object> $updDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MStructure, java.util.Date, java.lang.Object>(org.x.material.entity.MStructure.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "updDate", "upd_date", true, true);

    private final org.x.material.entity.MStructureListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructure, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructure, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructure, ?>> __entityPropertyTypeMap;

    private _MStructure() {
        __listener = new org.x.material.entity.MStructureListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "MStructure";
        __catalogName = "";
        __schemaName = "";
        __tableName = "m_structure";
        __qualifiedTableName = "m_structure";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructure, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructure, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructure, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructure, ?>>(19);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructure, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructure, ?>>(19);
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
    public void preInsert(org.x.material.entity.MStructure entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.x.material.entity.MStructure> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.x.material.entity.MStructure entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.x.material.entity.MStructure> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.x.material.entity.MStructure entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.x.material.entity.MStructure> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.x.material.entity.MStructure entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.x.material.entity.MStructure> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.x.material.entity.MStructure entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.x.material.entity.MStructure> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.x.material.entity.MStructure entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.x.material.entity.MStructure> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructure, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructure, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MStructure, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.MStructure, ?, ?> getGeneratedIdPropertyType() {
        return $recId;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.MStructure, ?, ?> getVersionPropertyType() {
        return $exCnt;
    }

    @Override
    public org.x.material.entity.MStructure newEntity() {
        return new org.x.material.entity.MStructure();
    }

    @Override
    public org.x.material.entity.MStructure newEntity(java.util.Map<String, Object> __args) {
        return new org.x.material.entity.MStructure();
    }

    @Override
    public Class<org.x.material.entity.MStructure> getEntityClass() {
        return org.x.material.entity.MStructure.class;
    }

    @Override
    public org.x.material.entity.MStructure getOriginalStates(org.x.material.entity.MStructure __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.x.material.entity.MStructure __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MStructure getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MStructure newInstance() {
        return new _MStructure();
    }

}
