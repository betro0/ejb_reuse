
package com.calculator.ejb;
import javax.ejb.Local;
@Local
public interface CalculatorService {
  double add(double num1, double num2);
  double subtract(double num1, double num2);
  double multiply(double num1, double num2);
  double divide(double num1, double num2) throws ArithmeticException;  
}
