
public class ArraysBidimensionalesVideo25 {

	public static void main(String[] args) {
		
		int [][] matrix=new int[4][5];//al ser bidimensional se ponen dos corchetes
		
		matrix[0][0]=12;
		matrix[0][1]=41;
		matrix[0][2]=14;
		matrix[0][3]=47;
		matrix[0][4]=52;
		
		matrix[1][0]=35;
		matrix[1][1]=63;
		matrix[1][2]=48;
		matrix[1][3]=98;
		matrix[1][4]=12;
		
		matrix[2][0]=23;
		matrix[2][1]=25;
		matrix[2][2]=34;
		matrix[2][3]=68;
		matrix[2][4]=76;
		
		matrix[3][0]=89;
		matrix[3][1]=87;
		matrix[3][2]=41;
		matrix[3][3]=18;
		matrix[3][4]=99;
		
		for(int i=0;i<4;i++) {    //menor que cuatro porque este primer bucle for se encargará de recorrer  la primera dimensión de la matriz
			System.out.println(); //cuando termina de rellenar j y vuelve a i produce un salto de línea antes de pasar de nuevo con j
		for(int j=0;j<5;j++) {	//menor que cinco porque este bucle for se encargará de recorrer la segunda dimensión desde 0 a 4
			System.out.print(matrix [i][j]+ " ");  //El flujo de lectura es similar a: Río que se introduce en cavidad rellena cavidad y sigue flujo común. Comenzará en i=0 para rellenar después j y poder subir de nuevo a i
		}
			}
	}

}
