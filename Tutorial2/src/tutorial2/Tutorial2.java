/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package tutorial2;

/**
 *
 * @author User
 */
class Frog{
    void speak(String s){
        System.out.println(s);
    }
    void jump(int h){
        for(int i=1; i<4; i++){
            System.out.println("Jumping "+h+"cm "+i+" time!");
        }
    }
    void move(String s, double d){
        System.out.println("Moving "+d+" meters in the "+s+" direction");
    }
}
public class Tutorial2 {

	public static void main(String[] args){

	Frog sam = new Frog();

	sam.speak("Hi, I am Sam");
	sam.jump(7);
	sam.move("West", 5.5);
	
	String greeting = "Good morning!";
	sam.speak(greeting);
	
	}
}
