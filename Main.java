// Author: Manas Kumar and Priscilla Ye
/*
  This programs is the perfect time manager for you! 
*/
import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    ArrayList<String> activities = new ArrayList<String>();
    
    System.out.print("How much free time do you have today? (in minutes) ");
    int time = scn.nextInt();
    
    int i = 0;
    while (time < 0) {
      System.out.print("Activity " + i + 1 + ": ");
      activities = scn.next();
      i++;
    }
  }

  /*
    The idea:
    Asks for amount of free time.
    Asks for assignments and he amount of time it takes
    Makes a schedule

    If more time:
    - Make it look fancy
    - Add priority to list
    - Add try-catch for user input
    - Saves it onto a ledger so it can update if they come later (this is only if we have A LOT of time)
  */
}