public class Teacher extends Person {
    private int numCourses;
    private String[] courses;

    public Teacher(String name, String address) {
        super(name, address);
        this.numCourses = 0;
        this.courses = new String[10];
    }

    public boolean addCourse(String course) {
        if (numCourses == courses.length) {
            return false;
        }
        courses[numCourses++] = course;
        return true;
    }

    public boolean removeCourse(String course) {
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course)) {
                for (int j = i; j < numCourses - 1; j++) {
                    courses[j] = courses[j + 1];
                }
                numCourses--;
                return true;
            }
        }
        return false;
    }

    public String[] getCourses() {
        return courses;
    }
}
