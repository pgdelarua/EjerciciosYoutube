
public class ManipulaCadenas2 {
	public static void main (String args []) {
String frase="Hoy es un buen d�a para programar";
String frase_resumen=frase.substring(0, 18) + " para gosaaaaar."; //EL M�TODO SUBSTRING NOS PERMITE SACAR FRAGMENTOS DE TEXTO(empezaremos se�alando desde cual empieza a extraer hasta el puesto que no queremos que extraiga
	System.out.println(frase_resumen);								//puedo concatenar texto tmb y m�s substrings
	}
}