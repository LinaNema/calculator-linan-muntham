package com.example.exam.final_project;

//import java.util.Scanner;
//import java.util.Locale;
import java.util.Scanner;

/**
* Simple Calculator. With 4 operations, 2 of them is variables without
* exceptions and while loop.
*
* @author Muntha Mahmod and Lina Nema
*
*/

public class BasicCalculator implements BasicCalculatorInterface {
  Scanner scan = new Scanner(System.in);

  public void showMenu() {
      System.out.println("1.Addition");
      System.out.println("2.Subtracktion");
      System.out.println("3.Multiplication");
      System.out.println("4.Division");

  }

  /**
   *
   * @param firstNumber
   *            - as a double
   * @param secondNumber
   *            - as a double
   * @return För att få fram resultat av addition.
   */

  public double add(double firstNumber, double secondNumber) {
      return firstNumber + secondNumber;

  }

  /**
   *
   * @param firstNumber
   *            - as a double
   * @param secondNumber
   *            - as a double
   * @return För att få fram resultat av subtracktion.
   */

  public double subtrackt(double firstNumber, double secondNumber) {
      return firstNumber - secondNumber;

  }

  /**
   *
   * @param firstNumber
   *            - as a double
   * @param secondNumber
   *            - as a double
   * @return För att få fram resultat av multiplication.
   */
  public double multiply(double firstNumber, double secondNumber) {
      return firstNumber * secondNumber;

  }

  /**
   *
   * @param firstNumber
   *            - as a double
   * @param secondNumber
   *            - as a double
   * @return För att få fram resultat av division.
   */
  public double divide(double firstNumber, double secondNumber) {
      if (secondNumber == 0) {
          System.out.println("Error! Dividing by zero is not allowed");
          return 0;
      } else {
          return firstNumber / secondNumber;
      }
  }

  public double modulo(double firstNumber, double secondNumber) {
      if (secondNumber == 0) {
          System.out.println("Error! Dividing by zero is not allowed");

      } else {
          return firstNumber / secondNumber;
      }
      return secondNumber;

  }
}
