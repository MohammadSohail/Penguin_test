package routine.App;

import routine.Service.Course;
import routine.Service.Routine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean ok =  true;
        char x;
        Scanner sc = new Scanner(System.in);
        Course c = new Course();
        Routine r = new Routine();

        while(true) {
            System.out.println("A. Create Routine\nB. Show Routine\nC. List Courses with Teachers name.");
            x = sc.next().charAt(0);
            switch (x) {
                case 'A':
                    c.courseList();
                    r.createRoutine();
                    break;
                case 'C':
                    c.printList();
                    break;
                case 'B':
                    r.showRoutine();
                    break;
                default:
                    continue;

            }
        }
    }
}
