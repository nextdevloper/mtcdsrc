package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:21.047+0900")
public class MBoxDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.MBoxDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MBoxDao.class, "insert", org.x.material.entity.MBox.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MBoxDao.class, "update", org.x.material.entity.MBox.class);

    /** */
    public MBoxDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public MBoxDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public MBoxDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected MBoxDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected MBoxDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected MBoxDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int insert(org.x.material.entity.MBox mBox) {
        entering("org.x.material.dao.impl.MBoxDaoImpl", "insert", mBox);
        try {
            if (mBox == null) {
                throw new org.seasar.doma.DomaNullPointerException("mBox");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.MBox> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.MBox>(org.x.material.entity._MBox.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(mBox);
            __query.setCallerClassName("org.x.material.dao.impl.MBoxDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MBoxDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MBoxDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public org.x.material.entity.MBox selectByBoxIdWithEnsureResult(java.lang.String delFlg, java.lang.String boxId) {
        entering("org.x.material.dao.impl.MBoxDaoImpl", "selectByBoxIdWithEnsureResult", delFlg, boxId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MBoxDao/selectByBoxIdWithEnsureResult.sql");
            __query.addParameter("delFlg", java.lang.String.class, delFlg);
            __query.addParameter("boxId", java.lang.String.class, boxId);
            __query.setCallerClassName("org.x.material.dao.impl.MBoxDaoImpl");
            __query.setCallerMethodName("selectByBoxIdWithEnsureResult");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MBox> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MBox>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.x.material.entity.MBox>(org.x.material.entity._MBox.getSingletonInternal()));
            org.x.material.entity.MBox __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MBoxDaoImpl", "selectByBoxIdWithEnsureResult", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MBoxDaoImpl", "selectByBoxIdWithEnsureResult", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.x.material.entity.MBox mBox) {
        entering("org.x.material.dao.impl.MBoxDaoImpl", "update", mBox);
        try {
            if (mBox == null) {
                throw new org.seasar.doma.DomaNullPointerException("mBox");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.MBox> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.MBox>(org.x.material.entity._MBox.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(config);
            __query.setEntity(mBox);
            __query.setCallerClassName("org.x.material.dao.impl.MBoxDaoImpl");
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
            exiting("org.x.material.dao.impl.MBoxDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MBoxDaoImpl", "update", __e);
            throw __e;
        }
    }

}
