package n.attt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2016/9/27.
 */
@Configuration
@SpringBootApplication
public class FirstSpringBootDemo {

    public static void main(String[] args){
        SpringApplication.run(FirstSpringBootDemo.class,args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
    }
}
