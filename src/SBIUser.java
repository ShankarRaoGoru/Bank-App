import java.util.Objects;
import java.util.UUID;

public class SBIUser implements BankInterface {
    //attributes
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private static double rateOfInterest;

    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateOfInterest=6.6;
        this.accountNo= String.valueOf(UUID.randomUUID());
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
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
        SBIUser.rateOfInterest = rateOfInterest;
    }

    @Override
    public double checkBlanace() {
        return balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=balance+amount;
        return "your new balance is:"+balance;
    }

    @Override
    public String withdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(password,enteredPassword)){
            if(amount>balance){
                return "insufficient money";
            } else{
                balance-=amount;
                return "money is there";
            }
        }
        else{
            return "wrong password";
        }
    }

    @Override
    public double calculateInterest(int years) {

        return (balance*years*rateOfInterest)/100;
    }
}
