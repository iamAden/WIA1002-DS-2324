/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package smallestinmatrix;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class SmallestInMatrix {
    public static int[] locateSmallest(int[][] a){
        
        int min=9999;
        int indexi=0, indexj=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(a[i][j] < min){
                    min=a[i][j];
                    indexi=i;
                    indexj=j;
                }
            }
        }
        int[]smallest= {indexi,indexj};
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][]array=new int [4][4];
        System.out.println("Enter a 4x4 integer array:");
        
        for(int i=0;i<4; i++){
            for(int j=0;j<4;j++){
                array[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Location: "+Arrays.toString(locateSmallest(array)));
    }
}
