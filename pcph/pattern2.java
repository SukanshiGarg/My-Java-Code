package pcph;

public class pattern2 {
    public static void main(String[] args) {
        int n=5;
        int nsp=0;
        int nst=5;
        for(int row=0; row<2*n-1;row++){
            for(int csp=0;csp<nsp;csp++){
                System.out.print(" ");
            }
            for(int cst=0;cst<nst;cst++){
                System.out.print("*");
            }
            if(row<n-1){
                nst--;
                nsp+=2;
            }
            else{
                nst++;
                nsp-=2;
            }
            System.out.println(" ");
        }
    }
    
}
