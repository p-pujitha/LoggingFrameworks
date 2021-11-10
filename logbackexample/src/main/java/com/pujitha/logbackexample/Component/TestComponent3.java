/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.logbackexample.Component;

import ch.qos.logback.classic.Level;
import javax.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author ppujita5
 */
@Component
public class TestComponent3 extends DemoLog{
 
    @PostConstruct
    public void setup() {
        ch.qos.logback.classic.Logger logbackLogger = (ch.qos.logback.classic.Logger)LoggerFactory.getLogger(TestComponent3.class);
        logbackLogger.setLevel(Level.ERROR);
        DemoLog.logStatements(logbackLogger, "-inside TestComponent3.setup() ");
    }
}