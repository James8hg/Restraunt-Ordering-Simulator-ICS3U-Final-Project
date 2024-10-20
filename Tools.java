// Class for useful Tools
// Function to clear the console and a function to delay the console
// Made by Luka January 2022
class Tools {

  public void Clear() {
    //This function clears the console window
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public void Delay(int nDelay) {
    //This function creates a delay of however many miliseconds is passed
    try {
      Thread.sleep(nDelay);
    }
    catch (InterruptedException e) {
      
    }
  }
}