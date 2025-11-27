package Lambda_Homework;
import java.util.ArrayList;
import java.util.function.Predicate;


public class Emploee {
    Emploee(String name, String departament, int salary){
        this.name = name;
        this.departament = departament;
        this.salary = salary;
    }
    String name;
    String departament;
    int salary;

    @Override
    public String toString(){
        return name + " " + departament + " " + "$" + salary;
    }
}

class TestEmploee{

     void printEmploee(Emploee e){
        System.out.println(e.name + e.departament + e.salary);
    }

    static void filtraciyaRabotnikov(Predicate <Emploee> e, ArrayList<Emploee> ar){
        for (Emploee emp : ar){
            if(e.test(emp)){
                System.out.println(emp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Emploee> ar = new ArrayList<>();
        Emploee vadim = new Emploee("vadim","research",400);
        Emploee slavic = new Emploee("slavic","boss",500);
        ar.add(vadim);
        ar.add(slavic);
        filtraciyaRabotnikov((e) -> {return e.name.equals("vadim");},ar);

    }
}
