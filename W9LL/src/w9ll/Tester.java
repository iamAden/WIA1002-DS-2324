/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w9ll;

/**
 *
 * @author User
 */
class MyLinkedList<E extends Comparable>{
    private Node head;
    private Node tail;
    private int size;
    public MyLinkedList(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    public int getSize(){
        return this.size;
    }
    //assigning new head
    public void addFirst(E data){
        Node newNode =new Node(data);
        //if list is empty
        if(head==null){
            head=newNode;
        }
        else{
            Node exHead = head;
            head = newNode;
            head.next = exHead;
        }
        size++;
    }
    public void addLast(E data){
        Node newNode = new Node(data);
        //if list is empty
        if(head==null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public E removeFirst(){
        Node temp = head;
        head = head.next;
        size--;
        return (E)temp.data;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[size=").append(this.size).append("]");
        
        Node temp=head;
        while(temp!=null){
            sb.append(">>").append(temp.data);
            temp=temp.next;
        }
        return sb.toString();
    }
    public boolean contains(E data){
        Node temp=head;
        while(temp!=null){ 
            //matches
            if(temp.data==data) return true;
            //else
            temp=temp.next;
        }
        //return false if list is empty
        return false;
    }
    public void clear(){
        head = null;
        tail = null;
        
        size=0;
        System.out.println("The list is cleared.");
    }
    public void combine(MyLinkedList<E> otherList){
        Node temp=otherList.head;
        while(temp!=null){
            E data = (E) temp.data;
            this.addLast(data);
            temp=temp.next;
        }
    }
}

public class Tester{
    public static void main(String[] args) {
        MyLinkedList l1 = new MyLinkedList();
        System.out.println(l1.toString());
        l1.addFirst("apple");
        l1.addFirst("banana");
        l1.addLast("pomelo");
        System.out.println(l1.toString());
        System.out.println(l1.contains("pomelo"));
        l1.removeFirst();
        System.out.println(l1.toString());
        l1.clear();
        System.out.println(l1.toString());
        l1.addLast("cherry");
        System.out.println(l1.toString());
        
        MyLinkedList l2 = new MyLinkedList();
        l2.addLast("durian");
        l2.addLast("persimmon");
        l2.addLast("orange");
        
        l1.combine(l2);
        System.out.println(l2.toString());
        System.out.println(l1.toString());
    }
}
