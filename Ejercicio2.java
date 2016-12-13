import java.util.*;

public class Ejercicio2{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);
		int cont= 0;	
	
		System.out.println("Introduce una palabra:");
		String palabra= sc.next();
		
		NumeroVocales(palabra);
		cont= NumeroVocales(palabra);	

		System.out.printf("Tiene %d vocal(es)\n", cont);

		
		cont=TieneTilde(palabra);
		
		if(cont==0){
			System.out.printf("La palabra %s no tiene tilde\n", palabra);
		}		
		else{
			System.out.printf("La palabra %s tiene tilde\n", palabra);
		}
		

		Minus(palabra);
		System.out.println(Minus(palabra));
		
		Mayus(palabra);			
		System.out.println(Mayus(palabra));
		}
		

		//Parte 1 del ejercicio
	public static int NumeroVocales(String palabra){
		
		int cont= 0;		
		int longitudPalabra= palabra.length();		
	
		for(int longitud= 0; longitud < longitudPalabra ; longitud++){
		
                        if(palabra.charAt(longitud)=='a' || palabra.charAt(longitud)=='e' || palabra.charAt(longitud)=='i' || palabra.charAt(longitud)=='o' || palabra.charAt(longitud)=='u'){

                                cont+=1;
                                }
                }
		
		
	return cont;
	}


		

		//Parte 2 del ejercicio	

	public static int TieneTilde(String palabra){
		
		int cont= 0;
		int longitudPalabra= palabra.length();
		
		for(int longitud= 0; longitud < longitudPalabra ; longitud++){

                        if(palabra.charAt(longitud)=='á' || palabra.charAt(longitud)=='é' || palabra.charAt(longitud)=='í' || palabra.charAt(longitud)=='ó' || palabra.charAt(longitud)=='ú'){

                                cont+=1;
                                }
                }
		return cont;
	}

		//Parte 3 del ejercicio

	public static String Minus(String palabra){
		return palabra.toLowerCase();	
	}

	public static String Mayus(String palabra){
		return palabra.toUpperCase();
	}
}
