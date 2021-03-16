package avallainrelease;

public class Varfun {
	
	public static int noc;
	public static int nor;
	
	public String name;
	public static String name1;
	
	public void kriti()
	{
		System.out.println("my name is kriti " + noc);
	}
	
	public static void shanvith()
	{
		System.out.println("my name is shanvith " + nor);
	}

	public static void main(String[] args) 
	{
		noc=5;
		nor=10;
		
		Varfun v1 = new Varfun();
		
		
		v1.name="saravanan";
		
		name1="shanmugam";
		
		v1.kriti();
		
		shanvith();
		
		System.out.println("father of kriti and shanvith is "+ v1.name);
		System.out.println("father of saravanan is " +name1);

	}

}
