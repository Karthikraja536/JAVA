class manage {
    private String name;
    private String id;
    private static int enrolled = 0;

    public manage(String name, String id) {
        this.name = name;
        this.id = id;
        enrolled++;
    }

    public static int getEnrolled() {
        return enrolled;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}

class Course {
    private String title;
    private String code;
    private static int courses = 0;

    public Course(String title, String code) {
        this.title = title;
        this.code = code;
        courses++;
    }

    public static int getCourses() {

        return courses;
    }

    public String getTitle() {

        return title;
    }

    public String getCode() {

        return code;
    }
}

public class University {
    public static void main(String[] args) {
        manage student1 = new manage("Karthik", "23110026");
        manage student2 = new manage("Kannama", "23110025");
        manage student3 = new manage("Gandhi", "23110024");
        System.out.println("Total Students Enrolled: " + manage.getEnrolled());

        Course stud1 = new Course("aiml", "212");
        Course stud2 = new Course("aids", "213");
        System.out.println("Total Course Offered: " + Course.getCourses());
    }
}


