/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fandemo;

/**
 *
 * @author User
 */
public class FanDemo {

    /**
     * @param args the command line arguments No objects
     */
    public static void main(String[] args) {

    }

}

class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed=SLOW;
        on=false;
        radius=5;
        color="blue";
    }
}
