import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter Name,Password,Balance to create account");
        Scanner sc=new Scanner(System.in);
       //create account
        String name=sc.nextLine();
        String password=sc.nextLine();
        double balance=sc.nextDouble();

        BankUser user=new BankUser(name,balance,password);

        //add amount
        String message=user.addMoney(100000);
        System.out.println(message);

        //withdraw money
        System.out.println("Enter amount to be withdrawn");
        int money=sc.nextInt();
        System.out.println("Enter password");
        String userPassword=sc.next();
        System.out.println(user.withDrawMoney(money,userPassword));

        //rete of interest
        int years=sc.nextInt();
        System.out.println(user.calculateInterest(years));



//        do{
//            System.out.println("press 1 to put money ,press 2 to withdraw money ,press 3 to show balance ,press 4 to calculate rate of interest");
//        }while(sc.nextInt())

        System.out.println("hi");
        System.out.println("hi");

    }
}