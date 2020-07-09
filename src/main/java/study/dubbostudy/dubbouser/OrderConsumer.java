package study.dubbostudy.dubbouser;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import study.dubbostudy.orderapi.service.OrderService;
import study.dubbostudy.orderapi.wrapper.DoOrderRequestWrapper;
import study.dubbostudy.orderapi.wrapper.DoOrderResponseWrapper;

/**
 * @author YeHaocong
 * @decription TODO
 * @Date 2020/7/7 19:47
 */

public class OrderConsumer {

    public static void main(String[] args) {
        //使用order-consumer.xml配置文件创建容器并初始化
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("order-consumer.xml");
        //获取orderService bean
        OrderService orderService = (OrderService) context.getBean("orderService");
        DoOrderRequestWrapper requestWrapper = new DoOrderRequestWrapper();
        requestWrapper.setName("YeHaocong");
        //调用远程服务
        DoOrderResponseWrapper responseWrapper = orderService.doOrder(requestWrapper);
        System.out.println(responseWrapper);

    }
}
