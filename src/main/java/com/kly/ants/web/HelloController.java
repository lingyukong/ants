package com.kly.ants.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * Company:changyou
 *
 * @author konglingyu
 * @Date 2021/4/19 16:12
 */
//@ResponseBody //表示这个类的所有方法都是给浏览器直接返回，直接返回数据（json或者xml格式），不能返回页面
//@Controller
@RestController
public class HelloController {

//    @ResponseBody
    @RequestMapping("/hello")
    public String handle1() {
        return "Hello Spring boot2";
    }
}
