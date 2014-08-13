
public class PfixOperators {

	public static void main(String[] args) {
		
		//This Class is to understand the post and prefix operators
		  int i = 3;
	        i++;
	        // prints 4
	        System.out.println(i);
	        ++i;			   
	        // prints 5
	        System.out.println(i);
	        // prints 6
	        System.out.println(++i);
	        // prints 6
	        System.out.println(i++);
	        // prints 7
	     //   System.out.println(i);
	        
	    //Pre and postfix operators    
	        int x = 10;
	        int y = ++x + 9;
	        System.out.println("y value first case: " + y);
	        System.out.println("x value prefix: " + x);
	        
	      x= 10;
	        y = x++ + 9  ;
	        System.out.println("y value second case: " + y);
	        System.out.println("x value postfix: " + x);
	       
	        //The following will show how post fix operator will work
	        int k= 10;
	        int n= k++ % 5;
	       // k value will print as 11 and n value will print as 0
	        		System.out.println("Firstcase :- value of k is" + k);
	                System.out.println("Firstcase :- value of n is" + n);
	       //       re-initialize k and n  
	             //   To show how pre fix operator works 
	                 k= 10;
	    	         n= ++k % 5;
	    	         // k value will print as 11 and n value will print as 1
	    	         System.out.println("Secondcase :- value of k is" + k);
		                System.out.println("Secondcase :- value of n is" + n);
	    	         
	    	         
		
		// TODO Auto-generated method stub

	}

}
