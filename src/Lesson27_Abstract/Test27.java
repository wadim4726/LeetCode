package Lesson27_Abstract;

public class Test27 {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("name ribi");
        Speakable p = new Pingvin("name pigvin");
        Pingvin p2 = new Pingvin("ppp");
        //p2.speak();
        Animal lev = new Lev("name Lev");
        Mammal lev2 = new Lev("name Lev mammal");
        //lev2.eat();


        Animal [] a = new Animal[3];
        Speakable [] s = new Speakable[3];
        a[0] = m;
        a[1] = p2;
        a[2] = lev;

        s[0] = p;
        s[1] = lev2;

        for(Speakable g : s){
            if(g instanceof Pingvin){System.out.println("instance of Pinguin in Speakable");g.speak();}
            if(g instanceof Mammal){System.out.println("instance of Lev in Speakable"); g.speak();((Mammal) g).run();}

        }

        for(Animal f : a){
            if(f instanceof Mechenosec)System.out.println("instance of Mechenosec in Animal");
            if(f instanceof Pingvin)System.out.println("instance of Pinguin in Animal");
            if(f instanceof Lev)System.out.println("instance of Lev  in Animal");

        }

    }
}

abstract class Animal {
    Animal(String name){this.name = name;}

    abstract void eat();
    abstract void sleep();
    String name;
}

abstract class Fish extends Animal{
    Fish(String name) {
        super(name);
    }

    void sleep(){System.out.println("Vsegda interesno nablyudat? kak spyat ribi");}
    abstract void swim();
}

abstract class Bird extends Animal implements Speakable{
    Bird(String name){
        super(name);
        this.name = name;
    }
    String name;
    abstract void Fly();

    public void speak (){System.out.println(name + "sings");}
}

abstract class Mammal extends Animal implements Speakable{
    Mammal(String name){
        super(name);
    }
    abstract void run();
}

class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name = name;
    }
    String name;
    void swim(){System.out.println("Mechenosec krasivaya riba kotoraya bistro plavaet");}
    void eat(){System.out.println("Mechenosec ne xishnaya riba, i ona est obixhiny korm");}
}

class Pingvin extends Bird{
    Pingvin(String name){
        super(name);
        this.name = name;
    }
    String name;
    void eat(){System.out.println("Pinguin eat");}
    void sleep(){System.out.println("Pinguin sleep");}
    void Fly(){System.out.println("Pinguin Fly");}
}

class Lev extends Mammal{
    Lev(String name){
        super(name);
        this.name = name;
    }
    String name;
    void eat(){System.out.println("Lev eat");}
    void run(){System.out.println("Lev run");}
    void sleep(){System.out.println("Lev slepp");}

}



interface Speakable {
    default void speak(){System.out.println("Somebody speaks");}

}











