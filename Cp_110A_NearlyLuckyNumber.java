/*
    Problem:	110A - Nearly Lucky Number
    link :      https://codeforces.com/problemset/problem/1

Petya loves lucky numbers. We all know that lucky numbers are the positive integers whose decimal representations contain only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.

Unfortunately, not all numbers are lucky. Petya calls a number nearly lucky if the number of lucky digits in it is a lucky number. He wonders whether number n is a nearly lucky number.

Input
The only line contains an integer n (1 ≤ n ≤ 1018).

Please do not use the %lld specificator to read or write 64-bit numbers in С++. It is preferred to use the cin, cout streams or the %I64d specificator.

Output
Print on the single line "YES" if n is a nearly lucky number. Otherwise, print "NO" (without the quotes).
Output
Print on the single line "YES" if n is a nearly lucky number. Otherwise, print "NO" (without the quotes).

Examples
InputCopy
40047
OutputCopy
NO
InputCopy
7747774
OutputCopy
YES
InputCopy
1000000000000000000
OutputCopy
NO
Note
In the first sample there are 3 lucky digits (first one and last two), so the answer is "NO".

In the second sample there are 7 lucky digits, 7 is lucky number, so the answer is "YES".

In the third sample there are no lucky digits, so the answer is "NO".


java implementation 

 */


 //method --1 *does not handle big inputs *

import java.util.*;
public class Cp_110A_NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        //traverse through each digit of the number
        int temp=n;
        int c=0;
        while(temp>0){
            int r=temp%10;
            
            if(r==4 || r==7){
                c=c+1;
            }
            temp=temp/10;
          
            
            
        }
        if(c==4 || c==7){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
