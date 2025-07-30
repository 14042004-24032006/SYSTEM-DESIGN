package oops;

// Abstract class
abstract class Animal {
    abstract void sound();
    abstract boolean isWild();

    void sleep() {
        System.out.println("Sleeping.....");
    }
}

// Dog class extending Animal
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    @Override
    boolean isWild() {
        return false;
    }
}

// interface
interface Pet {
    void play();
    void eat();
    void walk();
}

// Cat class implementing Pet
class Cat implements Pet {
    public void play() {
        System.out.println("Cat plays with yarn");
    }

    public void eat() {
        System.out.println("Cat eats fish");
    }

    public void walk() {
        System.out.println("Cat walks quietly");
    }
}

// Main class
public class Abstract {
    public static void main(String[] args) {
        // Abstract class example
        Animal dog = new Dog();
        dog.sound();
        dog.sleep();
        System.out.println("Is dog wild? " + dog.isWild());

        System.out.println("-------------------");

        // Interface example
        Pet cat = new Cat();
        cat.play();
        cat.eat();
        cat.walk();
    }
}
