// Class that does oop for pasta
// Made by Leila January 2022
import java.io.*;

public class Pasta {
  String SauceType, MeatType, PastaType; //variable declaration
  Tools tools = new Tools();

  public Pasta(String sPassSauceType, String sPassMeatType, String sPassPastaType) {
    SauceType = sPassSauceType;
    MeatType = sPassMeatType;
    PastaType = sPassPastaType;
  }

  public Pasta(String sPassSauceType, String sPassPastaType) {
    SauceType = sPassSauceType;
    PastaType = sPassPastaType;
    //creates the argument variable from main class for vegetarian pasta
  }
   
  public void PrintMeatPasta() {
    System.out.println("The Pasta ordered is " + PastaType + " with " + MeatType + " and " + SauceType + " sauce\n"); 
    //print pasta 
  }
  public void PrintVegPasta() {
    System.out.println("The pasta ordered is " + PastaType + " with " + SauceType  + " sauce\n"); //print Veg pasta 
  }

  public void MeatPastaBill() throws IOException {
    try (FileWriter f = new FileWriter("zListOfFood.txt", true); // this lets you write to existing files
        BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b)) { 
      //file writer
      p.println("Meat Pasta 10$.");
      p.close(); 
      
    } catch (FileNotFoundException err) { 
      // for file catch
      System.out.println("File name is innacurate");
    }
  }

  public void VegPastaBill() throws IOException {
    try (FileWriter f = new FileWriter("zListOfFood.txt", true); 
        BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b)) {
      //file writer
      p.println("Veg Pasta 10$.");
      p.close();
      
    } catch (FileNotFoundException err) { 
      // for file catch
      System.out.println("File name is innacurate");
    }
  }

  public void PastaBill() throws IOException {
    try (FileWriter f = new FileWriter("zListOfFood", true); BufferedWriter b = new     BufferedWriter(f); PrintWriter p = new PrintWriter(b);) {
      p.println("Pasta 10$");
    } catch (IOException i) {
      i.printStackTrace();
    }
  } 
}