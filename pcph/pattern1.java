package pcph;
public class pattern1 {
    public static void main(String[] args) {
        int n=5;
        int nst=1;
        for(int row=0 ; row< 2*n-1 ;row++){
            for(int cst=0 ;cst<nst ; cst++){
                System.out.print("*");
            }
            System.out.println(" ");
            
            if(row<n-1){
                nst++;
            }
            else{
                nst--;
            }
            

        }
    }
    
}
