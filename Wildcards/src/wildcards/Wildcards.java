/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package wildcards;

/**
 *
 * @author User
 */
import java.util.ArrayList;

class Machine{
    public Machine(){
        System.out.println("I am Machine");
    }
}

class Camera extends Machine{

}
public class Wildcards {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Jane");
        list.add("John");
        list.add("James");
        showList(list);
        
        ArrayList<Machine> list2 = new ArrayList<>();
        list2.add(new Machine());
        showList2(list2);
    }
    public static void showList(ArrayList<String> list){
        for(String value:list){ // <- this part is the wildcard
            System.out.println(value);
        }
    }
    public static void showList2(ArrayList<Machine> list){
        for(Machine value:list){ //<- this part is the wildcard
            System.out.println(value);
        }
    }
}
