import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner in=new Scanner(System.in);
        System.out.println("enter name,password and balance to create a account");
        String name=in.next();
        String password=in.next();
        double balance=in.nextDouble();
        SBIUser user=new SBIUser(name,balance,password);
        //add money
        System.out.println("enter money to add");
        int am=in.nextInt();
        String message=user.addMoney(am);
        System.out.println(message);
        //withdraw
        System.out.println("enter money to withdraw");
        int money=in.nextInt();
        System.out.println("enter password");
        String pass=in.next();
        System.out.println(user.withdrawMoney(money,pass));
    }
}