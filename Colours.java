//A class that holds a lot of text colour options that we thought were useful and we could use when we wanted to 
//Taken from: https://www.codegrepper.com/code-examples/java/add+color+to+java+console+output
// MODIFIED BY LUKA January 2022
public class Colours {

  //Colour Reset
  public final String TEXT_RESET = "\u001B[0m";

  //Bright green bold and underlined
  public final String GREEN_BOLD_BRIGHT_UNDERLINED = "\033[4;92m";

  //Red bold and underlined
  public final String RED_BOLD_UNDERLINED = "\033[4;31m";

  // Regular Colors
  public final String BLACK = "\033[0;30m";   // BLACK
  public final String RED = "\033[0;31m";     // RED
  public final String GREEN = "\033[0;32m";   // GREEN
  public final String YELLOW = "\033[0;33m";  // YELLOW
  public final String BLUE = "\033[0;34m";    // BLUE
  public final String PURPLE = "\033[0;35m";  // PURPLE
  public final String CYAN = "\033[0;36m";    // CYAN
  public final String WHITE = "\033[0;37m";   // WHITE

  // Bold
  // BLACK
  public final String BLACK_BOLD = "\033[1;30m";  
  // RED
  public final String RED_BOLD = "\033[1;31m";    
  // GREEN
  public final String GREEN_BOLD = "\033[1;32m";  
  // YELLOW
  public final String YELLOW_BOLD = "\033[1;33m"; 
  // BLUE
  public final String BLUE_BOLD = "\033[1;34m";   
  // PURPLE
  public final String PURPLE_BOLD = "\033[1;35m"; 
  // CYAN
  public final String CYAN_BOLD = "\033[1;36m";   
  // WHITE
  public final String WHITE_BOLD = "\033[1;37m";  

  // Underline
  // BLACK
  public final String BLACK_UNDERLINED = "\033[4;30m";  // RED
  public final String RED_UNDERLINED = "\033[4;31m";    // GREEN
  public final String GREEN_UNDERLINED = "\033[4;32m";  // YELLOW
  public final String YELLOW_UNDERLINED = "\033[4;33m"; // BLUE
  public final String BLUE_UNDERLINED = "\033[4;34m";   // PURPLE
  public final String PURPLE_UNDERLINED = "\033[4;35m"; // CYAN
  public final String CYAN_UNDERLINED = "\033[4;36m";   // WHITE
  public final String WHITE_UNDERLINED = "\033[4;37m"; 

  // High Intensity

  // BLACK
  public final String BLACK_BRIGHT = "\033[0;90m";  
  // RED
  public final String RED_BRIGHT = "\033[0;91m";    
  // GREEN
  public final String GREEN_BRIGHT = "\033[0;92m";  
  // YELLOW
  public final String YELLOW_BRIGHT = "\033[0;93m"; 
  // BLUE
  public final String BLUE_BRIGHT = "\033[0;94m";   
  // PURPLE
  public final String PURPLE_BRIGHT = "\033[0;95m"; 
  // CYAN
  public final String CYAN_BRIGHT = "\033[0;96m";   
  // WHITE
  public final String WHITE_BRIGHT = "\033[0;97m";

  // Bold High Intensity
  
  // BLACK
  public final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // RED
  public final String RED_BOLD_BRIGHT = "\033[1;91m";   // GREEN
  public final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // YELLOW
  public final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// BLUE
  public final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // PURPLE
  public final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// CYAN
  public final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // WHITE
  public final String WHITE_BOLD_BRIGHT = "\033[1;97m";
}
