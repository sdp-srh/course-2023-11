package basic;

public class StringCompareExample2 {

	public static void main(String[] args) {
		String s1="SRH";
		String s2="SRH";
		String s3=new String("SRH");
		
		System.out.println(s1 == s2); // true (Same instance "SRH")
		System.out.println(s1 == s3); // false (newly created)
	}	
	
}
