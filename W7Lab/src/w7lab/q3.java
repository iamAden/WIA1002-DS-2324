/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w7lab;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import w7lab.MyQueue;
/**
 *
 * @author User
 */
public class q3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filename="C:\\Users\\User\\Documents\\UM 2023-24\\wia1002 ds\\W6&7\\lab7q3.txt";
        Scanner sc = new Scanner(new FileReader(filename));
        
        while(sc.hasNextLine()){
            MyQueue q1 = new MyQueue(100);
            MyQueue q2 = new MyQueue(100);
            MyQueue q3 = new MyQueue(100);
            MyQueue q4 = new MyQueue(100);
            MyQueue q5 = new MyQueue(100);
            
            String line=sc.nextLine();
            String[]data=line.split(" ");
            for (int i = 0; i < data.length; i++) {
                if(data[i].matches("([aA-zZ])([0-9])([0-9])")){
                    q1.enqueue(data[i]);
                }
                if(data[i].matches("P03")){
                    q2.enqueue(data[i+1]);
                }
                if(data[i].matches("P02")){
                    q3.enqueue(data[i+1]);
                }
                if(data[i].matches("P04")){
                    q4.enqueue(data[i+1]);
                }
                if(data[i].matches("P09")){
                    q5.enqueue(data[i+1]);
                }
            }
            
            System.out.print("Product Code in Queue : " +q1.display() );
            
            System.out.println("\nProduct: P03");
            System.out.println(q2.display());
            System.out.println("\nProduct: P02");
            System.out.println(q3.display());
            System.out.println("\nProduct: P04");
            System.out.println(q4.display());
            System.out.println("\nProduct: P09");
            System.out.println(q5.display());
        }
    }
}
