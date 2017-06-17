package org.x.material.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:18.970+0900")
public final class _MCode extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.x.material.entity.MCode> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _MCode __singleton = new _MCode();

    /** the codeId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object> $codeId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object>(org.x.material.entity.MCode.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "codeId", "code_id");

    /** the codeKind */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object> $codeKind = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object>(org.x.material.entity.MCode.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "codeKind", "code_kind");

    /** the codeKindNm */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object> $codeKindNm = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object>(org.x.material.entity.MCode.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "codeKindNm", "code_kind_nm", true, true);

    /** the codeNm */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object> $codeNm = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object>(org.x.material.entity.MCode.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "codeNm", "code_nm", true, true);

    /** the codeNmr */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object> $codeNmr = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object>(org.x.material.entity.MCode.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "codeNmr", "code_nmr", true, true);

    /** the displayNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.math.BigDecimal, java.lang.Object> $displayNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.math.BigDecimal, java.lang.Object>(org.x.material.entity.MCode.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "displayNo", "display_no", true, true);

    /** the note */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object> $note = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object>(org.x.material.entity.MCode.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "note", "note", true, true);

    /** the recId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.Long, java.lang.Object> $recId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.Long, java.lang.Object>(org.x.material.entity.MCode.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "recId", "rec_id", true, true);

    /** the text1 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object> $text1 = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object>(org.x.material.entity.MCode.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "text1", "text1", true, true);

    /** the text2 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object> $text2 = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object>(org.x.material.entity.MCode.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "text2", "text2", true, true);

    /** the text3 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object> $text3 = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.lang.String, java.lang.Object>(org.x.material.entity.MCode.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "text3", "text3", true, true);

    /** the value1 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.math.BigDecimal, java.lang.Object> $value1 = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.math.BigDecimal, java.lang.Object>(org.x.material.entity.MCode.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "value1", "value1", true, true);

    /** the value2 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.math.BigDecimal, java.lang.Object> $value2 = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.math.BigDecimal, java.lang.Object>(org.x.material.entity.MCode.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "value2", "value2", true, true);

    /** the value3 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.math.BigDecimal, java.lang.Object> $value3 = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MCode, java.math.BigDecimal, java.lang.Object>(org.x.material.entity.MCode.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "value3", "value3", true, true);

    private final org.x.material.entity.MCodeListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MCode, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MCode, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MCode, ?>> __entityPropertyTypeMap;

    private _MCode() {
        __listener = new org.x.material.entity.MCodeListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "MCode";
        __catalogName = "";
        __schemaName = "";
        __tableName = "m_code";
        __qualifiedTableName = "m_code";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MCode, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MCode, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MCode, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MCode, ?>>(14);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MCode, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MCode, ?>>(14);
        __idList.add($codeId);
        __list.add($codeId);
        __map.put("codeId", $codeId);
        __idList.add($codeKind);
        __list.add($codeKind);
        __map.put("codeKind", $codeKind);
        __list.add($codeKindNm);
        __map.put("codeKindNm", $codeKindNm);
        __list.add($codeNm);
        __map.put("codeNm", $codeNm);
        __list.add($codeNmr);
        __map.put("codeNmr", $codeNmr);
        __list.add($displayNo);
        __map.put("displayNo", $displayNo);
        __list.add($note);
        __map.put("note", $note);
        __list.add($recId);
        __map.put("recId", $recId);
        __list.add($text1);
        __map.put("text1", $text1);
        __list.add($text2);
        __map.put("text2", $text2);
        __list.add($text3);
        __map.put("text3", $text3);
        __list.add($value1);
        __map.put("value1", $value1);
        __list.add($value2);
        __map.put("value2", $value2);
        __list.add($value3);
        __map.put("value3", $value3);
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
    public void preInsert(org.x.material.entity.MCode entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.x.material.entity.MCode> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.x.material.entity.MCode entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.x.material.entity.MCode> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.x.material.entity.MCode entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.x.material.entity.MCode> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.x.material.entity.MCode entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.x.material.entity.MCode> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.x.material.entity.MCode entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.x.material.entity.MCode> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.x.material.entity.MCode entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.x.material.entity.MCode> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MCode, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MCode, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MCode, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.MCode, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.MCode, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.x.material.entity.MCode newEntity() {
        return new org.x.material.entity.MCode();
    }

    @Override
    public org.x.material.entity.MCode newEntity(java.util.Map<String, Object> __args) {
        return new org.x.material.entity.MCode();
    }

    @Override
    public Class<org.x.material.entity.MCode> getEntityClass() {
        return org.x.material.entity.MCode.class;
    }

    @Override
    public org.x.material.entity.MCode getOriginalStates(org.x.material.entity.MCode __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.x.material.entity.MCode __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MCode getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MCode newInstance() {
        return new _MCode();
    }

}
