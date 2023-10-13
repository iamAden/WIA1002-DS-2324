/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package atmmachine;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author User
 */

class Account{
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.1;
    private Date dateCreated;
    public Account(){
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
        this.dateCreated=new Date();
    }
    public Account(int id, double balance){
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
        this.dateCreated=new Date();
    }
    void setId(int id){
        this.id=id;
    }
    void setBalance(double balance){
        this.balance=balance;
    }
    void setAnnualInterestRate(double r){
        this.annualInterestRate=r/100;
    }
    int getId(){
        return this.id;
    }
    double getBalance(){
        return this.balance;
    }
    double getAnnualInterestRate(){
        return this.annualInterestRate;
    }
    Date getDateCreated(){
        return this.dateCreated;
    }
    double getMonthlyInterestRate(){
        return this.annualInterestRate/12;
    }
    double getMonthlyInterest(){
        return this.balance*this.annualInterestRate/12;
    }
    void withdraw(double d){
        if (balance>=d){
            balance = this.balance - d;
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void deposit(double d){
        balance=this.balance + d;
    }
    
}
public class tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account account1 = new Account(1122,20000.0);
        account1.setAnnualInterestRate(4.5);
        account1.withdraw(2500.0);
        account1.deposit(3000);
        
        System.out.print("Balance:\t\t"+account1.getBalance()+"\nMonthly Interest:\t"+account1.getMonthlyInterest()+"\nDate Created:\t\t"+account1.getDateCreated()+"\n");
        
        System.out.println("\nModified Implementation...\n");
        Account[] accounts = new Account[10];
        for(int i = 0; i<10; i++){
            accounts[i] = new Account(i,100);
        }
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("=====Welcome to ATM====");
            System.out.println("Please enter your Account ID:");
            int id_entry = sc.nextInt();
            if (id_entry>=0&&id_entry<10){
                while(true){
                    System.out.println("\n====Main Menu====");
                    System.out.println("[1] View current balance");
                    System.out.println("[2] Withdraw");
                    System.out.println("[3] Deposit");
                    System.out.println("[4] Exit");
                    System.out.print("\nSelection: ");
                    int user_input = sc.nextInt();
                    System.out.println("");
                    switch(user_input){
                        case 1:
                            System.out.println("Viewing current balance...");
                            System.out.println("Current balance: RM "+accounts[id_entry].getBalance());
                            break;
                        case 2:
                            System.out.println("Withdrawing from account...");
                            System.out.println("Current balance\t\t\t: RM "+accounts[id_entry].getBalance());
                            System.out.print("Enter amount to withdraw\t: RM ");
                            accounts[id_entry].withdraw(sc.nextDouble());
                            System.out.println("Current balance\t\t\t: RM "+accounts[id_entry].getBalance());
                            break;
                        case 3:
                            System.out.println("Depositing to account...");
                            System.out.println("Current balance\t\t\t: RM "+accounts[id_entry].getBalance());
                            System.out.print("Enter amount to deposit\t: RM ");
                            accounts[id_entry].deposit(sc.nextDouble());
                            System.out.println("Current balance\t\t\t: RM "+accounts[id_entry].getBalance());
                            break;
                    }
                    if (user_input==4){break;}
                }
                
            }
            else{
                System.out.println("\nID does not exist. Please try again.\n");
            }
        }
        
        
    }

}
