package study.dubbostudy.dubbouser;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import study.dubbostudy.orderapi.service.OrderService1;
import study.dubbostudy.orderapi.wrapper.DoOrderRequestWrapper;
import study.dubbostudy.orderapi.wrapper.DoOrderResponseWrapper;

/**
 * @author YeHaocong
 * @decription TODO
 * @Date 2020/7/10 15:26
 */

public class ConsumerAPI {
    public static void main(String[] args) {

        ApplicationConfig config = new ApplicationConfig();
        //设置name属性和owner属性
        config.setName("order-providerAPI");
        config.setOwner("YeHaocongAPI");


        //创建一个注册中心配置
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setProtocol("zookeeper");
        registryConfig.setAddress("192.168.18.137:2181");

        //创建一个服务引用配置
        ReferenceConfig<OrderService1> orderService1ReferenceConfig = new ReferenceConfig<OrderService1>();
        //设置注册中心
        orderService1ReferenceConfig.setRegistry(registryConfig);
        //设置服务接口
        orderService1ReferenceConfig.setInterface(OrderService1.class);
        //设置application
        orderService1ReferenceConfig.setApplication(config);
        //获取远程调用代理类
        OrderService1 orderService1 = orderService1ReferenceConfig.get();

        DoOrderRequestWrapper requestWrapper = new DoOrderRequestWrapper();
        requestWrapper.setName("YeHaocong");
        //调用
        DoOrderResponseWrapper responseWrapper = orderService1.doOrder1(requestWrapper);
        System.out.println(responseWrapper);

    }
}
