package bootwildfly;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWildFlyController {


    @RequestMapping("hello")
    public String sayHello1(){
        return ("Hello, SpringBoot on Wildfly");
    }
    
    @RequestMapping("/")
    public String sayHello2(){
        return ("Hello, SpringBoot on Wildfly 13222424");
    }
}