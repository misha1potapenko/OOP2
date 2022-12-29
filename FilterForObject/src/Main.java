//Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
//        boolean isGood (T item);
//        Смысл этого интерфейса: ему дают элемент, он его одобряет или не одобряет.
//        Создайте следующие детские классы:
//        • IsEven — ему дают целое число, он одобряет его, если оно чётное
//        • IsPositive — ему дают целое число, он одобряет его, если оно положительное
//        • BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
//        • BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того,
//        что он запомнил
//
//        Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood.
//        Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.
//        Продемонстрируйте, что это работает.


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        IsEven isEven = new IsEven();
//        System.out.println(isEven.IsGood(4));
//
//        IsPositive isPositive = new IsPositive();
//        System.out.println(isPositive.IsGood(25.0));
//
//        BeginsWithA withA = new BeginsWithA();
//        System.out.println(withA.IsGood("adasda"));
//
//        BeginsWith with = new BeginsWith();
//        System.out.println(with.IsGood("adasda"));

//        ArrayList<Object> new1 = new ArrayList<>();
//        new1.add(5);
//        new1.add(6);
//        new1.add(7);
//        new1.add(4);
//        new1.add(12);
//        System.out.println(filter(new1));
        ArrayList<Object> new2 = new ArrayList<>();
        new2.add(-5.0);
        new2.add(-2.4);
        new2.add(7.0);
        new2.add(4.3);
        new2.add(-12.0);
        System.out.println(filter(new2));

    }

    public static List<Object> filter(ArrayList<Object> forFilter) {
        List newList = new ArrayList<>();

        for (Object filter : forFilter
        ) { if (filter instanceof Integer) {
            IsEven even = new IsEven();
            if (even.IsGood(filter)) {
                newList.add(filter);
            }
        }
            if (filter instanceof Double) {
                IsPositive isPositive = new IsPositive();
                if (isPositive.IsGood(filter)) {
                    newList.add(filter);
                }
            }


        }return newList;


    }
}