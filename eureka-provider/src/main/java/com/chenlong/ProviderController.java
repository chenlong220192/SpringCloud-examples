package com.chenlong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenlong
 * @Date 2020/4/12 15:35
 */
@RestController
public class ProviderController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/provider")
    public String provider() {
        String services = "Services: " + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }

}
