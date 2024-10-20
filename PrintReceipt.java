// Class that prints the reciept to the console and writes to a file
// Made by James and Luka January 2022
import java.util.*;
import java.io.*;

class PrintReceipt {

  int[] arnReceipt;
  String s1;
  double dTotal;

  public PrintReceipt(int[] arnReceipt) {
    this.arnReceipt = arnReceipt;
  }

  public void printreceipt () throws IOException {
    double dTax; 
    double dBillReceipt = 0, dFries = 4, dSoup = 3, dSalad = 4, dPizza = 7, dSandwich = 5, dPasta = 10; // prices of food
    try (FileWriter f = new FileWriter("zOrder_Receipt.txt", true); BufferedWriter b = new BufferedWriter(f); PrintWriter p = new PrintWriter(b);) { // to append file
      p.println("Coder's Corner Receipt\n");
      for (int i = 0; i < 6; i++) {
        if (this.arnReceipt[i] != 0)  {
          if (i == 0) {
            p.println(this.arnReceipt[i] + " fries $4");
            dBillReceipt += arnReceipt[i] * dFries ;
          }
          if (i == 1) {
            p.println(this.arnReceipt[i] + " soup $3");
            dBillReceipt += arnReceipt[i] * dSoup;
          }
          if (i == 2) {
            p.println(this.arnReceipt[i] + " salad $4");
            dBillReceipt += arnReceipt[i] * dSalad;
          }
          if (i == 3) {
            p.println(this.arnReceipt[i] + " pizza $7");
            dBillReceipt += arnReceipt[i] * dPizza;
          }
          if (i == 4) {
            p.println(this.arnReceipt[i] + " sandwich $5");
            dBillReceipt += arnReceipt[i] * dSandwich;
          }
          if (i == 5) {
            p.println(this.arnReceipt[i] + " pasta $10");
            dBillReceipt += arnReceipt[i] * dPasta;
          } 
        }
      }
      dBillReceipt = Math.round(dBillReceipt * 100.0) / 100.0; // rounding
      dTax = Math.round((dBillReceipt * 0.13) * 100.0) / 100.0; // calculates tax
      p.println("Subtotal " + dBillReceipt + "$");
      p.println("Tax 13% " + dTax + "$");
      dTotal = (dTax +  dBillReceipt);
      p.println("Total " + dTotal + "$");
    }
    catch (IOException i) {
      i.printStackTrace();
    }
    Scanner sin = new Scanner(new FileReader("zOrder_Receipt.txt")); //file reader
    while (sin.hasNextLine()) { //file reader for menu
      s1 = sin.nextLine();
      System.out.println(s1); //outputs menu
    }
  }
}

