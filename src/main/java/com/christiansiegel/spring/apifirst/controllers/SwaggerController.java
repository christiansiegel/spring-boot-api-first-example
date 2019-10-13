package com.christiansiegel.spring.apifirst.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerController {
    @RequestMapping("/swagger-ui")
    public String redirectToUi() {
        return "redirect:/webjars/swagger-ui/3.20.3/index.html?url=/openapi.yaml";
    }
}
