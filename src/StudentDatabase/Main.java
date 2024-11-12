package StudentDatabase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDatabase database = new StudentDatabase();

        // Menu to interact with the user
        while (true) {
            System.out.println("\nStudent Database Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Find Student");
            System.out.println("4. Update Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1: // Add student
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    Student student = new Student(id, name, age, grade);
                    database.addStudent(student);
                    break;

                case 2: // Remove student
                    System.out.print("Enter student ID to remove: ");
                    int removeId = scanner.nextInt();
                    database.removeStudent(removeId);
                    break;

                case 3: // Find student
                    System.out.print("Enter student ID to find: ");
                    int findId = scanner.nextInt();
                    Student foundStudent = database.findStudent(findId);
                    if (foundStudent != null) {
                        System.out.println("Found student: " + foundStudent);
                    }
                    break;

                case 4: // Update a student
                    System.out.print("Enter student ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new age: ");
                    int newAge = scanner.nextInt();
                    System.out.print("Enter new grade: ");
                    int newGrade = scanner.nextInt();
                    boolean updated = database.updateStudent(updateId, newName, newAge, newGrade);
                    if (!updated) {
                        System.out.println("Update failed. Student not found.");
                    }
                    break;

                case 5: // Display all students
                    database.displayStudents();
                    break;

                case 6: // Exit
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}

