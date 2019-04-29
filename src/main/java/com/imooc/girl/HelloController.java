package com.imooc.girl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//相当于@Controller+@ResponseBody
public class HelloController {


    @Value("${cupSize}")
    private String cupS;
    @Value("${age}")
    private Integer age;

    @RequestMapping(value="/hello")
    public String say(){
        return "hello spring boot,"+cupS+","+age;
    }

    //两个地址都能访问到这
    @RequestMapping(value={"/hihi","/hi"})
    public String say2(){
        return "hihi";
    }
}
