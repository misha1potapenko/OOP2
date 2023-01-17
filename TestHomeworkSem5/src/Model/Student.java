package Model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;

    private List<Attendance> attendances = new ArrayList<>();

    public Student(int id, String name, List<Attendance> attendances) {
        this.id = id;
        this.name = name;
        this.attendances = attendances;
    }

    public float attendancePercent(){
        float percent = 0;
        float count = 0;
        float allDay = 0;
        for (Attendance each: attendances
             ) { allDay ++;
            if (each.isAttendance()) count ++;

        }
        percent = count/allDay * 100;
        return percent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", attendances=" + attendances +
                '}';
    }
}
