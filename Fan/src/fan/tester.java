package fan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class tester {
    public static void main(String[]args){
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        fan1.setOn(true);
        
        fan2.setSpeed(2);
        fan2.setOn(true);
        //default color and radius
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println(fan1); //compiler getting toString method from built-in Object class
        //calling sout method will call toString method
    }
}
