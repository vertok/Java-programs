package mein.paket;

public class Schaltjahr {

	public static void main(String[] args) {
		/*nimmt eingegebene Zahl von Commandozeile
		  und konventiert das in "int" und arbeitet damit weiter*/
		int Jahr=Integer.parseInt(args[0]);
		/*um BREAK zu benutzen brauchen wir eine Schleife z.b. for-Schleife*/
		for(;;) {
			if(Jahr%4==0){
				if(Jahr%100==0)
					if(Jahr%400==0)
						{System.out.println("Schaltjahr!");break;}
					else
						{System.out.println("Nicht Schaltjahr!");break;}
				System.out.println("Schaltjahr!");// wenn nichts mit 100 und 400 zu tun dann folgendes:
			}
			else 
				System.out.println("Nicht Schaltjahr!");
		break;
		}
	}
}
