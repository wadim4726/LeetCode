package Lesson32_Exception;

public class Test {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("myaso");
        try {
            t.drink("voda");
            try {
                t.drink("pivo");
            }catch (NeVodaException e){
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Eto inner finally block");
        }
    }
}

class NeMyasoException extends RuntimeException{
    NeMyasoException(String s){super(s);}
}
class NeVodaException extends Exception{
    NeVodaException(String s){super(s);}
}
class Tiger {
    void eat (String s){
        if (s != "myaso") throw new NeMyasoException("Tigr ne est" + s);
        if (s == "myaso") System.out.println("Tigr est myaso");
    }
    void drink (String s) throws Exception{
        if (s != "voda") throw new NeVodaException("Tigr ne pyet" + s);
        if (s == "voda") System.out.println("Tigr pyet vody");
    }
}