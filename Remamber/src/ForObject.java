public  class ForObject <E> {
    private E passvord;
    private String name;
    private int age;

    public ForObject(E passvord, String name, int age) {
        this.passvord = passvord;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ForObject{" +
                "passvord=" + passvord +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
