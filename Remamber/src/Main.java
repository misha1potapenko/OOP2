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


        List<NewClass5> newClass5 = new ArrayList<>(5);
        newClass5.add(new NewClass5("Zoja",15, 4.2));
        newClass5.add(new NewClass5("Zula",15, 4.9));
        newClass5.add(new NewClass5("Ramil",15, 4.0));
        newClass5.add(new NewClass5("Kola",15, 4.7));
        newClass5.add(new NewClass5("Misha",15, 5.0));

        for (NewClass5 element: newClass5
             ) {
            System.out.println(element);

        }

    }

}