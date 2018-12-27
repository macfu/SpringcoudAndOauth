# springCloudAndOAut
## 项目结构
```
 |-springcloudoauth 父项目，定义开发包版本
    |   |-microauth-api 公共资源模块,定义po和公共接口
    |   |-microauht-eureka-server eureka服务提供
    |   |-microauth-provider-dept-8001 服务提供者
    |   |-microauth-consumer-huystrix rest服务消费端,hystrix熔断
    |   |-microauth-zuul-gateway-9501 网关模块，配置转发

```
## 描述
```$xslt
    项目的基础组成：consumer（Boot）+ zuul网关（SpringCloud） + Eureka注册中心 + provider微服务提供
```