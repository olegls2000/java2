package lesson11;

import data.*;

public class ClassWork {
    public static void main(String[] args) {
        //Shape shape  = new Shape();
        Shape shape = new SimpleTriangle(9, 9, 9);

        //Есть компания в которой работают сотрудники(Имя, Фамилия, Возраст, ЗП).
        // Глобально сторудники делятся на два типа: менеджеры и исполнители.

        //К менеджерам относятся: Директора (String название дирекции),
        // начальники отделов  (String  название отдела).

        // Менеджеры: в отличие от всех остальных имеют дополнительную прибавку к ЗП в размере 5%.
        // У директоров есть дополнительная ежемесячная премия в размере 1500 уе,
        // у начальников отделов ежемесячная премия составляет 750 уе.
        // К исполнителям относятся Программисты (Srting язык) и
        // Тестировщики(Srting проект).
        // У Программистовесть ежемесячная прибавка к ЗП 300 уе,
        // у тестировщиков её нет совсем.

        //Создайте иерархию классов для возможности оптимально реализовать в компании следующие методы :
        //- найти сторудника с максимальной  ЗП

        //У Директоров, НачОтделов, Программистов, Тестировщиков реализовать следующие конструкторы:
        //- все значения полей передаются через параметры;
        //- все значения генерируются случайно:
        //  - Имя из множества: Иван, Петр; - Фамилия из множества Николаенко, Сидоров;
        //  - возраст от 18 до 65; ЗП от 1 500 до 45 000;
        //  - Название дирекции - "Маркетинг", "Проектная";
        //  - Названия отделов "Первый-отдел", "Второй-отдел", "Третий-отдел";
        //  Язык программирования - "Java", "C#", "Python";
        //  - Названия проектов - "UBS", "Pentagon", "NASA".

        Director dir1 = new Director("Chak",
                "Norris", 80,
                100_000, "Combo");

        Director dir2 = new Director("Chak2",
                "Norris2", 82,
                105_000, "Combo2");

        Manager man1 = new Manager("Ivan", "Ivanov", 35, 20_000, "Falcons");
        Manager man2 = new Manager("Ilja", "Prorok", 27, 15_000, "Lusers");

        Worker[] workers = {dir1, dir2, man1, man2};
        JSCompany company = new JSCompany(workers);
        company.getYoungestWorker();

    }
}
