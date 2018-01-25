package edu.cnm.deepdive.fizzbuzz;

public class FizzBuzz {


  public static final int DEFAULT_LIMIT = 100;

  public static void main(String[] args) {
    int limit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_LIMIT;
    count(limit);
  }

  /**
   *
   * the ineffecient way
   output = Integer.toString(i);
   if (i % 3 == 0 && i % 5 == 0) { //binary operator && is and, also
   output = "Fizz buzz!";
   }
   else if (i % 5 == 0) {
   output = "Buzz!";
   }
   else if (i % 3 == 0) { //i divisiable by 3 and remainer is 0
   output = "Fizz!";
   }
   System.out.println(output);
   * @param fizzLimit   the less effecienct way
   */
  private static void count(int fizzLimit) {
    for (int i = 1; i <= fizzLimit; i++) {
      String output = "";
      if (i % 3 == 0) {
        output += "Fizz!"; // fizz +
      }
      if (i % 5 == 0) {
        output += "Buzz!"; // buzz +; fizz+ Bizz+ display Fizz!Buzz!
      }
      if (output.isEmpty()){
        output = Integer.toString(i);
      }
      System.out.println(output);
    }
  }
}
