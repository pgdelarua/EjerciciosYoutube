import javax.swing.JOptionPane;
public class EmailVideo21 {

public static void main(String[] args) {
 boolean arroba=false;
 String correo=JOptionPane.showInputDialog("Introduce tu correo");
 	for(int i=0; i<correo.length(); i++) {
 		if (correo.charAt(i)=='@') { //El m�todo char s�lo admite comilla simple
 			arroba=true;
 		}
 	}
 	if (arroba==true){
 		System.out.println("Es correcto");
 	}
 	else {
 		System.out.println("No es correcto");
 	}
}
}