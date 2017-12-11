package mein.paket;

public class Maximum {

	public static void main(String[] args) {
		int b=12;
		int a=8;
		int c=5;
		int tmp;
		if(a==b)
			System.out.println("Die Zahlen sind gleich gross!");
		else
			System.out.println(a<b?a+"<"+b :a+">"+b);
		System.out.println("before sortieren: "+a+" "+b+" "+c);
		if(a>b)
		{
			tmp=a;
			a=b;
			b=tmp;
		}
		if(a>c)
		{
			tmp=a;
			a=c;
			c=tmp;
		}
		if(b>c)
		{
			tmp=b;
			b=c;
			c=tmp;
		}
		System.out.println("nach sortieren: "+a+" "+b+" "+c);
	}

}
