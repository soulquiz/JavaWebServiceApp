/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorws_client_application;

/**
 *
 * @author soulq
 */
public class CalculatorWS_Client_Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int i = 10;
            int j = 2;
            int result = add(i, j);
            System.out.println(i + " Add " + j + " Result = " + result);
            
            result = subtraction(i, j);
            System.out.println(i + " Substraction " + j + " Result = " + result);
            
            result = multiply(i, j);
            System.out.println(i + " Multiply " + j + " Result = " + result);
            
            result = divide(i, j);
            System.out.println(i + " Divide " + j + " Result = " + result);
            
            } catch (Exception ex) {
                System.out.println("Exception: " + ex);
            }
    }

    private static int add(int i, int j) {
        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.add(i, j);
    }

    private static int divide(int i, int j) {
        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.divide(i, j);
    }

    private static int multiply(int i, int j) {
        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.multiply(i, j);
    }

    private static int subtraction(int i, int j) {
        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.subtraction(i, j);
    }
    
    
}
