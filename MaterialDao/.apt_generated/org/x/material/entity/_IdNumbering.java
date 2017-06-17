package org.x.material.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.269+0900")
public final class _IdNumbering extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.x.material.entity.IdNumbering> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _IdNumbering __singleton = new _IdNumbering();

    /** the idKind */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, org.x.material.entity.IdNumbering, java.lang.String, java.lang.Object> $idKind = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, org.x.material.entity.IdNumbering, java.lang.String, java.lang.Object>(org.x.material.entity.IdNumbering.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "idKind", "id_kind");

    /** the idNumber */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.IdNumbering, java.math.BigDecimal, java.lang.Object> $idNumber = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.IdNumbering, java.math.BigDecimal, java.lang.Object>(org.x.material.entity.IdNumbering.class, java.math.BigDecimal.class, org.seasar.doma.wrapper.BigDecimalWrapper.class, null, null, "idNumber", "id_number", true, true);

    /** the recId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.IdNumbering, java.lang.Long, java.lang.Object> $recId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.IdNumbering, java.lang.Long, java.lang.Object>(org.x.material.entity.IdNumbering.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "recId", "rec_id", true, true);

    private final org.x.material.entity.IdNumberingListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.IdNumbering, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.IdNumbering, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.IdNumbering, ?>> __entityPropertyTypeMap;

    private _IdNumbering() {
        __listener = new org.x.material.entity.IdNumberingListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "IdNumbering";
        __catalogName = "";
        __schemaName = "";
        __tableName = "id_numbering";
        __qualifiedTableName = "id_numbering";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.IdNumbering, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.IdNumbering, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.IdNumbering, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.IdNumbering, ?>>(3);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.IdNumbering, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.IdNumbering, ?>>(3);
        __idList.add($idKind);
        __list.add($idKind);
        __map.put("idKind", $idKind);
        __list.add($idNumber);
        __map.put("idNumber", $idNumber);
        __list.add($recId);
        __map.put("recId", $recId);
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
    public void preInsert(org.x.material.entity.IdNumbering entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.x.material.entity.IdNumbering> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.x.material.entity.IdNumbering entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.x.material.entity.IdNumbering> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.x.material.entity.IdNumbering entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.x.material.entity.IdNumbering> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.x.material.entity.IdNumbering entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.x.material.entity.IdNumbering> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.x.material.entity.IdNumbering entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.x.material.entity.IdNumbering> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.x.material.entity.IdNumbering entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.x.material.entity.IdNumbering> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.IdNumbering, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.IdNumbering, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.IdNumbering, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.IdNumbering, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.IdNumbering, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.x.material.entity.IdNumbering newEntity() {
        return new org.x.material.entity.IdNumbering();
    }

    @Override
    public org.x.material.entity.IdNumbering newEntity(java.util.Map<String, Object> __args) {
        return new org.x.material.entity.IdNumbering();
    }

    @Override
    public Class<org.x.material.entity.IdNumbering> getEntityClass() {
        return org.x.material.entity.IdNumbering.class;
    }

    @Override
    public org.x.material.entity.IdNumbering getOriginalStates(org.x.material.entity.IdNumbering __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.x.material.entity.IdNumbering __entity) {
    }

    /**
     * @return the singleton
     */
    public static _IdNumbering getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _IdNumbering newInstance() {
        return new _IdNumbering();
    }

}
