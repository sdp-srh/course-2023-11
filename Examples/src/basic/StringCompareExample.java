package basic;

public class StringCompareExample {

	public static void main(String[] args) {
		String s1="SRH";
		String s2="SRH";
		String s3=new String("SRH");
		String s4="sdp";
		System.out.println(s1.equals(s2));//true  
		System.out.println(s1.equals(s3));//true  
		System.out.println(s1.equals(s4));//false 
	}

}
