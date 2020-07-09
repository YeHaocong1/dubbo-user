package study.dubbostudy.dubbouser;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.dubbostudy.dubbouser.config.ConsumerConfig;

/**
 * @author YeHaocong
 * @decription TODO
 * @Date 2020/7/9 20:27
 */

public class AnnotationStartApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfig.class);
        ConsumeOrderService1 consumeOrderService1 = (ConsumeOrderService1) context.getBean("consumeOrderService1");
        consumeOrderService1.consumeOrderService1();
    }
}
