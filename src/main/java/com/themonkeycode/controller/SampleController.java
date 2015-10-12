package com.themonkeycode.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Monkey Code Spring Boot - Sample Controller
 */
@RestController
public class SampleController {

    @RequestMapping("/hello")
    String treeHome() {
        return "Hello Monkey!";
    }
}
