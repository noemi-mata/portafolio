package datos.unidad1.genericos;

public class MainGenericos {

    public static void main(String[] args) {

        Producto<?>[] inventario = new Producto<?>[4];

        inventario[0] = new Libro("Java Básico 1", 299.99, 350);
        inventario[1] = new Libro("Java Básico 2", 299.99, 350);
        inventario[2] = new Electronico("Laptop Lenovo", 15999.99, "1 año");
        inventario[3] = new Electronico("Mouse Logitech", 599.99, "6 meses");

        for (Producto<?> p : inventario) {
            p.mostrarDetalles();
        }
    }
}

