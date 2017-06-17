package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.989+0900")
public class MMaterialDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.MMaterialDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MMaterialDao.class, "insert", org.x.material.entity.MMaterial.class);

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MMaterialDao.class, "update", org.x.material.entity.MMaterial.class);

    /** */
    public MMaterialDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public MMaterialDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public MMaterialDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected MMaterialDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected MMaterialDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected MMaterialDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int insert(org.x.material.entity.MMaterial mMaterial) {
        entering("org.x.material.dao.impl.MMaterialDaoImpl", "insert", mMaterial);
        try {
            if (mMaterial == null) {
                throw new org.seasar.doma.DomaNullPointerException("mMaterial");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.MMaterial> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.MMaterial>(org.x.material.entity._MMaterial.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(mMaterial);
            __query.setCallerClassName("org.x.material.dao.impl.MMaterialDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MMaterialDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MMaterialDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public org.x.material.entity.MMaterial selectByMaterialIdWithEnsureResult(java.lang.String delFlg, java.lang.String mtId) {
        entering("org.x.material.dao.impl.MMaterialDaoImpl", "selectByMaterialIdWithEnsureResult", delFlg, mtId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MMaterialDao/selectByMaterialIdWithEnsureResult.sql");
            __query.addParameter("delFlg", java.lang.String.class, delFlg);
            __query.addParameter("mtId", java.lang.String.class, mtId);
            __query.setCallerClassName("org.x.material.dao.impl.MMaterialDaoImpl");
            __query.setCallerMethodName("selectByMaterialIdWithEnsureResult");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MMaterial> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MMaterial>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.x.material.entity.MMaterial>(org.x.material.entity._MMaterial.getSingletonInternal()));
            org.x.material.entity.MMaterial __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MMaterialDaoImpl", "selectByMaterialIdWithEnsureResult", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MMaterialDaoImpl", "selectByMaterialIdWithEnsureResult", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.x.material.entity.MMaterial mMaterial) {
        entering("org.x.material.dao.impl.MMaterialDaoImpl", "update", mMaterial);
        try {
            if (mMaterial == null) {
                throw new org.seasar.doma.DomaNullPointerException("mMaterial");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.MMaterial> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.MMaterial>(org.x.material.entity._MMaterial.getSingletonInternal());
            __query.setMethod(__method2);
            __query.setConfig(config);
            __query.setEntity(mMaterial);
            __query.setCallerClassName("org.x.material.dao.impl.MMaterialDaoImpl");
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
            exiting("org.x.material.dao.impl.MMaterialDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MMaterialDaoImpl", "update", __e);
            throw __e;
        }
    }

}
