package org.x.material.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.447+0900")
public final class _TMsgSendNews extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.x.material.entity.TMsgSendNews> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _TMsgSendNews __singleton = new _TMsgSendNews();

    private final org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinSequenceIdGenerator();
    {
        __idGenerator.setQualifiedSequenceName("mtcddb.t_msg_send_news_msg_no_seq");
        __idGenerator.setInitialValue(1);
        __idGenerator.setAllocationSize(1);
        __idGenerator.initialize();
    }

    /** the accId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.String, java.lang.Object> $accId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.String, java.lang.Object>(org.x.material.entity.TMsgSendNews.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "accId", "acc_id", true, true);

    /** the accIdSend */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.String, java.lang.Object> $accIdSend = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.String, java.lang.Object>(org.x.material.entity.TMsgSendNews.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "accIdSend", "acc_id_send", true, true);

    /** the defaultLocale */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.String, java.lang.Object> $defaultLocale = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.String, java.lang.Object>(org.x.material.entity.TMsgSendNews.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "defaultLocale", "default_locale", true, true);

    /** the delFlg */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.String, java.lang.Object> $delFlg = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.String, java.lang.Object>(org.x.material.entity.TMsgSendNews.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "delFlg", "del_flg", true, true);

    /** the exCnt */
    public final org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.math.BigDecimal, java.lang.Object> $exCnt = new org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.math.BigDecimal, java.lang.Object>(org.x.material.entity.TMsgSendNews.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "exCnt", "ex_cnt");

    /** the insAcc */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.String, java.lang.Object> $insAcc = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.String, java.lang.Object>(org.x.material.entity.TMsgSendNews.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "insAcc", "ins_acc", true, true);

    /** the insDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.util.Date, java.lang.Object> $insDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.util.Date, java.lang.Object>(org.x.material.entity.TMsgSendNews.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "insDate", "ins_date", true, true);

    /** the msgNo */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.Long, java.lang.Object> $msgNo = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.Long, java.lang.Object>(org.x.material.entity.TMsgSendNews.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "msgNo", "msg_no", __idGenerator);

    /** the msgNote */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.String, java.lang.Object> $msgNote = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.String, java.lang.Object>(org.x.material.entity.TMsgSendNews.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "msgNote", "msg_note", true, true);

    /** the msgTitle */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.String, java.lang.Object> $msgTitle = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.String, java.lang.Object>(org.x.material.entity.TMsgSendNews.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "msgTitle", "msg_title", true, true);

    /** the updAcc */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.String, java.lang.Object> $updAcc = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.lang.String, java.lang.Object>(org.x.material.entity.TMsgSendNews.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "updAcc", "upd_acc", true, true);

    /** the updDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.util.Date, java.lang.Object> $updDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, java.util.Date, java.lang.Object>(org.x.material.entity.TMsgSendNews.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "updDate", "upd_date", true, true);

    private final org.x.material.entity.TMsgSendNewsListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TMsgSendNews, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TMsgSendNews, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TMsgSendNews, ?>> __entityPropertyTypeMap;

    private _TMsgSendNews() {
        __listener = new org.x.material.entity.TMsgSendNewsListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "TMsgSendNews";
        __catalogName = "";
        __schemaName = "";
        __tableName = "t_msg_send_news";
        __qualifiedTableName = "t_msg_send_news";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TMsgSendNews, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TMsgSendNews, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TMsgSendNews, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TMsgSendNews, ?>>(12);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TMsgSendNews, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TMsgSendNews, ?>>(12);
        __list.add($accId);
        __map.put("accId", $accId);
        __list.add($accIdSend);
        __map.put("accIdSend", $accIdSend);
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
        __idList.add($msgNo);
        __list.add($msgNo);
        __map.put("msgNo", $msgNo);
        __list.add($msgNote);
        __map.put("msgNote", $msgNote);
        __list.add($msgTitle);
        __map.put("msgTitle", $msgTitle);
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
    public void preInsert(org.x.material.entity.TMsgSendNews entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.x.material.entity.TMsgSendNews> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.x.material.entity.TMsgSendNews entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.x.material.entity.TMsgSendNews> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.x.material.entity.TMsgSendNews entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.x.material.entity.TMsgSendNews> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.x.material.entity.TMsgSendNews entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.x.material.entity.TMsgSendNews> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.x.material.entity.TMsgSendNews entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.x.material.entity.TMsgSendNews> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.x.material.entity.TMsgSendNews entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.x.material.entity.TMsgSendNews> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TMsgSendNews, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TMsgSendNews, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.TMsgSendNews, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, ?, ?> getGeneratedIdPropertyType() {
        return $msgNo;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.TMsgSendNews, ?, ?> getVersionPropertyType() {
        return $exCnt;
    }

    @Override
    public org.x.material.entity.TMsgSendNews newEntity() {
        return new org.x.material.entity.TMsgSendNews();
    }

    @Override
    public org.x.material.entity.TMsgSendNews newEntity(java.util.Map<String, Object> __args) {
        return new org.x.material.entity.TMsgSendNews();
    }

    @Override
    public Class<org.x.material.entity.TMsgSendNews> getEntityClass() {
        return org.x.material.entity.TMsgSendNews.class;
    }

    @Override
    public org.x.material.entity.TMsgSendNews getOriginalStates(org.x.material.entity.TMsgSendNews __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.x.material.entity.TMsgSendNews __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TMsgSendNews getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TMsgSendNews newInstance() {
        return new _TMsgSendNews();
    }

}
