package service;

import java.util.Scanner;

public class Controller {


    public void showMe(){

        while (true){
            System.out.println("Выберите действие");
            System.out.println("1 - показать студентов и посещаемость");
            System.out.println("2 - отсортировать посещаемость");
            Scanner scan = new Scanner(System.in);
            int i = scan.nextInt();
            if (i == 1){
                AttendanceView show = new AttendanceView();
                show.showGroup();
                show.showAttendance();

            } else if ( i == 2) {

            }
            else if ( i == 3) {

            }
            else if ( i == 5) {
                System.out.println("Вы вышли из программы");
               break;
            }
        }


    }
}
