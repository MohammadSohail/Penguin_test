package routine.Model;

public class Course {
    String courseName;
    String teacherName;

    public Course(String name, String teacherName){
        this.courseName = name;
        this.teacherName = teacherName;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getTeacherName(){
        return teacherName;
    }
}
