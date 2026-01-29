package com.impact.lessons.server;

import com.impact.lessons.constants.ApConstants;

public class HelloService {

    public HelloService() {
        ApConstants apConstants = new ApConstants();
    }

    public String sayHallo(){
        return ApConstants.HellloWorld;
    }
}
