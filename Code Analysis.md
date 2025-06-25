Code Analysis for LinkedListCreation.java
Author: Ephraim Duncan
Date: 06-10-2025

Project structure:
Class is LinkedListCreted.
Methods include all of the below:
  1. main(String[] args),  this helps execute the program.
  2. addIntegers(List<Integer> numberList),  which handles user input
  3. showList(List<Integer> numberList),  which sorts and prints the list
This program is a single class.

Reuse of code/ Java Collections:
  1. LinkedList<Integer>- Reuses Java’s built-in linked list structure instead of writing custom Node-based logic.

  2. Collections.sort()-This uses Java's optimized sorting instead of implementing from scratch.


Encapsulation:
 The main function 'main()' is 'public', as required while 'addIntegers()' and 'showList()' are private, hiding implementation details which follows the good practice of OOP principles.


SOLID

(S) Each method has one job.
(O) Easily extendable (e.g., replace 'LinkedList' with 'Stack' for next week)
(L) Uses List<Integer> numberList = new LinkedList<>();  using list interface which could easily be changed to stack like next week.
    changes ----> List<Integer> numberList = new Stack<>(); Although, I will not write it like this, this should display how it will be substituted.
(I) Uses simple, focused interfaces |
(D) No not yet at least.


Law of Demeter:
Each method only interacts with direct collaborators (local variables or passed parameters), there is also no chaining. it's all clean.

Summary:
This project follows SOLID principles and is encapsulated with the class being public and contents being private. This code is simple and designed to be repurposed,
next week will reuse as a stack implementation instead. Should be able to maintain status as clean Java code that is disciplined.
