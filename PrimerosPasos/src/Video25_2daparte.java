
public class Video25_2daparte {

	public static void main(String[] args) {
	
			double acumulado;
			double inter�s=0.10;
			
			double[][] saldo=new double[6][5];
			 for (int i=0;i<6;i++) {
				 saldo [i][0]=10000; //ya que la segunda dimensi�n empieza en 10000 siempre en este ejemplo
				 acumulado=10000;
				 for(int j=1;j<5;j++) {  //empieza en uno porque ya hemos rellenado j=0 d�ndole como valor 10000
					 acumulado=acumulado+(acumulado*inter�s);
					 saldo [i][j]=acumulado;
					 
				 }
				 inter�s=inter�s+0.01;
			 }
			 for (int z=0; z<5; z++) { 
				 System.out.println();
				 for (int h =0; h<6; h++) { 
					 System.out.printf("%1.2f", saldo[h][z]); 
					 System.out.print(" "); } 
				 
				
			 	
				}
			 }
	}
