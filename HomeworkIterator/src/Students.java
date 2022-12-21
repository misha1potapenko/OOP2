import java.time.LocalDate;

public class Students {
    private String name;
    private LocalDate birthday;
    private double avarageMark;

    public Students(String name, LocalDate birthday, double avarageMark) {
        this.name = name;
        this.birthday = birthday;
        this.avarageMark = avarageMark;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", avarageMark=" + avarageMark +
                '}';
    }
}
