package site.mingsha.eureka.consumer.ribbon.api;

import javax.annotation.Resource;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author mingsha
 * @Date 2020/4/12 15:35
 */
@RestController
public class ConsumerRestRibbonController {

    @Resource(name = "restTemplate")
    private RestTemplate       restTemplate;
    @Resource(name = "lbcRestTemplate")
    private RestTemplate       lbcRestTemplate;

    @Resource
    private LoadBalancerClient loadBalancerClient;

    /**
     * RestTemplate注入负载均衡能力
     * 
     * @return
     */
    @GetMapping("/consumer_ribbon_rest")
    public String consumerRibbonRest() {
        return restTemplate.getForObject(String.format("http://%s/%s", "eureka-provider", "provider"), String.class);
    }

    /**
     * 注意：不能使用@LoadBalanced注解修饰的restTemplate，否则会报以下错误:
     * java.lang.IllegalStateException: No instances available for {serviceInstance.getHost()}
     * 原因是该RestTemplate不再使用默认实现。
     *
     * @return
     */
    @GetMapping("/consumer_ribbon_loadbalancer")
    public String consumerRibbonLoadbalancer() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-provider");
        return lbcRestTemplate.getForObject(String.format("http://%s:%s/provider", serviceInstance.getHost(), serviceInstance.getPort()), String.class);
    }

}
