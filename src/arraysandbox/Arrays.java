package arraysandbox;

import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		/* variables */
		int[] dfa = new int[10]; 
		int cntOfEntries = 10;
		long key; // the element we'ren looking for
		Random random = new Random(100);
		// editing with git
		
		// insert data
		for(int i = 0; i< cntOfEntries; i++) {
			dfa[i] = (int)(random.nextInt(100));
		} // end insert
		
		
        System.out.println("simple for loop");
        for(int i=0; i < cntOfEntries; i++) {
        	System.out.println(dfa[i]);
        }
                
        System.out.println("ForEach loop");
        for(int a:dfa) {
        	System.out.print(a + ",");
        }
        

		
	}

}
