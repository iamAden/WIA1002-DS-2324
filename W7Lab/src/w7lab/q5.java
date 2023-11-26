/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package w7lab;
/**
 *
 * @author User
 * share [100,20,20]
 * prices [20,24,36]
 * 100(30-20)
 * ...
 */
public class q5 {
    
    static void buy(MyQueue shares,MyQueue prices, int share, int price){
        shares.enqueue(share);
        prices.enqueue(price);
    }
    
    static int sell(MyQueue shares,MyQueue prices, int share, int price){
        int profit = 0;
        while(share>0&&!shares.isEmpty()){
            int existingShare = (int) shares.dequeue();
            int existingPrice = (int) prices.dequeue();
            
            if(share>existingShare){
                profit+=(price-existingPrice)*existingShare;
                share-=existingShare;
            }
            else{
                
                profit += (price-existingPrice)*share;
                shares.enqueue(existingShare-share);
                prices.enqueue(existingPrice);
                int size = shares.size();
                for(int i=size-1; i>0; i--){
                    shares.enqueue(shares.dequeue());
                    prices.enqueue(prices.dequeue());
                    
                }
                share=0;
            }
            
        }
        
        return profit;
    }
    public static void main(String[] args) {
        MyQueue shares = new MyQueue(100);
        MyQueue prices = new MyQueue(100);
        
        buy(shares,prices,100,20);
        buy(shares,prices,20,24);
        buy(shares,prices,200,36);
        System.out.println(sell(shares,prices,150,30));
    }
}
