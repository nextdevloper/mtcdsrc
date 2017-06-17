package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:21.028+0900")
public class MBoxMaterialDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.MBoxMaterialDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    /** */
    public MBoxMaterialDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public MBoxMaterialDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public MBoxMaterialDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected MBoxMaterialDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected MBoxMaterialDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected MBoxMaterialDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public org.x.material.entity.MBoxMaterial selectByMaterialId(java.lang.String srcMaterialId) {
        entering("org.x.material.dao.impl.MBoxMaterialDaoImpl", "selectByMaterialId", srcMaterialId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MBoxMaterialDao/selectByMaterialId.sql");
            __query.addParameter("srcMaterialId", java.lang.String.class, srcMaterialId);
            __query.setCallerClassName("org.x.material.dao.impl.MBoxMaterialDaoImpl");
            __query.setCallerMethodName("selectByMaterialId");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MBoxMaterial> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MBoxMaterial>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.x.material.entity.MBoxMaterial>(org.x.material.entity._MBoxMaterial.getSingletonInternal()));
            org.x.material.entity.MBoxMaterial __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MBoxMaterialDaoImpl", "selectByMaterialId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MBoxMaterialDaoImpl", "selectByMaterialId", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.MBoxMaterial> selectByMaterialNmWithInsideMatching(java.lang.String boxOnrId, java.lang.String srcMaterialNm, java.lang.String boxId, org.seasar.doma.jdbc.SelectOptions options) {
        entering("org.x.material.dao.impl.MBoxMaterialDaoImpl", "selectByMaterialNmWithInsideMatching", boxOnrId, srcMaterialNm, boxId, options);
        try {
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MBoxMaterialDao/selectByMaterialNmWithInsideMatching.sql");
            __query.setOptions(options);
            __query.addParameter("boxOnrId", java.lang.String.class, boxOnrId);
            __query.addParameter("srcMaterialNm", java.lang.String.class, srcMaterialNm);
            __query.addParameter("boxId", java.lang.String.class, boxId);
            __query.setCallerClassName("org.x.material.dao.impl.MBoxMaterialDaoImpl");
            __query.setCallerMethodName("selectByMaterialNmWithInsideMatching");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MBoxMaterial>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MBoxMaterial>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.MBoxMaterial>(org.x.material.entity._MBoxMaterial.getSingletonInternal()));
            java.util.List<org.x.material.entity.MBoxMaterial> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MBoxMaterialDaoImpl", "selectByMaterialNmWithInsideMatching", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MBoxMaterialDaoImpl", "selectByMaterialNmWithInsideMatching", __e);
            throw __e;
        }
    }

}
