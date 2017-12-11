package mein.paket;

public class Muster {
	static String[] temp;
	
	public static void DruckLineA(int a, int b, int c, int d) { // print line which starts like this: XXXX....XXXX.........
		while(a!=0) {
				if(a%2 == 0)
					DruckX(c);
				else
					DruckPoint(c);
				
				a--;
			}
		System.out.println();
		}
	
	public static void DruckLineB(int a, int b, int c, int d) { // print line which starts like this: ....XXXX....XXXX.........
		while(a!=0) {
				if(a%2 != 0)
					DruckX(c);
				else
					DruckPoint(c);
				
				a--;
			}
		System.out.println();
		}
	
	public static void DruckPoint(int c) {	//print line with length c from "."			
						while(c != 0) {
							System.out.print(".");
							c--;
				} 
				}	
	
	public static void DruckX(int c) { //print line with length c from "X"	
					while(c != 0) {
						System.out.print("X");
						c--;
			}
			}

	public static void DruckBlockLine(int a, int b, int c, int d,boolean beginneX ) {
		while(d!=0) {
			if(beginneX)
				DruckLineA(a,b,c,d);
			else
				DruckLineB(a,b,c,d);
			d--;
		}
	}
	
	public static void DruckMuster(int a, int b, int c, int d) {
		boolean beginneX;  // this variable we need to clear whether we will start the Line/BlockLine with "X" or "."
		if(b%2 == 0)  // our boolean variable works with b. but if b%2 will be 1( if b is odd), then we need to keep it in mind and do something like this 
			beginneX = true;
		else
			beginneX = false;
		while(b != 0) {
			if(b%2 == 0)
				DruckBlockLine(a, b, c, d, beginneX);
			else
				DruckBlockLine(a, b, c, d,!beginneX);
			b--;
		}
		System.out.println();
	}
		
	
	public static void main(String[] args) {

		DruckMuster(6,4,5,3);
		DruckMuster(8,5,2,1);
	}

}
