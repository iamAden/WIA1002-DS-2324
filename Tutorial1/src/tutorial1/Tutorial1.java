/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tutorial1;

/**
 *
 * @author User
 */

class Person{
    String name;
    int age;
    
    String sayHello(){
        return "This is your Captain " + name + " saying Oh-hoyyy!" ;
    }
    
    String speak(){
        return "I am " +name+ ", "+ age + " years old this year mate.";
    }
    
    String calculateYearsToRetirement(){
        return "I am retiring in "+ Integer.toString(60-age) + " years.";
    }
}
public class Tutorial1 {
	public static void main(String[] args){

	// Create an object for class Person 
	Person person1 = new Person();
	person1.name = "Jack Sparrow";
	person1.age = 38;

	// Create a second object for class Person 
	Person person2 = new Person();
	person2.name = "Katy Perry";
	person2.age = 45;
	
	// Display
	System.out.println(person1.name);
	System.out.println(person2.age);
        System.out.println(person1.sayHello());
	System.out.println(person2.sayHello());
	System.out.println(person1.speak());
	System.out.println(person1.calculateYearsToRetirement());
	System.out.println(person2.speak());
	System.out.println(person2.calculateYearsToRetirement());
	
		
	}
}
