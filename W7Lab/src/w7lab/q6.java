/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w7lab;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author User
 */
class SpecialQueue {
    //two pointers
    private int head, tail;
    private int maxSize;
    
    private Vehicle[] arr;
    public SpecialQueue(int size){
        this.head=0;
        this.tail=0;
        this.maxSize=size;
        arr = new Vehicle[size];
    }
    public boolean isEmpty(){
        return this.tail==0;
    }
    public Vehicle peek(){
        return arr[head];
    }
    public boolean enqueue(Vehicle data){
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
        
        else{ //enqueue
            arr[tail]=data;
            tail++;
            //System.out.println("Tail is at "+tail);
        }
        return true;
    }
    public Vehicle dequeue(){
        Vehicle exHead = arr[0];
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
    public void display(){
        for(Vehicle data: arr){
            if(data!=null) System.out.println(data);
        }
         
    }
    public int size(){
        return tail;
    }
    public void sort(){
        //sorting logic
        //compare priority first
        //then compare number when priority is same
         
        //higher the priority, higher in position
        for(int i=0; i < size(); i++){
            for (int j = i+1; j<size();j++) {
                
                if(arr[i].priority()<arr[j].priority()){
                    Vehicle temp=arr[i];
                    arr[i]=null;
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        //lower the number, higher the position
        for(int i=0; i < size(); i++){
            for (int j = i+1; j<size();j++) {
                
                if(arr[i].priority()==arr[j].priority()&&arr[i].number()>arr[j].number()){
                    Vehicle temp=arr[i];
                    arr[i]=null;
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}

class Vehicle{
    private String name;
    private int number;
    private int priority;
    public Vehicle(String name, int number){
        this.name=name;
        this.number=number;
        switch(name){
            case "Car" -> this.priority=1;
            case "Truck" -> this.priority=2;
            case "Motorcycle" -> this.priority=0;
        }
        
    }
    public String name(){
        return this.name;
    }
    public int priority(){
        return this.priority;
    }
    public int number(){
        return this.number;
    }
    @Override
    public String toString(){
        return String.format("%-13s %-2s (Priority=%-1s)",this.name,this.number,this.priority);
    }
    
    public int comparePriority(Vehicle v1, Vehicle v2) {
        return Integer.compare(v1.priority, v2.priority);
    }
    public int compareNumber(Vehicle v1, Vehicle v2) {
        return Integer.compare(v1.number, v2.number);
    }
}


public class q6 {
    
    public static void main(String[] args) {
        SpecialQueue q = new SpecialQueue(100);
        q.enqueue(new Vehicle("Car",1));
        q.enqueue(new Vehicle("Truck",2));
        q.enqueue(new Vehicle("Motorcycle",3));
        q.enqueue(new Vehicle("Motorcycle",4));
        q.enqueue(new Vehicle("Truck",5));
        q.enqueue(new Vehicle("Car",6));
        q.enqueue(new Vehicle("Truck",7));
        q.enqueue(new Vehicle("Truck",8));
        q.enqueue(new Vehicle("Motorcycle",9));
        q.enqueue(new Vehicle("Car",10));
        q.display();
        
        q.sort();
        System.out.println("");
        q.display();
    }
}
