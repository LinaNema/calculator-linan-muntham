package com.example.exam.final_project;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class BasicCalculatorTest {
	BasicCalculator bc = new BasicCalculator();
	Random random = new Random();
	private static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());
	

	@Test
	public void testAddition() {
		double firstNumber = 0.0;
		double secondNumber = 0.0;
		double result = 0.0;
		
		for (int i = 0; i < 50; i++) {
			firstNumber = random.nextDouble() * 100;
			secondNumber = random.nextDouble() * 100;
			result = firstNumber + secondNumber;
			LOG.info("Testing the method addition with"+ firstNumber + " and "+ secondNumber);
			assertEquals(bc.add(firstNumber, secondNumber), result, 0);
		}
	}
		
		@Test
		public void testSubtracktion() {
			double firstNumber = 0.0;
			double secondNumber = 0.0;
			double result = 0.0;
			
			for (int i = 0; i < 50; i++) {
				firstNumber = random.nextDouble() * 100;
				secondNumber = random.nextDouble() * 100;
				result = firstNumber - secondNumber;
				LOG.info("Testing the method subtracktion with"+ firstNumber + " and "+ secondNumber);
				assertEquals(bc.subtrackt(firstNumber, secondNumber), result, 0);
			}
		}
		@Test
		public void testMultiplication() {
			double firstNumber = 0.0;
			double secondNumber = 0.0;
			double result = 0.0;
				
			for (int i = 0; i < 50; i++) {
				firstNumber = random.nextDouble() * 100;
				secondNumber = random.nextDouble() * 100;
				result = firstNumber * secondNumber;
				LOG.info("Testing the method multiplication with"+ firstNumber + " and "+ secondNumber);
				assertEquals(bc.multiply(firstNumber, secondNumber), result, 0);
			}
		}
				
		@Test
		public void testDivision() {
			double firstNumber = 0.0;
			double secondNumber = 0.0;
			double result = 0.0;
					
			for (int i = 0; i < 50; i++) {
				firstNumber = random.nextDouble() * 100;
				secondNumber = random.nextDouble() * 100;
				result = firstNumber / secondNumber;
				LOG.info("Testing the method division with"+ firstNumber + " and "+ secondNumber);
				assertEquals(bc.divide(firstNumber, secondNumber), result, 0);
				}
		}
}
