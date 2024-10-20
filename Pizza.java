// Class that does oop for pizza
// Made by Adelaide January 2022
import java.io.*;

public class Pizza {
  String CrustType, SauceType, CheeseType, MeatType, VegtableType; 
    //variable declaration

  public Pizza(String sPassSauceType, String sPassCrustType, String sPassCheeseType, String sPassMeatType, String sPassVegtableType) { //constructor
    CrustType = sPassCrustType;
    SauceType = sPassSauceType;
    CheeseType = sPassCheeseType;
    MeatType = sPassMeatType;
    VegtableType = sPassVegtableType;
  }

  public Pizza(String sPassSauceType, String sPassCrustType, String sPassCheeseType, String sPassVegtableType) {
    CrustType = sPassCrustType;
    SauceType = sPassSauceType;
    CheeseType = sPassCheeseType;
    VegtableType = sPassVegtableType;
    //creates the argument variable from main class for vegetarian pizza
  }
  
  public void PrintMeatPizza() {
    System.out.println("The pizza ordered is " + CrustType + " crust with " + SauceType + " sauce, " + CheeseType + " cheese, " + MeatType + " and " + VegtableType + ".\n"); //print pizza out to console 
  }

  public void PrintVegPizza() {
    System.out.println("The pizza ordered is " + CrustType + " crust with " + SauceType + " sauce, " + CheeseType + " cheese and " + VegtableType + ".\n "); 
    //print Vegpizza
  }

  public void MeatPizzaBill() throws IOException {
    try (FileWriter f = new FileWriter("zListOfFood.txt", true); 
        BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b)) { 
      //file writer
      p.println("Meat pizza 7$.");
      p.close(); 
      
    } catch (FileNotFoundException err) { 
      // for file catch
      System.out.println("File name is innacurate");
    }
  }

  public void VegPizzaBill() throws IOException {
    try (FileWriter f = new FileWriter("zListOfFood.txt", true); 
        BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b)) { 
      //file writer
      p.println("Veg pizza 7$.");
      p.close(); //need to close FW

    } catch (FileNotFoundException err) {
      // for file catch
      System.out.println("File name is innacurate");
    }
  }

  public void PizzaBill() throws IOException {
    try (FileWriter f = new FileWriter("zListOfFood.txt", true); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b);) { // this lets you write to existing files
      p.println("Pizza 7$");
    } catch (IOException i) {
      i.printStackTrace();
    }
  } 
}
