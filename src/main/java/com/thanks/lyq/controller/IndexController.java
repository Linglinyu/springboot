package com.thanks.lyq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by mac on 16/5/20.
 */
@Controller
public class IndexController {



    @ResponseBody
    @RequestMapping("/json")
    private String indexjson() {

        return "json";
    }

}
