package profesiones;
import personas.Persona;

public class Barrendero extends Persona {

    private String name;
    private String zona;

    public Barrendero(String pName, String pZona) {
        this.name = pName;
        this.zona = pZona;
    }

    // Acción 1: el barrendero barre la calle
    public void barrer() {
        System.out.println(name + " está barriendo la zona " + zona);
    }

    // Acción 2: el barrendero recoge la basura
    public void recogerBasura() {
        System.out.println(name + " está recogiendo la basura de " + zona);
    }

    public static void main(String[] args) {
        Barrendero b = new Barrendero("Pedro", "Centro");
        b.barrer();
        b.recogerBasura();
    }
}
