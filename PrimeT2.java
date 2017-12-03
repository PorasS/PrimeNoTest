import java.util.Scanner;
public class PrimeT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int x=0;
        int flag=0;
        while(flag==0) {
        System.out.println(" Enter a no : ");
           x=s.nextInt();
           if(x==2||x==3){
        	  System.out.println("no "+x+" is a prime no:");
          	 flag++;
           }
           else {
         if(x%2==0||x%3==0){
        		System.out.println("No "+x+" is not prime :");  
        	
        	}
         else{
        	 
        	 System.out.println("no "+x+" is a prime no:");
        	flag++;
              } 	
           }
        }
           
        	           }
          }


