package DepartmentMicroservice.Configuration;

import org.springframework.cloud.commons.util.InetUtils;
import org.springframework.cloud.commons.util.InetUtilsProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EurekaBeanConfig {

    @Bean
    public InetUtils getInetUtil(){
        return new InetUtils(new InetUtilsProperties());
    }
}
