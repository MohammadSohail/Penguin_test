package pckg_1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String courseName;
    String teacherName;

    public Course(String name, String teacherName){
        this.courseName = name;
        this.teacherName = teacherName;
    }
    String getCourseName(){
        return courseName;
    }
    String getTeacherName(){
        return teacherName;
    }
}
