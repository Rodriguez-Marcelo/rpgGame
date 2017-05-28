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
public class DoorSphingeControlTest {
    
    public DoorSphingeControlTest() {
    }

    /****************************
     * Test Case 1 - calcConeSA *
     ****************************/
    
    @Test
    public void testCalcConeSA() {
        System.out.println("calcConeSA");
        double radius = 10.0;
        double length = 10.0;
        DoorSphingeControl instance = new DoorSphingeControl();
        double expResult = 376.99;
        double result = instance.calcConeSA(radius, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("Perfect!");
        
    }
    
    /****************************
     * Test Case 2 - calcConeSA *
     ****************************/
    
    @Test
    public void test2CalcConeSA() {
        System.out.println("calcConeSA");
        double radius = -1.0;
        double length = 2.0;
        DoorSphingeControl instance = new DoorSphingeControl();
        double expResult = -12.57;
        double result = instance.calcConeSA(radius, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
        
    }
    
    /****************************
     * Test Case 3 - calcConeSA *
     ****************************/
    
    @Test
    public void test3CalcConeSA() {
        System.out.println("calcConeSA");
        double radius = 5.0;
        double length = -13.0;
        DoorSphingeControl instance = new DoorSphingeControl();
        double expResult = -172.79;
        double result = instance.calcConeSA(radius, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
        
    }
    
    /****************************
     * Test Case 4 - calcConeSA *
     ****************************/
    
    @Test
    public void test4CalcConeSA() {
        System.out.println("calcConeSA");
        double radius = 8.0;
        double length = 21.0;
        DoorSphingeControl instance = new DoorSphingeControl();
        double expResult = 578.05;
        double result = instance.calcConeSA(radius, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
        
    }
    
    /****************************
     * Test Case 5 - calcConeSA *
     ****************************/
    
        @Test
    public void test5CalcConeSA() {
        System.out.println("calcConeSA");
        double radius = 5.0;
        double length = 0.0;
        DoorSphingeControl instance = new DoorSphingeControl();
        double expResult = 31.42;
        double result = instance.calcConeSA(radius, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
        
    }

    /****************************
     * Test Case 6 - calcConeSA *
     ****************************/
    
        @Test
    public void test6CalcConeSA() {
        System.out.println("calcConeSA");
        double radius = 0.0;
        double length = 16.0;
        DoorSphingeControl instance = new DoorSphingeControl();
        double expResult = 0.0;
        double result = instance.calcConeSA(radius, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
        
    }
    
    /****************************
     * Test Case 7 - calcConeSA *
     ****************************/
    
        @Test
    public void test7CalcConeSA() {
        System.out.println("calcConeSA");
        double radius = 4.0;
        double length = 18.0;
        DoorSphingeControl instance = new DoorSphingeControl();
        double expResult = 251.33;
        double result = instance.calcConeSA(radius, length);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
        
    }
    /**********************************************
    **********************************************/
    
    /**********************************
     * Test Case 1 - calcRectanglePer *
     **********************************/

    @Test
    public void test1CalcRectanglePer() {
        System.out.println("calcRectanglePer");
        int length = 10;
        int height = 10;
        DoorSphingeControl instance = new DoorSphingeControl();
        int expResult = 40;
        int result = instance.calcRectanglePer(length, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
    }
    
     /**********************************
     * Test Case 2 - calcRectanglePer *
     **********************************/

    @Test
    public void test2CalcRectanglePer() {
        System.out.println("calcRectanglePer");
        int length = -1;
        int height = 2;
        DoorSphingeControl instance = new DoorSphingeControl();
        int expResult = 2;
        int result = instance.calcRectanglePer(length, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
    }
    
     /**********************************
     * Test Case 3 - calcRectanglePer *
     **********************************/

    @Test
    public void test3CalcRectanglePer() {
        System.out.println("calcRectanglePer");
        int length = 5;
        int height = -13;
        DoorSphingeControl instance = new DoorSphingeControl();
        int expResult = -16;
        int result = instance.calcRectanglePer(length, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
    }
    
     /**********************************
     * Test Case 4 - calcRectanglePer *
     **********************************/

    @Test
    public void test4CalcRectanglePer() {
        System.out.println("calcRectanglePer");
        int length = 10;
        int height = 21;
        DoorSphingeControl instance = new DoorSphingeControl();
        int expResult = 62;
        int result = instance.calcRectanglePer(length, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
    }
    
     /**********************************
     * Test Case 5 - calcRectanglePer *
     **********************************/

    @Test
    public void test5CalcRectanglePer() {
        System.out.println("calcRectanglePer");
        int length = 5;
        int height = 0;
        DoorSphingeControl instance = new DoorSphingeControl();
        int expResult = 10;
        int result = instance.calcRectanglePer(length, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
    }
    
     /**********************************
     * Test Case 6 - calcRectanglePer *
     **********************************/

    @Test
    public void test6CalcRectanglePer() {
        System.out.println("calcRectanglePer");
        int length = 1;
        int height = 16;
        DoorSphingeControl instance = new DoorSphingeControl();
        int expResult = 34;
        int result = instance.calcRectanglePer(length, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
    }
    
     /**********************************
     * Test Case 7 - calcRectanglePer *
     **********************************/

    @Test
    public void test7CalcRectanglePer() {
        System.out.println("calcRectanglePer");
        int length = 4;
        int height = 18;
        DoorSphingeControl instance = new DoorSphingeControl();
        int expResult = 44;
        int result = instance.calcRectanglePer(length, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
    }

    /************************************************************
     * **********************************************************
     */
    
    /**********************************
     * Test Case 1 - calcConeVol      *
     **********************************/
    
    @Test
    public void testCalcConeVol() {
        System.out.println("calcConeVol");
        double radiusVol = 10.0;
        double heightVol = 10.0;
        DoorSphingeControl instance = new DoorSphingeControl();
        double expResult = 1047.2;
        double result = instance.calcConeVol(radiusVol, heightVol);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
    }
    
    /**********************************
     * Test Case 2 - calcConeVol      *
     **********************************/
    
    @Test
    public void test2CalcConeVol() {
        System.out.println("calcConeVol");
        double radiusVol = -1.0;
        double heightVol = 2.0;
        DoorSphingeControl instance = new DoorSphingeControl();
        double expResult = 2.09;
        double result = instance.calcConeVol(radiusVol, heightVol);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
    }
    
    /**********************************
     * Test Case 3 - calcConeVol      *
     **********************************/
    
    @Test
    public void test3CalcConeVol() {
        System.out.println("calcConeVol");
        double radiusVol = 5.0;
        double heightVol = -13.0;
        DoorSphingeControl instance = new DoorSphingeControl();
        double expResult = -340.34;
        double result = instance.calcConeVol(radiusVol, heightVol);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
    }
    
    /**********************************
     * Test Case 4 - calcConeVol      *
     **********************************/
    
    @Test
    public void test4CalcConeVol() {
        System.out.println("calcConeVol");
        double radiusVol = 0.0;
        double heightVol = 16.0;
        DoorSphingeControl instance = new DoorSphingeControl();
        double expResult = 0.0;
        double result = instance.calcConeVol(radiusVol, heightVol);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
    }
    
    /**********************************
     * Test Case 5 - calcConeVol      *
     **********************************/
    
    @Test
    public void test5CalcConeVol() {
        System.out.println("calcConeVol");
        double radiusVol = 5.0;
        double heightVol = 0.0;
        DoorSphingeControl instance = new DoorSphingeControl();
        double expResult = 0.0;
        double result = instance.calcConeVol(radiusVol, heightVol);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
    }
    
    /**********************************
     * Test Case 6 - calcConeVol      *
     **********************************/
    
    @Test
    public void test6CalcConeVol() {
        System.out.println("calcConeVol");
        double radiusVol = 10.0;
        double heightVol = 21.0;
        DoorSphingeControl instance = new DoorSphingeControl();
        double expResult = 2199.11;
        double result = instance.calcConeVol(radiusVol, heightVol);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
    }
    
    /**********************************
     * Test Case 7 - calcConeVol      *
     **********************************/
    
    @Test
    public void test7CalcConeVol() {
        System.out.println("calcConeVol");
        double radiusVol = 4.0;
        double heightVol = 18.0;
        DoorSphingeControl instance = new DoorSphingeControl();
        double expResult = 301.59;
        double result = instance.calcConeVol(radiusVol, heightVol);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println("PASS");
    }

  
    
}
