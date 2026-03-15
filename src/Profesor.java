// Clase Profesor: otra clase derivada que hereda de Persona

public class Profesor extends Persona {

    private String materia;

    // Constructor
    public Profesor(String nombre, int edad, String materia) {

        super(nombre, edad); // llama al constructor de Persona

        this.materia = materia;
    }

    // Getter
    public String getMateria() {
        return materia;
    }

    // Setter
    public void setMateria(String materia) {
        this.materia = materia;
    }

    // Método para mostrar información
    public void mostrarProfesor() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Materia: " + materia);
    }
}
