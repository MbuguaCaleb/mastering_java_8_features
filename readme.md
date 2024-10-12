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

**Functional Interfaces**
```
Any  interface that has exactly one abstract method (SAMS)
is called a functional interface

@FunctionalInterface is the annotation that is used on Top of all the
functional interfaces

It is importnat for functional interfaces to have the @FunctionalInterface annotation
so that they do not break the rules of the Contat, Single Abstract Method.

previous functional Interfaces were:

(a)Runnable
(b)Comparator.

New functional Interfaces introduced in Java 8 are:

(a)Consumer - BiConsumer
(b)Predicate - BiPredicate
(c)Function - BiFunction,UnaryOperator,BinaryOperator

Remember Any of these Functional Interfaces can easily be implemanted via lambda functions.

```

**BiConsumer**

```
An extension of the consumer and it acceps 2 inputs,

```

**Functional & BiFunction Interface**

```
Where we can code an entire functionality in Java and assign that functionality to a variable.
and pass it across as any other object in Java

Bifunction accepts Two Inputs and return One OutPut.
```
**Notes By**

```
MbuguaCaleb

```