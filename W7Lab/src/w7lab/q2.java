/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w7lab;

/**
 *
 * @author User
 */
public class q2 {
    public static void main(String[] args) {
        int balance = 1000;
        String input = "D 400 | W 300 | W 700 | D 450 | W 120";
        System.out.println("Enter transactions : " + input);
        display(balance,input);
    }
    public static void display(int balance,String input){
        
        //System.out.println(Arrays.toString(input.split("\\|")));
        MyQueue q = new MyQueue(input.split("\\|").length);
        for(String data:input.split("\\|")){ 
            q.enqueue(data.trim()); //remove trailing and leading whitespaces
        }
        System.out.print(q.display());
        System.out.println("");
        
        int queuesize = q.size();
        for (int i = 0; i < queuesize; i++) {
            String data= (String)q.dequeue();
            if(data.matches("D\s[0-9]+")){ //for deposits
                balance+=Integer.parseInt(data.substring(2)); //update balance amount
            }
            if(data.matches("W\s[0-9]+")){ //for withdraws
                balance-=Integer.parseInt(data.substring(2)); //update balance amount
            } 
        }
        
        System.out.println("Current Balance: "+ balance);
    }
    
}
