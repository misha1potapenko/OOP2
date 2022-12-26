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


public class Main {
    public static void main(String[] args) {
        IsEven isEven = new IsEven();
        System.out.println(isEven.IsGood(4));

        IsPositive isPositive = new IsPositive();
        System.out.println(isPositive.IsGood(25.0));

        BeginsWithA withA = new BeginsWithA();
        System.out.println(withA.IsGood("adasda"));



    }
}