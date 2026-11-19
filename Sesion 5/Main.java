public class Main {

    public static void main(String[] args) {

        // ===== VARIABLES PRIMITIVAS (viven directamente en el frame de main) =====
        int semestre = 3;
        double notaMinima = 3.0;
        boolean activo = true;

        // ===== CREACIÓN DE OBJETOS (referencia en Stack, objeto en Heap) =====
        Estudiante estudiante1 =
                new Estudiante("Laura", 21, 4.2);

        Estudiante estudiante2 =
                new Estudiante("Carlos", 23, 3.8);

        // ===== DOS REFERENCIAS AL MISMO OBJETO =====
        Estudiante copia = estudiante1;
        copia.setPromedio(4.7);

        System.out.println("Promedio vía estudiante1: "
                + estudiante1.getPromedio());
        System.out.println("Promedio vía copia: "
                + copia.getPromedio());

        // ===== LLAMADA A MÉTODO (se crea un nuevo frame) =====
        procesarEstudiante(estudiante2);

        // ===== REFERENCIAS NULL =====
        estudiante1 = null;
        copia = null;

        // Sugerencia a la JVM para ejecutar el Garbage Collector
        System.gc();

        // ===== RETO: PRODUCTOS =====
        retoProductos();

        System.out.println("Programa finalizado.");
    }

    public static void procesarEstudiante(Estudiante estudiante) {
        int puntosExtra = 1;
        double nuevoPromedio = estudiante.getPromedio() + 3.8;
        estudiante.setPromedio(nuevoPromedio);
        estudiante.mostrarDatos();
        System.out.println("Puntos extra: " + puntosExtra);
    }

    // ---------- Reto de programación (sección 17) ----------
    public static void retoProductos() {
        // a) Tres productos
        Producto producto1 = new Producto(101, "Portátil", 2500000);
        Producto producto2 = new Producto(102, "Mouse", 45000);
        Producto producto3 = new Producto(103, "Teclado", 120000);

        // b) Segunda referencia al primer producto
        Producto alias = producto1;

        // c) Modificar el precio con la segunda referencia
        alias.setPrecio(2300000);

        // d) Comprobar con la primera referencia
        System.out.println("Precio vía producto1: " + producto1.getPrecio());
        System.out.println("Precio vía alias: " + alias.getPrecio());

        // e-f) Método actualizarPrecio (entrar con Step Into)
        actualizarPrecio(producto2, 50000);
        producto2.mostrarDatos();
        producto3.mostrarDatos();

        // i) null a ambas referencias del primer producto
        producto1 = null;
        alias = null;
    }

    public static void actualizarPrecio(Producto producto, double nuevoPrecio) {
        double precioAnterior = producto.getPrecio();
        producto.setPrecio(nuevoPrecio);
        System.out.println("Precio actualizado de " + precioAnterior
                + " a " + nuevoPrecio);
    }
}
