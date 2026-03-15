import java.util.ArrayList; // Importamos ArrayList para manejar múltiples estudiantes

// Clase principal donde se ejecuta la aplicación
public class Main {
    public static void main(String[] args) {

        // Creamos una lista para almacenar objetos Estudiante
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        // Instanciamos estudiantes con nombre, edad y carrera
        Estudiante estudiante1 = new Estudiante("Ana", 20, "Ingeniería");
        Estudiante estudiante2 = new Estudiante("Luis", 22, "Medicina");
        Estudiante estudiante3 = new Estudiante("Carla", 19, "Derecho");
        
        // Creamos un profesor
        Profesor profesor1 = new Profesor("Dr. García", 50, "Matemáticas");
        
        // Agregamos los estudiantes a la lista
        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante3);

        // Mostramos la información de todos los estudiantes
        System.out.println("=== Lista de Estudiantes ===");
        for (Estudiante e : listaEstudiantes) {
            e.mostrarInformacion();
        }

        // Mostramos la informacion de el profesor
        System.out.println("=== Información del Profesor ===");
        profesor1.mostrarProfesor();

        // Ejemplo de actualización de datos
        estudiante1.setCarrera("Arquitectura"); // Cambiamos la carrera de Ana

        // Mostramos nuevamente la información para verificar cambios
        System.out.println("=== Después de actualizar la carrera de Ana ===");
        estudiante1.mostrarInformacion();
    }
}
