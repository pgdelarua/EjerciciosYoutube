
public class ManipulaCadenas2 {
	public static void main (String args []) {
String frase="Hoy es un buen día para programar";
String frase_resumen=frase.substring(0, 18) + " para gosaaaaar."; //EL MÉTODO SUBSTRING NOS PERMITE SACAR FRAGMENTOS DE TEXTO(empezaremos señalando desde cual empieza a extraer hasta el puesto que no queremos que extraiga
	System.out.println(frase_resumen);								//puedo concatenar texto tmb y más substrings
	}
}