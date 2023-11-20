// the name of the package
package example;


// the class is public and the name is Our
public class OurFirstClass {

	public static void main(String[] args) {
		System.out.println("My first java program is working");
		System.out.println("Doubled is "+ doubleTheValue(5));
	}
	
	private static int doubleTheValue(int value) {
		return value * 2;
	}
}
