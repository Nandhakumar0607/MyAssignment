package myassignmeent.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 289;
		 
	    for (int i = 2; i <= num / 2;){
	      if (num % i == 0) 
	      	  {
	    	  System.out.println(num + " is not a prime number");
	    	 
	          }
	      else
	      {
	    	  System.out.println(num + " is a prime number."); 
	    	  break;
	      }
	    }

	}

}
