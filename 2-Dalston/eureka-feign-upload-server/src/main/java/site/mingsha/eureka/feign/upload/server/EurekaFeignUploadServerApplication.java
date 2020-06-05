package site.mingsha.eureka.feign.upload.server;

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
public class EurekaFeignUploadServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaFeignUploadServerApplication.class).web(true).run(args);
    }

}
