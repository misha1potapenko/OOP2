import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Students> students;

    public List<Students> getStudentsGroup() {
        return students;
    }

    public Group(List<Students> studentsGroup) {
        this.students = studentsGroup;
    }

    public Students get (int index){
        return students.get(index);
    }
}

