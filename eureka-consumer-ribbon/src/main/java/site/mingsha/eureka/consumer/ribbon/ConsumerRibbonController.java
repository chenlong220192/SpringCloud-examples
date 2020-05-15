package site.mingsha.eureka.consumer.ribbon;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author mingsha
 * @Date 2020/4/12 15:35
 */
@RestController
public class ConsumerRibbonController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer_ribbon")
    public String consumer() {
        return restTemplate.getForObject(String.format("http://%s/%s","eureka-provider","provider"), String.class);
    }

}
