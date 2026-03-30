abstract class Animal {

    abstract void sound();   // abstract method

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

class Demo {
    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.sound();
        a.eat();

        a = new Cat();
        a.sound();
        a.eat();
    }
}