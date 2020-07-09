package study.dubbostudy.dubbouser;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import study.dubbostudy.orderapi.service.OrderService1;
import study.dubbostudy.orderapi.wrapper.DoOrderRequestWrapper;
import study.dubbostudy.orderapi.wrapper.DoOrderResponseWrapper;

/**
 * @author YeHaocong
 * @decription TODO
 * @Date 2020/7/9 20:22
 */

@Component
public class ConsumeOrderService1 {

    @Reference
    private OrderService1 orderService1;

    public void consumeOrderService1(){
        DoOrderRequestWrapper requestWrapper = new DoOrderRequestWrapper();
        requestWrapper.setName("YeHaocong");
        //调用远程服务
        DoOrderResponseWrapper responseWrapper = orderService1.doOrder1(requestWrapper);
        System.out.println(responseWrapper);
    }
}
