
public class ConcatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s1="hi";

		s1=s1.concat("hello");

		System.out.println(s1);
		
		System.out.println(s1.concat("mi"));
		System.out.println(s1.concat("dog"));
		
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.append("hi"));
		
		System.out.println(sb.append("hello"));
		System.out.println(sb.append("hi"));
		System.out.println(sb.append("hip"));
	}

}
