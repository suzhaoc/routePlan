package com.stone.controller;

import lombok.extern.java.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaoc on 2017/4/20.
 */
@RestController
@RequestMapping("/test")
@Log
public class HolleWordController {
    private final static Logger logger = LoggerFactory.getLogger(HolleWordController.class);

    @RequestMapping(value = "/{say}/hello")
    public String hello(@PathVariable(value = "say") String s) {
        log.info("say:" + s);
        logger.info("say={}", s);
        return s;
    }
}
