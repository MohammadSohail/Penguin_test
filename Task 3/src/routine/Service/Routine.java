package routine.Service;

import java.util.Scanner;

public class Routine extends Course {

    routine.Model.Routine routine = new routine.Model.Routine();
    int count = 0;

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
