package profesiones;
import personas.Persona;

public class Policia extends Persona {
    private String name;
    private int armas;

    public Policia(String pName, int pArmas) {
        this.name = pName;
        this.armas = pArmas;
    }

    public int multas(int pSoborno) {
        if (pSoborno >= 10000) {
            System.out.println("Fue un placer negocios");
        } else {
            System.out.println("Puede pagar la multa en la estacion ");
        }
        return pSoborno;
    }

    // Acción 1: el policía patrulla la zona
    public void patrullar() {
        System.out.println(name + " está patrullando la zona");
    }

    // Acción 2: el policía arresta a un sospechoso
    public void arrestar(String sospechoso) {
        System.out.println(name + " está arrestando a " + sospechoso);
    }

}
