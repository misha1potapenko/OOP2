public class NewClass extends ForClass {
    private String name;
    private Integer age;
    private double avrMark;

    public NewClass(String name, Integer age, double avrMark) {
        this.name = name;
        this.age = age;
        this.avrMark = avrMark;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public double getAvrMark() {
        return avrMark;
    }

    @Override
    public String toString() {
        return "NewClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avrMark=" + avrMark +
                '}';
    }
}
