package com.helpshift.jfresh;

import java.util.Map;
import java.util.Scanner;

public class Module1Exercise {

  public static void main(String[] args) {
    startSimpleInterestCalculator();
  }

  public static void startSimpleInterestCalculator(){
    boolean appRunning = true;
    // Reading inputs from command line
    Scanner scanner = new Scanner(System.in);

    final Float ANNUAL_INTEREST_RATE = (Float) getUserInput(scanner, "Please enter annual interest rate: ", "FLOAT");

    while (appRunning) {
      Double principal = (Double) getUserInput(scanner, "Please enter principal: ", "DOUBLE");

      Integer timeInYears = (Integer) getUserInput(scanner, "Please enter time in years: ", "INTEGER");

      Double simpleInterest = calcSimpleInterest(principal, ANNUAL_INTEREST_RATE, timeInYears);

      String choice = (String) getUserInput(scanner, "Principal with SI for is: " + simpleInterest +
          "\nDo you want to continue? [Y/N]: ", "STRING");

      if (choice.equalsIgnoreCase("N")) {
        appRunning = false;
        System.out.println("Bye!");
      }
    }
  }

  private static Object getUserInput(Scanner scanner, String message, String inputType) {
    System.out.println(message);
    switch (inputType) {
      case "FLOAT":
        return scanner.nextFloat();
      case "DOUBLE":
        return scanner.nextDouble();
      case "INTEGER":
        return scanner.nextInt();
      case "STRING":
        return scanner.next();
      default:
        System.out.println("Invalid Type, Exiting...");
        return null;
    }
  }

  private static Double calcSimpleInterest(Double principal, final Float annualInterestRate,
      Integer timeInYears) {
    return principal * ((1 + annualInterestRate / 100) * timeInYears);
  }

  /*
    EXERCISES
    Complete the following Java methods
     */

  // 1. The input to the method includes the current annual salary for the employee and a number indicating
  // the performance rating ("excellent", "good", and "poor"). An employee with a rating of "excellent" will receive a 6% raise, an
  // employee with a rating of "good" will receive a 4% raise, and one with a rating of "poor" will receive a 1.5% raise

  public long computeRaise(long currentAnnualSalary, String rating) {
    // add logic here
    return 0l;
  }

  // 2. The input to the method includes a list of all salaries
  // compute the average of all the input salaries grouped by salary bands
  // "band1" : less than $1000, "band2": $1000 >= and <$5000, "band3": >= $5000

  public Map<String, Long> computeAvgSalaryPerBand(long[] salaries) {
    // add logic here
    return null;
  }

  // 3. Try to practise more problems here https://codingbat.com/java
}
