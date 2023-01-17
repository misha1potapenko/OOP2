import Model.Attendance;
import Model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Attendance> forFirst = new ArrayList<>();
        forFirst.add(new Attendance(LocalDate.of(2020,12,23), true));
        forFirst.add(new Attendance(LocalDate.of(2020,11,23), false));
        forFirst.add(new Attendance(LocalDate.of(2020,10,23), true));
        Student first = new Student(1,"Popov Ilja", forFirst);
        System.out.println(first.attendancePersent());

        System.out.println("Hello world!");
    }
}