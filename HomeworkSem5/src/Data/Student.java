package Data;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;

    private List<AttendanseJournal> attendanse = new ArrayList<>();

    public Student(int id, String name, List<AttendanseJournal> attendanse) {
        this.id = id;
        this.name = name;
        this.attendanse = attendanse;
    }
    public float forAttendance(){
        for (AttendanseJournal each: attendanse
             ) {
            System.out.println(each);
        }

        return 0;

    }
    public List<AttendanseJournal> getAll(){
        List<AttendanseJournal> copy = new ArrayList<>();
        for (AttendanseJournal student: attendanse
        ) {
            copy.add(student);
        }
        return copy;
    }

    @Override
    public String toString() {
        return "\n Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", attendanse=" + attendanse;
    }
}
