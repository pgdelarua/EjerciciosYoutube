
public class UsoArraysVideo24 {

	public static void main(String[] args) {
		String pa�ses[]=new String[8];
		pa�ses[0]="Espa�a";
		pa�ses[1]="M�xico";
		pa�ses[2]="Colombia";
		pa�ses[3]="Per�";
		pa�ses[4]="Chile";
		pa�ses[5]="Argentina";
		pa�ses[6]="Ecuador";
		pa�ses[7]="Venezuela";
		
		/*for(int i=0;i<pa�ses.length;i++) {
			System.out.println("Pa�s: " + (i+1)+ " "+ pa�ses[i]);
		} SE PUEDE HACER OTRO TIPO DE BUCLE FOR*/
		for(String elemento:pa�ses) {
			System.out.println(elemento);
		}
	}

}
