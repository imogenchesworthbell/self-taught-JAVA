# Self-taught-JAVA

### To Do List:

-[x] Make sure all environments/software are installed

-[ ] Is there a required structure for Java?

-[x] How do I declare variables?

-[x] What data types exist in JAVA?

-[ ] How do I declare functions?

-[ ] How do I declare Classes?

-[ ] How do I control the flow of my application?

-[ ] How do I do loops?

-[ ] How to test/debug?

-[ ] Find and create a beginner project in Java.

### 4 week Learning Plan

**Days 1–3: Java Basics**

**Day 1: Introduction and Setup**

Research Java – Read about what Java is, its history, and its applications.
Install JDK and IDE – Set up Java JDK and a preferred IDE (IntelliJ IDEA or Eclipse).
Write "Hello, World!" – Create a simple program that prints "Hello, World!"

**Day 2: Basic Syntax and Data Types**

Variables and Data Types – Learn about different data types in Java (int, float, double, char, boolean).
Operators – Study arithmetic, comparison, logical, and assignment operators.

**Day 3: Control Structures**

Conditional Statements – Practice using if, else, and switch.
Loops – Learn about for, while, and do-while loops.
Mini-Project – Create a basic calculator that performs arithmetic based on user input.
Mini-Project – Create a user playable Rock Paper Scissors
Days 4–6: Object-Oriented Programming (OOP)

**Day 4: Introduction to OOP**

Understand OOP Concepts – Study concepts like classes, objects, inheritance, and polymorphism.
Create Your First Class – Define a class with basic fields and methods (e.g., a Person class with name and age).
Watched forrest knights java video coded along and made an inventory able to add items.

**Day 5: Encapsulation and Access Modifiers**

Encapsulation – Learn about getters and setters to protect class properties.
Access Modifiers – Study public, private, protected, and package-private.

**Day 6: Inheritance and Polymorphism**

Inheritance – Create a subclass that extends an existing class (e.g., Employee extending Person).
Polymorphism – Practice using polymorphic methods and method overriding.
Mini-Project – Develop a simple “Employee Management” system where different employee types (e.g., manager and salesperson) have unique properties.

**Days 7–9: Advanced Java Concepts**

**Day 7: Exception Handling**

Try-Catch Blocks – Learn how to handle exceptions and use try-catch blocks.
Custom Exceptions – Create a custom exception for practice.

**Day 8: Generics and Collections**

Introduction to Generics – Learn about generics to write flexible, type-safe code.
Collections – Study commonly used collections (ArrayList, HashMap, etc.).

**Day 9: Working with Collections**

Practice with Collections – Create a small program that uses ArrayList, HashMap, and HashSet.
Mini-Project – Build a “Student Database” that allows adding, removing, and searching for students using collections.

**Days 10–11: Multithreading and File I/O**

**Day 10: Multithreading Basics**

Understanding Threads – Learn how threads work in Java and their importance.
Creating Threads – Practice creating and running threads with Runnable and Thread classes.

**Day 11: File I/O**

File Reading and Writing – Learn to read from and write to text files using FileReader, BufferedReader, FileWriter, and BufferedWriter.
Practice – Create a program that reads and writes user data to a file.

**Days 12–13: Networking and Input/Output**

**Day 12: Networking Basics**

Socket Programming – Learn about networking and sockets to enable client-server communication.
Simple Client-Server Chat – Create a basic client-server chat application that sends messages between users.

**Day 13: Standard I/O**

System Input and Output – Practice reading from and writing to the console using System.in and System.out.
Mini-Project – Extend your “Chat Application” to save chat history to a file and load it on startup.

**Days 14–15: Best Practices and Final Project**

**Day 14: Java Best Practices**

Code Organization and Style – Refactor code to follow best practices.
Testing with JUnit – Write unit tests using JUnit for your classes and methods.

**Day 15: Build Something!**

**Week 4 Decide on a Project**

[//]: # (### Week 1 Plan:)

[//]: # (-[x] **Variables and Data Types** - data types, declaration, initialization and common methods)

[//]: # ()
[//]: # (-[x] **If-Else statements/control** - if else, logical operators and switch statements)

[//]: # ()
[//]: # (-[ ] **For and while loops** - for, while, break, continue, for each)

[//]: # ()
[//]: # (-[ ] **Classes and Methods** - class and object instantiation, constructors, this keyword, get/set methods inheritance, and public/private.)

[//]: # ()
[//]: # ()
[//]: # (### Week 2 Plan:)

[//]: # ()
[//]: # (### Week 3 Plan:)

[//]: # ()
[//]: # (### Week 4 Plan:)

### Websites Used / Learning Plan
- https://swe-learning-plans.netlify.app/languages/java.html
- https://www.pluralsight.com/paths/java-se-17
- https://www.w3schools.com/java/
- https://www.youtube.com/watch?v=b5l5UodFzMo
- https://www.youtube.com/watch?v=TiccevwEVe8
- https://edabit.com
- https://codewars.com

### Notes:

Push back to GitHub:
- git add .
- git commit -m"message here"
- git push --set-upstream origin ICB

Pull from GitHub:
- git fetch
- git pull
- git merge origin/main


# Week 1
Learning using the above pluralsight Java Course (Entry Level).

### Variables:
- int firstVariable = 25; - This can be changed 
- **final** secondVariable = 30 - 'final' value can't be changed once it is set

### Data Types:
**Integer types**

- **byte** (-128...127)

- **short** (-32768...32767)

- **int** (-2147483648...2147483647)

- **long** (-(massiveNumber)**L** ... (massiveNumber)**L**)

**Floating Point Types** 

- **float** (-(number.number)**f**...(number.number)**f**)

- **double** (-(biggerNumber.biggerNumber)**d**...(biggerNumber.biggerNumber)**d**)

**Character Type** [single character not strings] 

- **char** (e.g 'U') 

**Boolean Type** 

- **boolean** (has values of either true or false)

**String Type**

- **String** ("Hello")

### Type Conversion:
Widening conversions happen automatically, however, when shortening we need to specify.
e.g. short example1 = (short) longValue
this would turn the longValue into a short and then store example1 as that new short value.

### If-else statements

    if(condition)
        if-true-statement;
    else if(condition 2)
        else-if-true-statement;
    else
        false-statement;

### Logical operators
- & - and
- | - or
- ^ - exclusive XOR (if one  side or the other is true, but not both)
- ! - negation (!= not equal)
- && - conditional and
- || - conditional or
(conditional looks if the right stands and if it does then it will look at the left)
