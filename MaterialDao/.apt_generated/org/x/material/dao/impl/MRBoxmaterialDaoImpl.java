package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:21.041+0900")
public class MRBoxmaterialDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.MRBoxmaterialDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MRBoxmaterialDao.class, "insert", org.x.material.entity.MRBoxmaterial.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MRBoxmaterialDao.class, "update", org.x.material.entity.MRBoxmaterial.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MRBoxmaterialDao.class, "updateDelFlg", java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class);

    /** */
    public MRBoxmaterialDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public MRBoxmaterialDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public MRBoxmaterialDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected MRBoxmaterialDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected MRBoxmaterialDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected MRBoxmaterialDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int insert(org.x.material.entity.MRBoxmaterial mRBoxmaterial) {
        entering("org.x.material.dao.impl.MRBoxmaterialDaoImpl", "insert", mRBoxmaterial);
        try {
            if (mRBoxmaterial == null) {
                throw new org.seasar.doma.DomaNullPointerException("mRBoxmaterial");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.MRBoxmaterial> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.MRBoxmaterial>(org.x.material.entity._MRBoxmaterial.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(mRBoxmaterial);
            __query.setCallerClassName("org.x.material.dao.impl.MRBoxmaterialDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MRBoxmaterialDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MRBoxmaterialDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.x.material.entity.MRBoxmaterial mRBoxmaterial) {
        entering("org.x.material.dao.impl.MRBoxmaterialDaoImpl", "update", mRBoxmaterial);
        try {
            if (mRBoxmaterial == null) {
                throw new org.seasar.doma.DomaNullPointerException("mRBoxmaterial");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.MRBoxmaterial> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.MRBoxmaterial>(org.x.material.entity._MRBoxmaterial.getSingletonInternal());
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setEntity(mRBoxmaterial);
            __query.setCallerClassName("org.x.material.dao.impl.MRBoxmaterialDaoImpl");
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
            exiting("org.x.material.dao.impl.MRBoxmaterialDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MRBoxmaterialDaoImpl", "update", __e);
            throw __e;
        }
    }

    @Override
    public int updateDelFlg(java.lang.String delFlg, java.lang.String accId, java.lang.String boxId, java.lang.String mtId) {
        entering("org.x.material.dao.impl.MRBoxmaterialDaoImpl", "updateDelFlg", delFlg, accId, boxId, mtId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery();
            __query.setMethod(__method2);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MRBoxmaterialDao/updateDelFlg.sql");
            __query.addParameter("delFlg", java.lang.String.class, delFlg);
            __query.addParameter("accId", java.lang.String.class, accId);
            __query.addParameter("boxId", java.lang.String.class, boxId);
            __query.addParameter("mtId", java.lang.String.class, mtId);
            __query.setCallerClassName("org.x.material.dao.impl.MRBoxmaterialDaoImpl");
            __query.setCallerMethodName("updateDelFlg");
            __query.setQueryTimeout(-1);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(true);
            __query.setOptimisticLockExceptionSuppressed(true);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MRBoxmaterialDaoImpl", "updateDelFlg", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MRBoxmaterialDaoImpl", "updateDelFlg", __e);
            throw __e;
        }
    }

}
