package avallainrelease;

public class Exstring {

	public static void main(String[] args) 
	{
		String s1="I am saravanan";
		String s2="I am Saravanan";
		
		boolean b1=s1.equals(s2);
		System.out.println(b1);
		boolean b2=s1.equalsIgnoreCase(s2);
		System.out.println(b2);
		s1.length();
		System.out.println(s1.length());
		
		String a []=s1.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
		

	}

}
