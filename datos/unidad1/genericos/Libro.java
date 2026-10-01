package datos.unidad1.genericos;

public class Libro extends Producto<Integer> {

    public Libro(String nombre, double precio, Integer paginas) {
        super(nombre, precio, paginas);
    }

    @Override
    public void mostrarDetalles() {
        String datos = "Nombre: " + super.nombre + "\nPrecio: " + super.precio + "\nPaginas: " + super.getExtra();

	 System.out.println(datos);
    }
}
