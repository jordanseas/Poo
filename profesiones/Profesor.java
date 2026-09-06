package profesiones;
import personas.Persona;

public class Profesor extends Persona {

    private String name;
    private String materia;

    public Profesor(String pName, String pMateria) {
        this.name = pName;
        this.materia = pMateria;
    }

    // Acción 1: el profesor da una clase
    public void darClase() {
        System.out.println(name + " está dando la clase de " + materia);
    }

    // Acción 2: el profesor califica un examen
    public void calificarExamen(String estudiante, int nota) {
        System.out.println(name + " le puso " + nota + " a " + estudiante + " en " + materia);
    }

    public static void main(String[] args) {
        Profesor p = new Profesor("Rodrigo", "Estructuras de Datos");
        p.darClase();
        p.calificarExamen("Jordan", 95);
    }
}
