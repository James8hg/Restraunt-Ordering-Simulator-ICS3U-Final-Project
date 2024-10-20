// Prints a list of food that is finalized for the user to confirm there order
// Made by James January 2022
import java.util.*;
import java.io.*;
 
public class PrintListOfFood {
    String s1; //variable declaration    

  public void printlist (int[] arnReceipt) throws IOException {
    PrintWriter pw = new PrintWriter("zListOfFood.txt");
    pw.close();
    try (FileWriter f = new FileWriter("zListOfFood.txt", true); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b);) { // allows to apend file
      for (int i = 0; i < 6; i++) {
        if (arnReceipt[i] > 0)  { // only outputs food that is ordered
          if (i == 0) {
            p.println(arnReceipt[i] + " fries $4");
          }
          if (i == 1) {
            p.println(arnReceipt[i] + " soup $3");
          }
          if (i == 2) {
            p.println(arnReceipt[i] + " salad $4");
          }
          if (i == 3) {
            p.println(arnReceipt[i] + " pizza $7");
          }
          if (i == 4) {
            p.println(arnReceipt[i] + " sandwich $5");
          }
          if (i == 5) {
            p.println(arnReceipt[i] + " pasta $10");
          } 
        }
      }
    }
    catch (FileNotFoundException err) { // for file catch
      System.out.println("File name is innacurate ");
    }
    Scanner sin = new Scanner(new FileReader("zListOfFood.txt")); //file reader
    while (sin.hasNextLine()) { //file reader for menu
      s1 = sin.nextLine();
      System.out.println(s1); //outputs list of food to console
    }
  }
}