public interface BankInterface {
    double checkBalance();
    String addMoney(int amount);
    String withDrawMoney(int amount,String password);
    double calculateInterest(int year);

}