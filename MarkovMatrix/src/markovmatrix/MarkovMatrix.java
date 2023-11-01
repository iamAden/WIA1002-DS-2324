/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package markovmatrix;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MarkovMatrix {
    //Markov Matrix is a matrix with all positive elements & 
    //the sum of each column is 1
    public static boolean isMarkovMatrix(double[][]m){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(m[i][j]<0){
                    return false;
                }
            }
            if(m[0][i]+m[1][i]+m[2][i]!=1){
                return  false;
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[][]input=new double[3][3];
        System.out.println("Enter a 3X3 Markov Matrix:");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                input[i][j]=sc.nextDouble();
            }
        }
        
        System.out.println("Is this a Markov Matrix? " + isMarkovMatrix(input));
    }

}
