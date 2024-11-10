package com.example.demo.controller;

import com.example.demo.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

            @GetMapping("/greet")
           public String hello(@RequestParam String  name) {
                //Since RequestParam accept only simple obj(like String, int)
                //create new object pf class and set the name.
                User user = new User();
                user.setName(name);
                return "Hello, "+user.getName()+"!";
            }
            @PostMapping("/farewell")
             public String bye(@RequestBody User name){
                return "Goodbye , "+name.getName()+"!";
                }

}
