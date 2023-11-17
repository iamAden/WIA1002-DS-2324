package lab;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



/**
 *
 * @author User
 */


import java.util.Arrays;
class MyStack{
    private Integer[] arr;
    private int top;
    
    public MyStack(){
        arr = new Integer[10];
        top = 0;
    }
    public boolean isEmpty(){
        return (arr[0]==null);
    }
    public int peek(){
        return arr[top];
    }
    public void push(int e){
        arr[top]=e;
        top++;
    }
    public void pushMany(String data){
        for (String i : data.split(",")){
            int x = Integer.parseInt(i);
            push(x);
        }
        
    }
    public int pop(){
        int temp = arr[top-1];
        arr[top-1]=null;
        top--;
        return temp;
    }
    @Override
    public String toString (){
//        StringBuilder sb = new StringBuilder();
//        for(int i : list){
//            sb.append(Integer.toString(i));
//        }
//        return sb.toString();
        return Arrays.toString(arr);
    }

}
