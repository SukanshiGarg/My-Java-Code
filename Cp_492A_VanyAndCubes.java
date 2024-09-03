/*

linK: https://github.com/B1bhu1O1/Coding-Ninja3s-Solution-Java-DSA-Premium/tree/main
A. Vanya and Cubes
time limit per test1 second
memory limit per test256 megabytes
Vanya got n cubes. He decided to build a pyramid from them. Vanya wants to build the pyramid as follows: the top level of the pyramid must consist of 1 cube, the second level must consist of 1 + 2 = 3 cubes, the third level must have 1 + 2 + 3 = 6 cubes, and so on. Thus, the i-th level of the pyramid must have 1 + 2 + ... + (i - 1) + i cubes.

Vanya wants to know what is the maximum height of the pyramid that he can make using the given cubes.

Input
The first line contains integer n (1 ≤ n ≤ 104) — the number of cubes given to Vanya.

Output
Print the maximum possible height of the pyramid in the single line.
 */



import java.util.*;
public class Cp_492A_VanyAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int height=0;
        int sum=0;

        for(int i=1;n>0;i++){
            sum+=i;
            if(n-sum >= 0) height++;
            n-=sum;
             
        }
        System.out.println(height);
        
    }
    
}
