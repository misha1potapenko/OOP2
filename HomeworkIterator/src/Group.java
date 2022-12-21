import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Students> studentsGroup;

    public List<Students> getStudentsGroup() {
        return studentsGroup;
    }

    public Group(List<Students> studentsGroup) {
        this.studentsGroup = studentsGroup;
    }
}
}
