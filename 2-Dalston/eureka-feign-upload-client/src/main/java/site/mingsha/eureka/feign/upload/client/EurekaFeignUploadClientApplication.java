package site.mingsha.eureka.feign.upload.client;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author mingsha
 * @Date 2020/4/12 15:35
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaFeignUploadClientApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaFeignUploadClientApplication.class).web(true).run(args);
    }

}
