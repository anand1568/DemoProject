public class NoOfCoins {

	public static void main(String[] args) {
		int arr []= {25,10,5,1};
		getNumCoin( arr, 233);

	}
	
	
	public static int[] getNumCoin(int[] coinValues, int amount) {
		  int noOfCoins []= new int [4];
		  for(int i=0;i<coinValues.length;i++){
			  if (amount >= coinValues[i]) {
		  
		    noOfCoins[i]=amount/coinValues[i];
		     amount=amount%coinValues[i];
			  }
		  }
		  
		  System.out.println("The no of coins array is:");
		  
		  for(int i=0;i<coinValues.length;i++) {
			  if (noOfCoins[i] != 0) {
	                System.out.println(coinValues[i] + " : "
	                    + noOfCoins[i]);
		        }
		 

           }
		  return coinValues;
 }	

}