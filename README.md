# Spring Cloud 学习示例
***
- eureka-server Eureka服务
- eureka-provider 服务提供者
- eureka-consumer 服务消费者
- eureka-consumer-ribbon 服务消费者，使用Ribbon负载均衡器。
- eureka-consumer-feign 服务消费者，使用feign客户端模式，内置Ribbon负载均衡器。
***
- eureka-feign-upload-server 服务提供者，接收文件上传。
- eureka-feign-upload-client 客户端，使用feign模式调用上传文件接口。
***
- config-server 配置中心
- config-client 注意：这些属性必须配置在bootstrap.properties中，这样config-server中的配置信息才能被正确加载。
***
