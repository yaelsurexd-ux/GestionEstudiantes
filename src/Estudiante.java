// Clase Estudiante: representa a un estudiante con atributos y métodos
public class Estudiante extends Persona {

    // Atributos de la clase (propiedades del estudiante)
    private String carrera; // Carrera universitaria del estudiante

    // Constructor: se ejecuta al crear un nuevo estudiante
    public Estudiante(String nombre, int edad, String carrera) {
     super(nombre, edad);
        this.carrera = carrera;
    }

    // Getters y Setters: métodos para acceder y modificar los atributos

    public String getNombre() {
        return nombre; // Devuelve el nombre
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // Cambia el nombre
    }

    public int getEdad() {
        return edad; // Devuelve la edad
    }

    public void setEdad(int edad) {
        this.edad = edad; // Cambia la edad
    }

    public String getCarrera() {
        return carrera; // Devuelve la carrera
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera; // Cambia la carrera
    }

    // Método para mostrar toda la información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("------------------------");
    }
}
