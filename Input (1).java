// Class that gets all input needed for the program and makes sure the user enters the correct type of input for the situation
// Made by Luka January 2022

import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
//These are the imports needed for this class

class Input {

  Scanner sIn = new Scanner(System.in);
  //Creating a scanner
  Tools tools = new Tools();
  //Creating a tools object to use the useful methods from Tools class
  String sErrorMsg;
  //Declaring a variable

  public Input(String sErrorMsg) {
    //The class's constructor
    this.sErrorMsg = sErrorMsg;
  }

  public int GetInputInt() {
    //This method is for getting user integer input
    int nIn = 0;
    String sInput;
    boolean bisInt;
    //Declaring some variables and initializing one
    do {
      try {
        //Try getting the input,
        bisInt = true;
        sInput = sIn.nextLine();
        nIn = Integer.parseInt(sInput);
      } 
      catch (Exception e) {
        //If they don't enter the correct type of input, catch the error and display the error message
        bisInt = false;
        tools.Clear();
        tools.Delay(250);
        System.out.println(this.sErrorMsg);
      }
    } while (bisInt != true); 
    //Repeatedly ask them for input until they enter it correctly
    return nIn;
  }

  public String GetInputString() {
    //This method gets user string input
    String sInput;
    int nStringLength;
    boolean bisString;
    StringBuilder sbInput;
    //Declaring some variables
    do {
      bisString = true;
      sInput = sIn.nextLine();
      if (sInput.isEmpty() || sInput.isBlank()) {
        //If the user doesn't enter anything or only enter spaces
        bisString = false;
      }
      Pattern pDigit = Pattern.compile("(\\d+)");
      Matcher mInput = pDigit.matcher(sInput);
      if (mInput.find()) {
        //If what they entered is a digit and not a string
        bisString = false;
      }
      if (bisString == false) {
        //If they don't enter the correct type of input, catch the error and display the error message
        tools.Clear();
        tools.Delay(250);
        System.out.println(this.sErrorMsg);
      }
    } while (bisString != true);
    //Repeatedly ask for input intil the user enters it correctly
    nStringLength = sInput.length();
    sbInput = new StringBuilder(sInput);
    //Making a string builder to be able to delete extra spaces
    for (int i = nStringLength - 1; i >= 0; i--) {
      //Check each character of the string to see if it's a space, if it is, delete the space. This is a measure to stop people from typing a word with a bunch of spaces after or in between every single letter.
      char cSpace = sbInput.charAt(i);
      //Declaring and initializing a char variable
      if (cSpace == ' ') {
        //If character is space
        sbInput.deleteCharAt(i);
      } else {
        //If character isn't space
        
      }
    }
    sInput = sbInput.toString();
    //Convert back to the string variable
    return sInput;
  }
}