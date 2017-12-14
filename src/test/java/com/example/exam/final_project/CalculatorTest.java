package com.example.exam.final_project;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.logging.Logger;
import com.example.exam.final_project.AdvancedCalculator;
import com.example.exam.final_project.BasicCalculator;

import org.junit.Test;

public class CalculatorTest {
	AdvancedCalculator aC = new AdvancedCalculator();
	Random random = new Random();
	private static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());

	public double exCalculateDegreesToRadians(double valueToBeConverted) {
		double result = valueToBeConverted * (Math.PI / 180);
		return result;

	}

	public double exCalculateRadiansToDegrees(double valueToBeConverted) {
		double result = valueToBeConverted * (180 / Math.PI);
		return result;

	}

	@Test
	public void testDegreesToRadians() {
		double valueToBeConverted = 0.0;
		for (int i = 0; i < 10; i++) {

			valueToBeConverted = random.nextDouble() * 360;
			LOG.info("Testing the method degreesToRadians with the value = " + valueToBeConverted);
			assertEquals(exCalculateDegreesToRadians(valueToBeConverted), aC.radiansToDegrees(valueToBeConverted), 1);
		}
	}
	/**
	 *@param Testing the method with Sin. 
	 */

	@Test
	public void testSin() {
		double firstNumber = 0.0;
		double result = 0.0;

		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble() * 2 * Math.PI;
			result = Math.sin(firstNumber);
			LOG.info("Testing the method sin with" + firstNumber);
			assertEquals(aC.sin(firstNumber), result, 0.1);
		}
	}
	/**
	 * @param Testing the method with Cos.
	 */

	@Test
    public void testCos() {
        double firstNumber = 0.0;
        double result = 0.0;
       
        for (int i = 0; i < 50; i++) {
            firstNumber = random.nextDouble() * 2 * Math.PI;
            result = Math.cos(firstNumber);
            LOG.info("Testing the method cos with"+ firstNumber);
            assertEquals(aC.cos(firstNumber),result, 0.1);
        }
    }
/**
 * @param Testing the method pow
 */
	@Test
    public void testPow() {
        double firstNumber = 0.0;
        double secondNumber = 0.0;
        double result = 0.0;
       
        for (int i = 0; i < 50; i++) {
            firstNumber = random.nextDouble() * 100;
            secondNumber = random.nextDouble() * 5;
            result = Math.pow(firstNumber, secondNumber);
            LOG.info("Testing the method pow with"+ firstNumber +"and" + secondNumber);
            assertEquals(aC.pow(firstNumber , secondNumber),result, 0.1);
           
        }
    }
	@Test
    public void testProcent() {
        double firstNumber = 0.0;
        double result = 0.0;
       
        for (int i = 0; i < 50; i++) {
            firstNumber = random.nextDouble() * 100;
            result = (firstNumber / 100);
            LOG.info("Testing the method procent with"+ firstNumber);
            assertEquals(aC.procent(firstNumber),result, 0);
            
            /**
        	 * @param Testing the method with Procent.
        	 */
        }
	}
	
	@Test
    public void testEulers() {
        double secondNumber = 0.0;
        double result = 0.0;
       
        for (int i = 0; i < 50; i++) {
            secondNumber = random.nextDouble() * 20;
            result = Math.exp( secondNumber);
            LOG.info("Testing the method eulers with"+ secondNumber);
            assertEquals(aC.eulers(secondNumber),result, 0.01);
            
            /**
        	 * @param Testing the method with Eulers.
        	 */
        }
	}
}