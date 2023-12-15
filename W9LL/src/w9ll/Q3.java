/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w9ll;

/**
 *
 * @author User
 */
public class Q3 {
    public static void main(String[] args) {
        MyLinkedList list1 = new MyLinkedList();
        MyLinkedList list2 = new MyLinkedList();
        MyLinkedList list3 = new MyLinkedList();
        list1.addLast(2);
        list1.addLast(10);
        list1.addLast(38);
        list1.addLast(41);
        list1.addLast(51);
        
        list2.addLast(5);
        list2.addLast(12);
        list2.addLast(18);
        list2.addLast(21);
        list2.addLast(35);
        list2.addLast(41);
        list2.addLast(56);
        
        list3.combine(list1);
        list3.combine(list2);
        
        System.out.println(list1.toString());
        System.out.println(list2.toString());
        System.out.println(list3.toString());
    }
}
