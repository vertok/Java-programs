package mein.paket;

public class Einmaleins {
	
	public static void main(String[] args) {
		int[][] a = new int[20][20];
		for(int i=1; i<=10;i++) {
			for(int j=1; j<=10;j++) {
				a[i][j]= i*j;
				System.out.printf("%4d", a[i][j]);
			}
		System.out.println("");
		}
			
		
		
				
		

	}

}
