package org.cfs;

public class Motor {
    public Motor(){
        System.out.println("Motor constructor...");
    }

    public void start(){
        System.out.println("Motor is started...");
    }

    public void doWork(){
        System.out.println("Motor pumping water..");
    }

    public void stop(){
        System.out.println("Motor is stoped...");
    }
}
