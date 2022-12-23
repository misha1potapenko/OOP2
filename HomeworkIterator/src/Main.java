//     1)Класс Группа содержит в себе коллекцию Студентов.
//        По группе можно перемещаться с помощью итератора.
//        (Это повторяет 1-ю задачу из классной работы).
//        Остальные задачи надстраиваются поверх неё.
//     2)Создайте класс GroupListIterator,
//        который позволяет перемещаться по группе в обоих направлениях.
//        Он реализует интерфейс ListIterator<Student>.
//        Добавьте в Группу метод listIterator (),
//        который позволяет начать итерацию с помощью GroupListIterator.
//     3) Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
//        • Он отслеживает текущую позицию в переборе
//        • Он изначально выставлен на конечную позицию
//        • Он движется справа налево
//        Проверьте, как он работает.


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Students> listStudents = new ArrayList<>();
        listStudents.add(new Students("Petrov Ivan", LocalDate.of(1988,12,13),  5.0));
        listStudents.add(new Students("Petrova Elena", LocalDate.of(1989,11,15),  4.0));
        listStudents.add(new Students("Kuznecov Misha", LocalDate.of(1999,7,15),  4.3));
        listStudents.add(new Students("Kirov Ivan", LocalDate.of(1987,12,6),  3.6));
        listStudents.add(new Students("Volodin Leo", LocalDate.of(1986,12,3),  4.2));
        listStudents.add(new Students("Zajcev Kiril", LocalDate.of(1998,12,11),  4.5));
        listStudents.add(new Students("Jmakov Black", LocalDate.of(1978,12,19),  4.9));
        Group listGroup = new Group(listStudents);
        GroupListIterator.get();

    }
}