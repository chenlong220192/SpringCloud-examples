package site.mingsha.eureka.consumer.concreteinstance.api;

import java.util.List;

import javax.annotation.Resource;

import com.google.common.collect.Lists;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author mingsha
 * @Date 2020-06-15
 */
@RestController
public class ConsumerController {

    @Resource
    private DiscoveryClient discoveryClient;
    @Resource
    private RestTemplate    restTemplate;

    /**
     * 1、获取指定服务下所有实例
     * 2、针对具体实例发起调用
     */
    @GetMapping("/consumer")
    public List<String> consumer() {
        List<String> result = Lists.newArrayList();
        // 获取所有eureka-provider实例
        List<ServiceInstance> instances = discoveryClient.getInstances("eureka-provider");
        for (ServiceInstance instance : instances) {
            String resultStr = restTemplate.getForObject(String.format("http://%s:%s/provider", instance.getHost(), instance.getPort()), String.class);
            result.add(resultStr);
        }
        return result;
    }

}
