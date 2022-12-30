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

        ArrayList<Object> even = new ArrayList<>();
        even.add(5);
        even.add(6);
        even.add(7);
        even.add(4);
        even.add(12);
        System.out.println(filter(even));

        ArrayList<Object> positive = new ArrayList<>();
        positive.add(-5.0);
        positive.add(-2.4);
        positive.add(7.0);
        positive.add(4.3);
        positive.add(-12.0);
        System.out.println(filter(positive));

        ArrayList<Object> stringA = new ArrayList<>();
        stringA.add("Adidas");
        stringA.add("Ali");
        stringA.add("dgddfgdfg");
        stringA.add("sfsdfsdf");
        System.out.println(filter(stringA));

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
            if (filter instanceof String) {
                BeginsWithA withA = new BeginsWithA();
                if (withA.IsGood(filter)) {
                    newList.add(filter);
                }

            }


        }return newList;


    }
}