package Data;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    private List<Student> students = new ArrayList<>();




    public List<Student> NewGroup(){
        List<Student> newGroup1 = new ArrayList<>();
        List<AttendanseJournal> forPetrov = new ArrayList<>();
        forPetrov.add(new AttendanseJournal(LocalDate.of(2020,1,12), true));
        forPetrov.add(new AttendanseJournal(LocalDate.of(2020,1,13), true));
        forPetrov.add(new AttendanseJournal(LocalDate.of(2020,1,14), false));
        newGroup1.add(new Student(1,"Petrov Ivan", forPetrov));


        List<AttendanseJournal> forVoronova = new ArrayList<>();
        forVoronova.add(new AttendanseJournal(LocalDate.of(2020,1,12), false));
        forVoronova.add(new AttendanseJournal(LocalDate.of(2020,1,13), false));
        forVoronova.add(new AttendanseJournal(LocalDate.of(2020,1,14), false));
        newGroup1.add(new Student(2,"Voronova Inna", forVoronova));

        List<AttendanseJournal> forKuznecova = new ArrayList<>();
        forKuznecova.add(new AttendanseJournal(LocalDate.of(2020,1,12), true));
        forKuznecova.add(new AttendanseJournal(LocalDate.of(2020,1,13), true));
        forKuznecova.add(new AttendanseJournal(LocalDate.of(2020,1,14), true));
        newGroup1.add(new Student(3,"Kuznecova Marina", forKuznecova));
        return newGroup1;
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "students=" + students +
                '}';
    }
}
