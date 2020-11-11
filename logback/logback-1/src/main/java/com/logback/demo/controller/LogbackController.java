package com.logback.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LogbackController
 * @Description LogbackController
 * @Author miaolei
 * @Date 2020/11/11 22:28
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/logback")
public class LogbackController {

    @GetMapping("/recordLog")
    public void recordLog() {
        int count = 100;
        for (int i = 0; i < count; i++) {
            log.info("i = {}", i);
            log.debug("Debug log, please look the logs in debug log files.");
            log.info("Info log, please look the logs in info log files.");
            log.warn("Warn log, please look the logs in warn log files.");
            log.error("Error log, please look the logs in error log files.");
        }
    }

}
