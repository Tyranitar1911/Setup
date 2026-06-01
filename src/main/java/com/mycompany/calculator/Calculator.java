/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

/**
 *
 * @author Khang Vu
 */
public class Calculator {
    public double divide(double i, double j) {
        if(j == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return i/j;
    }
    
}
