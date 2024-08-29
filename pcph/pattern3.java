package pcph;
//question 16
public class pattern3 {
    public static void main(String[] args) {
        int n=5;
        int nsp=n-1;
        int nst=n;
        for(int row=0; row<2*n-1;row++){
            for(int csp=0;csp<nsp;csp++){
                System.out.print(" ");
            }
            for(int cst=0;cst<nst;cst++){
                System.out.print("*");
            }
            if(row<n-1){
                nst--;
                nsp--;
            }
            else{
                nst++;
                nsp++;
            }
            System.out.println(" ");
        }
    }
    
}
