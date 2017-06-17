package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:21.067+0900")
public class MStructAccDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.MStructAccDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    /** */
    public MStructAccDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public MStructAccDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public MStructAccDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected MStructAccDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected MStructAccDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected MStructAccDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public java.util.List<org.x.material.entity.MStructAcc> selectByAccIdWithInsideMatching(java.lang.String accId, org.seasar.doma.jdbc.SelectOptions options) {
        entering("org.x.material.dao.impl.MStructAccDaoImpl", "selectByAccIdWithInsideMatching", accId, options);
        try {
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MStructAccDao/selectByAccIdWithInsideMatching.sql");
            __query.setOptions(options);
            __query.addParameter("accId", java.lang.String.class, accId);
            __query.setCallerClassName("org.x.material.dao.impl.MStructAccDaoImpl");
            __query.setCallerMethodName("selectByAccIdWithInsideMatching");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MStructAcc>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MStructAcc>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.MStructAcc>(org.x.material.entity._MStructAcc.getSingletonInternal()));
            java.util.List<org.x.material.entity.MStructAcc> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MStructAccDaoImpl", "selectByAccIdWithInsideMatching", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MStructAccDaoImpl", "selectByAccIdWithInsideMatching", __e);
            throw __e;
        }
    }

    @Override
    public org.x.material.entity.MStructAcc selectByStrctIdAndAccId(java.lang.String srcStrctId, java.lang.String accId) {
        entering("org.x.material.dao.impl.MStructAccDaoImpl", "selectByStrctIdAndAccId", srcStrctId, accId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MStructAccDao/selectByStrctIdAndAccId.sql");
            __query.addParameter("srcStrctId", java.lang.String.class, srcStrctId);
            __query.addParameter("accId", java.lang.String.class, accId);
            __query.setCallerClassName("org.x.material.dao.impl.MStructAccDaoImpl");
            __query.setCallerMethodName("selectByStrctIdAndAccId");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MStructAcc> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MStructAcc>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.x.material.entity.MStructAcc>(org.x.material.entity._MStructAcc.getSingletonInternal()));
            org.x.material.entity.MStructAcc __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MStructAccDaoImpl", "selectByStrctIdAndAccId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MStructAccDaoImpl", "selectByStrctIdAndAccId", __e);
            throw __e;
        }
    }

}
