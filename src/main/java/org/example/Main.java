package org.example;

public class Main {
    public static void main(String[] args) {
        /*
          Создать класс Сотрудник (Employee).
          У класса должны быть следующие поля:
          1. Возраст (int)
          2. Имя (String)
          3. Фамилия (String)
          4. Зарплата (double)
          5. ... можно придумать свои поля
          У класса должно быть 2 конструктора:
          1. Конструктор, который принимает все аргументы
          2. Констуктор, который принимает все аргументы КРОМЕ зарплаты; значение зарплаты должно быть задано значением по умолчанию (50.0)
          Переопределить:
          1. Методы equals и hashCode (поля, которые должны там участвовать, нужно определить самостоятельно)
          2. Метод toString (в любом формате)
          * Реализовать методы:
          1. String getFullName() - возвращает полное имя сотрудника
          2. boolean olderThan(Employee e) - возвращает true, если текущий сотрудник старше чем тот, который передали в метод.
          3. void upgrade(double salary) - повышает зарплату сотрудника НА salary единиц.
          Пример: Было 50.0, upgrade(20.0) -> стало 70.0
         */
        Employee emp1 = new Employee(31, "Danil", "Smirnow", 100.0);
        Employee emp2 = new Employee(31, "Danil", "Smirnow", 100.0);
        Employee emp3 = new Employee(23, "Dmitry", "Ivanov");
        Employee emp4 = new Employee(23, "Fatima", "Dfoo", 20.0);
        Employee emp5 = new Employee(56, "Danil", "Smirnow", 100.0);
        System.out.println(emp1.equals(emp3));
        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.equals(emp5));

        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp3.hashCode());

        System.out.println(emp5.getFullName());
        System.out.println(emp2.toString());
        System.out.println(emp2.olderThan(emp3));
        System.out.println(emp3.olderThan(emp4));

        emp5.upgrade(20);
        System.out.println(emp5.toString());
    }
}