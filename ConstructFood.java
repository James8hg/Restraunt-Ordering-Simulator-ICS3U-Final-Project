// Class that gets user input to do oop for food
// Made by James January 2022
import java.io.*;

class ConstructFood {

  ErrorMessages errors = new ErrorMessages(); 
  Colours colours = new Colours();
  Menu readmenu = new Menu();
  Tools tools = new Tools(); // instances of classes

  public double ConstructSandwich(double dBillPrice) throws IOException {
    String sPassSauceType, sPassBreadType, sPassCheeseType, sPassVegtableType, sPassMeatType; 
    int n1;
    boolean bisSandwichOption; 
    // variable declaration
    System.out.println(colours.GREEN_BOLD_BRIGHT_UNDERLINED + "You have selected to order a sandwich." + colours.TEXT_RESET + "\nWould you like a vegetarian sandwich or a regular sandwich. Please input" + colours.GREEN_BOLD_BRIGHT + " '1'" + colours.TEXT_RESET + " for veggie and" + colours.GREEN_BOLD_BRIGHT + " '2'" + colours.TEXT_RESET + " for meat.\n");
    do {
      bisSandwichOption = true;
      n1 = errors.SandwichVegOrMeatError.GetInputInt();
      if (n1 == 1) {
        //if veggie sandwich is chosen
        tools.Clear(); // clears the console
        System.out.println(colours.GREEN_BOLD_BRIGHT_UNDERLINED + "You have selected to order a veggie sandwich." + colours.TEXT_RESET + "\nWhat bread would you like?\nYour choices are:\nWhite, whole wheat, rye\n(Type in your choice)\n");
        sPassBreadType = errors.BreadTypeError.GetInputString();
        tools.Clear();
        System.out.println("What type of sauce would you like?\nYour choices are:\nMayo, mustard, ranch\n(Type in your choice)\n");
        sPassSauceType = errors.SandwichSauceError.GetInputString();
        tools.Clear();
        System.out.println("What type of cheese would you like?\nYour choices are:\nCheddar, mozarella, blue\n(Type in your choice)\n");
        sPassCheeseType = errors.SandwichCheeseError.GetInputString();
        tools.Clear();
        System.out.println("What type of vegtable would you like?\nYour choices are:\nLettuce, pickle, tomato\n(Type in your choice)\n");
        sPassVegtableType = errors.SandwichVegError.GetInputString();
        tools.Clear();
        Sandwich sandwich1 = new Sandwich(sPassSauceType, sPassBreadType, sPassCheeseType, sPassVegtableType); //arguments // variable passed tho the classes house with meat sandwich1
        sandwich1.PrintVegSandwich();
        sandwich1.VegSandwichBill();
        return dBillPrice + 2; //price of sadwich
      }
      if (n1 == 2) {
        //If meat sandwich is chosen
        tools.Clear();
        System.out.println(colours.GREEN_BOLD_BRIGHT_UNDERLINED + "You have chosen to order a meat sandwich." + colours.TEXT_RESET + "\nWhat type of bread would you like?\nYour choices are:\nWhite, whole wheat, rye\n(Type in your choice)\n");
        sPassBreadType = errors.BreadTypeError.GetInputString();
        tools.Clear();
        System.out.println("What type of sauce would you like?\nYour choices are:\nMayo, mustard, ranch\n(Type in your choice)\n");
        sPassSauceType = errors.SandwichSauceError.GetInputString();
        tools.Clear();
        System.out.println("What type of cheese would you like?\nYour choices are:\nCheddar, mozarella, blue\n(Type in your choice)\n");
        sPassCheeseType = errors.SandwichCheeseError.GetInputString();
        tools.Clear();
        System.out.println("What type of vegtable would you like?\nYour choices are:\nLettuce, pickle, tomato\n(Type in your choice)\n");
        sPassVegtableType = errors.SandwichVegError.GetInputString();
        tools.Clear();
        System.out.println("What type of meat would you like?\nYour choices are:\nTurkey, ham, bacon\n(Type in your choice)\n");
        sPassMeatType = errors.SandwichMeatError.GetInputString();
        tools.Clear();
        Sandwich sandwich2 = new Sandwich(sPassSauceType, sPassBreadType, sPassCheeseType, sPassMeatType, sPassVegtableType); //arguments // variable passed tho the classes house with meat sandwich1
        sandwich2.PrintMeatSandwich();
        sandwich2.MeatSandwichBill();
        return dBillPrice + 3; //price of sadwich
      }
      if (n1 != 1 && n1 != 2) {
        //If neither option is chosen
        bisSandwichOption = false;
        tools.Clear();
        tools.Delay(250);
        System.out.println(errors.SandwichVegOrMeatError.sErrorMsg);
      }
    } while (bisSandwichOption != true);
    //Repeat until a valid option is chosen
    return (dBillPrice);
  }

