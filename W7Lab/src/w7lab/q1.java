/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package w7lab;

import java.util.Arrays;

/**
 *
 * @author User
 */

class MyQueue <T>{
    //two pointers
    private int head, tail;
    private int maxSize;
    
    private T[] arr;
    public MyQueue(int size){
        this.head=0;
        this.tail=0;
        this.maxSize=size;
        arr = (T[]) new Object[size];
    }
    public boolean isEmpty(){
        return this.tail==0;
    }
    public T peek(){
        return arr[head];
    }
    public boolean enqueue(T data){
        int temp=0;
        while(temp<tail){
            if(arr[temp].equals(data)){
                //System.out.println("Already in queue");
                
            }
            temp++;
        }
        
        if(tail>=maxSize){
            System.out.println("Cannot enqueue "+data +" , queue is full");
            return false;
        }
        else{
            arr[tail]=data;
            tail++;
            //System.out.println("Tail is at "+tail);
        }
        return true;
    }
    public T dequeue(){
        T exHead = arr[0];
        if(isEmpty()){
            System.out.println("Nothing to dequeue");
        }
        else{
            int temp=0;
            
            while(temp<maxSize-1){
                arr[temp]=arr[temp+1];
                temp++;
            }
            arr[maxSize-1]=null;
            tail--;
        }
        return exHead;
    }
    public String display(){
        StringBuilder sb = new StringBuilder();
        for(T data: arr){
            if (data!=null) sb.append(data).append(" --> ");
        }
        return sb.toString();
    }
    public int size(){
        return tail;
    }
}
public class q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyQueue q = new MyQueue (5);
        
        q.enqueue("NewJeans");
        q.enqueue("aespa");
        q.enqueue("gidle");
        q.enqueue("twice");
        q.enqueue("ive");
        q.enqueue("xg");
        System.out.println(q.display());
        q.dequeue();
        System.out.println(q.display());
    }

}
