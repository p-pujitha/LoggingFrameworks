/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.log4j2example.Component;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ppujita5
 */
@RestController
public class ComponentController {

    private static Logger logger = LogManager.getLogger(ComponentController.class);

    @RequestMapping("/test")
    public String getComponentDetails() {
        logger.debug("Debug log message ---- ComponentController");
        logger.info("Info log message ---- ComponentController");
        logger.error("Error log message ---- ComponentController");
        return "In Component Controller";
    }
}
