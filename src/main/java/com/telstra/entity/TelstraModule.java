package com.telstra.entity;

public class TelstraModule {
    public double getBandwidth(String serviceName){
        if(serviceName.equalsIgnoreCase("BSNL")){
            return 65.7;
        } else if (serviceName.equalsIgnoreCase("Jio")) {
            return 79.5;
        } else if (serviceName.equalsIgnoreCase("Airtel")) {
            return 83.6;
        }else {
            return 84.5;
        }
    }

    public boolean isOpticalEnabled(String serviceName){
        if(serviceName.equalsIgnoreCase("BSNL")){
            return true;
        } else if (serviceName.equalsIgnoreCase("Jio")) {
            return false;
        } else if (serviceName.equalsIgnoreCase("Airtel")) {
            return true;
        }else {
            return false;
        }
    }


}
