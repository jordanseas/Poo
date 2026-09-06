package profesiones;
import personas.Persona;

public class Bombero extends Persona {

    private String name;
    private String estacion;

    public Bombero(String pName, String pEstacion) {
        this.name = pName;
        this.estacion = pEstacion;
    }

    // Acción 1: el bombero apaga un incendio
    public void apagarIncendio(String lugar) {
        System.out.println(name + " está apagando el incendio en " + lugar);
    }

    // Acción 2: el bombero rescata a una persona
    public void rescatar(String persona) {
        System.out.println(name + " de la estación " + estacion + " está rescatando a " + persona);
    }

    public static void main(String[] args) {
        Bombero b = new Bombero("Carlos", "Estación Norte");
        b.apagarIncendio("el edificio central");
        b.rescatar("un gato");
    }
}
