package site.mingsha.eureka.consumer.ribbon;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

/**
 * @author mingsha
 * @Date 2020/4/12 15:35
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerRibbonApplication {

    @Bean(name = "restTemplate")
    // 赋予负载均衡能力
    // 功能将被改变，原有使用方式会报错。
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Primary
    @Bean(name = "lbcRestTemplate")
    RestTemplate lbcRestTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerRibbonApplication.class).web(true).run(args);
    }

}
