/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slayergame.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chicho
 */
public class DoorBlockControlTest {
    
    public DoorBlockControlTest() {
    }

   //TEST 1 CONE
    public void testConeKeyCalc() {
        System.out.println("calcConeKey");
        double radius = 5;
        double length = 5;
        DoorBlockControl instance = new DoorBlockControl();
        double expResult = 189.61;
        double result = instance.calcConeKey(radius, length);
        assertEquals(expResult, result, 0.0);
    }
    //TEST 2 CONE
    public void testConeKeyCalc2() {
        System.out.println("calcConeKey");
        double radius = 0.0;
        double length = 0.0;
        DoorBlockControl instance = new DoorBlockControl();
        double expResult = 0.0;
        double result = instance.calcConeKey(radius, length);
        assertEquals(expResult, result, 0.0);
    }
    //TEST 3 CONE
    public void testConeKeyCalc3() {
        System.out.println("calcConeKey");
        double radius = 0.0;
        double length = 0.0;
        DoorBlockControl instance = new DoorBlockControl();
        double expResult = 0.0;
        double result = instance.calcConeKey(radius, length);
        assertEquals(expResult, result, 0.0);
    }
    //TEST 4 CONE
    public void testConeKeyCalc4() {
        System.out.println("calcConeKey");
        double radius = 0.0;
        double length = 0.0;
        DoorBlockControl instance = new DoorBlockControl();
        double expResult = 0.0;
        double result = instance.calcConeKey(radius, length);
        assertEquals(expResult, result, 0.0);
    }
    //TEST 5 CONE
    public void testConeKeyCalc5() {
        System.out.println("calcConeKey");
        double radius = 0.0;
        double length = 0.0;
        DoorBlockControl instance = new DoorBlockControl();
        double expResult = 0.0;
        double result = instance.calcConeKey(radius, length);
        assertEquals(expResult, result, 0.0);
    }
    //TEST 6 CONE
    public void testConeKeyCalc6() {
        System.out.println("calcConeKey");
        double radius = 0.0;
        double length = 0.0;
        DoorBlockControl instance = new DoorBlockControl();
        double expResult = 0.0;
        double result = instance.calcConeKey(radius, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }
    //TEST 7 CONE
    public void testConeKeyCalc7() {
        System.out.println("calcConeKey");
        double radius = 0.0;
        double length = 0.0;
        DoorBlockControl instance = new DoorBlockControl();
        double expResult = 0.0;
        double result = instance.calcConeKey(radius, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.

    }

    
    public void testCalcRectanglePer() {
        System.out.println("calcRectanglePer");
        int length = 0;
        int height = 0;
        DoorBlockControl instance = new DoorBlockControl();
        int expResult = 0;
        int result = instance.calcRectanglePer(length, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    

    public void testCalcConeVol() {
        System.out.println("calcConeVol");
        double radiusVol = 0.0;
        double heightVol = 0.0;
        DoorBlockControl instance = new DoorBlockControl();
        double expResult = 0.0;
        double result = instance.calcConeVol(radiusVol, heightVol);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectDoorAnswerVol method, of class DoorBlockControl.
     */
    @Test
    public void testSelectDoorAnswerVol() {
        System.out.println("selectDoorAnswerVol");
        double totalVol = 0.0;
        DoorBlockControl instance = new DoorBlockControl();
        int expResult = 0;
        int result = instance.selectDoorAnswerVol(totalVol);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
