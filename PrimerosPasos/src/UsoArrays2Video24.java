import javax.swing.*;
public class UsoArrays2Video24 {

	public static void main(String[] args) {
		String pa�ses[]=new String[8];
		for (int i=0;i<8;i++) {
			pa�ses[i]=JOptionPane.showInputDialog("Introduce un pa�s: " + (i+1));
		}
		for (String elemento:pa�ses){
			System.out.println("Pa�s: " + elemento);
		}
	}

}
