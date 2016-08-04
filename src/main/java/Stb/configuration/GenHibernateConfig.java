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
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author yayan
 */
@Configuration
@EnableTransactionManagement
@ComponentScan("Stb.configuration")
@PropertySource(value = {"classpath:application.properties"})
public class GenHibernateConfig {
    @Autowired
    private Environment environment;

    @Bean(name = "sessionFactoryGen")
   public SessionFactory sessionFactoryGen() {
        LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSourceGen());
        builder.scanPackages("Stb.model.Gen")
                .addProperties(hibernatePropertiesGen());
        return builder.buildSessionFactory();
    }

    @Bean
    public DataSource dataSourceGen() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("oracle.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("oracle.url"));
        dataSource.setUsername(environment.getRequiredProperty("gen.oracle.username"));
        dataSource.setPassword(environment.getRequiredProperty("gen.oracle.password"));
        return dataSource;
    }

    private Properties hibernatePropertiesGen() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));

        return properties;
    }

    // **********Transaction
    @Bean(name = "transactionManagerGen")
    public HibernateTransactionManager txManager() {

        HibernateTransactionManager txManager = new HibernateTransactionManager(sessionFactoryGen());

        return txManager;
    }
}
