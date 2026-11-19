public class Estudiante {

    private String nombre;
    private int edad;
    private double promedio;

    // Constructor: recibe los datos y los guarda en los atributos del objeto
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void mostrarDatos() {
        System.out.println("Estudiante: " + nombre + " | " + edad
                + " años | Promedio: " + promedio);
    }
}
