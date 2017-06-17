package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.970+0900")
public class MLocationBoxMaterialDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.MLocationBoxMaterialDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    /** */
    public MLocationBoxMaterialDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public MLocationBoxMaterialDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public MLocationBoxMaterialDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected MLocationBoxMaterialDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected MLocationBoxMaterialDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected MLocationBoxMaterialDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public java.util.List<org.x.material.entity.MLocationBoxMaterial> selectByLocationWithInsideMatching(java.lang.String accId, java.lang.String srcLocNm, java.lang.String srcBoxNm, java.lang.String srcMtrNm, org.seasar.doma.jdbc.SelectOptions options) {
        entering("org.x.material.dao.impl.MLocationBoxMaterialDaoImpl", "selectByLocationWithInsideMatching", accId, srcLocNm, srcBoxNm, srcMtrNm, options);
        try {
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MLocationBoxMaterialDao/selectByLocationWithInsideMatching.sql");
            __query.setOptions(options);
            __query.addParameter("accId", java.lang.String.class, accId);
            __query.addParameter("srcLocNm", java.lang.String.class, srcLocNm);
            __query.addParameter("srcBoxNm", java.lang.String.class, srcBoxNm);
            __query.addParameter("srcMtrNm", java.lang.String.class, srcMtrNm);
            __query.setCallerClassName("org.x.material.dao.impl.MLocationBoxMaterialDaoImpl");
            __query.setCallerMethodName("selectByLocationWithInsideMatching");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MLocationBoxMaterial>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MLocationBoxMaterial>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.MLocationBoxMaterial>(org.x.material.entity._MLocationBoxMaterial.getSingletonInternal()));
            java.util.List<org.x.material.entity.MLocationBoxMaterial> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MLocationBoxMaterialDaoImpl", "selectByLocationWithInsideMatching", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MLocationBoxMaterialDaoImpl", "selectByLocationWithInsideMatching", __e);
            throw __e;
        }
    }

}
