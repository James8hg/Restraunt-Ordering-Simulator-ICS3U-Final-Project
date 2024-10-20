// Class reads the menu from a file or the simplified menu and outputs them to the console.
// Made by James and Luka January 2022
import java.util.*;
import java.io.*;

public class Menu {

  String s1; //variable declaration   
  Colours colours = new Colours(); // instance of class

  public void readmenu() throws IOException {
    try {
      Scanner sin = new Scanner(new FileReader("zmenu.txt")); //file reader
      while (sin.hasNextLine()) { //file reader for menu
        s1 = sin.nextLine();
        System.out.println(s1); //outputs menu
      }
    } catch (FileNotFoundException err) { // for file catch
      System.out.println("File name is innacurate ");
    }
  }

  public void SimpleMenu() {
    //Simplified menu for more friendly UI, detailed menu is still accessible
    System.out.println(colours.GREEN_BOLD_BRIGHT_UNDERLINED + "Simplified Menu" + colours.TEXT_RESET + "\n1. Fries $4\n2. Soup $3\n3. Salad $4\n4. Pizza $7\n5. Sandwich $5\n6. Pasta $10");
  }
}