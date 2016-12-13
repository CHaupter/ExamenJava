import java.util.*;


/*
Ejercicio 1 Java

@author chaupterperez
@version 1.0

*/
public class Ejercicio1{

	public static void main(String args[]){

		Scanner sc= new Scanner(System.in);

		System.out.println("Introduce un numero:");
		int numero= sc.nextInt();

		System.out.println("Introduce el incremento:");
		int incremento= sc.nextInt();

		System.out.println("Introduce el numero de columnas:");
		int numeroColumnas= sc.nextInt();

		for(int i= 0; i< numeroColumnas;i++){
		

			for(int cont=0; cont <10; cont++){
			int numeroIncrementado= numero + incremento;
		
			System.out.printf("%3d\n", numero);
			
			numero=numeroIncrementado;			
			}
		System.out.println("\t");

		}	



	}



}
