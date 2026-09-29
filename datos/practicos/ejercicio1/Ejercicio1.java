public class Ejercicio1{

	static int K = 2; // <-- Ultimo digito de mi matricula es: 1 + 1 = 2

	public static void main(String[] args){

		System.out.println("FASE 1: ARREGLO UNIDIMENSIONAL");
		fase1();

		System.out.println();
		System.out.println("FASE 2: ARREGLO BIDIMENSIONAL");
		fase2();

		System.out.println();
		System.out.println("FASE 3: ARREGLO TRIDIMENSIONAL");
		fase3();
	}

	// FASE 1
	public static void fase1(){

		int[] lecturas = {10, -5, 20, K * 2, -1, 30, 0, 15};

		//Se corrigio el for agegandole un -1 al lecturas.length para iniciar en el ultimo elemento del arreglo.
		for (int i = lecturas.length - 1; i >= 0; i--) {
			if (lecturas[i] > 0) {
				System.out.println("Lectura positiva: " + lecturas[i]);
			}
		}
	}

	// Explicación del error: Java indexa los arreglos desde 0, por lo tanto el
	// .length cuenta el total de elementos, en este caso 8, pero el índice 8 no
	// existe en el arreglo (los índices van del 0 al 7). Por eso el bucle original
	// lanza ArrayIndexOutOfBoundsException, porque empieza en i = lecturas.length.
	// Para corregirlo le restamos 1 al .length, así el bucle empieza en el último
	// índice del arreglo, en este caso 7.

	// FASE 2
	public static void fase2(){

		int suma = 0;

		// CÓDIGO A CORREGIR - FASE 2
		// Matriz de 3 filas con columnas de tamaño variable
		int[][] ventas = new int[3][];

		ventas[0] = new int[K];       // Vendedor 1
		ventas[1] = new int[K + 1];   // Vendedor 2
		ventas[2] = new int[2];       // Vendedor 3

		// Error: Intentan llenar la matriz como si fuera rectangular (4x4)
		for (int i = 0; i < ventas.length; i++) {
			for (int j = 0; j < ventas[i].length; j++) {
				ventas[i][j] = (i + 1) * (j + 1);
				suma += ventas[i][j];
			}
		}
		System.out.println("Suma total: " + suma);
	}

	// Explicación del error: El bucle estaba mal ya que daba por echo de que era una matriz de 4x4 cuando no era asi, ya que las filas tenian diferente tamaño por la variable k, asi que cuando recorrio un numero mayor al numero de filas marcaba error ya que no existia esa posicion en la matriz, asi que cambie el 4 por ventas[i].length para que diera el numero real de cada fila.

	//TAREA 2.3: ¿Cuál es la ventaja de memoria de un Jagged Array sobre una matriz tradicional de N x M cuando los datos de cada fila no son homogéneos?
	// La ventaja es que el jagged no desperdicia memoria, por que cada fila tiene los espacios de necesita y en una matriz normal todas las filas tendrian en mismo tamaño, y esto causa que dejen espacios vacios que ocupan memoria.


	// FASE 3
	public static void fase3(){

		int[][][] cubo = new int[2][K][K];

		// Lleno el cubo con la fórmula i + j + k + 1
		for (int i = 0; i < 2; i++)
			for (int j = 0; j < K; j++)
				for (int k = 0; k < K; k++)
					cubo[i][j][k] = i + j + k + 1;

		int i = 0;
		while (i < 2) {
			for (int j = 0; j < K; j++) {
				for (int k = 0; k < K; k++) {
					if (cubo[i][j][k] % 3 == 0) {
						System.out.println("Múltiplo encontrado en: " + i + "," + j + "," + k);
					}
				}
			}
			i++; // esto faltaba: sin esto i nunca sube y el ciclo no termina
		}
	}
}

	// TAREA 3.1: El while se quedaba en un bucle infinito porque la i empezaba en 0
	// y nunca subia de valor, entonces la condicion i < 2 siempre era verdadera.
	// Lo arregle agregando i++ al final del while para que la i fuera aumentando.

	// Aqui cambie los indices i, j, k por variables que toman cada parte del cubo:
	// plano (una matriz 2D), fila (un arreglo 1D) y valor (cada numero). Como ya no
	// uso indices, imprimo el valor y no la posicion. Tambien ya no necesito i++,
	// asi que no hay riesgo de que se haga un bucle infinito.

	// TAREA 3.3: La limitacion es que en el for-each la variable valor es solo una
	// copia del numero del arreglo, no el numero original. Si hago valor = valor * 2
	// solo cambio la copia y el arreglo sigue igual. Ademas no puedo saber en que
	// posicion (i, j, k) estoy, asi que no puedo decirle donde guardar un dato nuevo.
	// Por eso, si quiero modificar los valores, tengo que usar el for normal con
	// indices, por ejemplo cubo[i][j][k] = ... y listo.
