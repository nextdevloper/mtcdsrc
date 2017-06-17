package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:21.081+0900")
public class MLocationBoxDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.MLocationBoxDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    /** */
    public MLocationBoxDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public MLocationBoxDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public MLocationBoxDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected MLocationBoxDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected MLocationBoxDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected MLocationBoxDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public org.x.material.entity.MLocationBox selectByBoxId(java.lang.String srcBoxId) {
        entering("org.x.material.dao.impl.MLocationBoxDaoImpl", "selectByBoxId", srcBoxId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MLocationBoxDao/selectByBoxId.sql");
            __query.addParameter("srcBoxId", java.lang.String.class, srcBoxId);
            __query.setCallerClassName("org.x.material.dao.impl.MLocationBoxDaoImpl");
            __query.setCallerMethodName("selectByBoxId");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MLocationBox> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MLocationBox>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.x.material.entity.MLocationBox>(org.x.material.entity._MLocationBox.getSingletonInternal()));
            org.x.material.entity.MLocationBox __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MLocationBoxDaoImpl", "selectByBoxId", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MLocationBoxDaoImpl", "selectByBoxId", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.MLocationBox> selectByBoxNmWithInsideMatching(java.lang.String locOnrId, java.lang.String srcBoxNm, java.lang.String locId, org.seasar.doma.jdbc.SelectOptions options) {
        entering("org.x.material.dao.impl.MLocationBoxDaoImpl", "selectByBoxNmWithInsideMatching", locOnrId, srcBoxNm, locId, options);
        try {
            if (options == null) {
                throw new org.seasar.doma.DomaNullPointerException("options");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MLocationBoxDao/selectByBoxNmWithInsideMatching.sql");
            __query.setOptions(options);
            __query.addParameter("locOnrId", java.lang.String.class, locOnrId);
            __query.addParameter("srcBoxNm", java.lang.String.class, srcBoxNm);
            __query.addParameter("locId", java.lang.String.class, locId);
            __query.setCallerClassName("org.x.material.dao.impl.MLocationBoxDaoImpl");
            __query.setCallerMethodName("selectByBoxNmWithInsideMatching");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MLocationBox>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MLocationBox>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.MLocationBox>(org.x.material.entity._MLocationBox.getSingletonInternal()));
            java.util.List<org.x.material.entity.MLocationBox> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MLocationBoxDaoImpl", "selectByBoxNmWithInsideMatching", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MLocationBoxDaoImpl", "selectByBoxNmWithInsideMatching", __e);
            throw __e;
        }
    }

}
