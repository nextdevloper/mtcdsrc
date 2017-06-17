package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:21.073+0900")
public class IdNumberingDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.IdNumberingDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.IdNumberingDao.class, "insert", org.x.material.entity.IdNumbering.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.IdNumberingDao.class, "update", org.x.material.entity.IdNumbering.class);

    /** */
    public IdNumberingDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public IdNumberingDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public IdNumberingDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected IdNumberingDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected IdNumberingDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected IdNumberingDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int insert(org.x.material.entity.IdNumbering IdNumbering) {
        entering("org.x.material.dao.impl.IdNumberingDaoImpl", "insert", IdNumbering);
        try {
            if (IdNumbering == null) {
                throw new org.seasar.doma.DomaNullPointerException("IdNumbering");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.IdNumbering> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.IdNumbering>(org.x.material.entity._IdNumbering.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(IdNumbering);
            __query.setCallerClassName("org.x.material.dao.impl.IdNumberingDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.IdNumberingDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.IdNumberingDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.IdNumbering> selectByAll() {
        entering("org.x.material.dao.impl.IdNumberingDaoImpl", "selectByAll");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/IdNumberingDao/selectByAll.sql");
            __query.setCallerClassName("org.x.material.dao.impl.IdNumberingDaoImpl");
            __query.setCallerMethodName("selectByAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.IdNumbering>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.IdNumbering>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.IdNumbering>(org.x.material.entity._IdNumbering.getSingletonInternal()));
            java.util.List<org.x.material.entity.IdNumbering> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.IdNumberingDaoImpl", "selectByAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.IdNumberingDaoImpl", "selectByAll", __e);
            throw __e;
        }
    }

    @Override
    public org.x.material.entity.IdNumbering selectByIdKind(java.lang.String idKind) {
        entering("org.x.material.dao.impl.IdNumberingDaoImpl", "selectByIdKind", idKind);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/IdNumberingDao/selectByIdKind.sql");
            __query.addParameter("idKind", java.lang.String.class, idKind);
            __query.setCallerClassName("org.x.material.dao.impl.IdNumberingDaoImpl");
            __query.setCallerMethodName("selectByIdKind");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.IdNumbering> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.IdNumbering>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.x.material.entity.IdNumbering>(org.x.material.entity._IdNumbering.getSingletonInternal()));
            org.x.material.entity.IdNumbering __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.IdNumberingDaoImpl", "selectByIdKind", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.IdNumberingDaoImpl", "selectByIdKind", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.x.material.entity.IdNumbering IdNumbering) {
        entering("org.x.material.dao.impl.IdNumberingDaoImpl", "update", IdNumbering);
        try {
            if (IdNumbering == null) {
                throw new org.seasar.doma.DomaNullPointerException("IdNumbering");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.IdNumbering> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.IdNumbering>(org.x.material.entity._IdNumbering.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(config);
            __query.setEntity(IdNumbering);
            __query.setCallerClassName("org.x.material.dao.impl.IdNumberingDaoImpl");
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
            exiting("org.x.material.dao.impl.IdNumberingDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.IdNumberingDaoImpl", "update", __e);
            throw __e;
        }
    }

}
