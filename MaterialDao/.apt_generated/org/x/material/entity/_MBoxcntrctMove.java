package org.x.material.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.248+0900")
public final class _MBoxcntrctMove extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.x.material.entity.MBoxcntrctMove> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _MBoxcntrctMove __singleton = new _MBoxcntrctMove();

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("mtcddb.m_account_rec_id_seq");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the boxId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object> $boxId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxcntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "boxId", "box_id", true, true);

    /** the capaKind */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object> $capaKind = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxcntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "capaKind", "capa_kind", true, true);

    /** the cntrctCarierId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object> $cntrctCarierId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxcntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "cntrctCarierId", "cntrct_carier_id", true, true);

    /** the cntrctId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object> $cntrctId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxcntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "cntrctId", "cntrct_id", true, true);

    /** the defaultLocale */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object> $defaultLocale = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxcntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "defaultLocale", "default_locale", true, true);

    /** the delFlg */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object> $delFlg = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxcntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "delFlg", "del_flg", true, true);

    /** the exCnt */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.math.BigDecimal, java.lang.Object> $exCnt = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.math.BigDecimal, java.lang.Object>(org.x.material.entity.MBoxcntrctMove.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "exCnt", "ex_cnt");

    /** the insAcc */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object> $insAcc = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxcntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "insAcc", "ins_acc", true, true);

    /** the insDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.sql.Timestamp, java.lang.Object> $insDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.sql.Timestamp, java.lang.Object>(org.x.material.entity.MBoxcntrctMove.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "insDate", "ins_date", true, true);

    /** the locId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object> $locId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxcntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "locId", "loc_id", true, true);

    /** the locIdAfter */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object> $locIdAfter = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxcntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "locIdAfter", "loc_id_after", true, true);

    /** the moveFeeAmount */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.math.BigDecimal, java.lang.Object> $moveFeeAmount = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.math.BigDecimal, java.lang.Object>(org.x.material.entity.MBoxcntrctMove.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "moveFeeAmount", "move_fee_amount", true, true);

    /** the pointKind */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object> $pointKind = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxcntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "pointKind", "point_kind", true, true);

    /** the recId */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.Long, java.lang.Object> $recId = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.Long, java.lang.Object>(org.x.material.entity.MBoxcntrctMove.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "recId", "rec_id", __idGenerator);

    /** the updAcc */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object> $updAcc = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.MBoxcntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updAcc", "upd_acc", true, true);

    /** the updDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.sql.Timestamp, java.lang.Object> $updDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, java.sql.Timestamp, java.lang.Object>(org.x.material.entity.MBoxcntrctMove.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "updDate", "upd_date", true, true);

    private final org.x.material.entity.MBoxcntrctMoveListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxcntrctMove, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxcntrctMove, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxcntrctMove, ?>> __entityPropertyTypeMap;

    private _MBoxcntrctMove() {
        __listener = new org.x.material.entity.MBoxcntrctMoveListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "MBoxcntrctMove";
        __catalogName = "";
        __schemaName = "";
        __tableName = "m_boxcntrct_move";
        __qualifiedTableName = "m_boxcntrct_move";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxcntrctMove, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxcntrctMove, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxcntrctMove, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxcntrctMove, ?>>(16);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxcntrctMove, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxcntrctMove, ?>>(16);
        __list.add($boxId);
        __map.put("boxId", $boxId);
        __list.add($capaKind);
        __map.put("capaKind", $capaKind);
        __list.add($cntrctCarierId);
        __map.put("cntrctCarierId", $cntrctCarierId);
        __list.add($cntrctId);
        __map.put("cntrctId", $cntrctId);
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
        __list.add($locId);
        __map.put("locId", $locId);
        __list.add($locIdAfter);
        __map.put("locIdAfter", $locIdAfter);
        __list.add($moveFeeAmount);
        __map.put("moveFeeAmount", $moveFeeAmount);
        __list.add($pointKind);
        __map.put("pointKind", $pointKind);
        __idList.add($recId);
        __list.add($recId);
        __map.put("recId", $recId);
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
    public void preInsert(org.x.material.entity.MBoxcntrctMove entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.x.material.entity.MBoxcntrctMove> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.x.material.entity.MBoxcntrctMove entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.x.material.entity.MBoxcntrctMove> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.x.material.entity.MBoxcntrctMove entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.x.material.entity.MBoxcntrctMove> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.x.material.entity.MBoxcntrctMove entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.x.material.entity.MBoxcntrctMove> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.x.material.entity.MBoxcntrctMove entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.x.material.entity.MBoxcntrctMove> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.x.material.entity.MBoxcntrctMove entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.x.material.entity.MBoxcntrctMove> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxcntrctMove, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxcntrctMove, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MBoxcntrctMove, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, ?, ?> getGeneratedIdPropertyType() {
        return $recId;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.MBoxcntrctMove, ?, ?> getVersionPropertyType() {
        return $exCnt;
    }

    @Override
    public org.x.material.entity.MBoxcntrctMove newEntity() {
        return new org.x.material.entity.MBoxcntrctMove();
    }

    @Override
    public org.x.material.entity.MBoxcntrctMove newEntity(java.util.Map<String, Object> __args) {
        return new org.x.material.entity.MBoxcntrctMove();
    }

    @Override
    public Class<org.x.material.entity.MBoxcntrctMove> getEntityClass() {
        return org.x.material.entity.MBoxcntrctMove.class;
    }

    @Override
    public org.x.material.entity.MBoxcntrctMove getOriginalStates(org.x.material.entity.MBoxcntrctMove __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.x.material.entity.MBoxcntrctMove __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MBoxcntrctMove getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MBoxcntrctMove newInstance() {
        return new _MBoxcntrctMove();
    }

}
