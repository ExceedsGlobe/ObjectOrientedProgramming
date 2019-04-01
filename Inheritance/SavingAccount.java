package Inheritance;

public class SavingAccount extends BankAccount {
public static void main(String args[]){
    int transferLimit=10;
    SavingAccount savingAccount=new SavingAccount();
    savingAccount.accountNo=65468979;
    savingAccount.balance=800.40;
    System.out.println(savingAccount.accountNo);
    System.out.println(savingAccount.balance);
    System.out.println(transferLimit);
}
}
