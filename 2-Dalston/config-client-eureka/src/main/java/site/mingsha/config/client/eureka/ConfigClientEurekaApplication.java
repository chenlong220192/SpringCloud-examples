package site.mingsha.config.client.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author mingsha
 * @version : Demo, v 0.1 2020/5/4 23:42 mingsha Exp$
 */
//@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClientEurekaApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigClientEurekaApplication.class).web(true).run(args);
	}

}
