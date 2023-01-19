package com.automation.steps.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class Hooks {
    @Before
    public void setUp(){
        System.out.println("Before each Scenario");
    }
    @After

    public void cleanUp(){
        System.out.println("After Each Scenario");
    }
}
