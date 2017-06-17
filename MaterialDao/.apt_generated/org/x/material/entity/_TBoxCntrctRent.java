package org.x.material.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.513+0900")
public final class _TBoxCntrctRent extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.x.material.entity.TBoxCntrctRent> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _TBoxCntrctRent __singleton = new _TBoxCntrctRent();

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("mtcddb.m_account_rec_id_seq");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the cntrctId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object> $cntrctId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctRent.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "cntrctId", "cntrct_id", true, true);

    /** the contrctStat */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object> $contrctStat = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctRent.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "contrctStat", "contrct_stat", true, true);

    /** the defaultLocale */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object> $defaultLocale = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctRent.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "defaultLocale", "default_locale", true, true);

    /** the delFlg */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object> $delFlg = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctRent.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "delFlg", "del_flg", true, true);

    /** the depositLenderStat */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object> $depositLenderStat = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctRent.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "depositLenderStat", "deposit_lender_stat", true, true);

    /** the depositUsageStat */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object> $depositUsageStat = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctRent.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "depositUsageStat", "deposit_usage_stat", true, true);

    /** the exCnt */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.math.BigDecimal, java.lang.Object> $exCnt = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.math.BigDecimal, java.lang.Object>(org.x.material.entity.TBoxCntrctRent.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "exCnt", "ex_cnt");

    /** the insAcc */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object> $insAcc = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctRent.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "insAcc", "ins_acc", true, true);

    /** the insDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.sql.Timestamp, java.lang.Object> $insDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.sql.Timestamp, java.lang.Object>(org.x.material.entity.TBoxCntrctRent.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "insDate", "ins_date", true, true);

    /** the recId */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.Long, java.lang.Object> $recId = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.Long, java.lang.Object>(org.x.material.entity.TBoxCntrctRent.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "recId", "rec_id", __idGenerator);

    /** the rentFeeDailyStat */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object> $rentFeeDailyStat = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctRent.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "rentFeeDailyStat", "rent_fee_daily_stat", true, true);

    /** the rentFeeInitStat */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object> $rentFeeInitStat = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctRent.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "rentFeeInitStat", "rent_fee_init_stat", true, true);

    /** the tradeId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object> $tradeId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctRent.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "tradeId", "trade_id", true, true);

    /** the updAcc */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object> $updAcc = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.lang.String, java.lang.Object>(org.x.material.entity.TBoxCntrctRent.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updAcc", "upd_acc", true, true);

    /** the updDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.sql.Timestamp, java.lang.Object> $updDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, java.sql.Timestamp, java.lang.Object>(org.x.material.entity.TBoxCntrctRent.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "updDate", "upd_date", true, true);

    private final org.x.material.entity.TBoxCntrctRentListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctRent, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctRent, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctRent, ?>> __entityPropertyTypeMap;

    private _TBoxCntrctRent() {
        __listener = new org.x.material.entity.TBoxCntrctRentListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "TBoxCntrctRent";
        __catalogName = "";
        __schemaName = "";
        __tableName = "t_box_cntrct_rent";
        __qualifiedTableName = "t_box_cntrct_rent";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctRent, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctRent, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctRent, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctRent, ?>>(15);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctRent, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctRent, ?>>(15);
        __list.add($cntrctId);
        __map.put("cntrctId", $cntrctId);
        __list.add($contrctStat);
        __map.put("contrctStat", $contrctStat);
        __list.add($defaultLocale);
        __map.put("defaultLocale", $defaultLocale);
        __list.add($delFlg);
        __map.put("delFlg", $delFlg);
        __list.add($depositLenderStat);
        __map.put("depositLenderStat", $depositLenderStat);
        __list.add($depositUsageStat);
        __map.put("depositUsageStat", $depositUsageStat);
        __list.add($exCnt);
        __map.put("exCnt", $exCnt);
        __list.add($insAcc);
        __map.put("insAcc", $insAcc);
        __list.add($insDate);
        __map.put("insDate", $insDate);
        __idList.add($recId);
        __list.add($recId);
        __map.put("recId", $recId);
        __list.add($rentFeeDailyStat);
        __map.put("rentFeeDailyStat", $rentFeeDailyStat);
        __list.add($rentFeeInitStat);
        __map.put("rentFeeInitStat", $rentFeeInitStat);
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
    public void preInsert(org.x.material.entity.TBoxCntrctRent entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.x.material.entity.TBoxCntrctRent> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.x.material.entity.TBoxCntrctRent entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.x.material.entity.TBoxCntrctRent> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.x.material.entity.TBoxCntrctRent entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.x.material.entity.TBoxCntrctRent> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.x.material.entity.TBoxCntrctRent entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.x.material.entity.TBoxCntrctRent> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.x.material.entity.TBoxCntrctRent entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.x.material.entity.TBoxCntrctRent> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.x.material.entity.TBoxCntrctRent entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.x.material.entity.TBoxCntrctRent> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctRent, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctRent, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TBoxCntrctRent, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, ?, ?> getGeneratedIdPropertyType() {
        return $recId;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.TBoxCntrctRent, ?, ?> getVersionPropertyType() {
        return $exCnt;
    }

    @Override
    public org.x.material.entity.TBoxCntrctRent newEntity() {
        return new org.x.material.entity.TBoxCntrctRent();
    }

    @Override
    public org.x.material.entity.TBoxCntrctRent newEntity(java.util.Map<String, Object> __args) {
        return new org.x.material.entity.TBoxCntrctRent();
    }

    @Override
    public Class<org.x.material.entity.TBoxCntrctRent> getEntityClass() {
        return org.x.material.entity.TBoxCntrctRent.class;
    }

    @Override
    public org.x.material.entity.TBoxCntrctRent getOriginalStates(org.x.material.entity.TBoxCntrctRent __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.x.material.entity.TBoxCntrctRent __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TBoxCntrctRent getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TBoxCntrctRent newInstance() {
        return new _TBoxCntrctRent();
    }

}
