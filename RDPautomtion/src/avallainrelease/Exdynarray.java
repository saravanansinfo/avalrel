package avallainrelease;

import java.util.ArrayList;
import java.util.Hashtable;

public class Exdynarray {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		
		al1.add(100);
		
		
		al.add("Ramkumar");
		al.add("Charan");
		
		System.out.println(al.size());
		
		System.out.println(al.get(0));
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		
		ht.put("fname", "saravanan");
		ht.put("middelname", "shanmugam");
		ht.put("lastname", "karuppannan");
		
		System.out.println(ht.put("fname", "saravanan"));
		
		System.out.println(ht.size());
		
		System.out.println(ht.get("middelname"));
		

	}

}
