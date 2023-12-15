/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package w9ll;

/**
 *
 * @author User
 */
class Node<E extends Comparable<E>> implements Comparable<Node<E>>{
    public E data;
    public Node next;
    public Node(E data){
        this.data=data;
        this.next=null;
    }
    @Override 
    public int compareTo(Node<E> otherNode){
        return this.data.compareTo(otherNode.data);
    }
}

