package com.example.configurationproperties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
// @PropertySource("classpath:loda.yml") // Đánh dấu để lấy config từ trong file loda.yml
@ConfigurationProperties(prefix = "loda")
public class ConfigReader {
    private String email;
    private String googleAnalyticsId;

    private List<String> authors;
    private Map<String, String> exampleMap;

    public ConfigReader() {
        System.out.println("init ConfigReader objec!");
    }


}
