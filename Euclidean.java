import java.util.Scanner;
import javax.swing.JOptionPane;
public class Euclidean {

	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter 1st value:");
	 int a=s.nextInt();
	 int a1=a;
	 System.out.println("Enter 2nd value:");
	 int b=s.nextInt();
	 int b1=b;
	 int r=b;
	 while(r!=0) {
		 
		 if(a>b) {
			 
			 r=a%b;
			 a=b;
			 b=r;
			 
		 } 
		 else {
			 
			 r=b%a;
			 a=b;
			 b=r;
			 
		 }
		 
		 
	 }
	 System.out.println("gcd("+a1+","+b1+") :"+a);
	 JOptionPane.showMessageDialog(null,"gcd("+a1+","+b1+") : "+a);
	}

}
