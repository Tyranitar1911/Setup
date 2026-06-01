/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.calculator.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Khang Vu
 */
public class CalculatorTest {
    
     @Test
     void testDivideNumbers() {
         Calculator c = new Calculator();
         
         //act
         assertEquals(2, c.divide(4, 2));
     }
     
     @Test
     void testDivideByZero() {
         Calculator c = new Calculator();
         
         Assertions.assertThrows(ArithmeticException.class, ()->c.divide(3, 0));
     }
}
