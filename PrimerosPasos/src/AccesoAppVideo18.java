import javax.swing.*;
public class AccesoAppVideo18 {

	public static void main(String[] args) {
		String clave="Pablo";
		String password="";
		while(clave.equals(password)==false) {
			password=JOptionPane.showInputDialog("Introduce la contraseña, por favor");//Jopti... almacena el nombre introducido en la variable password si se acertara se abandonaría el bucle while
			if (clave.equals(password)==false) {
				System.out.println("Contraseña incorrecta");
			}
			
		}
		System.out.println("Contraseña correcta. Acceso permitido.");
	}

}
