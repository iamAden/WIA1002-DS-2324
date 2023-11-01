/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package account;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author User
 */

class Account{ 
    ArrayList list = new ArrayList();
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private ArrayList <Transaction> transactions=new ArrayList<>();
    
    public Account(){
        this.id=0;
        this.balance=0;
        this.annualInterestRate=0.1;
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
            System.out.println("Current balance\t\t\t: RM "+ balance);
            Transaction t = new Transaction('w',d,balance,"RM "+d+" is successfully withdrawn.");
            transactions.add(t);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void deposit(double d){
        balance=this.balance + d;
        System.out.println("Current balance\t\t\t: RM "+ balance);
        Transaction t = new Transaction('d',d,balance,"RM "+d+" is successfully deposited.");
        transactions.add(t);
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    
    
}
class Transaction extends Account{
    private char type;
    private double amount, balance;
    private String description;
    public Transaction(char type, double amount, double balance, String description){
        this.type=type;
        this.amount=amount;
        this.balance=balance;
        this.description=description;
    }
    
    @Override
    public String toString(){
        return "Type of transaction\t: "+(this.type=='w'? "Withdraw":"Deposit")+"\nTransaction amount\t: RM "+this.amount+"\nBalance\t\t\t: RM "+this.balance+"\nDescription\t\t: "+this.description+"\n";
    }
}
public class tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
                    System.out.println("[4] View transaction history");
                    System.out.println("[5] Exit");
                    System.out.print("\nSelection: ");
                    int user_input = sc.nextInt();
                    System.out.println("");
                    switch(user_input){
                        case 1:
                            System.out.println("Viewing current balance...");
                            System.out.println("Current balance: RM "+accounts[id_entry].getBalance());
                            break;
                        case 2:
                            System.out.print("Withdrawing from account...\n");
                            System.out.print("Current balance\t\t\t: RM "+accounts[id_entry].getBalance()+"\n");
                            System.out.print("Enter amount to withdraw\t: RM ");
                            accounts[id_entry].withdraw(sc.nextDouble());
                            
                            break;
                        case 3:
                            System.out.println("Depositing to account...");
                            System.out.println("Current balance\t\t\t: RM "+accounts[id_entry].getBalance());
                            System.out.print("Enter amount to deposit\t: RM ");
                            accounts[id_entry].deposit(sc.nextDouble());
                            break;
                        case 4:
                            System.out.println("Transaction History...");
                            if(accounts[id_entry].getTransactions().size()>0){
                                for(int i = 0; i<accounts[id_entry].getTransactions().size(); i++){
                                    System.out.println(accounts[id_entry].getTransactions().get(i).toString());
                                }
                            }
                            else{
                                System.out.println("None to show");
                            }
                    }
                    if (user_input==5){break;}
                }
                
            }
            else{
                System.out.println("\nID does not exist. Please try again.\n");
            }
        }
        
        
    }

}

