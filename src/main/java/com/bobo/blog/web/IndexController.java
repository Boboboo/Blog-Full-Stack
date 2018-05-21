package com.bobo.blog.web;


import com.bobo.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
//        int i=9/0;
        String blog=null;
        if(blog==null){
            throw new NotFoundException("BLog is not found...");
        }
        return "index";
    }
}
