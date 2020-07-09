package study.dubbostudy.dubbouser.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author YeHaocong
 * @decription TODO
 * @Date 2020/7/9 20:26
 */

@Configuration
//开启扫描dubbo注解并设置扫描基础包
@EnableDubbo(scanBasePackages = "study.dubbostudy.dubbouser")
@PropertySource(value = "classpath:order-consumer.properties")
//开启扫描spring组件注解，并设置扫描基础包
@ComponentScan(basePackages = "study.dubbostudy.dubbouser")
public class ConsumerConfig {
}
