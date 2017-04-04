package regex;

import java.lang.Thread;
import java.util.Scanner;
import java.io.*;
import java.util.regex.*;

public class ejer1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		boolean salir=false,entradab;
		String letra,letra2;
		int selector, entradai=0, numero;
		double entradad=0;
		do{
			System.out.println("-ESCRIBE EL TIPO DE DATO-\n1- Entero\n2- Decimal\n3- Boolean\n4- Salir\n5- NIE\n6- IBAN");
			selector=teclado.nextInt();
			switch(selector){
			case 1:
				System.out.println("Escribe un entero");
				entradai=leer.entero();
				if(leer.isError()){
					System.exit(1);
				}
				else{
					System.out.println(entradai);
				}
				break;
			case 2:
				System.out.println("Escribe un decimal");
				entradad=leer.decimal();
				if(leer.isError()){
					System.exit(1);
				}
				else{
					System.out.println(entradad);
				}
				break;
			case 3:
				System.out.println("Escribe un booleano");
				entradab=leer.booleano();
				if(leer.isError()){
					System.exit(1);
				} 
				else {
					System.out.println(entradab);
				}
				break;
			case 4:
				selector=4;
				break;
			case 5:
				System.out.print("Primera letra del NIE:");
				letra=teclado.next();
				System.out.print("Segunda letra del NIE:");
				letra2=teclado.next();
				
				System.out.print("Numero del NIE:");
				numero=leer.entero();
				
				if(leer.isError())
					System.exit(1);
				
				if (nie(letra,numero,letra2))
					System.out.println("Es correcto");
				
				else
				System.out.println("Es incorrecto");
				
				break;
				
			case 6:
				
				
				System.out.print("Numero IBAN:");
				letra=teclado.next();
				
				if(leer.isError())
					System.exit(1);
				
				if (iban(letra))
					System.out.println("Es correcto");
				
				else
				System.out.println("Es incorrecto");
				
				break;
				
			default:
				System.out.println("Del 1 al 4.");


			}
		} while(selector!=4);
		System.out.println("Fin de programa.");






	}
	
	static boolean nie(String letra,int numero, String letra2){
		boolean estado=false;
		
		String nIE=letra.toUpperCase()+" "+numero+"-"+letra2.toUpperCase();
		Pattern pat=Pattern.compile("[ZXY] \\d{7}-[A-Z]"); 
		Matcher mat=pat.matcher(nIE);
		if(mat.matches()){
			estado=true;
			System.out.println(nIE);
		}
		
		
		return estado;
	}
	
	static boolean iban(String numero){
		boolean estado=false;
		
		
		Pattern pat=Pattern.compile("..(\\d){2}( \\d{4}){4} \\d{4}"); 
		Matcher mat=pat.matcher(numero);
		if(mat.matches()){
			estado=true;
			System.out.println(numero);
		}
		
		
		return estado;
	}
	
	

}
