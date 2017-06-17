package org.x.material.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.401+0900")
public final class _MDBEnviroment extends org.seasar.doma.jdbc.entity.AbstractEntityType<org.x.material.entity.MDBEnviroment> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _MDBEnviroment __singleton = new _MDBEnviroment();

    /** the dbKind */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MDBEnviroment, java.lang.String, java.lang.Object> $dbKind = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, org.x.material.entity.MDBEnviroment, java.lang.String, java.lang.Object>(org.x.material.entity.MDBEnviroment.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "dbKind", "db_kind", true, true);

    private final org.x.material.entity.MDBEnviromentListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MDBEnviroment, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MDBEnviroment, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MDBEnviroment, ?>> __entityPropertyTypeMap;

    private _MDBEnviroment() {
        __listener = new org.x.material.entity.MDBEnviromentListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "MDBEnviroment";
        __catalogName = "";
        __schemaName = "";
        __tableName = "MDBEnviroment";
        __qualifiedTableName = "MDBEnviroment";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MDBEnviroment, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MDBEnviroment, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MDBEnviroment, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MDBEnviroment, ?>>(1);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MDBEnviroment, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MDBEnviroment, ?>>(1);
        __list.add($dbKind);
        __map.put("dbKind", $dbKind);
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
    public void preInsert(org.x.material.entity.MDBEnviroment entity, org.seasar.doma.jdbc.entity.PreInsertContext<org.x.material.entity.MDBEnviroment> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(org.x.material.entity.MDBEnviroment entity, org.seasar.doma.jdbc.entity.PreUpdateContext<org.x.material.entity.MDBEnviroment> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(org.x.material.entity.MDBEnviroment entity, org.seasar.doma.jdbc.entity.PreDeleteContext<org.x.material.entity.MDBEnviroment> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(org.x.material.entity.MDBEnviroment entity, org.seasar.doma.jdbc.entity.PostInsertContext<org.x.material.entity.MDBEnviroment> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(org.x.material.entity.MDBEnviroment entity, org.seasar.doma.jdbc.entity.PostUpdateContext<org.x.material.entity.MDBEnviroment> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(org.x.material.entity.MDBEnviroment entity, org.seasar.doma.jdbc.entity.PostDeleteContext<org.x.material.entity.MDBEnviroment> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MDBEnviroment, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MDBEnviroment, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<org.x.material.entity.MDBEnviroment, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, org.x.material.entity.MDBEnviroment, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, org.x.material.entity.MDBEnviroment, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public org.x.material.entity.MDBEnviroment newEntity() {
        return new org.x.material.entity.MDBEnviroment();
    }

    @Override
    public org.x.material.entity.MDBEnviroment newEntity(java.util.Map<String, Object> __args) {
        return new org.x.material.entity.MDBEnviroment();
    }

    @Override
    public Class<org.x.material.entity.MDBEnviroment> getEntityClass() {
        return org.x.material.entity.MDBEnviroment.class;
    }

    @Override
    public org.x.material.entity.MDBEnviroment getOriginalStates(org.x.material.entity.MDBEnviroment __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(org.x.material.entity.MDBEnviroment __entity) {
    }

    /**
     * @return the singleton
     */
    public static _MDBEnviroment getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _MDBEnviroment newInstance() {
        return new _MDBEnviroment();
    }

}
