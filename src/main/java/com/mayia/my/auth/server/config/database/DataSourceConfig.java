package com.mayia.my.auth.server.config.database;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {


//    @Bean
//    @ConfigurationProperties("spring.datasource")
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().build();
//    }
}
