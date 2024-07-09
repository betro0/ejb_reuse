package com.calculator.jsf;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import com.calculator.ejb.CalculatorService;
@Named
@RequestScoped
public class CalculatorBean {
    private double num1;
    private double num2;
    private double result;
    private String operation;

    @EJB
    private CalculatorService calculatorService;

    public void calculate() {
        switch (operation) {
            case "add":
                result = calculatorService.add(num1, num2);
                break;
            case "subtract":
                result = calculatorService.subtract(num1, num2);
                break;
            case "multiply":
                result = calculatorService.multiply(num1, num2);
                break;
            case "divide":
                try {
                    result = calculatorService.divide(num1, num2);
                } catch (ArithmeticException e) {
                    result = Double.NaN;
                }
                break;
        }
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}

