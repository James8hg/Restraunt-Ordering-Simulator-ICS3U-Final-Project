// Tracks the receipt 
// There is a feature to increase the array when the user adds new food and to delete from the array if they remove food.
// Made by James and Leila January 2022
import java.util.*;

class TrackReceipt {

  int[] arn = new int[6]; //array position for each food type and an an int for number of each food type.

  public int[] Track(int n) {
    if (n == 1) {
      //Fries
      arn[0]++;
    }
    if (n == 2) {
      //Soup
      arn[1]++;
    }
    if (n == 3) {
      //Salad
      arn[2]++;
    }
    if (n == 4) {
      //Pizza
      arn[3]++;
    }
    if (n == 5) {
      //Sandwich
      arn[4]++;
    }
    if (n == 6) {
      //Pasta
      arn[5]++;
    }
    return arn;
  }

  public int[] TrackDelete(int n)  {
    Tools tools = new Tools();
    Scanner sIn = new Scanner(System.in);
    //Creating a scanner and creating an instance of tools
    tools.Clear();
    if (n == 1) {
      //Fries
      arn[0]--;
      if (arn[0] < 0) {
        System.out.println("You have attempted to remove more fries than you have"); 
        arn[0]++;
      } else {
        System.out.println("You have removed 1 fries");
      }
    }
    if (n == 2) {
      //Soup
      arn[1]--;
      System.out.println("You have removed 1 soup");
      if (arn[1] < 0) {
        System.out.println("You have attempted to remove more soup than you have"); 
        arn[0]++;
      }
    }
    if (n == 3) {
      //Salad
      arn[2]--;
      if (arn[2] < 0) {
        System.out.println("You have attempted to remove more salad than you have");
         arn[2]++;
      } else {
        System.out.println("You have removed 1 salad");
      }
    }
    if (n == 4) {
      //Pizza
      arn[3]--;
      if (arn[3] < 0) {
        System.out.println("You have attempted to remove more pizza than you have"); 
        arn[0]++;
      }
      else {
        System.out.println("You have removed 1 pizza");
      }
    }
    if (n == 5) {
      //Sandwich
      arn[4]--;
      if (arn[4] < 0) {
        System.out.println("You have attempted to remove more samdwich than you have"); 
        arn[0]++;
      } else {
        System.out.println("You have remove 1 sandwich");
      }
    }
    if (n == 6) {
      //Pasta
      arn[5]--;
      if (arn[5] < 0) {
        System.out.println("You have attempted to remove more pasta than you have");
        arn[5]++; 
      } else {
        System.out.println("You have removed 1 pasta");
      }
    }
    System.out.println("\nPress enter to continue:\n");
    sIn.nextLine();
    return arn;
  }
}