public interface BankInterface {
    double checkBlanace();
    String addMoney(int amount);
    String withdrawMoney(int amount,String password);
    double calculateInterest(int years);
}
