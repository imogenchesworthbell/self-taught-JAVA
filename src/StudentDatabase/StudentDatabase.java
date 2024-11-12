package StudentDatabase;

import java.util.ArrayList;

public class StudentDatabase {
    private ArrayList<Student> students;  // List to store all students

    // Constructor to initialize the ArrayList
    public StudentDatabase() {
        this.students = new ArrayList<>();
    }

    // Method to add a student to the database
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student.getName());
    }

    // Method to remove a student by their ID
    public void removeStudent(int studentId) {
        for (Student student : students) { // iterates over each Student object (student) in the students list
            if (student.getId() == studentId) {
                students.remove(student);
                System.out.println("Student removed: " + student.getName());
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
    }

    // Method to find a student by their ID
    public Student findStudent(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                return student;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
        return null;
    }

    //Method to update a student by their ID
    public boolean updateStudent(int studentId, String newName, int newAge, int newGrade){
        for(Student student : students){
            if (student.getId() == studentId){
                student.setName(newName);
                student.setAge(newAge);
                student.setGrade(newGrade);
                System.out.println("Student updated: " + student);
                return true;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
        return false;
    }

    // Method to display all students (optional but helpful)
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the database.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}

