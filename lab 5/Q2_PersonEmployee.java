class Person {
    String name;
    int age;
    Person(String name, int age) { this.name = name; this.age = age; }
    void display() { System.out.println("Name: " + name + ", Age: " + age); }
}

class Employee extends Person {
    double salary;
    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    @Override
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Salary: " + salary);
    }
}

public class Q2_PersonEmployee {
    public static void main(String[] args) {
        Person p = new Person("Ravi", 30);
        p.display();

        Employee e = new Employee("Anita", 28, 50000);
        e.display();
    }
}
