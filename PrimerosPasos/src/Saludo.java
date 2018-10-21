
public class Saludo{

public static void main (String args[] ) { //método main
System.out.println("¨Hawariu?");
respuesta rpt = new respuesta(); //llamada a clase: crear instancia
rpt.respuesta();
}

 static class respuesta { //clase con método
 static void respuesta() { //el método
 System.out.println("Wuel!");
 }
 } 
}
