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

​	I chose to compare read and write operations using Integers and Strings on 4 different data structures: LinkedList, HashMap, Vector, and ArrayList. When choosing these I assumed that the HashMap would be the fastest for reads and writes, followed by Vector then ArrayList, with LinkedList lagging behind. I didn't have a very scientific reason for expecting HashMap to be the fastest, but have always heard people say it's the fastest. Vectors and ArrayLists should be blazingly fast because  they both function as arrays under the hood. LinkedList reads are expected to be slow because of their node based implementation. 



### Test Implementation

​	I chose to insert integers and strings in an ordered manner for each data structure. This can lead to data structures that benefit from being ordered performing better than ones that don't. The tests were designed to insert objects (integers and then strings) and then read each one of them. This is done with input sizes of a hundred thousand elements and one million elements. These tests are averaged over the course of ten runs. The code to implement these tests was deceptively easy to write, so I wrote the test once for LinkedList and then copy-pasted it to make the other four test cases while only changing two or three lines. In many scenarios having large amounts of identical code is problematic, here it makes the test code easier to read and work with. I also decided to implement the program as a command line interface with inputs reminiscent of some older DOS programs for aesthetic purposes.  



### Results



![integerTestPlot](\images\integerTestPlot.png?raw=true)

![stringTestPlot](\images\stringTestPlot.png?raw=true)

​	When the tests were run I was surprised by the results of the Hash Map performance. It took significantly longer to on all of the operations compared to the Vector and the ArrayList. The LinkedList took so long to complete when handling a million elements that I had to abort the tests (for my purposes the exact completion time is less relevant than getting a good comparison). Vector and ArrayList had near identical performances with both Integer and String tests. When run multiple times, both ArrayList and Vector would alternate between having the fastest completion time. Tests with Strings tended to take close to double the time to complete (most likely because a string value takes more memory than an int value).  


### What I Learned

​	Next time I should output to csv for easier reading of results. I should use a more powerful machine so that I can run tests with more elements and larger objects. Based on the results of this experiment I can safely say that for most implementations I would use an ArrayList over any of the other data structures. In fact, when I was working as a developer at a leading home improvement retailer the microservices we wrote used ArrayLists to store and transfer large amounts of objects. I think the theory matches the results in that the natively indexed structures (ArrayList and Vector) performed at what I would interpret as constant time, and the LinkedList (with its node reference implementation) performed at linear time with respect to the size of n. Given this data it is easy to see how the growth rates of functions greatly impact design decisions for developers every day, and this strengthens my resolve to learn more about the theory. 
