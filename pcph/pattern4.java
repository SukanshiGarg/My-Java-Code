package pcph;

public class pattern4 {
    public static void main(String[] args) {
        int n=7;
        int nst=n/2;
        int nsp=1;
        for(int row=0 ; row< n ; row++){
            for(int cst=0 ;cst<nst;cst++){
                System.out.print("*");

            }
            //spaces
            for(int csp=0;csp<nsp;csp++){
                System.out.print(" ");
            }
            //stars
            for(int cst=0 ;cst<nst;cst++){
                System.out.print("*");

            }
            if(row<n/2){
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
