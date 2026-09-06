package profesiones;
import personas.Persona;

public class Musico extends Persona {

    private String name;
    private String cancionFav;

    public Musico(String pName, String pCancionFav) {
        this.name = pName;
        this.cancionFav = pCancionFav;
    }

    
    public void cantar() {
        System.out.println(name + " está cantando \"" + cancionFav + "\"");
    }

    // Acción 2: el músico toca un instrumento
    public void tocarInstrumento(String instrumento) {
        System.out.println(name + " está tocando " + instrumento);
    }

    public static void main(String[] args) {
        Musico m = new Musico("Milo J", "Cuando el agua esta hirviendo");
        m.cantar();
        m.tocarInstrumento("guitarra");
    }
}
