/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MatthewKay
 */
public class SystemControllerTest {
    
    public SystemControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

  

    /**
     * Test of runSystem method, of class SystemController.
     */
    @Test
    public void testRunSystem() {
        System.out.println("runSystem");
        SystemController instance = new SystemController();
        instance.runSystem();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    


    

    /**
     * Test of stopSystem method, of class SystemController.
     */
    @Test
    public void testStopSystem() {
        System.out.println("stopSystem");
        SystemController instance = new SystemController();
        instance.stopSystem();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkAlarm1 method, of class SystemController.
     */
    @Test
    public void testCheckAlarm1() {
        System.out.println("checkAlarm1");
        SystemController instance = new SystemController();
        instance.checkAlarm1();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkAlarm2 method, of class SystemController.
     */
    @Test
    public void testCheckAlarm2() {
        System.out.println("checkAlarm2");
        SystemController instance = new SystemController();
        instance.checkAlarm2();
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of alarm1GoingOff method, of class SystemController.
     */
    @Test
    public void testAlarm1GoingOff() {
        System.out.println("alarm1GoingOff");
        SystemController instance = new SystemController();
        boolean expResult = false;
        boolean result = instance.alarm1GoingOff();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of alarm2GoingOff method, of class SystemController.
     */
    @Test
    public void testAlarm2GoingOff() {
        System.out.println("alarm2GoingOff");
        SystemController instance = new SystemController();
        boolean expResult = false;
        boolean result = instance.alarm2GoingOff();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isalarm1on method, of class SystemController.
     */
    @Test
    public void testIsalarm1on() {
        System.out.println("isalarm1on");
        SystemController instance = new SystemController();
        boolean expResult = true;
        boolean result = instance.isalarm1on();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isalarm2on method, of class SystemController.
     */
    @Test
    public void testIsalarm2on() {
        System.out.println("isalarm2on");
        SystemController instance = new SystemController();
        boolean expResult = false;
        boolean result = instance.isalarm2on();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of snooze method, of class SystemController.
     */
    @Test
    public void testSnooze() {
        System.out.println("snooze");
        SystemController instance = new SystemController();
        instance.snooze();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAlarm1 method, of class SystemController.
     */
    @Test
    public void testSetAlarm1() {
        System.out.println("setAlarm1");
        int hours1 = 5;
        int minutes1 = 50;
        boolean isPM1 = true;
        SystemController instance = new SystemController();
        instance.setAlarm1(hours1, minutes1, isPM1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAlarm2 method, of class SystemController.
     */
    @Test
    public void testSetAlarm2() {
        System.out.println("setAlarm2");
        int hours1 = 4;
        int minutes1 = 40;
        boolean isPM1 = true;
        SystemController instance = new SystemController();
        instance.setAlarm2(hours1, minutes1, isPM1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    

    /**
     * Test of changetime method, of class SystemController.
     */
    @Test
    public void testChangetime() {
        System.out.println("changetime");
        int hours = 3;
        int min = 3;
        int sec = 39;
        boolean pm = true;
        SystemController instance = new SystemController();
        instance.changetime(hours, min, sec, pm);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setalarm1ONOFF method, of class SystemController.
     */
    @Test
    public void testSetalarm1ONOFF() {
        System.out.println("setalarm1ONOFF");
        boolean on = true;
        SystemController instance = new SystemController();
        instance.setalarm1ONOFF(on);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setalarm2ONOFF method, of class SystemController.
     */
    @Test
    public void testSetalarm2ONOFF() {
        System.out.println("setalarm2ONOFF");
        boolean on = true;
        SystemController instance = new SystemController();
        instance.setalarm2ONOFF(on);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deactivatealarm1 method, of class SystemController.
     */
    @Test
    public void testDeactivatealarm1() {
        System.out.println("deactivatealarm1");
        SystemController instance = new SystemController();
        instance.deactivatealarm1();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deactivatealarm2 method, of class SystemController.
     */
    @Test
    public void testDeactivatealarm2() {
        System.out.println("deactivatealarm2");
        SystemController instance = new SystemController();
        
        instance.deactivatealarm2();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of changeradiosetting method, of class SystemController.
     */
    @Test
    public void testChangeradiosetting() {
        System.out.println("changeradiosetting");
        String am = "";
        SystemController instance = new SystemController();
        instance.changeradiosetting(am);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRadioSetting method, of class SystemController.
     */
    @Test
    public void testGetRadioSetting() {
        System.out.println("getRadioSetting");
        SystemController instance = new SystemController();
        boolean expResult = false;
        boolean result = instance.getRadioSetting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAMradio method, of class SystemController.
     */
    @Test
    public void testSetAMradio() {
        System.out.println("setAMradio");
        int num = 700;
        SystemController instance = new SystemController();
        instance.setAMradio(num);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFMradio method, of class SystemController.
     */
    @Test
    public void testSetFMradio() {
        System.out.println("setFMradio");
        double num1 = 99.5;
        SystemController instance = new SystemController();
        instance.setFMradio(num1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTime method, of class SystemController.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        SystemController instance = new SystemController();
        String expResult = "12:00:00 PM";
        String result = instance.getTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAlarm1Time method, of class SystemController.
     */
    @Test
    public void testGetAlarm1Time() {
        System.out.println("getAlarm1Time");
        SystemController instance = new SystemController();
        String expResult = "12 : 01 PM";
        String result = instance.getAlarm1Time();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAlarm2Time method, of class SystemController.
     */
    @Test
    public void testGetAlarm2Time() {
        System.out.println("getAlarm2Time");
        SystemController instance = new SystemController();
        String expResult = "12 : 00 PM";
        String result = instance.getAlarm2Time();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRadioToString method, of class SystemController.
     */
    @Test
    public void testGetRadioToString() {
        System.out.println("getRadioToString");
        SystemController instance = new SystemController();
        String expResult = "FM: 99.5";
        String result = instance.getRadioToString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
