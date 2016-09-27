package n.attt.controller;

import n.attt.bean.Greeting;
import n.attt.serivce.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Administrator on 2016/9/27.
 */
@RestController
public class GreetingController {
    @Autowired
    GreetingService greetingService;

    @RequestMapping("/greeting")
    public
    Greeting greeting(
            @RequestParam(value="name", required=false, defaultValue="World") String name) {
        System.out.println("==== in greeting ====");
        return greetingService.generateGreetingMessage(name);
    }
}
