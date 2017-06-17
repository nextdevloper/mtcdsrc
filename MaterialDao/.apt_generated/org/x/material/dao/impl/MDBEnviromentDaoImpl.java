package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.983+0900")
public class MDBEnviromentDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.MDBEnviromentDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    /** */
    public MDBEnviromentDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public MDBEnviromentDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public MDBEnviromentDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected MDBEnviromentDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected MDBEnviromentDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected MDBEnviromentDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public org.x.material.entity.MDBEnviroment selectDbKind() {
        entering("org.x.material.dao.impl.MDBEnviromentDaoImpl", "selectDbKind");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MDBEnviromentDao/selectDbKind.sql");
            __query.setCallerClassName("org.x.material.dao.impl.MDBEnviromentDaoImpl");
            __query.setCallerMethodName("selectDbKind");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MDBEnviroment> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MDBEnviroment>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.x.material.entity.MDBEnviroment>(org.x.material.entity._MDBEnviroment.getSingletonInternal()));
            org.x.material.entity.MDBEnviroment __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MDBEnviromentDaoImpl", "selectDbKind", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MDBEnviromentDaoImpl", "selectDbKind", __e);
            throw __e;
        }
    }

}
