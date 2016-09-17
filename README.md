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
 
- Notice the way in which we create a `FuelSupplier` interface and make `FuelTank` implement it.
- Now we make the `Engine` know about the `FuelSupplier`.
- The `Car` is now composed of `Engine` and `FuelTank`
- By doing this :
 - we decouple the `Car` from `Engine` and `FuelTank`.
 - now, we have `Engine` and `FuelTank` that can be reusable.
 
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

### Exercise 2 - Area Calculation (better way!)

- Add `abstract double getArea()`; in `Shape` and implement in all the shapes.
 - Area calculation formulae are provided.
- Modify `AreaSummer` to use `getArea()`
- Implement the `getArea()` functions on all the shapes and get the test `giveAreaOfAllShapes()` to pass.
 1. Have a think, is this a sustainable style of coding?
 2. What if we need to introduce new shapes?
 3. What if an external library creates a new, unknown, `Shape` and tries to use `AreaSummer`?

======================

## Functional programming

A programming style that does not have side effects. E.g.:

	public int a = 0;
	public void addWithSideEffects(int b) {
		a += b;
	}

	public int addWithNoSideEffects(int x, int y) {
		return x + y;
	}
	
*Why use functional programming?*
- Less to keep in your head
- Helps to avoid concurrency issues (no side effects), ease of parallelization in your programs (maximise your multiple cores)
- Code can be more concise and readable

*Traditional for loop*: (note this also modifies the passed in list)

	public List<Integer> multiplyByTwoWithForLoop(List<Integer> list) {
		for(int i = 0; i < list.size(); i++) {
			int doubled = list.get(i) * 2;
			list.set(i, doubled);
		}
		return list;
	}

*Using stream*: (Has no side effects, list remains unchanged)

	public List<Integer> multiplyByTwoWithStream(List<Integer> list) {
		return list.stream().map(x -> x * 2).collect(Collectors.toList());
	}

### Functional features in Java

- Stream is like an iterator that works on one individual elements.
- A stream is a sequence of elements.
- It offers an API of operations to be done on the elements in an **immutable** way.
- Performs operations **lazily**.
- Can **handle parallel operations** for you if requested.
- All Java collections can be converted to streams with the built-in `stream()` or `parallelStream()` method.

- There are many operations you can do with streams:
 - `map`: transforms each element in a stream based on a given function (e.g. double, absolute)
 - `filter`: filters the stream elements for ones that match a given condition (e.g. even/odd number)
 - `reduce`: reduces the stream into a single element using a given function (eg. sum, min, max)
 - etc...
- [More details on stream](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)

- When we don't use functional programming, the passed element *may be* changed, so to do something else with that list, we need to create a new function to handle the list.
- With functional programming, a ** new list is always ** returned.

- A **lambda** expression is simply a function that can be passed around and may be executed later. (0 or more times)
In Java (version 8+ only) they look like this:
`(a, b) -> {return a + b}`
`(a, b) -> a + b`
 - Since Java is strongly typed, the return type and argument types are inferred from the usage.
 
- In Java functions are actually classes that conform to the Function interface

	public interface Function<T, U> {
		public U apply(T input) {
		// do something and return a object of type U
		}
	}
	
- The apply method is called to execute them

	Function<String, String> shout = (str) -> str.toUpperCase();
	shout.apply('loud noises')
	
Java has a multitude of different function interfaces, for example:

- `Function<T, R>` : a function that accepts one argument and returns a result
- `Consumer<T>` : a void function that takes one argument
- `Predicate<T>` : a boolean-valued function that takes one argument
- `Supplier<T>` : a function that takes no argument but returns a result
- [And many more...](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)

- Futures are placeholders which will turn into results at sometime later. E.g. below:
	public Future<Boolean> saveToDatabase(User user)

- Futures allow you to give instructions now (functions) that will be applied at a later time.

	public interface CompletableFuture<T> {
		public CompletableFuture<U> thenApply(Function<T, U> transformFunction) {}
	}






