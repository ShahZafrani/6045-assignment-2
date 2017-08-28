import java.util.*;

public class HashMapTest {
  
   static String structureToTest = "Hash Map";
   
   public static void testIntegerInsertionAndRead(int testSize, int timesToRun) {
      
      int insertSumTime = 0;
      int readSumTime = 0;
      for(int i = 0; i < timesToRun; i++) {
        HashMap<Integer, Integer> hashPipe = new HashMap<Integer, Integer>();
        long startTime = System.currentTimeMillis();
        for (int j = 0; j < testSize; j++) {
           hashPipe.put(j,j);
        }
        long stopTime = System.currentTimeMillis();
        if(hashPipe.size() != testSize) {
          System.out.println("Error running test. Give student a failing grade.");
        } else {
        long elapsedTime = stopTime - startTime;
        insertSumTime += elapsedTime;
        
        int out = 0;
        startTime = System.currentTimeMillis();
        for (int k = 0; k < testSize; k++) {
           out = hashPipe.get(k);
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
        HashMap<String, String> hashPipe = new HashMap<String, String>();
        long startTime = System.currentTimeMillis();
        for (int j = 0; j < testSize; j++) {
           hashPipe.put(String.valueOf(j),String.valueOf(j));
        }
        long stopTime = System.currentTimeMillis();
        if(hashPipe.size() != testSize) {
          System.out.println("Error running test. Give student a failing grade.");
        } else {
        long elapsedTime = stopTime - startTime;
        insertSumTime += elapsedTime;
        
        String out = "a";
        startTime = System.currentTimeMillis();
        for (int k = 0; k < testSize; k++) {
           out = hashPipe.get(k);
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