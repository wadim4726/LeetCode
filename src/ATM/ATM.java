package ATM;

import java.util.Scanner;

class  User{
    String name;
    int pinCode;
    double balance;
    public User(String name,int pinCode,double balance){
        this.name=name;
        this.pinCode=pinCode;
        this.balance=balance;
    }
    @Override
    public String toString(){
        return ("ATM.User name is " +name +" balance " + balance);
    }
}

public class ATM {
    User user;
    public ATM(User user){
        this.user=user;
    }

    public boolean login(User user, Scanner input){
        if(user.pinCode == input.nextInt()){
            return true;
        }else {
            System.out.println("Incorrect PIN.");
            return false;
        }
    }

    public void showMenu(Scanner input, User user){
        System.out.println("Welcome to ATM.ATM " + user.name + " Enter your PIN:");
        boolean check = login(user,input);

        while(check){
            System.out.println("1. show balance ");
            System.out.println("2. add balance ");
            System.out.println("3. Exit");


            switch(input.nextInt()){
                case 1:
                    System.out.println(user.balance);
                    break;
                case 2:
                    System.out.println("Enter amount to add to balance:");
                    if(input.hasNextDouble()){
                        double amountToAdd = input.nextDouble();
                        user.balance+=amountToAdd;
                        System.out.println("New balance is now "+user.balance);
                    }else {
                        System.out.println("Invalid input, please enter a valid number.");
                        input.next();
                    }
                    break;
                case 3: check = false;
                        break;
                default:
                    System.out.println("Incorrect input.");
            }
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        User user1 = new User("Vadim",4726,1000);
        ATM atm = new ATM(user1);
        atm.showMenu(input,user1);
        System.out.println(user1);

    }

}

