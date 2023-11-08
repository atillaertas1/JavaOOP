package WEEK_7;
public class Main {
    public static void main(String[] args) {
        //creating account
        Account account1 = new Account();
        Account account2 = new Account();
        //setting accounts value
        //account 1
        account1.setAccountNumber("111-000-222");
        account1.setName("Atilla");
        account1.setBalance(10000);
        //account 2
        account2.setAccountNumber("333-444-555");
        account2.setName("Ahmet");
        account2.setBalance(500);

        //console outputs
        Account.printAccountInfo(account1);
        Account.printAccountInfo(account2);
        Account.accountCounter();
        //success withdraws
        System.out.println("SUCCESS WITHDRAWS");
        account1.withdrawMoney(100);
        account1.withdrawMoney((double) 100);
        account2.withdrawMoney(50);
        account2.withdrawMoney((double) 50);
        //withdraw errors
        System.out.println("WITHDRAWS ERROR");
        account1.withdrawMoney(5000000);
        account1.withdrawMoney((double) 500000);
        account2.withdrawMoney(5000000);
        account2.withdrawMoney((double) 500000);
        //deposit money
        System.out.println("DEPOSIT MONEY");
        account1.depositMoney(10000);
        account1.depositMoney((double) 10000);
        account2.depositMoney(50000);
        account2.depositMoney((double) 20000);
        //accounts array
        System.out.println("Registered Accounts|");
        for (String account : Account.accounts) {
            System.out.println(account);
        }

    }

}