package Lesson22_Incapsulation;

public class Animal {

    Animal(){System.out.println("i am animal");}

    int eyes;

    void eat(){
        System.out.println("Animal eats");
    }
    void drinf(){
        System.out.println("Animal drinks");
    }
}

class Pet extends Animal{
    Pet (){System.out.println("i am pet");
    eyes = 2;
    }

    String name;
    int tail;
    final int paw = 4;

    void run(){
        System.out.println("Pet run");
    }
    void jump(){
        System.out.println("Pet jumps");
    }
}

class Dog extends Pet {
    Dog(String name){ System.out.println("i am Dog my name is " + name);}

    void play (){
        System.out.println("Dog play");
    }
}

class Cat extends Pet {
    Cat(String name){System.out.println("i am Cat my name is " + name);}
    void sleep (){
        System.out.println("Cat sleep");
    }
}

class Test{
    public static void main(String[] args) {
        Dog d = new Dog("lordyk");
        Cat c = new Cat("Pumshik");
        System.out.println(d.paw);
        c.sleep();
    }
}
