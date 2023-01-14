package Data;


import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    private List<Student> students = new ArrayList<>();


    public StudentsGroup(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "students=" + students +
                '}';
    }
    public List<Student> NewGroup(Student student){
        List<Student> newGroup1 = new ArrayList<>();
        newGroup1.add(new Student(1,"Petrov Ivan"));
        newGroup1.add(new Student(2,"Voronova Inna"));
        newGroup1.add(new Student(3,"Kuznecova Marina"));
        return newGroup1;
    }

}
