package pckg_1;

import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    Course course0 = new Course("English Grammar","John Smith");
    Course course1 = new Course("Mathematics","Lara Gilbert");
    Course course2 = new Course("Physics","Johanna Kabir");
    Course course3 = new Course("Chemistry","Danniel Robertson");
    Course course4 = new Course("Biology","Larry Cooper");
    int count=0;

    Routine routine = new Routine();

    public static void main(String[] args) {

        boolean ok =  true;
        char x;
        Scanner sc = new Scanner(System.in);
        Main m=new Main();
        while(true){
            System.out.println("A. Create Routine\nB. Show Routine\nC. List Courses with Teachers name.");
            x = sc.next().charAt(0);
            switch (x) {
                case 'A':
                    m.courseList();
                    m.createRoutine();
                    break;
                case 'C':
                    m.printList();
                    break;
                case 'B':
                    m.showRoutine();
                    break;
                default:
                    continue;

            }
        }
    }

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

    public void createRoutine(){
        Scanner sc = new Scanner(System.in);
        //int dayIndex = sc.nextInt();
        for(int i = 0; i < 4; i++){
            int dayIndex = sc.nextInt();
            int hourIndex = sc.nextInt();
            int courseIndex = sc.nextInt();
            routine.arr[dayIndex][hourIndex]=courseIndex;

        }
        count++;
    }

    public void showRoutine(){

        for(int i = 0; i < count; i++){
            for (int j = 0;j < 4; j++)
            {
                String crs;
                if(routine.arr[i][j]==0)
                {
                    System.out.println(i+" "+j+" "+course0.getCourseName());
                }
                if(routine.arr[i][j]==1)
                {
                    System.out.println(i+" "+j+" "+course1.getCourseName());
                }
                if(routine.arr[i][j]==2)
               {
                System.out.println(i+" "+j+" "+course2.getCourseName());
               }
                if(routine.arr[i][j]==3)
                {
                    System.out.println(i+" "+j+" "+course3.getCourseName());
                }
                if(routine.arr[i][j]==4)
                {
                    System.out.println(i+" "+j+" "+course4.getCourseName());
                }
            }



        }
    }

}
