package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:21.019+0900")
public class MAccountAccountBlockDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.MAccountAccountBlockDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    /** */
    public MAccountAccountBlockDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public MAccountAccountBlockDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public MAccountAccountBlockDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected MAccountAccountBlockDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected MAccountAccountBlockDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected MAccountAccountBlockDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public java.util.List<org.x.material.entity.MAccountAccountBlock> selectByAccont(java.lang.String srcAccId) {
        entering("org.x.material.dao.impl.MAccountAccountBlockDaoImpl", "selectByAccont", srcAccId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MAccountAccountBlockDao/selectByAccont.sql");
            __query.addParameter("srcAccId", java.lang.String.class, srcAccId);
            __query.setCallerClassName("org.x.material.dao.impl.MAccountAccountBlockDaoImpl");
            __query.setCallerMethodName("selectByAccont");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MAccountAccountBlock>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MAccountAccountBlock>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.MAccountAccountBlock>(org.x.material.entity._MAccountAccountBlock.getSingletonInternal()));
            java.util.List<org.x.material.entity.MAccountAccountBlock> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MAccountAccountBlockDaoImpl", "selectByAccont", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MAccountAccountBlockDaoImpl", "selectByAccont", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.MAccountAccountBlock> selectByAccountWithInsideMatching(java.lang.String srcAccId, org.seasar.doma.jdbc.SelectOptions options) {
        entering("org.x.material.dao.impl.MAccountAccountBlockDaoImpl", "selectByAccountWithInsideMatching", srcAccId, options);
        try {
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MAccountAccountBlockDao/selectByAccountWithInsideMatching.sql");
            __query.setOptions(options);
            __query.addParameter("srcAccId", java.lang.String.class, srcAccId);
            __query.setCallerClassName("org.x.material.dao.impl.MAccountAccountBlockDaoImpl");
            __query.setCallerMethodName("selectByAccountWithInsideMatching");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MAccountAccountBlock>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MAccountAccountBlock>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.MAccountAccountBlock>(org.x.material.entity._MAccountAccountBlock.getSingletonInternal()));
            java.util.List<org.x.material.entity.MAccountAccountBlock> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MAccountAccountBlockDaoImpl", "selectByAccountWithInsideMatching", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MAccountAccountBlockDaoImpl", "selectByAccountWithInsideMatching", __e);
            throw __e;
        }
    }

}
