import java.util.*;
public class SchoolProject {
    public static void main(String[] args) {
        // Create an array of Strings to store the names of students
        String[] studentNames = {"Alice", "Bob", "Charlie"};
        
        // Create a HashMap to store the grades for each student
        Map<String, Integer> studentGrades = new HashMap<>();
        
        // Add grades for each student
        studentGrades.put("Alice", 90);
        studentGrades.put("Bob", 85);
        studentGrades.put("Charlie", 70);
        
        // Print the names of students who have a grade of 80 or higher
        for (String name : studentNames) {
            if (studentGrades.get(name) >= 80) {
                System.out.println(name);
            }
        }
    }
}