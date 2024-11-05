# Self-taught-JAVA

### To Do List:

-[x] Make sure all environments/software are installed
-[ ] Is there a required structure for Java?
-[ ] How do I declare variables?
-[x] What data types exist in JAVA?
-[ ] How do I declare functions?
-[ ] How do I declare Classes?
-[ ] How do I control the flow of my application?
-[ ] How do I do loops?
-[ ] How to test/debug?
-[ ] Find and create a beginner project in Java.


### Week 1 Plan:
-[x] **Variables and Data Types** - data types, declaration, initialization and common methods
-[ ] **If-Else statements/control** - if else, logical operators and switch statements
-[ ] **For and while loops** - for, while, break, continue, for each
-[ ] **Classes and Methods** - class and object instantiation, constructors, this keyword, get/set methods inheritance, and public/private.

### Week 2 Plan:

### Week 3 Plan:

### Week 4 Plan:

Websites/Courses found that I can use:

### Learning Plan 
- https://swe-learning-plans.netlify.app/languages/java.html
- https://www.pluralsight.com/paths/java-se-17
- https://www.w3schools.com/java/
- https://www.codecademy.com/learn/learn-java

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
- **Integer types**

(byte (-128...127), short (-32768...32767), int (-2147483648...2147483647), long (-(massiveNumber)L ... (massiveNumber)L))

- **Floating Point Types** 

(float (-(number.number)f...(number.number)f), double (-(biggerNumber.biggerNumber)d...(biggerNumber.biggerNumber)d)

- **Character Type** [single character not strings] 

(char, e.g 'U')

- **Boolean Type** 

(has values of either true or false)

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
- && conditional and
- || conditional or
(conditional looks if the right stands and if it does then it will look at the left)

###