/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import applicationcalculatricetest.Calculatrice;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Inclusiv-PC07
 */
public class CalculatriceTest {
    @Test
    public void  testAddition() {
    Calculatrice additionTest = new Calculatrice ();
    assertEquals(4,additionTest.addition(2, 2),0.0001);
    assertEquals(0,additionTest.addition(2, -2),0.0001);
    assertEquals(2,additionTest.addition(2, 0),0.0001);
    }
    
    @Test
    public void  testSoustraction() {
    Calculatrice soustractionTest = new Calculatrice ();
    assertEquals(0,soustractionTest.soustraction(2, 2),0.0001);
    assertEquals(-4,soustractionTest.soustraction(-2, 2),0.0001);
    assertEquals(2,soustractionTest.soustraction(2, 0),0.0001);
    }
    
     @Test
    public void  testMultiplication() {
    Calculatrice multiplicationTest = new Calculatrice ();
    assertEquals(6,multiplicationTest.multiplication(3, 2),0.0001);
    assertEquals(-6,multiplicationTest.multiplication(-3, 2),0.0001);
    assertEquals(0,multiplicationTest.multiplication(3, 0),0.0001);
    }
    
      @Test
    public void  testDivision() {
    Calculatrice divisionTest = new Calculatrice ();
    assertEquals(2,divisionTest.division(4, 2),0.0001);
    assertEquals(-2,divisionTest.division(-4, 2),0.0001);
    try {
            divisionTest.division(4,0);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Division par zéro impossible !", e.getMessage());
        }
   
    }
    
    }
    

