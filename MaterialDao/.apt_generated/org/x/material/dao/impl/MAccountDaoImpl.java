package org.x.material.dao.impl;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2017-02-04T15:28:20.951+0900")
public class MAccountDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements org.x.material.dao.MAccountDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MAccountDao.class, "insert", org.x.material.entity.MAccount.class);

    private static final java.lang.reflect.Method __method5 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(org.x.material.dao.MAccountDao.class, "update", org.x.material.entity.MAccount.class);

    /** */
    public MAccountDaoImpl() {
        super(new org.x.material.condition.AppConfig());
    }

    /**
     * @param connection the connection
     */
    public MAccountDaoImpl(java.sql.Connection connection) {
        super(new org.x.material.condition.AppConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public MAccountDaoImpl(javax.sql.DataSource dataSource) {
        super(new org.x.material.condition.AppConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected MAccountDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected MAccountDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected MAccountDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int insert(org.x.material.entity.MAccount mAccount) {
        entering("org.x.material.dao.impl.MAccountDaoImpl", "insert", mAccount);
        try {
            if (mAccount == null) {
                throw new org.seasar.doma.DomaNullPointerException("mAccount");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.MAccount> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<org.x.material.entity.MAccount>(org.x.material.entity._MAccount.getSingletonInternal());
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setEntity(mAccount);
            __query.setCallerClassName("org.x.material.dao.impl.MAccountDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MAccountDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MAccountDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.MAccount> selectById(java.lang.String accId) {
        entering("org.x.material.dao.impl.MAccountDaoImpl", "selectById", accId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MAccountDao/selectById.sql");
            __query.addParameter("accId", java.lang.String.class, accId);
            __query.setCallerClassName("org.x.material.dao.impl.MAccountDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MAccount>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MAccount>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.MAccount>(org.x.material.entity._MAccount.getSingletonInternal()));
            java.util.List<org.x.material.entity.MAccount> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MAccountDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MAccountDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public org.x.material.entity.MAccount selectByIdWithEnsureResult(java.lang.String accId) {
        entering("org.x.material.dao.impl.MAccountDaoImpl", "selectByIdWithEnsureResult", accId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MAccountDao/selectByIdWithEnsureResult.sql");
            __query.addParameter("accId", java.lang.String.class, accId);
            __query.setCallerClassName("org.x.material.dao.impl.MAccountDaoImpl");
            __query.setCallerMethodName("selectByIdWithEnsureResult");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MAccount> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<org.x.material.entity.MAccount>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<org.x.material.entity.MAccount>(org.x.material.entity._MAccount.getSingletonInternal()));
            org.x.material.entity.MAccount __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MAccountDaoImpl", "selectByIdWithEnsureResult", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MAccountDaoImpl", "selectByIdWithEnsureResult", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.MAccount> selectByIdWithOutDelFlg(java.lang.String accId) {
        entering("org.x.material.dao.impl.MAccountDaoImpl", "selectByIdWithOutDelFlg", accId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MAccountDao/selectByIdWithOutDelFlg.sql");
            __query.addParameter("accId", java.lang.String.class, accId);
            __query.setCallerClassName("org.x.material.dao.impl.MAccountDaoImpl");
            __query.setCallerMethodName("selectByIdWithOutDelFlg");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MAccount>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MAccount>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.MAccount>(org.x.material.entity._MAccount.getSingletonInternal()));
            java.util.List<org.x.material.entity.MAccount> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MAccountDaoImpl", "selectByIdWithOutDelFlg", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MAccountDaoImpl", "selectByIdWithOutDelFlg", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<org.x.material.entity.MAccount> selectBymailaddress(java.lang.String mailaddress) {
        entering("org.x.material.dao.impl.MAccountDaoImpl", "selectBymailaddress", mailaddress);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/org/x/material/dao/MAccountDao/selectBymailaddress.sql");
            __query.addParameter("mailaddress", java.lang.String.class, mailaddress);
            __query.setCallerClassName("org.x.material.dao.impl.MAccountDaoImpl");
            __query.setCallerMethodName("selectBymailaddress");
            __query.setResultEnsured(true);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MAccount>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<org.x.material.entity.MAccount>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<org.x.material.entity.MAccount>(org.x.material.entity._MAccount.getSingletonInternal()));
            java.util.List<org.x.material.entity.MAccount> __result = __command.execute();
            __query.complete();
            exiting("org.x.material.dao.impl.MAccountDaoImpl", "selectBymailaddress", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MAccountDaoImpl", "selectBymailaddress", __e);
            throw __e;
        }
    }

    @Override
    public int update(org.x.material.entity.MAccount mAccount) {
        entering("org.x.material.dao.impl.MAccountDaoImpl", "update", mAccount);
        try {
            if (mAccount == null) {
                throw new org.seasar.doma.DomaNullPointerException("mAccount");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.MAccount> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<org.x.material.entity.MAccount>(org.x.material.entity._MAccount.getSingletonInternal());
            __query.setMethod(__method5);
            __query.setConfig(config);
            __query.setEntity(mAccount);
            __query.setCallerClassName("org.x.material.dao.impl.MAccountDaoImpl");
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
            exiting("org.x.material.dao.impl.MAccountDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("org.x.material.dao.impl.MAccountDaoImpl", "update", __e);
            throw __e;
        }
    }

}
