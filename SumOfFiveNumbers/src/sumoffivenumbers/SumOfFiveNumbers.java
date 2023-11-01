/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package sumoffivenumbers;

import java.util.Scanner;

/**
 *
 * @author User
 */


public class SumOfFiveNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers.");
        String numbers = sc.nextLine();
        String[] numArr=numbers.split(" ");
        
        int sum = 0;
        for(int i = 0;i<numArr.length;i++){
            sum += Integer.parseInt(numArr[i]);
        }
        System.out.println("Sum of all numbers: "+sum);
    }

}
