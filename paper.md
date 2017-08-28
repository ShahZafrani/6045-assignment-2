# Comparing Native Java Data Structure Operation Runtimes
***A brief experiment by Shah Zafrani***

Find the source code at [https://github.com/ShahZafrani/6045-assignment-2](https://github.com/ShahZafrani/6045-assignment-2)

---

Original Assignment Instructions (avaiable [here](https://github.com/okaram/Algorithms/blob/master/content/assignments/6045-assignment2.md))

* Find two data structure implementations in the Java standard library, which according to the documentation have different running times (for example, Linked list vs Array implementation of lists, or hash table vs tree based implementation of sets or maps)

* Compare at least two operations (insert, search, delete etc), for different n values, and plot the actual time they take. You may want to run the same thing several times and use averages.

* Analyze the results. Some possible interesting questions
    * Do you get different results when you run the same thing several times ? How different ? Why do you think it happens ?
    * Can you derive the constants from the data ? How accurately ?
    * Do the results go with the theory ? How much do they deviate ?
    * Does the actual data matter ? The data types ? (String vs Integer vs ...)
    * What implementation would you use and why 

Submit the source code, and a 2-page-ish 'paper' with the plots and analysis. Paper does not have to be formal, I want to see your thinking more than how good you are at word/latex/English 


<div style="page-break-after: always;"></div> 


### First Impressions and Runtime Assumptions

I chose to compare read and write operations using Integers and Strings on 4 different data structures: LinkedList, HashMap, Vector, and ArrayList. 

### Test Implementation

I chose to insert integers and strings in an ordered manner for each data structure. This can lead to skewed results (such as data structures that benefit from being ordered will outperform hash maps). 

### Results




### What I Learned


