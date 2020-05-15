package site.mingsha.eureka.provider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author mingsha
 * @Date 2020/4/12 15:35
 */
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaProviderApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(EurekaProviderApplication.class).web(true).run(args);
	}

}
