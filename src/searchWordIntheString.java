

//how u can search word in the string  using contains() and also indexOf()


public class searchWordIntheString {
	public static void main(String args[])
	{
		
	String s1="india is my country";
	System.out.println(s1.contains("my"));
	
	
	int index=s1.indexOf("my");
	if(index==-1)
	{
		System.out.println("my not fpund");
	}
	else
		System.out.println("my at "+index);
	}
}
