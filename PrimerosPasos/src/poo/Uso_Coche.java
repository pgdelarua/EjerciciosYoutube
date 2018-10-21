package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		//Coche Renault=new Coche(); //INSTANCIAR UNA CLASE/EJEMPLAR DE CLASE(NOMBRE DE LA CLASE+ NOMBRE= NEW + MÉTODO CONSTRUCTOR) .El primer objeto que voy a crear pertenece a la clase coche
		//Renault.ruedas=3; Podría dar el valor que quisiera al no encapsular el int ruedas
		//System.out.println("Este coche tiene " + Renault.ruedas + " ruedas."); YA no se puede usar porque el int ruedas es privado
		//System.out.println(Renault.decir_longitud());
	
	
	    Coche micoche=new Coche();
	    micoche.DimeColor();
	    System.out.println(micoche.dime_color());
	}
}



