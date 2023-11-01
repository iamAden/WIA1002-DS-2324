/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package generics;

import java.util.ArrayList;

/**
 * Generics
 * @author User
 */
public class Generics {

    public static void main(String[] args) {
        //how arraylist was used before generics BEFORE JAVA 5
        ArrayList list = new ArrayList();
        list.add("apple");
        list.add("orange");
        
        String fruit = (String) list.get(0); //Downcasting
        
        System.out.println(fruit);
        
        //After JAVA 5
        ArrayList<String> str1 = new ArrayList<>();
        ArrayList<Integer> num1 = new ArrayList<>();
        
        str1.add("cat");
        str1.add("panda");
        str1.add("lion");
        str1.add("lizard");
    }

}
