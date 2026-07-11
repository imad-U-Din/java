class Animal {
    void makeSound() { System.out.println("Some generic animal sound"); }
}

class Mammal extends Animal {
    void giveBirth() { System.out.println("Giving birth"); }
}

class Dog extends Mammal {
    @Override
    void makeSound() { System.out.println("Woof!"); }
}

public class Q6_AnimalMammalDog {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();

        Mammal m = new Mammal();
        m.makeSound();
        m.giveBirth();

        Dog d = new Dog();
        d.makeSound();
        d.giveBirth();
    }
}
