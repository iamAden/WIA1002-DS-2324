/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package numericcasting;

/**
 *
 * @author User
 */

public class NumericCasting {
    
    public static void main(String[] args) {
        byte byte1 = 127;
        short short1 = 55;
        int intvalue = 888;
        long longvalue = 234234;
        float floatvalue1 = 234.34f; //special case, must include f
        float floatvalue2 = (float)234.23; 
        double doublevalue = 234.43;
        
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        
        doublevalue = intvalue;
        //intvalue = doublevalue; <- ERROR
        //double to int cannot, but int to double can??
        //because int is smaller than double
        //cannot put bigger value into smaller container
        intvalue = (int) doublevalue;
        System.out.println("");
    }

}
