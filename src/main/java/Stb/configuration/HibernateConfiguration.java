/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.configuration;

import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author yayan
 */
@Configuration
@EnableTransactionManagement
@ComponentScan({"Stb.configuration"})
@PropertySource(value = {"classpath:application.properties"})
public class HibernateConfiguration {

    @Autowired
    private Environment environment;

    @Bean(name = "sessionFactoryAVA")
    public LocalSessionFactoryBean sessionFactoryAVA() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSourceAVA());
        sessionFactory.setPackagesToScan(new String[]{"Stb.model.ava"});
        sessionFactory.setHibernateProperties(hibernatePropertiesAVA());
        return sessionFactory;
    }

    @Bean
    public DataSource dataSourceAVA() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("oracle.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("oracle.url"));
        dataSource.setUsername(environment.getRequiredProperty("ava.oracle.username"));
        dataSource.setPassword(environment.getRequiredProperty("ava.oracle.password"));
        return dataSource;
    }

    private Properties hibernatePropertiesAVA() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
        properties.put("hibernate.current_session_context_class", environment.getRequiredProperty("hibernate.current_session_context_class"));
        return properties;
    }

    // ********************** Ref config  
//    @Bean(name = "sessionFactoryRef")
//    
//    public LocalSessionFactoryBean sessionFactoryRef() {
//        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//        sessionFactory.setDataSource(dataSourceRef());
//        sessionFactory.setPackagesToScan(new String[]{"Stb.model.Ref"});
//        sessionFactory.setHibernateProperties(hibernatePropertiesRef());
//        return sessionFactory;
//    }
//
//    @Bean
//    public DataSource dataSourceRef() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(environment.getRequiredProperty("oracle.driverClassName"));
//        dataSource.setUrl(environment.getRequiredProperty("oracle.url"));
//        dataSource.setUsername(environment.getRequiredProperty("ref.oracle.username"));
//        dataSource.setPassword(environment.getRequiredProperty("ref.oracle.password"));
//        return dataSource;
//    }
//
//    private Properties hibernatePropertiesRef() {
//        Properties properties = new Properties();
//        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
//        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
//        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
//        properties.put("hibernate.current_session_context_class", environment.getRequiredProperty("hibernate.current_session_context_class"));
//        return properties;
//    }

    // **********Transaction
    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory s) {
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(s);
        return txManager;
    }
}
