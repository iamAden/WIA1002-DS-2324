/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package shufflematrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ShuffleMatrix {
    public static void shuffle(int[][]m){
        Random rd = new Random();
        ArrayList<Integer>list=new ArrayList<>();
        int random;
        int[][]newm=new int[5][2];
        for(int i=0;i<5;i++){
            random = rd.nextInt(5);
            while(list.contains(random)&&list.size()<5){
                random = rd.nextInt(5);
            }
            newm[i]=m[random];
            list.add(random);
        }
        System.out.println(Arrays.deepToString(newm));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]m=new int[5][2];
        System.out.println("Enter 2x5 matrix: ");
        for(int i=0;i<5;i++){
            for(int j=0;j<2;j++){
                m[i][j]=sc.nextInt();
            }
        }
        shuffle(m);
    }

}
