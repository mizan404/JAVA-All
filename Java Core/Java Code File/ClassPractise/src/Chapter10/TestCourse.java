package Chapter10;

public class TestCourse {

    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Data Structures");
        course1.addStudent("aaa");
        course1.addStudent("bbb");
        course1.addStudent("ccc");

        course2.addStudent("ddd");
        course2.addStudent("eee");
        System.out.println("Number of students in course1: " + course1.getNumberOfStudent());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudent(); i++) {
            System.out.println(students[i] + ",");
        }

        System.out.println();
        System.out.println("Number of students in course2 :" + course2.getNumberOfStudent());

    }
}
