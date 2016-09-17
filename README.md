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

- Inheritance should NOT be used as a convenient means for code-reuse
- Some might say inheritance actually violates encapsulation due to the tight coupling between parent and child classes.
- If there is no clear object hierarchy or if there are doubts, use composition.


### Exercise 3

- Can we apply composition to overcome our problem of the `CountingStringList` class having dependency on the parent class implementation?

## Project : BloppiGames (Polymorphism)

- Bloppian children love to play number games.
- Their favourite is to take a list of numbers and a set of game rules.

They like to find the rule that produces the largest result.

Implement the Player class such that all the tests pass.

Feel free to have some fun making your own rules, perhaps you could make a rule that combines other rules together.

======================

## Project : Dependency Inversion

- High-level modules should not depend on low-level modules. Both should depend on abstractions.
- Abstractions should not depend upon details. Details should depend upon abstractions.

### Exercise 1

We have a Driver who loves to listen to the Radio while she is driving in the Car. While driving the driver can speedUp, slowDown, listenToRadio, etc. 
Your task is:
- To get the tests for the Driver passing.

### Exercise 2

Is the dependency between the Driver to Car and Radio modelled correctly?

- Can we create a new type of car, SportsCar
 - Behaves like car but accelerates and decelerates in steps of 2.

- How can the Driver easily use SportsCar instead of Car?

======================

## Project : LiskovSubstitution

Think of the interface that is exposed.

We cannot replace Car with Helicopter in the test because the Helicopter has to take off before it can accelerate, that the driver doesn't know. Hence it is bad LiskovSubstitution.

======================

## Project : InterfaceSegregation 

Our Driver’s Car needs some fuel from the FuelStation
Have a look at the code and think about the questions below:

- Is it correct that Driver and FuelStation should both depend on the entire Car class?
- Implement the correct way to model the code so that each User of Car actually needs to only use a subset (hint: interface)
 - Please do not break up the Car class.
- Can you think of any advantages because you did this?

- Here, notice that both `DriverCarInterface` and `FuelStationInterface` have `checkFuelLevel()` method. 
- We can extract the `checkFuelLevel()` to a new `Fillable` interface, make `DriverCarInterface` and `FuelStationInterface` implement the `Fillable`.
- This way we create a diamond like interface dependency.

======================

## Project : SingleResponsibility

- Do one thing ...
- Do it well!
- Instead of having a big Uber class doing everything (possibily crappily), create multiple smaller classes doing only one thing (but doing properly)

### Exercise 1

Our Car can speedUp and slowDown, and it also handles all engine responsibilities and fuel responsibilities.

- Is the Car class doing more than one thing?
- Can we break up the class so that they are doing only one thing?
 - Remember the exposed interface of Car should not change.
- How should we handle the useFuel method? Which class does it belong to?
 - Remember to consider the other principles if they help.

======================

## Project : OpenClosed

- Closed for modification
- Open for extension

### Exercise 1 - Area Calculation

We have created a class (`AreaSummer`) that gives the total area of a set of shapes… currently it can only handle `Squares` and `Circles`.

- In the same style of code, modify the `AreaSummer` to support `Rectangles` and get the test `giveAreaOfSquareCircleAndRectanlge()` to pass.
 1. Have a think, is this a sustainable style of coding?
 2. What if we need to introduce new shapes?
 3. What if an external library creates a new, unknown, Shape and tries to use AreaSummer?
