package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonBuilderUtils;

@Configuration
public class AppConfig {
    @Value("${loda.mysql.url}")
    String mysqlUrl;

    @Bean
    DatabaseConnector mysqlConfigure() {
        DatabaseConnector mySqlConnector = new MySqlConnector();
        mySqlConnector.setUrl(mysqlUrl);
        System.out.println("Config Mysql Url: " + mysqlUrl);

        return mySqlConnector;
    }

}
