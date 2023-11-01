/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package removedupint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class RemoveDupInt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter ten integers: ");
        String input = sc.nextLine();
        String[] numArr = input.split(" ");
        
        ArrayList<String> list = new ArrayList<>();
        for(String value:numArr){
            if (!list.contains(value)){
                list.add(value);
            }
        }
        System.out.print("Output: ");
        for(String value:list){
            System.out.print(value+" ");
        }
        System.out.println("");
    }

}
