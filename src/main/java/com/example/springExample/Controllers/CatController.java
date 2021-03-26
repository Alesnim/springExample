package com.example.springExample.Controllers;


import com.example.springExample.Models.Cat;
import com.example.springExample.Models.CatColor;
import com.example.springExample.Responces.CatResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cats")
public class CatController {


    @GetMapping(value = "", produces = "application/json")
    public @ResponseBody
    CatResponse getCat() {
        Cat cat = new Cat(2, new CatColor("blue", 2, 2, 2), "Барсик");

        return new CatResponse("OK", 200, cat);
    }


}
