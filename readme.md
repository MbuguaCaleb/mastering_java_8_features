**Imperative vs Declarative**

```
(a)Imperative Approach --> Here we normally focus on a step by step problem 
solving approach.Tradional OOP archictecture.

(b)Declarative programming -->With this one, we  focus on the end result,
we command java to do something, Java 8 introduce a lot of functions
where we can give a range of inputs and we get the correct output
declaratively.

[It is commanding Java to give you this or that]

```

**Lambda Function**

```
This is a function without a name, it is also know as an anonymous function.
It has all the Qaulities that a regular methods have:
  (a)Method Parameters
  (b)Method Body
  (c)Return Type
 
Lambdas are not tied to any classes unlike regular methods.
Lambdas can also be assigned to a variable and passed around like any other regular
variables in Java.

Lambda expression

(input params) ->  {method body}

The main purpose of Lamba is the implementation of functional Interfaces.
If an interface has only one abstract method it is categorized as a functional
Interface.

Ruunable and Comparator methods are some of the traditional Java Interfaces.
Runnable and Comparator methods helo us in creating the traditional lambads
that were introduced in Java 1.8

A Thread takes in a RunnableInterface.
Lambdas simplify greatly how we work with threads

N/B
Using Lambdas we run Methods inside functional Interfaces, Anonymostly
Which leads to cleaner code
```