  public double ConstructPizza(double dBillPrice) throws IOException {
    String sPassCrustType, sPassSauceType, sPassCheeseType, sPassMeatType, sPassVegtableType;
    int n1;
    boolean bisPizzaOption;
    //Declaring variables
    System.out.println(colours.GREEN_BOLD_BRIGHT_UNDERLINED + "You have selected to order a Pizza." + colours.TEXT_RESET + "\nWould you like a vegetarian pizza or a meat pizza. Please input" + colours.GREEN_BOLD_BRIGHT + " '1'" + colours.TEXT_RESET + " for veggie and" + colours.GREEN_BOLD_BRIGHT + " '2'" + colours.TEXT_RESET + " for meat.\n");
    do {
      bisPizzaOption = true;
      n1 = errors.PizzaVegOrMeatError.GetInputInt();
      if (n1 == 1) {
        //If veggie pizza is chosen
        tools.Clear();
        System.out.println(colours.GREEN_BOLD_BRIGHT_UNDERLINED + "You have chosen to order a veggie pizza." + colours.TEXT_RESET + "\nWhat type of crust would you like?\nYour choices are:\nThin, stuffed, regular\n(Type in your choice)\n");
        sPassCrustType = errors.CrustTypeError.GetInputString();
        tools.Clear();
        System.out.println("What type of sauce would you like?\nYour choices are:\nTomato, alfredo, pesto, BBQ\n(Type in your choice)\n");
        sPassSauceType = errors.PizzaSauceError.GetInputString();
        tools.Clear();
        System.out.println("What type of cheese would you like?\nYour choices are:\nCheddar, mozzarella, swiss\n(Type in your choice)\n");
        sPassCheeseType = errors.PizzaCheeseError.GetInputString();
        tools.Clear();
        System.out.println("What type of vegtable would you like?\nYour choices are:\nBroccoli, pepper, mushrooms, tomato\n(Type in your choice)\n");
        sPassVegtableType = errors.PizzaVegError.GetInputString();
        tools.Clear();
        Pizza pizza1 = new Pizza(sPassSauceType, sPassCrustType, sPassCheeseType, sPassVegtableType);
        pizza1.PrintVegPizza();
        pizza1.VegPizzaBill();
        return dBillPrice + 7; //price of pizza
      }
      if (n1 == 2) {
        //If meat pizza is chosen
        tools.Clear();
        System.out.println(colours.GREEN_BOLD_BRIGHT_UNDERLINED + "You have chosen to order a meat pizza." + colours.TEXT_RESET + "\nWhat type of crust would you like?\nYour choices are:\nThin, stuffed, regular\n(Type in your choice)\n");
        sPassCrustType = errors.CrustTypeError.GetInputString();
        tools.Clear();
        System.out.println("What type of sauce would you like?\nYour choices are:\nTomato, alfredo, pesto, BBQ\n(Type in your choice)\n");
        sPassSauceType = errors.PizzaSauceError.GetInputString();
        tools.Clear();
        System.out.println("What type of cheese would you like?\nYour choices are:\nCheddar, mozzarella, swiss\n(Type in your choice)\n");
        sPassCheeseType = errors.PizzaCheeseError.GetInputString();
        tools.Clear();
        System.out.println("What type of meat would you like?\nYour choices are:\nPepperoni, sausage, chicken\n(Type in your choice)\n");
        sPassMeatType = errors.MeatPizzaError.GetInputString();
        tools.Clear();
        System.out.println("What type of vegtable would you like?\nYour choices are:\nBroccoli, pepper, mushrooms, tomato\n(Type in your choice)\n");
        sPassVegtableType = errors.PizzaVegError.GetInputString();
        tools.Clear();
        Pizza pizza1 = new Pizza(sPassSauceType, sPassCrustType, sPassCheeseType, sPassMeatType, sPassVegtableType); 
        pizza1.PrintMeatPizza();
        pizza1.MeatPizzaBill();
        return dBillPrice + 7; //price of pizza
      }
      if (n1 != 1 && n1 != 2) {
        //If no valid options are chosen
        bisPizzaOption = false;
        tools.Clear();
        tools.Delay(250);
        System.out.println(errors.PizzaVegOrMeatError.sErrorMsg);
      }
    } while (bisPizzaOption != true);
    //Repeat until a valid option is chosen
    return (dBillPrice);
  }

