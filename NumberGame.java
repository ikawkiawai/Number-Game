import java.util.Scanner;

class NumberGame {
  public static void main(String[] args) {
    //Creating the double vairables Random and userNum
    //Random creates a random number from 1-100
    //userNum is early creation of the user's input variable
    double Random = Math.round(Math.random()*100);
    double userNum = 0;
    //Scanner to catch user input
    Scanner input = new Scanner(System.in); 
    //Loop until user guess is correct:
    while (userNum != Random) {
      //Makes the scanner check for the line after
      System.out.println("Guess a Number:");
      userNum = input.nextDouble();
      //Say how close number is via 'higher', 'lower', 'correct'
      if (userNum > Random) {
        System.out.println("Your number is higher.");
      } else if (userNum < Random) {
        System.out.println("Your number is lower.");
      } else {
        System.out.println("Correct!");
      }
    }
  }
}