public class Student extends Person {
    private int numCourses;
    private String[] courses;
    private int[] grades;

    public Student(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[10];
        this.grades = new int[10];
    }

    public void addCourseGrade(String course, int grade) {
        if (numCourses == courses.length) {
            System.out.println("Course list full. Cannot add grade.");
            return;
        }
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades() {
        if (numCourses == 0) {
            System.out.println("No grades to display.");
            return;
        }
        for (int i = 0; i < numCourses; i++) {
            System.out.println(courses[i] + ": " + grades[i]);
        }
    }

    public int getNumCourses() {
        return numCourses;
    }

    public double getAverageGrade() {
        if (numCourses == 0) {
            return 0;
        }
        double total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / numCourses;
    }
}
