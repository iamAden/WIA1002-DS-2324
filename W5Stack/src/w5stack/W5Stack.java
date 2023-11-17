/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package w5stack;

//1. need a container to work, ie an array with specific size
//2. need a pointer to traverse the array
//3. need some methods to operate the Stack
class Stack{
    
    //decalre some local variables for class Stack
    int maxSize; //maxSize of array
    int top; //this is the pointer
    String arr[];//creating an array of type String so we can push String data
    
    //constructor 
    public Stack(){
        maxSize=5;  //size of array
        top=0;      //pointer initialised to index 0
        arr = new String[maxSize];
    }
    
    public boolean isEmpty(){
        if(top==0) return true;
        return false;
    }
    public boolean isFull(){
        return (top==maxSize);
    }
    public void push(String data){
        if(isFull()){
            System.out.println("full dy cannot push "+data);
        }
        else{
        arr[top]=data; //"tomato" is arr[0] now
        top++;
        }
        
    }
    public void display(){
        for(int i=0; i<maxSize; i++){
            System.out.println(arr[i]);
        }
    }
    public String peek(){
        if(!isEmpty()){
            return arr[top-1];
        }
        return "Stack is empty so nothing to peep";
    }
    public String pop(){
        if(!isEmpty()){
            String temp = peek();
            arr[top-1]=null;
            top--;
            return temp;
        }
        return "Stack is empty so nothing to pop";
        
    }
}
public class W5Stack {
    public static void main(String[] args) {
       Stack stack = new Stack();
       //System.out.println(stack.peek());
       stack.push("tomato");
       stack.push("cucumber");
       stack.push("durian");
       stack.push("rambutan");
       stack.push("banana");
       stack.push("cempedak");
       stack.push("jambu");
       stack.display();
       while(!stack.isEmpty()){stack.pop();}
       stack.pop();
       System.out.println(stack.peek());
    }

}
