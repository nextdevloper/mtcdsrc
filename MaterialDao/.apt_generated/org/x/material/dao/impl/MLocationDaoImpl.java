package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:21.057+0900")
public class MLocationDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.MLocationDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MLocationDao.class, "insert", org.x.material.entity.MLocation.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MLocationDao.class, "update", org.x.material.entity.MLocation.class);

    /** */
    public MLocationDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public MLocationDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public MLocationDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected MLocationDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected MLocationDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected MLocationDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int insert(org.x.material.entity.MLocation mLocation) {
        entering("org.x.material.dao.impl.MLocationDaoImpl", "insert", mLocation);
        try {
            if (mLocation == null) {
                throw new org.seasar.doma.DomaNullPointerException("mLocation");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.MLocation> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.MLocation>(org.x.material.entity._MLocation.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(mLocation);
            __query.setCallerClassName("org.x.material.dao.impl.MLocationDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MLocationDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MLocationDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public org.x.material.entity.MLocation selectByLocId(java.lang.String delFlg, java.lang.String locId) {
        entering("org.x.material.dao.impl.MLocationDaoImpl", "selectByLocId", delFlg, locId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MLocationDao/selectByLocId.sql");
            __query.addParameter("delFlg", java.lang.String.class, delFlg);
            __query.addParameter("locId", java.lang.String.class, locId);
            __query.setCallerClassName("org.x.material.dao.impl.MLocationDaoImpl");
            __query.setCallerMethodName("selectByLocId");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MLocation> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MLocation>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.x.material.entity.MLocation>(org.x.material.entity._MLocation.getSingletonInternal()));
            org.x.material.entity.MLocation __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MLocationDaoImpl", "selectByLocId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MLocationDaoImpl", "selectByLocId", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.MLocation> selectByLocNmWithInsideMatching(java.lang.String locOnrId, java.lang.String locNm, org.seasar.doma.jdbc.SelectOptions options) {
        entering("org.x.material.dao.impl.MLocationDaoImpl", "selectByLocNmWithInsideMatching", locOnrId, locNm, options);
        try {
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MLocationDao/selectByLocNmWithInsideMatching.sql");
            __query.setOptions(options);
            __query.addParameter("locOnrId", java.lang.String.class, locOnrId);
            __query.addParameter("locNm", java.lang.String.class, locNm);
            __query.setCallerClassName("org.x.material.dao.impl.MLocationDaoImpl");
            __query.setCallerMethodName("selectByLocNmWithInsideMatching");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MLocation>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MLocation>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.MLocation>(org.x.material.entity._MLocation.getSingletonInternal()));
            java.util.List<org.x.material.entity.MLocation> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MLocationDaoImpl", "selectByLocNmWithInsideMatching", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MLocationDaoImpl", "selectByLocNmWithInsideMatching", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.x.material.entity.MLocation mLocation) {
        entering("org.x.material.dao.impl.MLocationDaoImpl", "update", mLocation);
        try {
            if (mLocation == null) {
                throw new org.seasar.doma.DomaNullPointerException("mLocation");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.MLocation> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.MLocation>(org.x.material.entity._MLocation.getSingletonInternal());
            __query.setMethod(__method3);
            __query.setConfig(config);
            __query.setEntity(mLocation);
            __query.setCallerClassName("org.x.material.dao.impl.MLocationDaoImpl");
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
            exiting("org.x.material.dao.impl.MLocationDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MLocationDaoImpl", "update", __e);
            throw __e;
        }
    }

}
