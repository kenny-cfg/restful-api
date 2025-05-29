package com.kenny.wenny.restful.restful_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemonstrationController {
    @GetMapping("/violeta")
    @ResponseBody
    public String get() {
        return "demonstration";
    }
}
