import javax.swing.JOptionPane;

public class CompruebaEmail_Video21{
	public static void main(String args[]) {
	
		boolean arroba=false;
			String email=JOptionPane.showInputDialog("Introduce tu email");
	for(int i=0; i<email.length(); i++) {
		if (email.charAt(i)=='@') {
			arroba=true;
		}
	}
	if(arroba==true) {
		System.out.println("El email es correcto");
	}
	if(arroba=false){
		System.out.println("El email es falso");
	}
	}
	}
