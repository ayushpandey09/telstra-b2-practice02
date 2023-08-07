package com.telstra.testingDemo;

import com.telstra.entity.TelstraModule;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TelstraModuleDemo {
    private TelstraModule telstraModule;
    @Before
    public void init() {
        telstraModule = new TelstraModule();
        System.out.println("before testing");
    }
    @Test
    public void getBandwithTest() {
        System.out.println("Bandwidth Test");
        Assert.assertEquals(65.7, telstraModule.getBandwidth("BSNL"), 0.1);
        Assert.assertEquals(79.5, telstraModule.getBandwidth("Jio"), 0.1);
        Assert.assertEquals(83.6, telstraModule.getBandwidth("Airtel"), 0.1);
        Assert.assertEquals(84.5, telstraModule.getBandwidth("Vodafone"), 0.1);
    }
    @Test
    public void getOpticalFiberTest(){
        System.out.println("Optical fiber test");
            Assert.assertTrue(telstraModule.isOpticalEnabled("BSNL"));
            Assert.assertFalse(telstraModule.isOpticalEnabled("Jio"));
        }
}
