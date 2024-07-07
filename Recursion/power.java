package Recursion;

// recursive relation for p^q = p^q-1*p

//base case: p^0:1
public class power {
    public static void main(String[] args) {
        int p=5;
        int q=2;
        System.out.println(powe(p,q));
    }
    public static int powe(int p,int q){
        //base condition : p^0 = 1
        if(q==0) return 1;
        return powe(p, q-1)*p;
        //head recursion 
    }
    

}
