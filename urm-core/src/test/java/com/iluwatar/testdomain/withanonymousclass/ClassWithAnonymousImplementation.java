package com.iluwatar.testdomain.withanonymousclass;

public class ClassWithAnonymousImplementation {

    private ClassWithAnonymousImplementation self;

    public ClassWithAnonymousImplementation() {
        Runnable anonImplementation = new Runnable() {
            @Override
            public void run() {}
        };
    }
}