import java.util.Scanner;
import java.util.Random;
public class PrimeTest {

	public static void main(String[] args) {
		int m,n,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a no :");
		n=s.nextInt();
		
		//Random rnd=new Random();
	    // n=rnd.nextInt();
		m=n/2;
		
		for(int i=2;i<n;i++) {
			
			if(n%i==0) {
				
				System.out.println(n+" is not prime number ,plz enter prime no: ");
				flag=1;
		        break;
				
			}
			
			
		}
	
		if(flag==0) {
			System.out.println(n+" is a prime number ");
			
		}
	}

}
