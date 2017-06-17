package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.838+0900")
public class TMsgSendResultDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.TMsgSendResultDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.TMsgSendResultDao.class, "delete", org.x.material.entity.TMsgSendResult.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.TMsgSendResultDao.class, "insert", org.x.material.entity.TMsgSendResult.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.TMsgSendResultDao.class, "update", org.x.material.entity.TMsgSendResult.class);

    /** */
    public TMsgSendResultDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public TMsgSendResultDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public TMsgSendResultDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected TMsgSendResultDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected TMsgSendResultDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected TMsgSendResultDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int delete(org.x.material.entity.TMsgSendResult entity) {
        entering("org.x.material.dao.impl.TMsgSendResultDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<org.x.material.entity.TMsgSendResult> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<org.x.material.entity.TMsgSendResult>(org.x.material.entity._TMsgSendResult.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendResultDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendResultDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendResultDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int insert(org.x.material.entity.TMsgSendResult entity) {
        entering("org.x.material.dao.impl.TMsgSendResultDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.TMsgSendResult> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.TMsgSendResult>(org.x.material.entity._TMsgSendResult.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendResultDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendResultDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendResultDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public org.x.material.entity.TMsgSendResult selectById(java.lang.String accId, java.lang.String accIdSend, java.lang.Long msgNo) {
        entering("org.x.material.dao.impl.TMsgSendResultDaoImpl", "selectById", accId, accIdSend, msgNo);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/TMsgSendResultDao/selectById.sql");
            __query.addParameter("accId", java.lang.String.class, accId);
            __query.addParameter("accIdSend", java.lang.String.class, accIdSend);
            __query.addParameter("msgNo", java.lang.Long.class, msgNo);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendResultDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.TMsgSendResult> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.TMsgSendResult>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.x.material.entity.TMsgSendResult>(org.x.material.entity._TMsgSendResult.getSingletonInternal()));
            org.x.material.entity.TMsgSendResult __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendResultDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendResultDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.TMsgSendResult> selectByIdWithPeriod(java.lang.String accIdSend, java.util.Date startDate, java.util.Date endDate) {
        entering("org.x.material.dao.impl.TMsgSendResultDaoImpl", "selectByIdWithPeriod", accIdSend, startDate, endDate);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/TMsgSendResultDao/selectByIdWithPeriod.sql");
            __query.addParameter("accIdSend", java.lang.String.class, accIdSend);
            __query.addParameter("startDate", java.util.Date.class, startDate);
            __query.addParameter("endDate", java.util.Date.class, endDate);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendResultDaoImpl");
            __query.setCallerMethodName("selectByIdWithPeriod");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(100);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.TMsgSendResult>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.TMsgSendResult>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.TMsgSendResult>(org.x.material.entity._TMsgSendResult.getSingletonInternal()));
            java.util.List<org.x.material.entity.TMsgSendResult> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendResultDaoImpl", "selectByIdWithPeriod", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendResultDaoImpl", "selectByIdWithPeriod", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.TMsgSendResult> selectBySendId(java.lang.String accIdSend) {
        entering("org.x.material.dao.impl.TMsgSendResultDaoImpl", "selectBySendId", accIdSend);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/TMsgSendResultDao/selectBySendId.sql");
            __query.addParameter("accIdSend", java.lang.String.class, accIdSend);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendResultDaoImpl");
            __query.setCallerMethodName("selectBySendId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.TMsgSendResult>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.TMsgSendResult>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.TMsgSendResult>(org.x.material.entity._TMsgSendResult.getSingletonInternal()));
            java.util.List<org.x.material.entity.TMsgSendResult> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendResultDaoImpl", "selectBySendId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendResultDaoImpl", "selectBySendId", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.x.material.entity.TMsgSendResult entity) {
        entering("org.x.material.dao.impl.TMsgSendResultDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.TMsgSendResult> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.TMsgSendResult>(org.x.material.entity._TMsgSendResult.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendResultDaoImpl");
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
            exiting("org.x.material.dao.impl.TMsgSendResultDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendResultDaoImpl", "update", __e);
            throw __e;
        }
    }

}
