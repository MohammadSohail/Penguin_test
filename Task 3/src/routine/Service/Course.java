package routine.Service;


public class Course {


    routine.Model.Course course0 = new routine.Model.Course("English Grammar","John Smith");
    routine.Model.Course course1 = new routine.Model.Course("Mathematics","Lara Gilbert");
    routine.Model.Course course2 = new routine.Model.Course("Physics","Johanna Kabir");
    routine.Model.Course course3 = new routine.Model.Course("Chemistry","Danniel Robertson");
    routine.Model.Course course4 = new routine.Model.Course("Biology","Larry Cooper");

    public void printList(){
        System.out.println(course0.getCourseName() + "," + course0.getTeacherName());
        System.out.println(course1.getCourseName() + "," + course1.getTeacherName());
        System.out.println(course2.getCourseName() + "," + course2.getTeacherName());
        System.out.println(course3.getCourseName() + "," + course3.getTeacherName());
        System.out.println(course4.getCourseName() + "," + course4.getTeacherName());
    }

    public void courseList(){
        System.out.println("1. " + course0.getCourseName());
        System.out.println("2. " + course1.getCourseName());
        System.out.println("3. "+course2.getCourseName());
        System.out.println("4. "+course3.getCourseName());
        System.out.println("5. "+course4.getCourseName());
    }


}
