package DepartmentMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartmentMicroserviceMainClass {
    public static void main(String[] args) {
        SpringApplication.run(DepartmentMicroserviceMainClass.class, args);
    }
}
