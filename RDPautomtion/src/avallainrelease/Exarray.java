package avallainrelease;

public class Exarray {

	public static void main(String[] args) 
	{
		int a[] = new int [10];
		
		a[0] = 10;
		a[1]=20;
		a[2]=30;
		
		System.out.println(a[1]);
		
		int b[][]=new int[10][5];
		
		b[0][2] = 50;
		
		System.out.println(b[0][2]);
		
		Object c[][]=new Object[2][5];
		
		c[0][0]=100;
		c[0][1]="Ram";
		c[1][1]="Sundar";
		c[1][2]=10.5;
		
		System.out.println(c[0][1]);
		
		
	}

}
