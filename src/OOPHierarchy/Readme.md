# Mini-Project Challenge/Task 

## Create a Simple OOP Hierarchy

### Design a small class hierarchy to represent a Library system:

### LibraryItem (a base class):
Properties: title (String) and yearPublished (int).
Method: displayInfo() to print title and year published.


### Book (subclass of LibraryItem):
Adds a property author (String).
Overrides displayInfo() to include author in the output.


### DVD (subclass of LibraryItem):
Adds a property director (String).
Overrides displayInfo() to include director in the output.


### Create a main method to:

Instantiate a Book object and a DVD object.
Call displayInfo() on each object to show how polymorphism allows different outputs based on the object’s type.