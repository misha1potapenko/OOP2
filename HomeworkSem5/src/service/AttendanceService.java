package service;


import Data.Student;
import Data.StudentsGroup;


public class AttendanceService {
    private int attendance;
    private StudentsGroup group = new StudentsGroup();




    public void showAllAttendance(){
        StudentsGroup group1 = new StudentsGroup();
        for (Student student:group1.NewGroup()
             ) {
            System.out.printf(student.getName() + " = " + student.attendancePercent() + '\n');

        }

        }
    }

