package site.mingsha.eureka.consumer.allinstances;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author mingsha
 * @Date 2020/4/12 15:35
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerForAllInstancesApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaConsumerForAllInstancesApplication.class).web(true).run(args);
	}

}
