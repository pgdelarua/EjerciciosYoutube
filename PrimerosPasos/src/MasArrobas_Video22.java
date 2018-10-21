import javax.swing.JOptionPane;

public class MasArrobas_Video22{
	public static void main(String args[]) {
	
		int arroba=0;  //cambiamos la variable boolean por una variable de tipo entero y la iniciamos en 0
		boolean punto=false;
			
		String email=JOptionPane.showInputDialog("Introduce tu email");
	for(int i=0; i<email.length(); i++) {
		if (email.charAt(i)=='@') {
			arroba++;		//si al analizar el texto se encuentra con un arroba le indicamos que sume 1 mediante "++"
		}
		if(email.charAt(i)=='.') {
			punto=true;
		}
	}
	if(arroba==1 && punto==true) {            //en vez de preguntarle si tiene arroba le preguntamos si tiene 1 arroba. Resultado que daremos como correcto
		System.out.println("El email es correcto");
	}
	else{
		System.out.println("El email no es correcto");
	}
	}
	}
