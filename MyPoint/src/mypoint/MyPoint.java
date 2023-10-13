/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mypoint;

/**
 *
 * @author User
 */
class MyPoint {

    /**
     * @param args the command line arguments
     */
    
    private double x,y;
    //not private static double -> because
    //When a variable is declared as static, then a single copy of the variable 
    //is created and shared among all objects at a class level.
    public MyPoint(){
        this.x=0.0;
        this.y=0.0;
    }
    public MyPoint(double dx, double dy){
        x=dx;
        y=dy;
    }
    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    double distance(MyPoint point){
        return Math.sqrt((point.getX()-this.x)*(point.getX()-this.x)+(point.getY()-this.y)*(point.getY()-this.y));
        
    }
    double distance(double x, double y){
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }
    
    static double distance(MyPoint point1, MyPoint point2){
        return Math.sqrt((point1.getX()-point2.getX())*(point1.getX()-point2.getX())+(point1.getY()-point2.getY())*(point1.getY()-point2.getY()));
    }
}
