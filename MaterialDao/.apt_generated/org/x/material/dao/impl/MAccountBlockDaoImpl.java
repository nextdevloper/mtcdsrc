package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:21.014+0900")
public class MAccountBlockDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.MAccountBlockDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MAccountBlockDao.class, "delete", org.x.material.entity.MAccountBlock.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MAccountBlockDao.class, "insert", org.x.material.entity.MAccountBlock.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MAccountBlockDao.class, "update", org.x.material.entity.MAccountBlock.class);

    /** */
    public MAccountBlockDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public MAccountBlockDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public MAccountBlockDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected MAccountBlockDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected MAccountBlockDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected MAccountBlockDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int delete(org.x.material.entity.MAccountBlock mAccountBlock) {
        entering("org.x.material.dao.impl.MAccountBlockDaoImpl", "delete", mAccountBlock);
        try {
            if (mAccountBlock == null) {
                throw new org.seasar.doma.DomaNullPointerException("mAccountBlock");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<org.x.material.entity.MAccountBlock> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<org.x.material.entity.MAccountBlock>(org.x.material.entity._MAccountBlock.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(mAccountBlock);
            __query.setCallerClassName("org.x.material.dao.impl.MAccountBlockDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MAccountBlockDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MAccountBlockDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int insert(org.x.material.entity.MAccountBlock mAccountBlock) {
        entering("org.x.material.dao.impl.MAccountBlockDaoImpl", "insert", mAccountBlock);
        try {
            if (mAccountBlock == null) {
                throw new org.seasar.doma.DomaNullPointerException("mAccountBlock");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.MAccountBlock> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.MAccountBlock>(org.x.material.entity._MAccountBlock.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setEntity(mAccountBlock);
            __query.setCallerClassName("org.x.material.dao.impl.MAccountBlockDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MAccountBlockDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MAccountBlockDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.MAccountBlock> selectByaccId(java.lang.String accId) {
        entering("org.x.material.dao.impl.MAccountBlockDaoImpl", "selectByaccId", accId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MAccountBlockDao/selectByaccId.sql");
            __query.addParameter("accId", java.lang.String.class, accId);
            __query.setCallerClassName("org.x.material.dao.impl.MAccountBlockDaoImpl");
            __query.setCallerMethodName("selectByaccId");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MAccountBlock>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MAccountBlock>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.MAccountBlock>(org.x.material.entity._MAccountBlock.getSingletonInternal()));
            java.util.List<org.x.material.entity.MAccountBlock> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MAccountBlockDaoImpl", "selectByaccId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MAccountBlockDaoImpl", "selectByaccId", __e);
            throw __e;
        }
    }

    @Override
    public org.x.material.entity.MAccountBlock selectByaccIdblockId(java.lang.String accId, java.lang.String accIdBlock) {
        entering("org.x.material.dao.impl.MAccountBlockDaoImpl", "selectByaccIdblockId", accId, accIdBlock);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MAccountBlockDao/selectByaccIdblockId.sql");
            __query.addParameter("accId", java.lang.String.class, accId);
            __query.addParameter("accIdBlock", java.lang.String.class, accIdBlock);
            __query.setCallerClassName("org.x.material.dao.impl.MAccountBlockDaoImpl");
            __query.setCallerMethodName("selectByaccIdblockId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MAccountBlock> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MAccountBlock>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.x.material.entity.MAccountBlock>(org.x.material.entity._MAccountBlock.getSingletonInternal()));
            org.x.material.entity.MAccountBlock __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MAccountBlockDaoImpl", "selectByaccIdblockId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MAccountBlockDaoImpl", "selectByaccIdblockId", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.x.material.entity.MAccountBlock mAccountBlock) {
        entering("org.x.material.dao.impl.MAccountBlockDaoImpl", "update", mAccountBlock);
        try {
            if (mAccountBlock == null) {
                throw new org.seasar.doma.DomaNullPointerException("mAccountBlock");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.MAccountBlock> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.MAccountBlock>(org.x.material.entity._MAccountBlock.getSingletonInternal());
            __query.setMethod(__method4);
            __query.setConfig(config);
            __query.setEntity(mAccountBlock);
            __query.setCallerClassName("org.x.material.dao.impl.MAccountBlockDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MAccountBlockDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MAccountBlockDaoImpl", "update", __e);
            throw __e;
        }
    }

}
