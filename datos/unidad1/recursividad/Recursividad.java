package datos.unidad1.recursividad;
import java.util.Scanner;

public class Recursividad {
		
	public static void saludo(int total, String nombre){

		if(total <= 0) //condicion base
			return;
		else{	//condicion recrsiva o repetitiva
			System.out.println("Hola"+ " " + nombre);			
			saludo(total -1,nombre);
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

        	System.out.print("Ingresa un nombre: ");
        	String nombre = sc.nextLine(); 
		saludo(10, nombre);
	}
}