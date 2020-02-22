package com.sollers.calcapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(origins="*",allowedHeaders="*")
public class HomeController {

    @GetMapping(value="/home")
    @ResponseBody
    public ResponseEntity<HomeController> Home() {
        return null;
    }

}
