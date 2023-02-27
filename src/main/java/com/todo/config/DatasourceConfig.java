//package com.todo.config;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableTransactionManagement
//@PropertySource("classpath:/application.properties")
//public class DatasourceConfig {
//
//    @Autowired
//    private ApplicationContext applicationContext;
//
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public HikariConfig hikariConfig() {
//        return new HikariConfig();
//    }
//
//    @Bean(name="dataSource")
//    public DataSource dataSource() {
//        DataSource dataSource = new HikariDataSource(hikariConfig());
//        return dataSource;
//    }
//
//
//    @Bean(name="sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
////        Resource confiigLocation = new PathMatchingResourcePatternResolver().getResource("classpath:spring/spring-mybatis.xml");
////        sqlSessionFactoryBean.setConfigLocation(confiigLocation);
//        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:/mapper/*.xml"));
//        return sqlSessionFactoryBean.getObject();
//    }
//
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//
//    // https://linked2ev.github.io/gitlog/2019/10/02/springboot-mvc-15-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-MVC-Transaction-%EC%84%A4%EC%A0%95/
//    // https://moonsiri.tistory.com/53
//    @Bean(name="transactionManager")
//    public DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//}
