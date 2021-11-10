/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.logbackexample.Component;

import org.slf4j.Logger;

/**
 *
 * @author ppujita5
 */
public abstract class DemoLog {
    public static void logStatements(Logger logger, String message) {
        logger.trace("log a trace message {}", message);
        logger.debug("log a debug message {}", message);
        logger.info("log a info message {}", message);
        logger.warn("log a warn message {}", message);
        logger.error("log an error message {}", message);
    }
}
