package org.x.material.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.411+0900")
public final class _TBoxCntrctMove extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.x.material.entity.TBoxCntrctMove> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _TBoxCntrctMove __singleton = new _TBoxCntrctMove();

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("mtcddb.m_account_rec_id_seq");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the cntrctId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.String, java.lang.Object> $cntrctId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "cntrctId", "cntrct_id", true, true);

    /** the contrctStat */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.String, java.lang.Object> $contrctStat = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "contrctStat", "contrct_stat", true, true);

    /** the defaultLocale */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.String, java.lang.Object> $defaultLocale = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "defaultLocale", "default_locale", true, true);

    /** the delFlg */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.String, java.lang.Object> $delFlg = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "delFlg", "del_flg", true, true);

    /** the exCnt */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.math.BigDecimal, java.lang.Object> $exCnt = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.math.BigDecimal, java.lang.Object>(org.x.material.entity.TBoxCntrctMove.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "exCnt", "ex_cnt");

    /** the insAcc */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.String, java.lang.Object> $insAcc = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "insAcc", "ins_acc", true, true);

    /** the insDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.sql.Timestamp, java.lang.Object> $insDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.sql.Timestamp, java.lang.Object>(org.x.material.entity.TBoxCntrctMove.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "insDate", "ins_date", true, true);

    /** the moveFeeStat */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.String, java.lang.Object> $moveFeeStat = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "moveFeeStat", "move_fee_stat", true, true);

    /** the recId */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.Long, java.lang.Object> $recId = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.Long, java.lang.Object>(org.x.material.entity.TBoxCntrctMove.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "recId", "rec_id", __idGenerator);

    /** the tradeId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.String, java.lang.Object> $tradeId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "tradeId", "trade_id", true, true);

    /** the updAcc */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.String, java.lang.Object> $updAcc = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctMove.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updAcc", "upd_acc", true, true);

    /** the updDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.sql.Timestamp, java.lang.Object> $updDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, java.sql.Timestamp, java.lang.Object>(org.x.material.entity.TBoxCntrctMove.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "updDate", "upd_date", true, true);

    private final org.x.material.entity.TBoxCntrctMoveListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctMove, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctMove, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctMove, ?>> __entityPropertyTypeMap;

    private _TBoxCntrctMove() {
        __listener = new org.x.material.entity.TBoxCntrctMoveListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "TBoxCntrctMove";
        __catalogName = "";
        __schemaName = "";
        __tableName = "t_box_cntrct_move";
        __qualifiedTableName = "t_box_cntrct_move";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctMove, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctMove, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctMove, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctMove, ?>>(12);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctMove, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctMove, ?>>(12);
        __list.add($cntrctId);
        __map.put("cntrctId", $cntrctId);
        __list.add($contrctStat);
        __map.put("contrctStat", $contrctStat);
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
        __list.add($moveFeeStat);
        __map.put("moveFeeStat", $moveFeeStat);
        __idList.add($recId);
        __list.add($recId);
        __map.put("recId", $recId);
        __list.add($tradeId);
        __map.put("tradeId", $tradeId);
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
    public void preInsert(org.x.material.entity.TBoxCntrctMove entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.x.material.entity.TBoxCntrctMove> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.x.material.entity.TBoxCntrctMove entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.x.material.entity.TBoxCntrctMove> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.x.material.entity.TBoxCntrctMove entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.x.material.entity.TBoxCntrctMove> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.x.material.entity.TBoxCntrctMove entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.x.material.entity.TBoxCntrctMove> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.x.material.entity.TBoxCntrctMove entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.x.material.entity.TBoxCntrctMove> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.x.material.entity.TBoxCntrctMove entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.x.material.entity.TBoxCntrctMove> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctMove, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctMove, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctMove, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, ?, ?> getGeneratedIdPropertyType() {
        return $recId;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctMove, ?, ?> getVersionPropertyType() {
        return $exCnt;
    }

    @Override
    public org.x.material.entity.TBoxCntrctMove newEntity() {
        return new org.x.material.entity.TBoxCntrctMove();
    }

    @Override
    public org.x.material.entity.TBoxCntrctMove newEntity(java.util.Map<String, Object> __args) {
        return new org.x.material.entity.TBoxCntrctMove();
    }

    @Override
    public Class<org.x.material.entity.TBoxCntrctMove> getEntityClass() {
        return org.x.material.entity.TBoxCntrctMove.class;
    }

    @Override
    public org.x.material.entity.TBoxCntrctMove getOriginalStates(org.x.material.entity.TBoxCntrctMove __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.x.material.entity.TBoxCntrctMove __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TBoxCntrctMove getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TBoxCntrctMove newInstance() {
        return new _TBoxCntrctMove();
    }

}
