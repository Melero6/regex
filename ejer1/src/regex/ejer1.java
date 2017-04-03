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
			System.out.println("-ESCRIBE EL TIPO DE DATO-\n1- Entero\n2- Decimal\n3- Boolean\n4- Salir\n5- NIE");
			selector=teclado.nextInt();
			switch(selector){
			case 1:
				entradai=leer.entero();
				if(leer.isError()){
					System.exit(1);
				}
				else{
					System.out.println(entradai);
				}
				break;
			case 2:
				entradad=leer.decimal();
				if(leer.isError()){
					System.exit(1);
				}
				else{
					System.out.println(entradad);
				}
				break;
			case 3:
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
				letra2=teclado.next();
				
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
	
	

}
