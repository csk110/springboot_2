package com.accp.springboot_2.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ChenSK
 * @date 2019-06-24 - 14:01
 */
@Controller
public class HellowController {

    @RequestMapping("/hellow")
    public String hellow(HttpServletRequest request){
        request.setAttribute("hi","hellow word");
        return "login";
    }


}
