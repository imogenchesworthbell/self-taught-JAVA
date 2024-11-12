# Create a Student Database

Design a console-based student database system using Object-Oriented Programming principles in Java. The system allows adding, removing, and searching for students.

## Classes

**Student:**

- id (int) - The student's unique identifier.
- name (String) - The student's name.
- age (int) - The student's age.
- grade (int) - The student's grade
- getId() - Returns the student's ID.
- getName() - Returns the student's name.
- getAge() - Returns the student's age.
- getGrade(int) - Returns the students grade.

**StudentDatabase:**

- students (ArrayList<Student>) - A list that stores all the students in the database.
- addStudent(Student student) - Adds a student to the database.
- removeStudent(int studentId) - Removes a student from the database by their ID.
- findStudent(int studentId) - Searches for a student by their ID and returns their details.
- updateStudent(studentId, String newName, int newAge, int newGrade) - Update a students' information

- **Main:**

- main(String[] args) - The main method that runs the program. It interacts with the user to add, remove, or search for students in the database. It uses the StudentDatabase class to perform these actions.
