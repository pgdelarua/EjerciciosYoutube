import javax.swing.*;
public class AccesoAppVideo18 {

	public static void main(String[] args) {
		String clave="Pablo";
		String password="";
		while(clave.equals(password)==false) {
			password=JOptionPane.showInputDialog("Introduce la contrase�a, por favor");//Jopti... almacena el nombre introducido en la variable password si se acertara se abandonar�a el bucle while
			if (clave.equals(password)==false) {
				System.out.println("Contrase�a incorrecta");
			}
			
		}
		System.out.println("Contrase�a correcta. Acceso permitido.");
	}

}
