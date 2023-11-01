/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class GeometricObject {
    private String color;
    private boolean filled;
    public GeometricObject(){
        this.color="red";
        this.filled=true;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public String getColor(){
        return this.color;
    }
    public boolean getFilled(){
        return this.filled;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("=== Geometric Object ===");
        sb.append("\nColor: ").append(this.color);
        sb.append("\nFilled: ").append(this.filled);
        return sb.toString();
    }
}

class Circle extends GeometricObject{
    private double radius;
    public Circle(){
        this.radius=1;
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        super.setColor(color);
        super.setFilled(filled);
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("=== ");
        sb.append(this.radius==1&&super.getColor()=="red"&&super.getFilled()==true? "Default Circle":super.getColor()+", "+(super.getFilled()==true? "filled Circle":"unfilled Circle"));
        sb.append(" ===");
        sb.append("\nColor: ").append(super.getColor());
        sb.append("\nFilled: ").append(super.getFilled());
        sb.append("\nRadius: ").append(this.radius);
        return sb.toString();
    } 
}

class Rectangle extends GeometricObject{
    private double height;
    private double width;
    public Rectangle(){
        this.height=1;
        this.width=1;
    }

    public Rectangle(double height, double width) {
        super();
        this.height = height;
        this.width = width;
    }
    
    public Rectangle(double width, double height, String color, boolean filled ){
        this.width=width;
        this.height=height;
        super.setColor(color);
        super.setFilled(filled);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
}

public class Tester{
    public static void main(String[]args){
        GeometricObject obj1 = new GeometricObject();
        Circle obj2 = new Circle();
        Circle obj3 = new Circle(9,"black",false);
        Rectangle obj4 = new Rectangle();
        System.out.println(obj1 + "\n");
        System.out.println(obj2 + "\n");
        System.out.println(obj3 + "\n");
        System.out.println(obj4);
    }
}
