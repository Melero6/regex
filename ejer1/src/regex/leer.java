package regex;

import java.io.IOException;
import java.lang.Thread;
import java.util.Scanner;

public class leer {
	
	private static boolean error=false;
	
	public static int entero() throws InterruptedException{
		int num=0,vuelta=0;
		boolean salir;
		
		Scanner teclado=new Scanner(System.in);
		do{

			try{
				if(vuelta==4)
					System.out.println("Queda un intento:");
				
				salir=true;
				System.out.println("Escribe un numero");
				num=teclado.nextInt();

			}
			catch(java.util.InputMismatchException e){
				vuelta++;
				salir=false;
				teclado=new Scanner(System.in);

			}
			finally{
				System.gc();
				Thread.sleep(100);
			}


		} while(!salir&&vuelta<5);
		if(vuelta==4){
			error=true;
			System.exit(1);
		}
			
		
		return num;
	}
	
	
	public static double decimal() throws InterruptedException{
		int vuelta=0;
		double num=0;
		boolean salir;
		
		Scanner teclado=new Scanner(System.in);
		do{

			try{
				if(vuelta==4)
					System.out.println("Queda un intento:");
				
				salir=true;
				System.out.println("Escribe un decimal");
				num=teclado.nextDouble();

			}
			catch(java.util.InputMismatchException e){
				vuelta++;
				salir=false;
				teclado=new Scanner(System.in);

			}
			finally{
				System.gc();
				Thread.sleep(100);
			}


		} while(!salir&&vuelta<5);
		if(vuelta==4){
			error=true;
			System.exit(1);
		}
		
		return num;
	}
	
	public static boolean booleano() throws InterruptedException{
		int vuelta=0;
		boolean salir,num=false;
		
		Scanner teclado=new Scanner(System.in);
		do{

			try{
				if(vuelta==4)
					System.out.println("Queda un intento:");
				
				salir=true;
				System.out.println("Escribe un booleano");
				num=teclado.nextBoolean();

			}
			catch(java.util.InputMismatchException e){
				vuelta++;
				salir=false;
				teclado=new Scanner(System.in);

			}
			finally{
				System.gc();
				Thread.sleep(100);
			}


		} while(!salir&&vuelta<5);
		if(vuelta==4){
			error=true;
			System.exit(1);
		}
		
		return num;
	}


	public static boolean isError() {
		return error;
	}
}
