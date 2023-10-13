/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package fan;

/**
 *
 * @author User
 */
public class Fan {

    /**
     * @param args the command line arguments
     */
    private static final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    String color = "blue";
    
    public Fan(){
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }
    
    //Accessors and mutators (Setters and getters)
    void setSpeed(int s){
        switch (s){
            case 1:
                this.speed=SLOW; break;
            case 2:
                this.speed=MEDIUM; break;
            case 3:
                this.speed=FAST; break;
        }
    }
    
    String getSpeed(){
        String speedStr="";
        switch(this.speed){
            case 1:
                speedStr= "SLOW";
            case 2:
                speedStr= "MEDIUM";
            case 3:
                speedStr= "FAST";
        }
        return speedStr;
    }
    
    void setOn(boolean b){
        this.on=b;
    }
    
    boolean getOn(){
        return this.on;
    }
    
    void setRadius(double d){
        this.radius=d;
    }
    
    double getRadius(){
        return this.radius;
    }
    
    void setColor(String c){
        this.color=c;
    }
    
    String getColor(){
        return this.color;
    }
    
    @Override
    public String toString(){
        String desc = "";
        if (this.on==true){
            desc="\nSpeed\t"+this.speed+"\nColor\t"+this.color+"\nRadius\t"+this.radius;
        }
        else{
            desc="\nColor\t"+this.color+"\nRadius\t"+this.radius+"\nfan is off";
        }
        return desc;
    }
    

}
