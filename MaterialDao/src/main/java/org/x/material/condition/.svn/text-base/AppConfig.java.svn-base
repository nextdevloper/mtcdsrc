package org.x.material.condition;

import javax.sql.DataSource;

import org.seasar.doma.jdbc.ClassHelper;
import org.seasar.doma.jdbc.DefaultClassHelper;
import org.seasar.doma.jdbc.DomaAbstractConfig;
import org.seasar.doma.jdbc.JdbcLogger;
import org.seasar.doma.jdbc.RequiresNewController;
import org.seasar.doma.jdbc.SqlFileRepository;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.PostgresDialect;
import org.seasar.extension.datasource.DataSourceFactory;
import org.seasar.extension.datasource.impl.SelectableDataSourceProxy;
import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;



public class AppConfig extends DomaAbstractConfig {

    private static Dialect dialect = new PostgresDialect();
    private static RequiresNewController requiresNewController = new S2RequiresNewController();
    private static JdbcLogger jdbcLogger = new CommonsJdbcLogger();
    private static SqlFileRepository sqlfileRepository = new SqlFileRepositoryProxy();
    private static ClassHelper classHelper = new DefaultClassHelper();

    @Override
    public String getDataSourceName() {
        S2Container container = SingletonS2ContainerFactory.getContainer();
        if (container.hasComponentDef(DataSourceFactory.class)) {
            DataSourceFactory dataSourceFactory = (DataSourceFactory) container
                    .getComponent(DataSourceFactory.class);
            if (getDataSourceInternal() instanceof SelectableDataSourceProxy) {
                return dataSourceFactory.getSelectableDataSourceName();
            }
        }
        return getClass().getName();
    }

    @Override
    public DataSource getDataSource() {
        return getDataSourceInternal();
    }

    protected DataSource getDataSourceInternal() {
        S2Container container = SingletonS2ContainerFactory.getContainer();
        return (DataSource) container.getComponent(DataSource.class);
    }

    @Override
    public Dialect getDialect() {
        return dialect;
    }

    @Override
    public RequiresNewController getRequiresNewController() {
        return requiresNewController;
    }

    @Override
    public JdbcLogger getJdbcLogger() {
        return jdbcLogger;
    }

    @Override
    public SqlFileRepository getSqlFileRepository() {
        return sqlfileRepository;
    }

    @Override
    public ClassHelper getClassHelper() {
        return classHelper;
    }

    /*
	protected static final LocalTransactionalDataSource dataSource = createDataSource();

    protected static final Dialect dialect = new PostgresDialect();

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }

    @Override
    public Dialect getDialect() {
        return dialect;
    }

    protected static LocalTransactionalDataSource createDataSource() {
        SimpleDataSource dataSource = new SimpleDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost/mtcddb");
        dataSource.setUser("mtcddb");
        dataSource.setPassword("mtcddb");
        return new LocalTransactionalDataSource(dataSource);
    }

    public static LocalTransaction getLocalTransaction() {
        return dataSource.getLocalTransaction(defaultJdbcLogger);
    }

*/

}
