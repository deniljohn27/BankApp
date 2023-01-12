import java.util.Objects;
import java.util.UUID;

public class BankUser implements BankInterface {
    private String name;
    private String accountNumber;
    private double balance;
    private String password;
    private static double rateOfInterest;

    public BankUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.rateOfInterest=6.5;
        this.accountNumber= String.valueOf(UUID.randomUUID());//randomly generat number

        System.out.println("Acoount created for "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        BankUser.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=balance+amount;
        return "You New Balance is "+balance;
    }

    @Override
    public String withDrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
            if(amount>balance){
                return "Insufficient balance";
            }
            else{
                balance=balance-amount;
                return "Withdrawn";
            }
        }

        return "wrong password";
    }

    @Override
    public double calculateInterest(int year) {

        return (balance*year*rateOfInterest)/100;
    }
}
