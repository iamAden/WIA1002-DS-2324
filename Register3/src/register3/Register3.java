/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package register3;

/**
 *
 * @author User
 */
class Student{
    private String name="No name";
    private int matricId=9999;
    private int year=1;
    
    public Student(String name,int matricId, int year){
        this.name=name;
        this.matricId=matricId;
        this.year=year;
    }
    public Student(String name){
        this.name=name;
    }
    public Student(String name, int year){
        this.name=name;
        this.year=year;
    }
    public void displayInfo(){
        System.out.println(this.name + "\t" + this.matricId + "\t\t" + this.year);
    }
}


public class Register3 {

    public static void main(String[] args) {
        
        Student alexaObj = new Student("Alex",1007,2);
        Student siriObj = new Student("Siri",5018,4);
        Student omegaObj = new Student("Omega",2019,1);
        Student betaObj = new Student("Beta",2371,3);
        Student thanosObj = new Student("Thanos");
        Student ironObj = new Student("Ironman", 1);

        
        System.out.println("Name\tMatricId\tYear");
        alexaObj.displayInfo();
        siriObj.displayInfo();
        omegaObj.displayInfo();
        betaObj.displayInfo();
        thanosObj.displayInfo();
        ironObj.displayInfo();
    }
}

