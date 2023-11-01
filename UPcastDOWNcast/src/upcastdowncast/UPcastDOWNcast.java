/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package upcastdowncast;

/**
 * Upcasting
 * Downcasting
 * @author User
 */

class Machine{
    public void start(){
        System.out.println("Machine started...");
    }
}

class Camera extends Machine{
    @Override
    public void start(){
        System.out.println("Camera started...");
    }
    public void snap(){
        System.out.println("Photo taken...");
    }
}
public class UPcastDOWNcast {
    public static void main(String[]args){
    
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();
        machine1.start();
        camera1.start();
        camera1.snap();
        
        //upcasting
        Machine machine2 = camera1;
        machine2.start();

        //downcasting
        Machine machine3 = new Camera();
        machine3.start();
        //Camera camera2 = machine3; <- ERROR
        Camera camera2 = (Camera) machine3;
        camera2.snap();
        camera2.start();
    }

}
