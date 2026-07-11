abstract class PersonQ14 {
    abstract void speak();
}

class Student extends PersonQ14 {
    @Override
    void speak() { System.out.println("The student is asking a question"); }
}

class Teacher extends PersonQ14 {
    @Override
    void speak() { System.out.println("The teacher is giving a lecture"); }
}

public class Q14_PersonStudentTeacher {
    public static void main(String[] args) {
        PersonQ14 student = new Student();
        student.speak();

        PersonQ14 teacher = new Teacher();
        teacher.speak();
    }
}
