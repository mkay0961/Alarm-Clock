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
public class ClockTest {
    
    public ClockTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Clock method, of class Clock.
     */
    @Test
    public void testClock() {
        System.out.println("Clock");
        Clock instance = new Clock();
        instance.Clock();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHours method, of class Clock.
     */
    @Test
    public void testSetHours() {
        System.out.println("setHours");
        int hours = 3;
        Clock instance = new Clock();
        instance.setHours(hours);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMinutes method, of class Clock.
     */
    @Test
    public void testSetMinutes() {
        System.out.println("setMinutes");
        int minutes = 0;
        Clock instance = new Clock();
        instance.setMinutes(minutes);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSeconds method, of class Clock.
     */
    @Test
    public void testSetSeconds() {
        System.out.println("setSeconds");
        int seconds = 56;
        Clock instance = new Clock();
        instance.setSeconds(seconds);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIsPM method, of class Clock.
     */
    @Test
    public void testSetIsPM() {
        System.out.println("setIsPM");
        boolean isPM = false;
        Clock instance = new Clock();
        instance.setIsPM(isPM);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAlarm1 method, of class Clock.
     */
    @Test
    public void testSetAlarm1() {
        System.out.println("setAlarm1");
        int hours1 = 5;
        int minutes1 = 56;
        boolean isPM1 = true;
        Clock instance = new Clock();
        instance.setAlarm1(hours1, minutes1, isPM1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAlarm2 method, of class Clock.
     */
    @Test
    public void testSetAlarm2() {
        System.out.println("setAlarm2");
        int hours1 = 0;
        int minutes1 = 0;
        boolean isPM1 = false;
        Clock instance = new Clock();
        instance.setAlarm2(hours1, minutes1, isPM1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAlarm1ON method, of class Clock.
     */
    @Test
    public void testSetAlarm1ON() throws NullPointerException {
        System.out.println("setAlarm1ON");
        boolean isON = true;
        Clock instance = new Clock();
        
        instance.setAlarm1ON(isON);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAlarm2ON method, of class Clock.
     */
    @Test
    public void testSetAlarm2ON() {
        System.out.println("setAlarm2ON");
        boolean isON = true;
        Clock instance = new Clock();
        
        instance.setAlarm2ON(isON);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHours method, of class Clock.
     */
    @Test
    public void testGetHours() {
        System.out.println("getHours");
        Clock instance = new Clock();
        int expResult = 11;
        instance.setHours(11);
        int result = instance.getHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMinutes method, of class Clock.
     */
    @Test
    public void testGetMinutes() {
        System.out.println("getMinutes");
        Clock instance = new Clock();
        int expResult = 0;
        int result = instance.getMinutes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSeconds method, of class Clock.
     */
    @Test
    public void testGetSeconds() {
        System.out.println("getSeconds");
        Clock instance = new Clock();
        int expResult = 30;
        instance.setSeconds(30);
        int result = instance.getSeconds();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isIsPM method, of class Clock.
     */
    @Test
    public void testIsIsPM() {
        System.out.println("isIsPM");
        Clock instance = new Clock();
        boolean expResult = false;
        boolean result = instance.isIsPM();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Clock.
     */
    
    @Test
    public void testIncrementClock() {
        System.out.println("incrementClock");
        Clock instance = new Clock();
        instance.incrementClock();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkAlarm1 method, of class Clock.
     */
    @Test
    public void testCheckAlarm1() {
        System.out.println("checkAlarm1");
        int hours = 4;
        int minutes = 4;
        int seconds = 4;
        boolean isPM = true;
        Clock instance = new Clock();
        boolean expResult = false;
        boolean result = instance.checkAlarm1(hours, minutes, seconds, isPM);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkAlarm2 method, of class Clock.
     */
    @Test
    public void testCheckAlarm2() {
        System.out.println("checkAlarm2");
        int hours = 2;
        int minutes = 2;
        int seconds = 2;
        boolean isPM = true;
        Clock instance = new Clock();
        boolean expResult = false;
        boolean result = instance.checkAlarm2(hours, minutes, seconds, isPM);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of activateAlarm1 method, of class Clock.
     */
    @Test
    public void testActivateAlarm1() {
        System.out.println("activateAlarm1");
        Clock instance = new Clock();
        instance.activateAlarm1();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of activateAlarm2 method, of class Clock.
     */
    @Test
    public void testActivateAlarm2() {
        System.out.println("activateAlarm2");
        Clock instance = new Clock();
        instance.activateAlarm2();
       
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deactivateAlarm1 method, of class Clock.
     */
    @Test
    public void testDeactivateAlarm1() {
        System.out.println("deactivateAlarm1");
        Clock instance = new Clock();
        instance.deactivateAlarm1();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deactivateAlarm2 method, of class Clock.
     */
    @Test
    public void testDeactivateAlarm2() {
        System.out.println("deactivateAlarm2");
        Clock instance = new Clock();
        instance.deactivateAlarm2();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of snoozealarm1 method, of class Clock.
     */
    @Test
    public void testSnoozealarm1() {
        System.out.println("snoozealarm1");
        Clock instance = new Clock();
        instance.snoozealarm1();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of snoozealarm2 method, of class Clock.
     */
    @Test
    public void testSnoozealarm2() {
        System.out.println("snoozealarm2");
        Clock instance = new Clock();
        instance.snoozealarm2();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Clock.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Clock instance = new Clock();
        String expResult = "0:00:00 AM";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
