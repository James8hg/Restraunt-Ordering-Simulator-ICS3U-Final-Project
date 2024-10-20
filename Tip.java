// Class that calculates the tips
// Made by James January 2022
class Tip {
  ErrorMessages errors = new ErrorMessages();
  //Creating an instance of ErrorMessages class

  public void tip(double dBillPrice) {
    int n1;
    double dBillNoTip, dTip;
    //Declaring variables
    System.out.println("\nPlease enter the percent of the total bill you would like to tip. For example, typing '10' would be 10% of your bill.\n");
    n1 = errors.TipPercentError.GetInputInt();
    dBillNoTip = dBillPrice;
    dTip = Math.round((n1 * 0.01) * (dBillPrice) * 100.0) / 100.0;
    //Calculating the tip amount
    System.out.println("\nThe tip amount is $" + dTip);
    dBillPrice = Math.round((dBillNoTip + dTip) * 100.0) / 100.0;
    //Calculating the new bill with tax
    System.out.println("\nThe final bill is $" + dBillPrice + " please pay your server.");
  }
}