  public double ConstructPasta(double dBillPrice) throws IOException {
    String sPassSauceType, sPassMeatType, sPassPastaType;
    int n1;
    boolean bisPastaOption;
    //Declaring variables
    System.out.println(colours.GREEN_BOLD_BRIGHT_UNDERLINED + "You have selected to order pasta." + colours.TEXT_RESET + "\nWould you like vegetarian pasta or meat pasta. Please input" + colours.GREEN_BOLD_BRIGHT + " '1'" + colours.TEXT_RESET + " for veggie and" + colours.GREEN_BOLD_BRIGHT + " '2'" + colours.TEXT_RESET + " for meat.\n");
    do {
      bisPastaOption = true;
      n1 = errors.PastaVegOrMeatError.GetInputInt();
      if (n1 == 1) {
        //If veggie pasta is chosen
        tools.Clear();
        System.out.println(colours.GREEN_BOLD_BRIGHT_UNDERLINED + "You have chosen to order a veggie pasta." + colours.TEXT_RESET + "\nWhat type of pasta would you like?\nYour choices are:\nMacoroni, spaghetti, fettuccine\n(Type in your choice)\n");
        sPassPastaType = errors.PastaError.GetInputString();
        tools.Clear();
        System.out.println("What type of sauce would you like?\nYour choices are:\nTomato, alfredo, spicy\n(Type in your choice)\n");
        sPassSauceType = errors.PastaSauceError.GetInputString();
        tools.Clear();
        Pasta pasta1 = new Pasta(sPassSauceType, sPassPastaType); 
        pasta1.PrintVegPasta();
        pasta1.VegPastaBill();
        return dBillPrice + 10; //price of pizza
      }
      if (n1 == 2) {
        //If meat pasta is chosen
        tools.Clear();
        System.out.println(colours.GREEN_BOLD_BRIGHT_UNDERLINED + "You have chosen to order a meat pasta." + colours.TEXT_RESET + "\nWhat type of pasta would you like?\nYour choices are:\nMacoroni, spaghetti, fettuccine\n(Type in your choice)\n");
        sPassPastaType = errors.PastaError.GetInputString();
        tools.Clear();
        System.out.println("What type of sauce would you like?\nYour choices are:\nTomato, alfredo, spicy\n(Type in your choice)\n");
        sPassSauceType = errors.PastaSauceError.GetInputString();
        tools.Clear();
        System.out.println("What type of meat would you like?\nYour choices are:\nChicken, beef, shrimp\n(Type in your choice)\n");
        sPassMeatType = errors.PastaMeatError.GetInputString();
        tools.Clear();
        Pasta pasta1 = new Pasta(sPassSauceType, sPassMeatType, sPassPastaType); 
        pasta1.PrintMeatPasta();
        pasta1.MeatPastaBill();
        return dBillPrice + 10; //price of pizza
      }
      if (n1 != 1 || n1 != 2) {
        //If no valid option is chosen
        bisPastaOption = false;
        tools.Clear();
        tools.Delay(250);
        System.out.println(errors.PastaVegOrMeatError.sErrorMsg);
      }
    } while (bisPastaOption != true);
    //Repeat until valid option is chosen
    return (dBillPrice);
  }
}