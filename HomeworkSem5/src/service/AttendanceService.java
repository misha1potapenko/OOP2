package service;


import Data.Student;
import Data.StudentsGroup;

import java.util.List;


public class AttendanceService {
    private int attendance;

    StudentsGroup forNewGroup = new StudentsGroup();

    public int getAttendance(List<Student> group){

        for (Student each: forNewGroup.NewGroup()
             ) {
            System.out.println(each);
        }

        return attendance;
    }

}
