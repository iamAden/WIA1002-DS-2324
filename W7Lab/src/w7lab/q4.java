/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w7lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author User
 * 
 * 1. initialize array for colors and numbers (the index will be the precedence score)
 * 2. generate 5 cards for 2 players using random and queue
 * 3. display the cards of each player
 * 4. compare the cards one by one, one will higher precedence (sum of the indices) wins one point
 * 5. calculate total score and find winner
 * 
 */
public class q4 {
    public static void main(String[] args) {
        start(5);
    }
    public static void start(int numCards){
        Random rd = new Random();
        
        ArrayList<String> colorarr = new ArrayList<>(Arrays.asList("Yellow","Blue","Green","Red"));
        ArrayList<String> numberarr = new ArrayList<>(Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"));
        
        MyQueue player1 = new MyQueue(numCards);
        MyQueue player2 = new MyQueue(numCards);
        
        for (int i = 0; i < numCards; i++) {
            player1.enqueue(numberarr.get(rd.nextInt(numberarr.size())) + " " + colorarr.get(rd.nextInt(colorarr.size())));
            player2.enqueue(numberarr.get(rd.nextInt(numberarr.size())) + " " + colorarr.get(rd.nextInt(colorarr.size())));
        }
        System.out.println("Player 1 Card");
        System.out.println(player1.display());
        System.out.println("Player 2 Card");
        System.out.println(player2.display());
        
        int totalscore1=0, totalscore2=0;
        
        for (int i = 0; i < numCards; i++) {
            int score1 = 0, score2 = 0;
            String card1 = (String) player1.dequeue();
            String card2 = (String) player2.dequeue();
            for(String data1:card1.split(" ")){
                score1 += numberarr.indexOf(data1);
            }
            for(String data2:card2.split(" ")){
                score2 += numberarr.indexOf(data2);
            }
//            System.out.println("Round "+i);
//            System.out.println("Score1: "+score1);
//            System.out.println("Score2: "+score2);
            
            if(score1>score2) totalscore1++;
            if(score2>score1) totalscore2++;
            
//            System.out.println("Total score1: "+totalscore1);
//            System.out.println("Total score2: "+totalscore2);
        }
        
        System.out.println("Player 1 Score: "+totalscore1);
        System.out.println("Player 2 Score: "+totalscore2);
        if(totalscore1>totalscore2)System.out.println("Player 1 wins!");
        if(totalscore2>totalscore1)System.out.println("Player 2 wins!");
        if(totalscore1==totalscore2)System.out.println("Draw!");
    }
}
       