/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package circle2d;

/**
 *
 * @author User
 */
class Circle2D{
    private double x;
    private double y;
    private double radius;
    double getX(){
        return this.x;
    }
    double getY(){
        return this.y;
    }
    double getRadius(){
        return this.radius;
    }
    public Circle2D(){
        this.x=0;
        this.y=0;
        this.radius=1;
    }
    public Circle2D(double x, double y, double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
    boolean contains(double x, double y){
        double distance = Math.sqrt(Math.pow(this.x - x, 2) + (Math.pow(this.y - y, 2)));
        return (distance  <= radius * 2);
    }
    boolean contains(Circle2D circle){
        double distance = Math.sqrt(Math.pow(circle.getX() - x, 2) + (Math.pow(circle.getY() - y, 2)));
        return (distance <= (this.radius - circle.radius));
    }
    boolean overlaps(Circle2D circle){
        double distance = Math.sqrt(Math.pow(circle.getX() - x, 2) + (Math.pow(circle.getY() - y, 2)));
        return (distance <= (this.radius + circle.radius) && distance >= Math.abs(this.radius - circle.radius));
    }
}
public class tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2,2,5.5);
        System.out.println("Area\t\t:"+c1.getArea()+"\nPerimeter\t:"+c1.getPerimeter());
        System.out.println("test 1\t\t:"+c1.contains(3,3));
        System.out.println("test 2\t\t:"+c1.contains(new Circle2D(4,5,10.5)));
        System.out.println("test 3\t\t:"+c1.overlaps(new Circle2D(3,5,2.3)));
    }

}
