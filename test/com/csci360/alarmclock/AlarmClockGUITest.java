/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csci360.alarmclock;

import javafx.stage.Stage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MatthewKay
 */
public class AlarmClockGUITest {
    
    public AlarmClockGUITest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class AlarmClockGUI.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AlarmClockGUI.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class AlarmClockGUI.
     */
    @Test
    public void testStart() throws Exception {
        System.out.println("start");
        Stage stage = new Stage();
        AlarmClockGUI instance = new AlarmClockGUI();
        instance.start(stage);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
