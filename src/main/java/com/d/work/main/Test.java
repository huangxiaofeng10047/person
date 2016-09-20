package com.d.work.main;
import com.d.work.redis.RedisClientTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/9/20.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac =  new ClassPathXmlApplicationContext("classpath:/data-source.xml");
        RedisClientTemplate redisClient = (RedisClientTemplate)ac.getBean("redisClientTemplate");
//        for(int i=0;i<10000;i++){
//            redisClient.set(i+"","i="+i);
//        }
        for(int i=0;i<10000;i++){
            System.out.println(redisClient.get(i+""));
        }
    }
}
