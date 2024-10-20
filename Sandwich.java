// Class that does oop for sandwich
// Made by James January 2022

import java.io.*;

class Sandwich {
  String BreadType, SauceType, CheeseType, MeatType, VegtableType;
  //variable declaration
  Tools clear = new Tools();

  public Sandwich(String sPassSauceType, String sPassBreadType, String sPassCheeseType, String sPassMeatType, String sPassVegtableType) {
    BreadType = sPassBreadType;
    SauceType = sPassSauceType;
    CheeseType = sPassCheeseType;
    MeatType = sPassMeatType;
    VegtableType = sPassVegtableType;
    //creates the argument variable from main class for meat sandwich
  }

  public Sandwich(String sPassSauceType, String sPassBreadType, String sPassCheeseType, String sPassVegtableType) {
    BreadType = sPassBreadType;
    SauceType = sPassSauceType;
    CheeseType = sPassCheeseType;
    VegtableType = sPassVegtableType;
    //creates the argument variable from main class for vegetarian sandwich
  }

  public void PrintMeatSandwich() {
    System.out.println("The sandwich ordered is " + BreadType + " bread with " + SauceType + " sauce, " + CheeseType + " cheese, " + MeatType + " and " + VegtableType + ". \n"); 
    //print sandwich 
  }

  public void PrintVegSandwich() {
    System.out.println("The sandwich ordered is " + BreadType + " bread with " + SauceType + " sauce, " + CheeseType + " cheese and " + VegtableType + ". \n"); 
    //print Vegsandwich 
  }

  public void MeatSandwichBill() throws IOException {
    try (FileWriter f = new FileWriter("zListOfFood.txt", true); 
        BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b)) {
      //file writer
      p.println("Meat sandwich 2$.");
      p.close(); 
      
    } catch (FileNotFoundException err) { // for file catch
      System.out.println("File name is innacurate");
    }
  }

  public void VegSandwichBill() throws IOException {
    try (FileWriter f = new FileWriter("zListOfFood.txt", true); 
        BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b)) { 
      //file writer
      p.println("Veg sandwich 1$.");
      p.close(); 
      
    } catch (FileNotFoundException err) { 
      // for file catch
      System.out.println("File name is innacurate");
    }
  }

  public void SandwichBill() throws IOException {
    try (FileWriter f = new FileWriter("zOrder_Receipt.txt", true); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b);) {
      p.println("Sandwich $2");
    } catch (IOException i) {
      i.printStackTrace();
    }
  } 
}