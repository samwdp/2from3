/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pkg3to2.Interface;

/**
 *
 * @author samwdp
 */
public class InterfaceTest {
    
    static Interface i;
    
    public InterfaceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        i = new Interface();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void checkDice1(){
        int number1 = 3;
        int number2 = 3;
        int number3 = 2;
        
        int expected = 2;
        int result = i.getDice1(number1, number2, number3);
        
        assertEquals(expected, result);
    }
    
    @Test
    public void checkDice2(){
        int dice1 = 6;
        int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        
        int expected = 5;
        int result = i.getDice2(dice1, number1, number2, number3);
        assertEquals(expected, result);
    }
    
    @Test
    public void calculateDifferentTest(){
        int i1 = 2;
        int i2 = 2;
        int i3 = 1;
        
        int expected = 2;
        int result = i.calculateDifferent(i1, i2, i3);
        
        assertEquals(expected, result);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
