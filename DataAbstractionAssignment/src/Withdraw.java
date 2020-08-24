import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    //Requires: nothing
    //Modifies: this
    //Effects: replaces default toString() method with what we want printed out
    public String toString(){
        //your code here
        return "Withdrawal of: $" + amount + " Date: " + date + " into account: " + account;
    }
}
