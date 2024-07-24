// best soln link : https://www.youtube.com/watch?v=jgEF8Dod5KE&t=6s&ab_channel=Nikh

// his git soln : https://github.com/nikoo28/java-solutions/blob/master/src/main/java/leetcode/medium/OnlineStockSpan.java

package Queues;

import java.util.Stack;

public class A12StockSpanner2 {
    public static int[] calculateSpans(int[] prices) {
        int spans[] = new int[prices.length];
        spans[0] = 1;
        // span of the first is always 1

        Stack<Integer> indexStack = new Stack<>();

        // push the index of the first element
        indexStack.push(0);

        for (int i = 1; i < prices.length; i++) {
            while (!indexStack.isEmpty()
            && prices[indexStack.peek()] < prices[i])
          indexStack.pop();
        

        //if the index stack is empty , the price at index "i"
        // is greater than all previous values 

        if(indexStack.isEmpty()){
            spans[i]=i+1;
        }
        else{
            spans[i]=i-indexStack.peek();
        }
        indexStack.push(i);
    }
    return spans;
}
public static void main(String[] args) {
    A12StockSpanner2 st = new A12StockSpanner2();
    int prices[]={100,80,60,70,60,75,85};
    int spans[]=calculateSpans(prices);

    for (int i = 0; i < prices.length; i++) {
        System.out.println("Price: " + prices[i] + ", Span: " + spans[i]);

    }
}

}
