package Servise;

import Date.Toy;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddToy {


    List<Toy> toys = new ArrayList<>();


    public List<Toy> addToy()  {
        System.out.println("Введите количество игрушек котрые будут в игре ");
        Scanner counter = new Scanner(System.in);
        int count = counter.nextInt();
        int forCount = 0;
        while (forCount < count) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите id ");
            int id = in.nextInt();

            Scanner in1 = new Scanner(System.in);
            System.out.println("Введите name ");
            String name = in1.nextLine();

            Scanner in2 = new Scanner(System.in);
            System.out.println("Введите количество ");
            int amout = in2.nextInt();

            Scanner in3 = new Scanner(System.in);
            System.out.println("Введите частоту выпадания ");
            int frequency = in3.nextInt();

            Toy nextToy = new Toy(id, name, amout, frequency);
            toys.add(nextToy);
            forCount += 1;

        }
        System.out.println("Наши игрушки:" + toys);
        return toys;

    }
}
