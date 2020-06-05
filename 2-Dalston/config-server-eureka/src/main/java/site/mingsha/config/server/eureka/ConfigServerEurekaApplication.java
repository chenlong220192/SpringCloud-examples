package site.mingsha.config.server.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author mingsha
 * @date 2020-06-05
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerEurekaApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigServerEurekaApplication.class).web(true).run(args);
	}

}
