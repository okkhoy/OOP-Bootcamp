# OOP-Bootcamp
OOP Bootcamp bootcamp organize by Thoughtworks at NUS

## Agenda

*Basic OO Principles*
- Abstraction and Encapsulation
- Inheritance
- Polymorphism

*SOLID Principles*
- Single Responsibility
- Open Closed
- Liskov’s Substitution
- Interface Segregation
- Dependency Inversion

*Functional Programming*
- Basic introduction
- Functional features in Java 8

*Retrospective*

## Coding exercise

There will be many Coding exercises throughout the day.
To get ready, please download and extract the exercises from here:

http://bit.ly/2cur7DK

Each project is already setup for Eclipse, you should just be able to import the project into Eclipse (File > Import…)



## Project: BloppiDate (Encapsulation and abstraction)

### Exercise 1
On the planet Bloppi, everything is a regular cycle, including their dates.
- A year has exactly 360 days
- A month has exactly 30 days
- Days, months and years are zero based. (i.e. 0-11 are valid months)
Your task is to implement BloppiDate, which should have a method to print the date in the following format: d/m/y, e.g 5/0/12

### Exercise 2
Now, there are some new requirements:
- Create method `diffDays`: given another BloppiDate, you need to return the number of days between the dates.
- Create method `addDays`: given a number of days, return a new BloppiDate representing that many days in the future (or past if negative)

### Exercise 3
Let's change the internal storage of BloppiDate to be a number of days since 0/0/0
instead of day, month, year.

Does this make `diffDays` and `addDays` easier?

How about `toString` and the constructor?

Do all your tests still pass?

## Project: Bloppians (Inheritance)

*Bloppian inheritance*
- A Bloppian can fly, talk and eat
- However, a female Bloppain can also lay eggs and fly twice as fast as male Bloppian
- A male Bloppain shouts when it talks and can also fertilize eggs

### Task 1: Implement FemaleBloppian and MaleBloppian classes
- Ensure all unit tests pass


## Project: Inheritance Pitfalls

- Tightly coupled with Super class implementation.
- Can be inflexible, classes and method are bound by a predefined set of behaviour. 
- Languages such as Java only allows single inheritance

### Exercise 1

We have `StringList` which allows you to `add` a String or `addAll` Strings in a collection to the list. 
We also have `CountingStringList` which extends `StringList` and counts the number of elements that have been inserted. 

Your task:
- Find out why the CountingStringList unit test is failing?
- Fix the failure without modifying the super class

### Exercise 2

- Now, what happens if the parent class `MyStringList` changes its implementation of `addAll` to NOT call `add`?
- What can we do to overcome this problem?

### Composition

Composition allows code re-use by:
- composing some objects inside another
- the composite object can then call the methods of the objects that it contains, and possibly add extra behaviour.

### Exercise 3

- Can we apply composition to overcome our problem of the `CountingStringList` class having dependency on the parent class implementation?