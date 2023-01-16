//Напишите программу, позволяющую анализировать посещаемость студентов. Используйте паттерн MVP.
//        Есть группа студентов. Для каждого студента есть журнал его посещаемости:
//        список дат занятий и для каждой даты — посетил студент занятие или нет.
//        Создайте класс AttendanceService (сервис посещаемости),
//        в котором хранится информация обо всех студентах. Создайте класс AttendanceView,
//        который позволяет отображать студентов и их посещаемость.
//        Создайте класс контроллера со следующими функциями:
//        Распечатать всех студентов и посещаемость каждого в процентах
//        Распечатать студентов, отсортировав их по убыванию посещаемости
//        Распечатать студентов с посещаемостью ниже 25%



import Data.StudentsGroup;
import service.AttendanceService;
import service.AttendanceView;


public class Main {
    public static void main(String[] args) {


        StudentsGroup group = new StudentsGroup();

        AttendanceService newGroup = new AttendanceService();
        newGroup.getAttendance(group.NewGroup());
    }
}