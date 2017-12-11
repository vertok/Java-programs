package mein.paket;

public class Schleifen {
	
	public static void leseSwitch(int Zahl) {
		String s="" + Zahl;  // wandelt int ins String
		for(int i=s.length()-1; i>=0; i--)
		{
			switch(s.charAt(i)) {
			case '1':{ 
				System.out.print("eins ");
				break;
			}
			case '2':{ 
				System.out.print("zwei ");
				break;
			}
			case '3':{ 
				System.out.print("drei ");
				break;
			}
			case '4':{ 
				System.out.print("vier ");
				break;
			}
			case '5':{ 
				System.out.print("fuenf ");
				break;
			}
			case '6':{ 
				System.out.print("sechs ");
				break;
			}
			case '7':{ 
				System.out.print("sieben ");
				break;
			}
			case '8':{ 
				System.out.print("acht ");
				break;
			}
			case '9':{ 
				System.out.print("nein ");
				break;
			}
			case '0':{ 
				System.out.print("zero ");
				break;
			}
			default:{
				System.out.print("Eine ungueltige Eingabe ");
				break;
			}
			
			
			}
			
		}

	}
	public static void main(String[] args) {
		leseSwitch(123509);

	}

}
