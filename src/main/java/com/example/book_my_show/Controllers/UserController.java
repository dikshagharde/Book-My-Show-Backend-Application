package com.example.book_my_show.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @GetMapping("/printLogs")

    public String printLogs(){
        //Advance way of writing System
        log.trace("This is a trace");
        log.debug("This is a debug");
        log.info("This is a info");

        log.warn("This is a waring");
        log.error("This is a error");

        return "Printed logs";
    }
}
