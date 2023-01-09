import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<NewClass> newClass = new ArrayList<>();
        newClass.add(new NewClass("Misha", 14, 4.6));
        newClass.add(new NewClass("Masha", 14, 4.8));
        newClass.add(new NewClass("Max", 14, 4.9));
        newClass.add(new NewClass("Lena", 14, 5.0));
        newClass.add(new NewClass("Kolja", 14, 4.5));
        newClass.add(new NewClass("Zina", 14, 4.3));


        System.out.println(newClass);
    }

}