package com.juying.application;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with SXD.
 * Description:
 * User: 36119
 * Date: 2019-06-18
 * Time: 16:11
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String Hello(){
        return "hello";
    }

}
