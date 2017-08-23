import java.util.*;

public class main {
    public static String availableOptions = "[L]inked List   |   [A]rray List";
    String availableTests = "[I]nteger Insertion Test";
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
            if (input.contains("l")) {
                LinkedListTest.testIntegerInsertionAndRead(getTestSize());
            } else if (input.contains("a")) {
                ArrayListTest.testIntegerInsertionAndRead(getTestSize());
            } else if (input.contains("x")) {
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
      if (input.contains("h")) {
          size = 100000;
          inputGathered = true;
      } else if (input.contains("m")) {
          size = 1000000;
          inputGathered = true;
      } else if (input.contains("t")) {
          size = 10000000;
          inputGathered = true;
      } else {
          System.out.println("Not a valid input. Try again.");
      }
    }
    return size;
  }
  
  static void printElementSizeInstructions(){
      System.out.println("How many elements would you like to test with?");
      System.out.println("One [H]undred Thousand, One [M]illion, or [T]en Million");
  }
}