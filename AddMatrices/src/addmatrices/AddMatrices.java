/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package addmatrices;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class AddMatrices {
    public static double[][]addMatrix(double[][]a, double[][]b){
        double[][]sum=new double[2][2];
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sum[i][j]=a[i][j]+b[i][j];
                //System.out.println(a[i][j]+b[i][j]);
            }
        }
        
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[][]matrixA=new double[2][2];
        double[][]matrixB=new double[2][2];
        
        System.out.println("Enter 4 values of 2x2 matrix A: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                matrixA[i][j]=sc.nextDouble();
            }
        }
        
        System.out.println("Enter 4 values of 2x2 matrix B: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                matrixB[i][j]=sc.nextDouble();
            }
        }
        
        System.out.println("The addition of the two matrix results in: ");
        double[][]result=addMatrix(matrixA,matrixB);
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
