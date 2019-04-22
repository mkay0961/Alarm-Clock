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
public class AlarmTest {
    
    public AlarmTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getIsPM method, of class Alarm.
     */
    @Test
    public void testGetIsPM() {
        System.out.println("getIsPM");
        Alarm instance = new Alarm(1,0,0,false,false);
        boolean expResult = false;
        boolean result = instance.getIsPM();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAlarmNum method, of class Alarm.
     */
    @Test
    public void testGetAlarmNum() {
        System.out.println("getAlarmNum");
        Alarm instance = new Alarm(1,0,0, false,false);
        int expResult = 1;
        int result = instance.getAlarmNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIsAlarmON method, of class Alarm.
     */
    @Test
    public void testGetIsAlarmON() {
        System.out.println("getIsAlarmON");
        Alarm instance = new Alarm(0,0,0, false,false);
        boolean expResult = false;
        boolean result = instance.getIsAlarmON();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getHours method, of class Alarm.
     */
    @Test
    public void testGetHours() {
        System.out.println("getHours");
        Alarm instance = new Alarm(1,7,0, false,false);
        int expResult = 7;
        int result = instance.getHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMinutes method, of class Alarm.
     */
    @Test
    public void testGetMinutes() {
        System.out.println("getMinutes");
        Alarm instance = new Alarm(0,0,56, false,false);
        int expResult = 56;
        int result = instance.getMinutes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIsAlarmON method, of class Alarm.
     */
    @Test
    public void testSetIsAlarmON() {
        System.out.println("setIsAlarmON");
        boolean AlarmON = false;
        Alarm instance = new Alarm(0,0,0, false,false);
        instance.setIsAlarmON(AlarmON);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHours method, of class Alarm.
     */
    @Test
    public void testSetHours() {
        System.out.println("setHours");
        int hours = 4;
        Alarm instance = new Alarm(11,0,0, false,false);
        instance.setHours(hours);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMinutes method, of class Alarm.
     */
    @Test
    public void testSetMinutes() {
        System.out.println("setMinutes");
        int minutes = 55;
        Alarm instance = new Alarm(1,3,20, false,false);
        instance.setMinutes(minutes);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIsPM method, of class Alarm.
     */
    @Test
    public void testSetIsPM() {
        System.out.println("setIsPM");
        boolean isPM = false;
        Alarm instance = new Alarm(0,0,0, false,false);
        instance.setIsPM(isPM);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isIsGoingOff method, of class Alarm.
     */
    @Test
    public void testIsIsGoingOff() {
        System.out.println("isIsGoingOff");
        Alarm instance = new Alarm(0,0,0, false,false);
        boolean expResult = false;
        boolean result = instance.isIsGoingOff();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIsGoingOff method, of class Alarm.
     */
    @Test
    public void testSetIsGoingOff() {
        System.out.println("setIsGoingOff");
        boolean isGoingOff = true;
        Alarm instance = new Alarm(0,0,0, false,false);
        instance.setIsGoingOff(isGoingOff);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSeconds method, of class Alarm.
     */
    @Test
    public void testGetSeconds() {
        System.out.println("getSeconds");
        Alarm instance = new Alarm(0,0,0,false,false);
        int expResult = 23;
        instance.setSeconds(23);
        int result = instance.getSeconds();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setSeconds method, of class Alarm.
     */
    @Test
    public void testSetSeconds() {
        System.out.println("setSeconds");
        int seconds = 35;
        Alarm instance = new Alarm(0,0,0, false,false);
        instance.setSeconds(seconds);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Alarm.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Alarm instance = new Alarm(5,5,5,true,true);
        String expResult = "5 : 05 PM";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   
   
    
}
