# Data Structure  Comparison Paper Outline

## Intro:
- Assumptions in structuring a program
- Assumptions in what is going to work better
- 

## Preparation
- Codebase implementation
	- Implemented as a command line interface for style and ease of use (Aesthetic is important)
	- I created a class for each type of data structure. But I only wrote one of them initially so that I could copy-paste and change the one or two relevant lines of code to make it work for each different data structure. 
- Stregnths of using the code structure that I did
	- portability (easy to extend to other data structures)
- drawbacks of using said structure
- acknowledging biases in implementation

## Results
- What performed better in what situations
	- as expected, string operations took longer than with integers.
	- LinkedList was the slowest for everything, with it's only redeeming attribute being the speed at which it can insert elements
	- ArrayList and Vector have very similar performance
	- HashMap worked surprisingly well for storing smaller amounts of data. When using a hashmap for storing string values, the advantage is that strings are used as keys as well. 
- Why I think it performed better

- Why it actually performed better (using some outside source)

## What I would do next time...

- output to a csv
- use more test runs for the average
- use a higher specced machine 
