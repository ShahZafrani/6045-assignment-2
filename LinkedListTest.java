import java.util.*;

public class LinkedListTest {
  
   static String structureToTest = "Linked List";
   
   // Change this for a more accurate average performance
   static int timesToRun = 3;
   public static void testIntegerInsertion(int testSize) {
      
      String typeOfTest = "Integer Insertion Test"; 
      int sumTime = 0;
      for(int i = 0; i < timesToRun; i++) {
        LinkedList<Integer> linkList = new LinkedList<Integer>();
        long startTime = System.currentTimeMillis();
        for (int j = 0; j < testSize; j++) {
           linkList.add(j);
        }
        long stopTime = System.currentTimeMillis();
        if(linkList.size() != testSize) {
          System.out.println("Error running test. Give student a failing grade.");
        } else {
        long elapsedTime = stopTime - startTime;
        sumTime += elapsedTime;
        }
      }
      float averageTime = sumTime/timesToRun;
      System.out.println("Average Time for " + structureToTest + " " + typeOfTest + " of " + testSize + " elements after " + timesToRun + " runs is: " + averageTime + " milliseconds");
   }
}