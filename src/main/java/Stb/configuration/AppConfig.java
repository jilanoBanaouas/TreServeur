/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stb.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * @author yayan
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "Stb")
public class AppConfig {
    
     @Bean
    public ViewResolver viewResolver() {
         InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

//        viewResolver.setPrefix("/WEB-INF/views/");

        return viewResolver;
    }
    
}
