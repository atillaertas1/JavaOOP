package WEEK_7;

import java.util.ArrayList;

public class Account {
    private String accountNumber;
    private String name;
    private double balance;
    static int numberOfAccounts;
    static ArrayList<String> accounts = new ArrayList<>();



    //constructor
    Account(){
        numberOfAccounts++;
    }

    //getter
    String getAccountNumber(){
        return this.accountNumber;
    }
    String getName(){
        return this.name;
    }
    double getBalance(){ return this.balance; }
    //setter
    void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
        accounts.add(accountNumber);
    }
    void setName(String name){
        this.name = name;
    }
    void setBalance(double balance){
        this.balance = balance;
    }
    void withdrawMoney(int value){
        if(value <= this.balance){
            System.out.println(this.accountNumber+" -"+value);
            this.balance = this.balance - value;
            System.out.println(this.accountNumber+" current value:"+this.balance);
        }
        else{
            System.out.println(this.accountNumber+" You can't withdraw " + value);
        }
    }
    void withdrawMoney(double value){
        if (value <= this.balance){
            System.out.println(this.accountNumber+" -"+value);
            this.balance = this.balance - value;
            System.out.println(this.accountNumber+" current value:"+this.balance);
        }
        else{
            System.out.println(this.accountNumber+" You can't withdraw " + value);
        }
    }
    void depositMoney(int value){
        System.out.println(this.accountNumber+" +"+value);
        this.balance = this.balance + value;
        System.out.println(this.accountNumber+" current value:"+this.balance);
    }
    void depositMoney(double value){
        System.out.println(this.accountNumber+" +"+value);
        this.balance = this.balance + value;
        System.out.println(this.accountNumber+" current value:"+this.balance);
    }

     static void printAccountInfo(Account account) {
        System.out.printf("Account Number:%s\nName:%s\nBalance:%.2f\n\n", account.getAccountNumber(), account.getName(), account.getBalance());
    }

    static void accountCounter() {
        System.out.println("Number of accounts: " + numberOfAccounts);
    }

}