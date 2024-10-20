// Luka, Leila, James, and Adelaide
// ICS3UI
// Jan 26 2022
// Mr. Dyck
// KCI
// This is a program that simulates ordering food at a restaurant, including multiple menus, options for ordering food, a receipt, and an option to tip.
///////////////////////////
import java.io.*;
//Import needed for the main class IO

class Main {

  public static void main(String[] args) throws IOException {
    Menu menu = new Menu();
    ConstructFood constructfood = new ConstructFood();
    Colours colours = new Colours(); 
    TrackReceipt trackreceipt = new TrackReceipt(); 
    PrintListOfFood printlistoffood = new PrintListOfFood();
    ErrorMessages errors = new ErrorMessages();
    Tools tools = new Tools();
    //Creating instances of all the classes that get incorperated into this main class
    double dBillPrice = 0;
    int n1 = 0;
    boolean bYesOrder = true;
    //Declaring and initializing variables
    try {
      PrintWriter pw = new PrintWriter("zListOfFood.txt"); //writes a file of nothing so it deletes all previous text from old receipt
      pw.close(); // this deletes all the text in the receipt so it only displays current order
      PrintWriter pw2 = new PrintWriter("zOrder_Receipt.txt");
      pw2.close();
      tools.Clear();
      System.out.println(colours.GREEN_BOLD_BRIGHT + "Welcome to Coder's Corner!\n" + colours.TEXT_RESET); //read menu command
      while (bYesOrder) { //for order
        try (FileWriter f = new FileWriter("zListOfFood.txt", true); 
        BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b);) { //appends the file
          if (n1 != 10) {
            menu.SimpleMenu();
          }
          if (n1 != 20) {
            //If they haven't confirmed their order yet
            System.out.println(colours.GREEN_BOLD_BRIGHT_UNDERLINED + "\nWhat would you like to order?" + colours.TEXT_RESET + "\nPlease input the number corresponding to the food you would like.\nFor example if you want pizza please input " + colours.GREEN_BOLD_BRIGHT + "'4'" + colours.TEXT_RESET + ". \nYou can only order one food at a time so please input only one number. \nTo finish ordering and confirm your order input " + colours.GREEN_BOLD_BRIGHT + "'20'" + colours.TEXT_RESET + ".\nInput " + colours.GREEN_BOLD_BRIGHT + "'10'" + colours.TEXT_RESET +" if you wish to see the detailed menu.\n");
            n1 = errors.FoodSelectionError.GetInputInt();
            trackreceipt.Track(n1);
          }
          if (n1 == 20) {
            //If they have confirmed their order
            boolean bisOption = true;
            //Variable declaration
            tools.Clear();
            System.out.println("Here is a list of all the food you ordered:\n");
            printlistoffood.printlist(trackreceipt.arn);
            System.out.println("\n1. Confirm Your Order\n2. Add More To Your Order\n3. Remove An Item From Your Order\n");
            do {
              bisOption = true;
              n1 = errors.FoodlistSelectionError.GetInputInt();
              if (n1 == 1) {
                //They are done ordering
                bYesOrder = false;
              } else if (n1 == 2)  {
                //They want to go back and add more to their order
                tools.Clear();
                menu.SimpleMenu();
                System.out.println("\nPlease input what food you wish to order:\n");
                n1 = errors.FoodSelectionError.GetInputInt();
                trackreceipt.Track(n1);
              } else if (n1 == 3)  {
                //They want to remove an item from their order
                tools.Clear();
                menu.SimpleMenu();
                System.out.println(colours.GREEN_BOLD_BRIGHT_UNDERLINED+ "\nYou have chosen to remove an item from your order." + colours.TEXT_RESET + "\nPlease input the number corresponding to the food you would like to remove.\nYou can only remove 1 at a time. For examples fries would be " + colours.GREEN_BOLD_BRIGHT + "'1'" + colours.TEXT_RESET + ".\n\nThis is what you currently have ordered:\n");
                printlistoffood.printlist(trackreceipt.arn);
                System.out.println();
                n1 = errors.FoodSelectionError.GetInputInt();
                trackreceipt.TrackDelete(n1);
                n1 = 20;
              } else {
                //If none of the options are chosen
                bisOption = false;
                tools.Clear();
                System.out.println(errors.FoodlistSelectionError.sErrorMsg);
              }
            } while (bisOption != true);
            //Repeat until a valid option is chosen
          }
          tools.Clear();
          tools.Delay(250);
          if (n1 == 1) {
            //Order of fries
            tools.Clear();
            System.out.println("You have ordered fries\n");
            dBillPrice += 4;
            p.println("Fries $4");
          }
          if (n1 == 2) {
            //Order of soup
            tools.Clear();
            System.out.println("You have ordered soup\n"); 
            dBillPrice += 4;
            p.println("Soup $3");
          }
          if (n1 == 3) {
            //Order of salad
            tools.Clear();
            System.out.println("You have ordered a salad\n");
            dBillPrice += 4;
            p.println("Salad $4");
          }
          if (n1 == 4) { 
            //Order of pizza
            tools.Clear();
            constructfood.ConstructPizza(dBillPrice);   
          }
          if (n1 == 5) { 
            //Order of sandwich
            tools.Clear();
            constructfood.ConstructSandwich(dBillPrice);
          }
          if (n1 == 6) { 
            //Order of pasta
            tools.Clear();
            constructfood.ConstructPasta(dBillPrice);   
          }
          if (n1 == 10) { 
            //Order of pasta
            tools.Clear();
            menu.readmenu(); //read menu command
          }
        }
      }
      dBillPrice = Math.round(1.13 * dBillPrice * 100.0)/ 100.0; //Rounded tax for the total price of the order
      PrintReceipt printreceipt = new PrintReceipt(trackreceipt.arn);
      //Creating an instance of a class
      tools.Clear();
      System.out.println(colours.GREEN_BOLD_BRIGHT_UNDERLINED + "Here is your receipt:\n" + colours.TEXT_RESET);
      printreceipt.printreceipt();
      System.out.println(colours.GREEN_BOLD_BRIGHT_UNDERLINED + "\nThank you for ordering at Coder's Corner!\n" + colours.TEXT_RESET + "Would you like to leave a tip?\n1. Leave a Tip and Pay\n2. Pay Without Leaving a Tip\n"); // could add the bill to the reciepit if wanted to
      n1 = errors.TipError.GetInputInt();
      if (n1 == 1) {
        //They would like to tip
        Tip tip = new Tip();
        tip.tip(printreceipt.dTotal);
      }
      System.out.println("\nHave a great day!");
    } 
    catch (FileNotFoundException err) { 
      // for file catch
      System.out.println("File name is innacurate "); 
    }
  }
}
