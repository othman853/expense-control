package io.github.othman853.expensecontrol;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    @Bean
    @FlywayDataSource
    public DataSource dataSource(
            @Value("${ec.database.url}") String url,
            @Value("${ec.database.username}") String username,
            @Value("${ec.database.password}") String password,
            @Value("${ec.database.driver-class-name}") String driver) {

        return DataSourceBuilder
                .create()
                .driverClassName(driver)
                .url(url)
                .username(username)
                .password(password)
                .build();
    }

}
