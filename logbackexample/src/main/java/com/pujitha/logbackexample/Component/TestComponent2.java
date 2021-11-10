/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pujitha.logbackexample.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author ppujita5
 */
@Component
public class TestComponent2 extends DemoLog{
    private static final Logger lOG = LoggerFactory.getLogger(TestComponent2.class);
 
 
    @PostConstruct
    public void setup() {
        logStatements(lOG,"-inside TestComponent2.setup() ");
    }
 
    @PreDestroy
    public void clean() {
        logStatements(lOG,"-inside TestComponent2.clean() ");
    }
}
