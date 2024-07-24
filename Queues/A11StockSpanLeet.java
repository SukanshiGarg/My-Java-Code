// online stock span leetcode 901 medium
//https://leetcode.com/problems/online-stock-span/solutions/5501419/online-stock-span-easy-and-detailed-explanation/
//https://leetcode.com/problems/online-stock-span/descriptio

//  coding blocks lecture link: https://online.codingblocks.com/app/player/285081/content/293986/19190/lecture


package Queues;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class A11StockSpanLeet {
     List<Integer> list;
     
     public A11StockSpanLeet(){
        this.list= new ArrayList<>();
     }

     public int next(int price){
        list.add(price);
        int count=0;
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)>price){
            break;
            }
        count++;
        }
        return count;
    
     }
     public static void main(String []args){
        A11StockSpanLeet stockSpanner = new A11StockSpanLeet();
        int prices[]={100,80,60,70,60,75,85};

        for(int price: prices){
            int result=stockSpanner.next(price);
            System.out.println("Price : "+ price + " span : "+ result);

        }

     }
}
