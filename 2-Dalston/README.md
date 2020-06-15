# Spring Cloud 学习示例
***
- eureka-server Eureka服务 port:1001,1002,1003
***
- eureka-provider 服务提供者 port:1004
***
- eureka-consumer 服务消费者 port:1005
- eureka-consumer-feign 服务消费者，使用feign客户端模式，内置Ribbon负载均衡器。 port:1006
- eureka-consumer-ribbon 服务消费者，使用Ribbon负载均衡器。 port:1007
- eureka-consumer-all-instances 服务消费者（获取所有服务的所有实例信息） port:1008
- eureka-consumer-concrete-instance 服务消费者（调用特定实例） port:1009
***
- eureka-feign-upload-server 服务提供者，接收文件上传。 port:1010
- eureka-feign-upload-client 客户端，使用feign模式调用上传文件接口。 port:1011
***
- config-server 配置中心 port:1012
- config-client  port:1013 (注意：这些属性必须配置在bootstrap.properties/bootstrap.yml中，这样config-server中的配置信息才能被正确加载。)
***
- config-server-eureka 配置中心（注册服务） port:1014
- config-client-eureka  port:1015
***
