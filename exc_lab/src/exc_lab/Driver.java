package exc_lab;


/**
*<h1> Driver class containing the main method for the ArrayProcessor and Menu classes.</h1>
*/
public class Driver {

 public static void main(String[] args) {
	 /**
	  * creating object for the array processor class // given in the code
	  */
     ArrayProcessor ap = new ArrayProcessor();
     int len = ap.getArrayLength(new String[] {"one", "two", "three"});
     System.out.println("Array length is " + len);
 }
}

