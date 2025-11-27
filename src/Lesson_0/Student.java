package Lesson_0;

public class Student {

        private Student(String name1){
        name = name1;
        }


        public Student ( int b,String surname1){
            surname = surname1;
            System.out.println("public");
    }

        Student (int id1){
        id =  id1;
        System.out.println("не принимает значений");
    }


    int id;
    public String name;
    private String surname;
    int course;

    void getId (){
        System.out.println(id);
    }

    void getSurname (){
        System.out.println(surname);
    }

    void getName (){
        System.out.println(name);
    }

}


class StudentTest {
    public static void main(String[] args) {
        Student Suzana = new Student(1,"Suzana fuflo");
        Suzana.getSurname();
    }
}