package lab;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
postfix evaluation:
1) a*b+c*d-e
2) {(a*b)+(c*d)}-e
3) (a*b) -> ab*
4) (c*d) -> cd*
5) {(a*b)+(c*d)} -> (ab*)(cd*)+ -> ab*cd*+
6) {(a*b)+(c*d)}-e -> ab*cd*+e-

pseudocode of using stack for this
{ create a stack S
    for i:length(exp)-1{
        if exp[i] is operand (1,2,3)
            push(exp[i])
        else if exp[i] is operator (+-/)
            pop() -> remove and return top element op2
            pop() -> remove and return top element op1
            perform operation (exp[i],op1,op2)
            push (result)
    }
    return top of stack(the final result)
}
        
*/
import lab.MyStack;
public class Q2 {
    public static void main(String[] args) {
        System.out.println("12+3+=" + evaluatePostfix("12+3+"));
    }
    public static int evaluatePostfix(String expression){
        MyStack stack = new MyStack();
        int result = 0;
        for (char o : expression.toCharArray()){
            if(Character.isDigit(o)){
                //is an operand, push
                stack.push(Character.getNumericValue(o)); //convert char to int
            }
            else if(o == '%' || o == '/' || o == '*' || o == '+' || o == '-'||!stack.isEmpty()){
                //is an operator, pop() two 
                int op2 = stack.pop();
                int op1 = stack.pop();
                result = performOperation(o,op2,op1);
                stack.push(result);
            }
            
        }
        return result;
    }
    public static int performOperation(char c, int op2, int op1){
        if(c=='+') return op1+op2;
        else if(c=='-') return op1-op2;
        else if(c=='*') return op1*op2;
        else if(c=='/') return op1/op2;
        return -1;
    }
}
