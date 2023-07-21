

// how to compaire string


public class StringCompareTo {

	public static void main(String[] args) {
		String s1="poonam";
		String s2="poonam";
		String s3=new String("Poonam");
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.compareToIgnoreCase(s3));
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}

}


