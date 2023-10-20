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
     int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    private String color = "blue";
     String speedStr="FAST";
    
    public Fan(){
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }
    
    //Accessors and mutators (Setters and getters)
    public void setSpeed(int s){
        switch (s){
            case 1 -> this.speed=SLOW; 
            case 2 -> this.speed=MEDIUM;
            case 3 -> this.speed=FAST;
        }
    }
    
    public int getSpeed(){
        return this.speed;
    }
    
    public void setOn(boolean b){
        this.on=b;
    }
    
    public boolean getOn(){
        return this.on;
    }
    
    public void setRadius(double d){
        this.radius=d;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setColor(String c){
        this.color=c;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public String getSpeedStr(){
        String speedStr="";
        switch(this.speed){
            case 1 -> speedStr="SLOW";
            case 2 -> speedStr="MEDIUM";
            case 3 -> speedStr="FAST";
        }
        return speedStr;
    }
    
    @Override
    public String toString(){
        String desc = "";
        if (this.on==true){
            desc="\nSpeed\t"+this.getSpeedStr()+"\nColor\t"+this.color+"\nRadius\t"+this.radius;
        }
        else{
            desc="\nColor\t"+this.color+"\nRadius\t"+this.radius+"\nfan is off";
        }
        return desc;
    }
    

}
