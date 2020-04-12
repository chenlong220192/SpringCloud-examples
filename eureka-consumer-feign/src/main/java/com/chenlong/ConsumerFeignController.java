package com.chenlong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenlong
 * @Date 2020/4/12 15:35
 */
@RestController
public class ConsumerFeignController {

    @Autowired
    ConsumerFeignProvider consumerFeignProvider;

    @GetMapping("/consumer_feign")
    public String dc() {
        return consumerFeignProvider.provider();
    }

}
