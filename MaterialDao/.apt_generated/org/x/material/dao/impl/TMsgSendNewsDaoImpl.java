package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.930+0900")
public class TMsgSendNewsDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.TMsgSendNewsDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.TMsgSendNewsDao.class, "delete", org.x.material.entity.TMsgSendNews.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.TMsgSendNewsDao.class, "insert", org.x.material.entity.TMsgSendNews.class);

    private static final java.lang.reflect.Method __method7 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.TMsgSendNewsDao.class, "update", org.x.material.entity.TMsgSendNews.class);

    /** */
    public TMsgSendNewsDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public TMsgSendNewsDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public TMsgSendNewsDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected TMsgSendNewsDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected TMsgSendNewsDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected TMsgSendNewsDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int delete(org.x.material.entity.TMsgSendNews entity) {
        entering("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<org.x.material.entity.TMsgSendNews> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<org.x.material.entity.TMsgSendNews>(org.x.material.entity._TMsgSendNews.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendNewsDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int insert(org.x.material.entity.TMsgSendNews entity) {
        entering("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.TMsgSendNews> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.TMsgSendNews>(org.x.material.entity._TMsgSendNews.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendNewsDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.TMsgSendNews> selectByAll() {
        entering("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "selectByAll");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/TMsgSendNewsDao/selectByAll.sql");
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendNewsDaoImpl");
            __query.setCallerMethodName("selectByAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.TMsgSendNews>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.TMsgSendNews>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.TMsgSendNews>(org.x.material.entity._TMsgSendNews.getSingletonInternal()));
            java.util.List<org.x.material.entity.TMsgSendNews> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "selectByAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "selectByAll", __e);
            throw __e;
        }
    }

    @Override
    public org.x.material.entity.TMsgSendNews selectById(java.lang.String accId, java.lang.String accIdSend, java.lang.Long msgNo) {
        entering("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "selectById", accId, accIdSend, msgNo);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/TMsgSendNewsDao/selectById.sql");
            __query.addParameter("accId", java.lang.String.class, accId);
            __query.addParameter("accIdSend", java.lang.String.class, accIdSend);
            __query.addParameter("msgNo", java.lang.Long.class, msgNo);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendNewsDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.TMsgSendNews> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.TMsgSendNews>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.x.material.entity.TMsgSendNews>(org.x.material.entity._TMsgSendNews.getSingletonInternal()));
            org.x.material.entity.TMsgSendNews __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.TMsgSendNews> selectByIdWithPeriod(java.lang.String accIdSend, java.util.Date startDate, java.util.Date endDate) {
        entering("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "selectByIdWithPeriod", accIdSend, startDate, endDate);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/TMsgSendNewsDao/selectByIdWithPeriod.sql");
            __query.addParameter("accIdSend", java.lang.String.class, accIdSend);
            __query.addParameter("startDate", java.util.Date.class, startDate);
            __query.addParameter("endDate", java.util.Date.class, endDate);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendNewsDaoImpl");
            __query.setCallerMethodName("selectByIdWithPeriod");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(100);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.TMsgSendNews>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.TMsgSendNews>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.TMsgSendNews>(org.x.material.entity._TMsgSendNews.getSingletonInternal()));
            java.util.List<org.x.material.entity.TMsgSendNews> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "selectByIdWithPeriod", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "selectByIdWithPeriod", __e);
            throw __e;
        }
    }

    @Override
    public org.x.material.entity.TMsgSendNews selectByMsgNo(java.lang.Long msgNo) {
        entering("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "selectByMsgNo", msgNo);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/TMsgSendNewsDao/selectByMsgNo.sql");
            __query.addParameter("msgNo", java.lang.Long.class, msgNo);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendNewsDaoImpl");
            __query.setCallerMethodName("selectByMsgNo");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.TMsgSendNews> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.TMsgSendNews>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.x.material.entity.TMsgSendNews>(org.x.material.entity._TMsgSendNews.getSingletonInternal()));
            org.x.material.entity.TMsgSendNews __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "selectByMsgNo", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "selectByMsgNo", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.TMsgSendNews> selectBySendId(java.lang.String accIdSend) {
        entering("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "selectBySendId", accIdSend);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/TMsgSendNewsDao/selectBySendId.sql");
            __query.addParameter("accIdSend", java.lang.String.class, accIdSend);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendNewsDaoImpl");
            __query.setCallerMethodName("selectBySendId");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.TMsgSendNews>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.TMsgSendNews>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.TMsgSendNews>(org.x.material.entity._TMsgSendNews.getSingletonInternal()));
            java.util.List<org.x.material.entity.TMsgSendNews> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "selectBySendId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "selectBySendId", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.x.material.entity.TMsgSendNews entity) {
        entering("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.TMsgSendNews> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.TMsgSendNews>(org.x.material.entity._TMsgSendNews.getSingletonInternal());
            __query.setMethod(__method7);
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("org.x.material.dao.impl.TMsgSendNewsDaoImpl");
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
            exiting("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.TMsgSendNewsDaoImpl", "update", __e);
            throw __e;
        }
    }

}
