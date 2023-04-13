package org.example;

public class Employee {

    private final int age;
    private final String firstName;
    private final String lastName;
    private double salary;

    public Employee(int age, String firstName, String lastName, double salary) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public  Employee(int age, String firstName, String lastName) {
        this(age, firstName, lastName, 50);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Employee employee) {
            return firstName.equals(employee.firstName) &&
                    lastName.equals(employee.lastName) &&
                    age == employee.age;
        }
        return false;
    }

    public int hashCode() {
        int res = lastName.hashCode();
        res = 31 * res + firstName.hashCode();
        res = 31 * res + age;
        return res;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String toString() {
        return "Employee[" + getFullName() + ", " + age + ", sal: " + salary + "]";
    }

    public boolean olderThan(Employee e) {
        return this.age > e.age;
    }

    void upgrade(double salary) {
        this.salary += salary;

    }
}
