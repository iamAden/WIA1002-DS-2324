/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

import java.util.Stack;

/**
 *
 * @author User
 */
public class q4 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Stack stackop = new Stack();
        StringBuilder sb = new StringBuilder();
        
        String infix = "((((A-B)+((M^N)*(O+P)))-((Q/(R^S))*T))+Z)";
        
        System.out.println("Infix: "+infix);
        
        for(char c:infix.toCharArray()){
            if(Character.isLetter(c)){
                stack.push(c);
                //System.out.println(stack);
            }
            else if(c=='+'||c=='-'||c=='/'||c=='*'||c=='^'){
                stackop.push(c);
                //System.out.println(stackop);
            }
            else if(c==')'){
                stack.push(stackop.pop());
            }
        }
        for(int i=0;i<stack.size();i++){
            sb.append(stack.get(i));
        }
        System.out.println("Postfix: "+ sb.toString());
    }
}
