package com.example.exam.final_project;


//import java.util.Scanner;

public class AdvancedCalculator implements AdvancedCalculatorInterface {
    // add "implements AdvancedCalculatorInterface"
    // Add the real implementation for the methods and not only the signature.

   
    public double sin(double value) {
        return Math.sin(value);
    }

   
    public double cos(double value) {
        return Math.cos(value);
    }

    public double pi() {
        return Math.PI;
    }

   
    public double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }

   
    public double procent(double delen, double dethela) {
        return (dethela*delen /100);
    }

   
    public double eulers() {
        return Math.E;
    }
    
   public double degreesToRadians (double valueToBeConverted) {
	   double result = valueToBeConverted * (Math.PI/ 180);
	   return result;
   }
   
   public double radiansToDegrees (double valueToBeConverted) {
	   double result = valueToBeConverted * (Math.PI/ 180);
	   return result;
   }
}
  