package dataStructure;

import java.util.HashMap;
import java.util.Map;

public class GradeBook {
    private Map<String, Integer> grades;

    // Constructor
    public GradeBook() {
        grades = new HashMap<>();
    }

    // Method to add a student and their grade to the grade book
    public void addGrade(String studentName, int grade) {
        grades.put(studentName, grade);
    }

    // Method to calculate the average grade
    public double calculateAverage() {
        if (grades.isEmpty()) {
            return 0.0; // Return 0 if there are no grades
        }

        int total = 0;
        for (int grade : grades.values()) {
            total += grade;
        }

        return (double) total / grades.size();
    }

    // Method to display the student names and their grades
    public void displayGrades() {
        System.out.println("Student Grades:");
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        // Create a GradeBook instance
        GradeBook gradeBook = new GradeBook();

        // Add grades for some students
        gradeBook.addGrade("Alice", 90);
        gradeBook.addGrade("Bob", 85);
        gradeBook.addGrade("Charlie", 95);

        // Display student grades
        gradeBook.displayGrades();

        // Calculate and display the average grade
        double average = gradeBook.calculateAverage();
        System.out.println("Average Grade: " + average);
    }
}
