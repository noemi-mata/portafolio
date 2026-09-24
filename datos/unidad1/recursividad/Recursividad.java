package datos.unidad1.recursividad;

public class Recursividad {
		
	public static void saludo(int total){
		
		if(total <= 0) //condicion base
			return;
		else{	//condicion recrsiva o repetitiva
			System.out.println("Hola");			
			saludo(total -1);
		}
	}

	public static void main(String[] args){
		saludo(10);
	}
}