package DepartmentMicroservice.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSoureSingleton {

    private static DataSource dataSourceObj;

    @Value("${driverVal}")
    String driver;

    @Value("${urlVal}")
    String url;

    @Value("${usernameVal}")
    String username;

    @Value("${passwordVal}")
    String password;

    @Bean
    public synchronized DataSource getDataSource(){
        if(dataSourceObj == null){
            synchronized (DataSoureSingleton.class){
                dataSourceObj = DataSourceBuilder.create()
                        .url(url)
                        .driverClassName(driver)
                        .username(username)
                        .password(password)
                        .build();
            }
        }
        return dataSourceObj;
    }
}
