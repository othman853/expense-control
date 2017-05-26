package io.github.othman853.expensecontrol;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ConfigurationProperties("ec.database")
public class DatabaseConfiguration {

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

}
