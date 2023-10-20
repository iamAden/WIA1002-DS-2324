/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package register;

/**
 *
 * @author User
 */
class Student{
	
    private String name;
    private int matricId;
    private int year;
    public void setName(String name){
        this.name=name;
    }
    public void setMatricId(int matricId){
        this.matricId=matricId;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String getName(){
        return this.name;
    }
    public int getMatricId(){
        return this.matricId;
    }
    public int getYear(){
        return this.year;
    }
    public void displayInfo(){
        System.out.println(this.name + "\t" + this.matricId + "\t\t" + this.year);
    }
	
}

public class Register {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student alexaObj = new Student();
        Student siriObj = new Student();
        Student omegaObj = new Student();
        Student betaObj = new Student();
        
        alexaObj.setName("Alexa");
        alexaObj.setMatricId(1007);
        alexaObj.setYear(2);
        siriObj.setName("Siri");
        siriObj.setMatricId(5018);
        siriObj.setYear(4);
        omegaObj.setName("Omega");
        omegaObj.setMatricId(2019);
        omegaObj.setYear(1);
        betaObj.setName("Beta");
        betaObj.setMatricId(2371);
        betaObj.setYear(3);
			   
	System.out.println("Name\tMatricId\tYear");
        System.out.println(alexaObj.getName()+"\t"+alexaObj.getMatricId()+"\t\t"+alexaObj.getYear());
        System.out.println(siriObj.getName()+"\t"+siriObj.getMatricId()+"\t\t"+siriObj.getYear());
        System.out.println(omegaObj.getName()+"\t"+omegaObj.getMatricId()+"\t\t"+omegaObj.getYear());
        System.out.println(betaObj.getName()+"\t"+betaObj.getMatricId()+"\t\t"+betaObj.getYear());
    }

}
