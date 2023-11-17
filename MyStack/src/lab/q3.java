/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 *
 * @author User
 *


*/
public class q3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filename = "C:/Users/User/Documents/UM 2023-24/wia1002 ds/W5/sample3.txt";
        BufferedReader br = new BufferedReader(new FileReader(filename));
        Stack stack = new Stack();
        
        String regex1 = "<([^/][^<>]*)>";
        String regex2 = "<\\/([^>]+)";
        Pattern p1 = Pattern.compile(regex1);
        Pattern p2 = Pattern.compile(regex2);
        Matcher m1,m2;
        
        br.readLine();
        String line = br.readLine();
        
        while(line!=null){
            m1=p1.matcher(line);
            m2=p2.matcher(line);
            if(m1.find()){
                System.out.println("Pushing into stack: "+m1.group(1));
                stack.push(m1.group(1));
                System.out.println("Current stack: "+stack+"\n");
            }
            if(m2.find()){
                System.out.println("Found an ending tag: "+m2.group(1));
                if(m2.group(1).equals(stack.peek())){
                    System.out.println("The ending tag is correct.");
                    stack.pop();
                    System.out.println("Current stack: "+stack+"\n");
                }
                else{
                    System.out.println("Error: "+ stack.peek() +", "+ m2.group(1));
                    break;
                }
                
            }
            line = br.readLine();
        }
        
        System.out.println("\nIs the HTML file correct? " + stack.isEmpty());
    }
}
