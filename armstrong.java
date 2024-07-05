import java.util.*;
public class armstrong {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		int rem;
		int digit=(int)(Math.log10(n)+1);
		while(n>0){
			rem=n%10;
			sum+=Math.pow(rem,digit);
			n=n/10;
		}
		if(num==sum){
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
		

	}
}