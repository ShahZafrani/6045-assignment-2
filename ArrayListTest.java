import java.util.*;

public class ArrayListTest {
  
   static String structureToTest = "Array List";
   
   public static void testIntegerInsertionAndRead(int testSize, int timesToRun) {
      
      int insertSumTime = 0;
      int readSumTime = 0;
      for(int i = 0; i < timesToRun; i++) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        long startTime = System.currentTimeMillis();
        for (int j = 0; j < testSize; j++) {
           arrList.add(j);
        }
        long stopTime = System.currentTimeMillis();
        if(arrList.size() != testSize) {
          System.out.println("Error running test. Give student a failing grade.");
        } else {
        long elapsedTime = stopTime - startTime;
        insertSumTime += elapsedTime;
        
        int out = 0;
        startTime = System.currentTimeMillis();
        for (int k = 0; k < testSize; k++) {
           out = arrList.get(k);
        }
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        readSumTime += elapsedTime;
        }
      }
      float insertAverageTime = insertSumTime/timesToRun;
      float readAverageTime = readSumTime/timesToRun;
      
      System.out.println("Average Time for " + structureToTest + " Integer Insertion Test of " + testSize + " elements after " + timesToRun + " runs is: " + insertAverageTime + " milliseconds");
      System.out.println("Average Time for " + structureToTest + " Integer Read Test of " + testSize + " elements after " + timesToRun + " runs is: " + readAverageTime + " milliseconds");
      
      //too lazy to code this into the main as an option. Just gonna chain off of this function
      testStringInsertionAndRead(testSize, timesToRun);
   }
   
    public static void testStringInsertionAndRead(int testSize, int timesToRun) {
      
      int insertSumTime = 0;
      int readSumTime = 0;
      for(int i = 0; i < timesToRun; i++) {
        ArrayList<String> arrList = new ArrayList<String>();
        long startTime = System.currentTimeMillis();
        for (int j = 0; j < testSize; j++) {
           arrList.add(String.valueOf(j));
        }
        long stopTime = System.currentTimeMillis();
        if(arrList.size() != testSize) {
          System.out.println("Error running test. Give student a failing grade.");
        } else {
        long elapsedTime = stopTime - startTime;
        insertSumTime += elapsedTime;
        
        String out = "a";
        startTime = System.currentTimeMillis();
        for (int k = 0; k < testSize; k++) {
           out = arrList.get(k);
        }
        stopTime = System.currentTimeMillis();
        elapsedTime = stopTime - startTime;
        readSumTime += elapsedTime;
        }
      }
      float insertAverageTime = insertSumTime/timesToRun;
      float readAverageTime = readSumTime/timesToRun;
      
      System.out.println("Average Time for " + structureToTest + " String Insertion Test of " + testSize + " elements after " + timesToRun + " runs is: " + insertAverageTime + " milliseconds");
      System.out.println("Average Time for " + structureToTest + " String Read Test of " + testSize + " elements after " + timesToRun + " runs is: " + readAverageTime + " milliseconds");
   }
}