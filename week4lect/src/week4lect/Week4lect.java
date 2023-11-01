/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package week4lect;

/**
 * polymorphism = many shape
 * can use object from child class anywhere you would an object of parent class
 * 
 * inheritance : child uses parent 
 * polymorphism : parent uses child
 * @author User
 */

class Plant{
    public void grow(){
        System.out.println("Plant is growing...");
    }
}

class Tree extends Plant{
    @Override
    public void grow(){
        System.out.println("Tree is growing...");
    }
    public void shedLeaves(){
        System.out.println("Tree is shedding leaves");
    }
}
public class Week4lect {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        //Datatype (Plant) variable/instance = object creation (Plant)
        Tree tree1 = new Tree();
        
        Plant plant2 = plant1;
        
        Plant plant3 = tree1; // this is polymorphism
        //Datatype (Plant) variable/instance (Plant) = object creation (Tree)
        //                                    Not Tree because it has to follow Datatype (Plant)
        plant1.grow(); //Plant
        plant2.grow(); //Plant
        plant3.grow(); //Tree because instance is tree
        
        tree1.shedLeaves();
        //plant3.shedLeaves(); <- ERROR
        //plant3 cannot access shedLeaves() because plant3 is a Plant & shedLeaves is not Overriden
        //plant3 can access grow() inside Tree because there is an overriding
    }

}
