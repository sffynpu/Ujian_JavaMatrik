import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create student and teacher objects
        Student student = new Student("John Doe", "123 Main Street");
        Teacher teacher = new Teacher("Jane Doe", "456 Elm Street");

        // Add courses to Teacher
        teacher.addCourse("Java Programming");
        teacher.addCourse("Data Structures and Algorithms");

        // Simulate interaction
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. View course list");
            System.out.println("2. View my grades");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Display courses offered by Teacher
                    for (String course : teacher.getCourses()) {
                        if (course != null) {
                            System.out.println(course);
                        }
                    }
                    break;
                case 2:
                    // Display student's grades (if any)
                    if (student.getNumCourses() == 0) {
                        System.out.println("No grades available.");
                    } else {
                        student.printGrades();
                        System.out.println("Average grade: " + student.getAverageGrade());
                    }
                    break;
                case 3:
                    // Exit program
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
