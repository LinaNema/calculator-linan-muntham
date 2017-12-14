package com.example.exam.final_project;

/**
 * 
 * @author Lina Nema & Muntha Mahmod
 * @param AvancedCalculatorInterface  är skapad för sex olika avancerade räknesätt. 
 *
 */

public interface AdvancedCalculatorInterface {
	// Add the signature for all the methods that need to be implemented. /The methods.
	//For the buttons in the application. 
	
	
	public double sin(double value);
	public double cos(double value);
	public double pi();
	public double pow(double base, double exponent);
	public double procent(double dethela);
	public double eulers(double x);
	
	public double degreesToRadians (double valueToBeConverted);
	public double radiansToDegrees (double valueToBeConverted);
	
	
}
