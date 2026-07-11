abstract class AnimalQ12 {
    abstract void move();
}

class Bird extends AnimalQ12 {
    @Override
    void move() { System.out.println("The bird is flying"); }
}

class Fish extends AnimalQ12 {
    @Override
    void move() { System.out.println("The fish is swimming"); }
}

public class Q12_AnimalBirdFish {
    public static void main(String[] args) {
        AnimalQ12 bird = new Bird();
        bird.move();

        AnimalQ12 fish = new Fish();
        fish.move();
    }
}
