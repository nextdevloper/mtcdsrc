package org.x.material.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.275+0900")
public final class _MBoxMaterial extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.x.material.entity.MBoxMaterial> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _MBoxMaterial __singleton = new _MBoxMaterial();

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("mtcddb.m_account_rec_id_seq");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the defaultLocale */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object> $defaultLocale = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MMaterial.getSingletonInternal().$defaultLocale, null, "defaultLocale", "default_locale", true, true);

    /** the delFlg */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object> $delFlg = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MMaterial.getSingletonInternal().$delFlg, null, "delFlg", "del_flg", true, true);

    /** the exCnt */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.math.BigDecimal, java.lang.Object> $exCnt = new org.seasar.doma.jdbc.entity.VersionPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.math.BigDecimal, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, org.x.material.entity._MMaterial.getSingletonInternal().$exCnt, null, "exCnt", "ex_cnt");

    /** the insAcc */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object> $insAcc = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MMaterial.getSingletonInternal().$insAcc, null, "insAcc", "ins_acc", true, true);

    /** the insDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.util.Date, java.lang.Object> $insDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.util.Date, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, org.x.material.entity._MMaterial.getSingletonInternal().$insDate, null, "insDate", "ins_date", true, true);

    /** the mtId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object> $mtId = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MMaterial.getSingletonInternal().$mtId, null, "mtId", "mt_id", true, true);

    /** the mtKind1 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object> $mtKind1 = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MMaterial.getSingletonInternal().$mtKind1, null, "mtKind1", "mt_kind1", true, true);

    /** the mtKind2 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object> $mtKind2 = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MMaterial.getSingletonInternal().$mtKind2, null, "mtKind2", "mt_kind2", true, true);

    /** the mtNm */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object> $mtNm = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MMaterial.getSingletonInternal().$mtNm, null, "mtNm", "mt_nm", true, true);

    /** the mtOnrId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object> $mtOnrId = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MMaterial.getSingletonInternal().$mtOnrId, null, "mtOnrId", "mt_onr_id", true, true);

    /** the recId */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.Long, java.lang.Object> $recId = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.Long, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, org.x.material.entity._MMaterial.getSingletonInternal().$recId, null, "recId", "rec_id", __idGenerator);

    /** the tagA */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object> $tagA = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MMaterial.getSingletonInternal().$tagA, null, "tagA", "tag_a", true, true);

    /** the tagB */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object> $tagB = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MMaterial.getSingletonInternal().$tagB, null, "tagB", "tag_b", true, true);

    /** the updAcc */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object> $updAcc = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, org.x.material.entity._MMaterial.getSingletonInternal().$updAcc, null, "updAcc", "upd_acc", true, true);

    /** the updDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.util.Date, java.lang.Object> $updDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, java.util.Date, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, org.x.material.entity._MMaterial.getSingletonInternal().$updDate, null, "updDate", "upd_date", true, true);

    /** the boxId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object> $boxId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "boxId", "box_id", true, true);

    /** the boxKind */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object> $boxKind = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "boxKind", "box_kind", true, true);

    /** the boxNm */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object> $boxNm = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "boxNm", "box_nm", true, true);

    /** the boxOnrId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object> $boxOnrId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxMaterial, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxMaterial.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "boxOnrId", "box_onr_id", true, true);

    private final org.x.material.entity.MBoxMaterialListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxMaterial, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxMaterial, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxMaterial, ?>> __entityPropertyTypeMap;

    private _MBoxMaterial() {
        __listener = new org.x.material.entity.MBoxMaterialListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "MBoxMaterial";
        __catalogName = "";
        __schemaName = "";
        __tableName = "MBoxMaterial";
        __qualifiedTableName = "MBoxMaterial";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxMaterial, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxMaterial, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxMaterial, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxMaterial, ?>>(19);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxMaterial, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxMaterial, ?>>(19);
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
        __list.add($mtId);
        __map.put("mtId", $mtId);
        __list.add($mtKind1);
        __map.put("mtKind1", $mtKind1);
        __list.add($mtKind2);
        __map.put("mtKind2", $mtKind2);
        __list.add($mtNm);
        __map.put("mtNm", $mtNm);
        __list.add($mtOnrId);
        __map.put("mtOnrId", $mtOnrId);
        __idList.add($recId);
        __list.add($recId);
        __map.put("recId", $recId);
        __list.add($tagA);
        __map.put("tagA", $tagA);
        __list.add($tagB);
        __map.put("tagB", $tagB);
        __list.add($updAcc);
        __map.put("updAcc", $updAcc);
        __list.add($updDate);
        __map.put("updDate", $updDate);
        __list.add($boxId);
        __map.put("boxId", $boxId);
        __list.add($boxKind);
        __map.put("boxKind", $boxKind);
        __list.add($boxNm);
        __map.put("boxNm", $boxNm);
        __list.add($boxOnrId);
        __map.put("boxOnrId", $boxOnrId);
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
    public void preInsert(org.x.material.entity.MBoxMaterial entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.x.material.entity.MBoxMaterial> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.x.material.entity.MBoxMaterial entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.x.material.entity.MBoxMaterial> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.x.material.entity.MBoxMaterial entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.x.material.entity.MBoxMaterial> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.x.material.entity.MBoxMaterial entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.x.material.entity.MBoxMaterial> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.x.material.entity.MBoxMaterial entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.x.material.entity.MBoxMaterial> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.x.material.entity.MBoxMaterial entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.x.material.entity.MBoxMaterial> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxMaterial, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxMaterial, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxMaterial, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, ?, ?> getGeneratedIdPropertyType() {
        return $recId;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<org.x.material.entity.MMaterial, org.x.material.entity.MBoxMaterial, ?, ?> getVersionPropertyType() {
        return $exCnt;
    }

    @Override
    public org.x.material.entity.MBoxMaterial newEntity() {
        return new org.x.material.entity.MBoxMaterial();
    }

    @Override
    public org.x.material.entity.MBoxMaterial newEntity(java.util.Map<String, Object> __args) {
        return new org.x.material.entity.MBoxMaterial();
    }

    @Override
    public Class<org.x.material.entity.MBoxMaterial> getEntityClass() {
        return org.x.material.entity.MBoxMaterial.class;
    }

    @Override
    public org.x.material.entity.MBoxMaterial getOriginalStates(org.x.material.entity.MBoxMaterial __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.x.material.entity.MBoxMaterial __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MBoxMaterial getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MBoxMaterial newInstance() {
        return new _MBoxMaterial();
    }

}
