package exc_lab;

/**
 * This class checks for the length of the array.
 */

public class ArrayProcessor {
    public int getArrayLength(Object[] a) {
  
    	// given in the code
    	int count = 0;
    	try {
            while (true) {
                Object t = a[count];
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        	System.out.println();
            System.out.println(e + "array index is out of bound");        
            }
        return count;
    }
}

