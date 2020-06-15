package site.mingsha.eureka.consumer.allinstances.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mingsha
 * @Date 2020-06-15
 */
@RestController
public class ConsumerController {

    @Resource
    private DiscoveryClient discoveryClient;

    /**
     * import org.springframework.cloud.client.ServiceInstance;
     * import org.springframework.cloud.client.discovery.DiscoveryClient;
     *
     * 获取每一个服务下面实例
     */
    @GetMapping("/consumer")
    public Map<String, List<ServiceInstance>> consumer() {
        Map<String, List<ServiceInstance>> result = new HashMap<String, List<ServiceInstance>>();
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            result.put(service, instances);
        }
        return result;
    }

}
