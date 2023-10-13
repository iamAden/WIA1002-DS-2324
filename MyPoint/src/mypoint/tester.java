package mypoint;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class tester {
    public static void main (String[]args){
        MyPoint point1 = new MyPoint(0.0,0.0);
        MyPoint point2 = new MyPoint(10,30.5);
        
        System.out.printf("%.4f\n",point1.distance(point2));
    }
}
