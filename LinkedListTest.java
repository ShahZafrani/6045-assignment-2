import java.util.*;

public class LinkedListTest {
   public static void main(String[] args) {

      int testSize = 10000000;
      
      String structureToTest = "Linked List";
      
      String typeOfTest = "Integer Insertion Test";
      
      long startTime = System.currentTimeMillis();
      LinkedList<Integer> linkList = new LinkedList<Integer>(); 
      for (int i = 0; i < testSize; i++) {
         linkList.add(i);
      }
      long stopTime = System.currentTimeMillis();
      long elapsedTime = stopTime - startTime;
      System.out.println("Elapsed Time for " + structureToTest + " " + typeOfTest + " of " + testSize + " elements is: " + elapsedTime + " milliseconds");
   }
}