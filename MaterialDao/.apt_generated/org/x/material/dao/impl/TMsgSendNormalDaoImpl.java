package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.912+0900")
public class TMsgSendNormalDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.TMsgSendNormalDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.TMsgSendNormalDao.class, "delete", org.x.material.entity.TMsgSendNormal.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.TMsgSendNormalDao.class, "insert", org.x.material.entity.TMsgSendNormal.class);

    private static final java.lang.reflect.Method __method6 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.TMsgSendNormalDao.class, "update", org.x.material.entity.TMsgSendNormal.class);

    /** */
    public TMsgSendNormalDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public TMsgSendNormalDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public TMsgSendNormalDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected TMsgSendNormalDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected TMsgSendNormalDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected TMsgSendNormalDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int delete(org.x.material.entity.TMsgSendNormal entity) {
        entering("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<org.x.material.entity.TMsgSendNormal> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<org.x.material.entity.TMsgSendNormal>(org.x.material.entity._TMsgSendNormal.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendNormalDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int insert(org.x.material.entity.TMsgSendNormal entity) {
        entering("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.TMsgSendNormal> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.TMsgSendNormal>(org.x.material.entity._TMsgSendNormal.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendNormalDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.TMsgSendNormal> selectByAccId(java.lang.String accId, java.lang.String accIdSend, java.lang.Long msgNo) {
        entering("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "selectByAccId", accId, accIdSend, msgNo);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/TMsgSendNormalDao/selectByAccId.sql");
            __query.addParameter("accId", java.lang.String.class, accId);
            __query.addParameter("accIdSend", java.lang.String.class, accIdSend);
            __query.addParameter("msgNo", java.lang.Long.class, msgNo);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendNormalDaoImpl");
            __query.setCallerMethodName("selectByAccId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(100);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.TMsgSendNormal>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.TMsgSendNormal>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.TMsgSendNormal>(org.x.material.entity._TMsgSendNormal.getSingletonInternal()));
            java.util.List<org.x.material.entity.TMsgSendNormal> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "selectByAccId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "selectByAccId", __e);
            throw __e;
        }
    }

    @Override
    public org.x.material.entity.TMsgSendNormal selectById(java.lang.String accId, java.lang.String accIdSend, java.lang.Long msgNo) {
        entering("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "selectById", accId, accIdSend, msgNo);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/TMsgSendNormalDao/selectById.sql");
            __query.addParameter("accId", java.lang.String.class, accId);
            __query.addParameter("accIdSend", java.lang.String.class, accIdSend);
            __query.addParameter("msgNo", java.lang.Long.class, msgNo);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendNormalDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.TMsgSendNormal> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.TMsgSendNormal>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.x.material.entity.TMsgSendNormal>(org.x.material.entity._TMsgSendNormal.getSingletonInternal()));
            org.x.material.entity.TMsgSendNormal __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.TMsgSendNormal> selectByIdWithPeriod(java.lang.String accIdSend, java.util.Date startDate, java.util.Date endDate) {
        entering("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "selectByIdWithPeriod", accIdSend, startDate, endDate);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/TMsgSendNormalDao/selectByIdWithPeriod.sql");
            __query.addParameter("accIdSend", java.lang.String.class, accIdSend);
            __query.addParameter("startDate", java.util.Date.class, startDate);
            __query.addParameter("endDate", java.util.Date.class, endDate);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendNormalDaoImpl");
            __query.setCallerMethodName("selectByIdWithPeriod");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(100);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.TMsgSendNormal>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.TMsgSendNormal>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.TMsgSendNormal>(org.x.material.entity._TMsgSendNormal.getSingletonInternal()));
            java.util.List<org.x.material.entity.TMsgSendNormal> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "selectByIdWithPeriod", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "selectByIdWithPeriod", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.TMsgSendNormal> selectBySendId(java.lang.String accIdSend) {
        entering("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "selectBySendId", accIdSend);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/TMsgSendNormalDao/selectBySendId.sql");
            __query.addParameter("accIdSend", java.lang.String.class, accIdSend);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendNormalDaoImpl");
            __query.setCallerMethodName("selectBySendId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(100);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.TMsgSendNormal>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.TMsgSendNormal>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.TMsgSendNormal>(org.x.material.entity._TMsgSendNormal.getSingletonInternal()));
            java.util.List<org.x.material.entity.TMsgSendNormal> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "selectBySendId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "selectBySendId", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.x.material.entity.TMsgSendNormal entity) {
        entering("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.TMsgSendNormal> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.TMsgSendNormal>(org.x.material.entity._TMsgSendNormal.getSingletonInternal());
            __query.setMethod(__method6);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendNormalDaoImpl");
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
            exiting("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendNormalDaoImpl", "update", __e);
            throw __e;
        }
    }

}
