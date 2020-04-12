package com.chenlong;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chenlong
 * @Date 2020/4/12 15:35
 */
@FeignClient("eureka-provider")
public interface ConsumerFeignProvider {

    /**
     * 绑定eureka-provider服务provider接口
     * @return
     */
    @GetMapping("/provider")
    String provider();

}
