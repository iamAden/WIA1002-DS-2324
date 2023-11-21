/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package queuelecture;

import java.util.Arrays;

/**
 *Queue
 * First In First Out
 * 
 * enqueue = push into queue
 * dequeue = remove the head in queue
 * 
 * two pointers = head & tail
 * head stays at index 0, tail traverses
 * 
 * using an Array
 */
class Queue{
    private int head;
    private int tail;
    private int maxSize;
    //using an Array
    private String[]arr;
    
    //args constructor
    public Queue(int size){ 
        //initialising variable
        this.head=0;
        this.tail=0;
        this.maxSize=size;
        this.arr=new String[size];
    }
    
    public boolean isEmpty(){
        return tail==0;
    }
    
    public boolean isFull(){
        return tail==maxSize;
    }
    
    public void enqueue(String data){ //enqueue at tail, dequeue at head
        if(isFull()) System.out.println("[Queue is full, cannot enqueue '"+data+"']");
        else{
            this.arr[tail]=data;
            System.out.println("[Enqueued '"+data+"' successfully]");
            tail++;
            //if(tail-1==0) tail=0;
        }
        
    }
    
    public void enqueueMany(String dataString){
        for(String data:dataString.split(",")){
            enqueue(data);
        }
    }
    public void dequeue(){
        //remove data at arr[head] 
        if(isEmpty()){
            System.out.println("[Queue is empty, nothing to dequeue]");
        }
        else{
            String exHead = arr[head];
            int temp=0;
            while(temp<maxSize-1){
                arr[temp]=arr[temp+1];
                temp++;
            }
            arr[tail-1]=null;
            tail--;
            System.out.println("[Dequeued '"+exHead+"']");
        }    
    }
    
    public void display(){
        System.out.println("Queue: " + Arrays.toString(arr));
        System.out.println("Tail: "+tail);
    }
}

public class QueueLecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue("water");
        queue.enqueue("banana");
        queue.display();
        queue.enqueueMany("apple,orange,melon,honey");
        queue.display();
        queue.dequeue();
        queue.display();
        queue.enqueue("pop");
        queue.display();
    }

}
