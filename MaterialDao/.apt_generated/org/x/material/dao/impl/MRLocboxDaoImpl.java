package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:21.096+0900")
public class MRLocboxDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.MRLocboxDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MRLocboxDao.class, "insert", org.x.material.entity.MRLocbox.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MRLocboxDao.class, "update", org.x.material.entity.MRLocbox.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MRLocboxDao.class, "updateDelFlg", java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class);

    /** */
    public MRLocboxDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public MRLocboxDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public MRLocboxDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected MRLocboxDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected MRLocboxDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected MRLocboxDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int insert(org.x.material.entity.MRLocbox mRLocbox) {
        entering("org.x.material.dao.impl.MRLocboxDaoImpl", "insert", mRLocbox);
        try {
            if (mRLocbox == null) {
                throw new org.seasar.doma.DomaNullPointerException("mRLocbox");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.MRLocbox> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.MRLocbox>(org.x.material.entity._MRLocbox.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(mRLocbox);
            __query.setCallerClassName("org.x.material.dao.impl.MRLocboxDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MRLocboxDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MRLocboxDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.x.material.entity.MRLocbox mRLocbox) {
        entering("org.x.material.dao.impl.MRLocboxDaoImpl", "update", mRLocbox);
        try {
            if (mRLocbox == null) {
                throw new org.seasar.doma.DomaNullPointerException("mRLocbox");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.MRLocbox> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.MRLocbox>(org.x.material.entity._MRLocbox.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setEntity(mRLocbox);
            __query.setCallerClassName("org.x.material.dao.impl.MRLocboxDaoImpl");
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
            exiting("org.x.material.dao.impl.MRLocboxDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MRLocboxDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int updateDelFlg(java.lang.String delFlg, java.lang.String accId, java.lang.String locId, java.lang.String boxId) {
        entering("org.x.material.dao.impl.MRLocboxDaoImpl", "updateDelFlg", delFlg, accId, locId, boxId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery();
            __query.setMethod(__method2);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MRLocboxDao/updateDelFlg.sql");
            __query.addParameter("delFlg", java.lang.String.class, delFlg);
            __query.addParameter("accId", java.lang.String.class, accId);
            __query.addParameter("locId", java.lang.String.class, locId);
            __query.addParameter("boxId", java.lang.String.class, boxId);
            __query.setCallerClassName("org.x.material.dao.impl.MRLocboxDaoImpl");
            __query.setCallerMethodName("updateDelFlg");
            __query.setQueryTimeout(-1);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(true);
            __query.setOptimisticLockExceptionSuppressed(true);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MRLocboxDaoImpl", "updateDelFlg", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MRLocboxDaoImpl", "updateDelFlg", __e);
            throw __e;
        }
    }

}
