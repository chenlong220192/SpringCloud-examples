package site.mingsha.eureka.consumer.feign.api;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import site.mingsha.eureka.consumer.feign.integration.ConsumerFeignProvider;

/**
 * @author mingsha
 * @Date 2020/4/12 15:35
 */
@RestController
public class ConsumerFeignController {

    @Resource
    private ConsumerFeignProvider consumerFeignProvider;

    @GetMapping("/consumer_feign")
    public String dc() {
        return consumerFeignProvider.provider();
    }

}
