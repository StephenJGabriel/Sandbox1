package reversestring;

public class StringReverse {

	public static void main(String[] args) {
		String a = "string test";
	    System.out.println(a.length());
	    char[] test = a.toCharArray();
	  
	    for(int i = test.length - 1; i >= 0; i--) {
	        System.out.print(test[i]);	        	        
	    }
	 
	    System.out.println();
	    for(int i = test.length - 1; i >= 0; i--) {
	        System.out.print(a.charAt(i));	        	        
	    }

	    // testing branch
	    
	}

}
