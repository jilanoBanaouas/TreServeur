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
public class GenHibernateConfig extends AbstractHibernateConfig{
    @Autowired
    private Environment environment;

    @Bean(name = "sessionFactoryGen")
   public SessionFactory sessionFactoryGen() {
        LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSourceGen());
        builder.scanPackages("Stb.model.Gen")
                .addProperties(hibernateProperties());
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


    // **********Transaction
    @Bean(name = "transactionManagerGen")
   
    public HibernateTransactionManager txManager() {

        HibernateTransactionManager txManager = new HibernateTransactionManager(sessionFactoryGen());

        return txManager;
    }
}
