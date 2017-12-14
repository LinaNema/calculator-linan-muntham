package com.example.exam.final_project;


//import java.util.Scanner;

public class AdvancedCalculator implements AdvancedCalculatorInterface {
    // add "implements AdvancedCalculatorInterface"
    // Add the real implementation for the methods and not only the signature.

	/**Advanced Calculator. With 6 operations.
	* @author Muntha Mahmod and Lina Nema
	*/
	
    public double sin(double value) {
        return Math.sin(value);
    }
    /**
    @param Value
    *För att få fram resultatet av sin. 
    */

   
    public double cos(double value) {
        return Math.cos(value);
    }
    /**
    @param Konstant värde
    *För att få fram resultatet av cos. 
    */

    public double pi() {
        return Math.PI;
    }
    /**
    @param Value
    *För att få fram resultatet av PI. 
    */
   
    public double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }
    /**
    @param Bas och exponenten av en POw
    *För att få fram resultatet.  
    */
   
    public double procent( double dethela) {
        return (dethela /100);
    }
    /**
    @param Dethela genom 100
    *För att få fram resultatet av procent. 
    */

   
    public double eulers(double x) {
        return Math.exp(x);
        }
    /**
    @param X upphöjt till ett tal. 
    *För att få fram resultatet av eulers . 
    */
    
   public double degreesToRadians (double valueToBeConverted) {
	   double result = valueToBeConverted * (Math.PI/ 180);
	   return result;
	   
	   /**
	    * @param Value DegreesToRadians
	    * För att få fram resultatet av PI.
	    */
   }
   
   public double radiansToDegrees (double valueToBeConverted) {
	   double result = valueToBeConverted * (Math.PI/ 180);
	   return result;
	   /**
	    * @param RadiansToDegrees
	    * För att få resultatet av PI.
	    */
   }
}
  