import java.util.*;

public class main {
    public static String availableOptions = "[L]inked List   |   [A]rray List    |    [H]ash Map    |    [V]ector";
    public static Scanner userInput = new Scanner(System.in);
  public static void main(String[] args) {
    
    System.out.println("Welcome to the Data Structure Runtime Comparator 5000");
    printInstructions();
    respondToInput();
    
  }  
  
  static void printInstructions() {
      System.out.println("Available Data Structures to Test are: ");
      System.out.println(availableOptions);
      System.out.println("What Data Structure would you like to test? Or would you like to e[X]it?");
  }
  static void respondToInput() {
    boolean timeToQuit = false;
        while (!timeToQuit) {
            String input = userInput.nextLine();
            if (input.equalsIgnoreCase("l")) {
                LinkedListTest.testIntegerInsertionAndRead(getTestSize(),  getTimesToRun());
            } else if (input.equalsIgnoreCase("a")) {
                ArrayListTest.testIntegerInsertionAndRead(getTestSize(), getTimesToRun());
            } else if (input.equalsIgnoreCase("h")) {
                HashMapTest.testIntegerInsertionAndRead(getTestSize(),  getTimesToRun());
            }  else if (input.equalsIgnoreCase("v")) {
                VectorTest.testIntegerInsertionAndRead(getTestSize(),  getTimesToRun());
            }  else if (input.equalsIgnoreCase("x")) {
                timeToQuit = true;
            } else {
                System.out.println("Not a valid input. Try again.");
            }
            printInstructions();
        }
  }
  
  static int getTestSize(){
    printElementSizeInstructions();
    boolean inputGathered = false;
    int size = 1;
    while (!inputGathered) {
      String input = userInput.nextLine();
      if (input.equalsIgnoreCase("h")) {
          size = 100000;
          inputGathered = true;
      } else if (input.equalsIgnoreCase("m")) {
          size = 1000000;
          inputGathered = true;
      } else if (input.equalsIgnoreCase("t")) {
          size = 1000;
          inputGathered = true;
      } else {
          System.out.println("Not a valid input. Try again.");
      }
    }
    return size;
  }
  
    static int getTimesToRun(){
    printTimesToRunInstructions();
    boolean inputGathered = false;
    int ttr = 1;
    while (!inputGathered) {
      String input = userInput.nextLine();
      try {
        ttr = Integer.parseInt(input);
      } catch (NumberFormatException e) {
        System.out.println("Just use the digits please. Try again.");
      }
      if ((ttr >= 2) && (ttr <=10)) {
            inputGathered = true;
      } else {
          System.out.println("Not a valid input. Try again.");
      }
    }
    return ttr;
  }
  
  static void printElementSizeInstructions(){
      System.out.println("How many elements would you like to test with?");
      System.out.println("One [T]housand, One [H]undred Thousand, or One [M]illion");
  }
  
  static void printTimesToRunInstructions(){
      System.out.println("How many tests would you like the average of");
      System.out.println("Input a positive integer between 2 and 10");
  }
}