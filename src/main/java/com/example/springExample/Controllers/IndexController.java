package com.example.springExample.Controllers;


import com.example.springExample.Responces.IndexResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class IndexController {


    @RequestMapping("/")
    public String getResponse() {
        return "index.html";
    }

}
