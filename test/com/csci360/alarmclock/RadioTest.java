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
public class RadioTest {
    
    public RadioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setStationNumFM method, of class Radio.
     */
    @Test
    public void testSetStationNumFM() {
        System.out.println("setStationNumFM");
        double x = 99.5;
        Radio instance = new Radio();
        instance.setStationNumFM(x);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStationNumAM method, of class Radio.
     */
    @Test
    public void testSetStationNumAM() {
        System.out.println("setStationNumAM");
        int x = 700;
        Radio instance = new Radio();
        instance.setStationNumAM(x);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setradioSetting method, of class Radio.
     */
    @Test
    public void testSetradioSetting() {
        System.out.println("setradioSetting");
        boolean x = false;
        Radio instance = new Radio();
        instance.setradioSetting(x);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStationNumFM method, of class Radio.
     */
    @Test
    public void testGetStationNumFM() {
        System.out.println("getStationNumFM");
        Radio instance = new Radio();
        instance.setStationNumFM(99.5);
        double expResult = 99.5;
        double result = instance.getStationNumFM();
        assertEquals(expResult, result, 99.5);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStationNumAM method, of class Radio.
     */
    @Test
    public void testGetStationNumAM() {
        System.out.println("getStationNumAM");
        Radio instance = new Radio();
        int expResult = 400;
        instance.setStationNumAM(400);
        int result = instance.getStationNumAM();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRadioSetting method, of class Radio.
     */
    @Test
    public void testGetRadioSetting() {
        System.out.println("getRadioSetting");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.getRadioSetting();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isIsON method, of class Radio.
     */
    @Test
    public void testIsIsON() {
        System.out.println("isIsON");
        Radio instance = new Radio();
        boolean expResult = false;
        boolean result = instance.isIsON();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIsON method, of class Radio.
     */
    @Test
    public void testSetIsON() {
        System.out.println("setIsON");
        boolean isON = false;
        Radio instance = new Radio();
        instance.setIsON(isON);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   


    /**
     * Test of toString method, of class Radio.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Radio instance = new Radio();
        String expResult = "FM: 99.5";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
