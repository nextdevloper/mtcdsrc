package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:21.086+0900")
public class MCodeDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.MCodeDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    /** */
    public MCodeDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public MCodeDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public MCodeDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected MCodeDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected MCodeDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected MCodeDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public java.util.List<org.x.material.entity.MCode> selectByCodeKind(java.lang.String codeKind) {
        entering("org.x.material.dao.impl.MCodeDaoImpl", "selectByCodeKind", codeKind);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MCodeDao/selectByCodeKind.sql");
            __query.addParameter("codeKind", java.lang.String.class, codeKind);
            __query.setCallerClassName("org.x.material.dao.impl.MCodeDaoImpl");
            __query.setCallerMethodName("selectByCodeKind");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MCode>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MCode>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.MCode>(org.x.material.entity._MCode.getSingletonInternal()));
            java.util.List<org.x.material.entity.MCode> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MCodeDaoImpl", "selectByCodeKind", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MCodeDaoImpl", "selectByCodeKind", __e);
            throw __e;
        }
    }

    @Override
    public org.x.material.entity.MCode selectByCodeKindCodeId(java.lang.String codeKind, java.lang.String codeId) {
        entering("org.x.material.dao.impl.MCodeDaoImpl", "selectByCodeKindCodeId", codeKind, codeId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MCodeDao/selectByCodeKindCodeId.sql");
            __query.addParameter("codeKind", java.lang.String.class, codeKind);
            __query.addParameter("codeId", java.lang.String.class, codeId);
            __query.setCallerClassName("org.x.material.dao.impl.MCodeDaoImpl");
            __query.setCallerMethodName("selectByCodeKindCodeId");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MCode> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MCode>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.x.material.entity.MCode>(org.x.material.entity._MCode.getSingletonInternal()));
            org.x.material.entity.MCode __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MCodeDaoImpl", "selectByCodeKindCodeId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MCodeDaoImpl", "selectByCodeKindCodeId", __e);
            throw __e;
        }
    }

}
