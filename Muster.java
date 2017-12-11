package mein.paket;

public class Muster {
	
	static String[][] temp, temp2;
	public static void druckeMuster(int a, int b, int c, int d) {

		temp = new String[c][d];
		temp2 = new String[c][d];
		for(int i=0; i<a;i++) {
			System.out.println("");	
			for(int j=0;j<b;j++) {
				if((i+j)%2 == 0)
					DruckX(c,d);
				else
					DruckPoint(c,d);
				
				
			}}
		}
	public static void DruckPoint(int c, int d) {
					for(int j1=0;j1<d;j1++) {
					
						//System.out.println("");					
						for(int i1=0; i1<c;i1++) {
							temp2[i1][j1] = ".";
							System.out.print(temp2[i1][j1]);
				} 
						System.out.println("");
				}	
				}
	public static void DruckX(int c, int d) {
				for(int j1=0;j1<d;j1++) {
				
					//System.out.println("");
					for(int i1=0; i1<c;i1++) {
						temp[i1][j1] = "X";	
						System.out.print(temp[i1][j1]);
			}
			System.out.println("");
			}
			}

	public static void main(String[] args) {

		druckeMuster(6,4,5,3);


	}

}
