public abstract class ForClass {
    private String name;
    private Integer age;
    private double avrMark;

    public ForClass(String name, Integer age, double avrMark) {
        this.name = name;
        this.age = age;
        this.avrMark = avrMark;
    }

    @Override
    public String toString() {
        return "ForClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avrMark=" + avrMark +
                '}';
    }
}
