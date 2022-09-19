 import java.util.Scanner;
 public class PrimeNo{
  public static void main(String [] args){
  
    System.out .println("Enter the number");
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int f=0;
     if(n==0||n==1){
      System.out .println("The number is not prime");
     }
    
     else {
     
   	for(int i=2;i<n/2;i++){
           
	  if(n%i==0){
           System.out .println("The number is not prime");
	    f=1;
            break;
          }

        }
       
        if(f==0){
 	   System.out .println("The number is  prime");
         }

     }
   
   }

 }