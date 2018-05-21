package com.bobo.blog.web;


import ch.qos.logback.core.net.SyslogOutputStream;
import com.bobo.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class IndexController {

//    @GetMapping("/{id}/{name}")
//    public String index(@PathVariable Integer id, @PathVariable String name){
//
//        System.out.println("--------id----------name------------");
//
//        return "index";
//   }


    @GetMapping()
    public String index(){
        return "index";
    }
}
