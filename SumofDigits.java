import java.util.Scanner;
public class SumofDigits{
 
   public static void main(String [] args){
     int s=0;
     System.out.println("Please enter the number");
     Scanner sc = new Scanner(System.in);
     int n= sc.nextInt();
 
	while(n>0){
	 s=s+n%10;
	 n=n/10;
	}

     System.out.println("The sum of digit is-->"+s);

   }

} 