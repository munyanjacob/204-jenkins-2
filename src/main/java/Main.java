import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();
    System.out.println("welcome to the calculator\nEnter a command:");
    while (sc.hasNext()) {
      String func = sc.next();
      if (func.equals("add")) {
        System.out.println(calc.add(sc.nextInt(), sc.nextInt()));
      } else if (func.equals("subtract")) {
        System.out.println(calc.subtract(sc.nextInt(), sc.nextInt()));
      } else if (func.equals("multiply")) {
        System.out.println(calc.multiply(sc.nextInt(), sc.nextInt()));
      } else if (func.equals("divide")) {
        System.out.println(calc.divide(sc.nextInt(), sc.nextInt()));
      } else if (func.equals("fibonacci")) {
        System.out.println(calc.fibonacciNumberFinder(sc.nextInt()));
      } else if (func.equals("binary")) {
        System.out.println(calc.intToBinaryNumber(sc.nextInt()));
      }
    }
  }
}
