
public class Saludo{

public static void main (String args[] ) { //m�todo main
System.out.println("�Hawariu?");
respuesta rpt = new respuesta(); //llamada a clase: crear instancia
rpt.respuesta();
}

 static class respuesta { //clase con m�todo
 static void respuesta() { //el m�todo
 System.out.println("Wuel!");
 }
 } 
}
