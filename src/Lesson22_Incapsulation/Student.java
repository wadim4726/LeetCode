package Lesson22_Incapsulation;

public class Student {

     StringBuilder name = new StringBuilder("suzana fuflo");
    int course;
    int grade;

    StringBuilder getName(){
        StringBuilder s1 = new StringBuilder(name);
        return s1;
    }
    void setName(StringBuilder sb){
        if (sb.length() > 3){
            name = sb;
        }
    }
    int getCourse(){
        return course;
    }
    void setCourse(int a){
        if(a <= 4 && a > 1){
            course = a;
        }
    }
    int getGrade(){
        return grade;
    }
    void setGrade(int a){
        if(a < 10 && a > 1){
            grade = a;
        }
    }
    void showInfo(){
        System.out.println("grade" + grade);
        System.out.println("course" + course);
        System.out.println(name);

    }
    public static void main(String[] args) {
        Student s = new Student();
        s.setName(new StringBuilder("ffff"));
        s.getName();
        s.setCourse(5);
        s.getCourse();
        s.setGrade(6);
        s.getGrade();
        s.showInfo();
    }
}

