package ProgramaMutante;
import personas.Persona;
import poderes.IPower;
import poderes.PoderPiedras;
import poderes.PoderSalud;
import poderes.PoderFuego;
import poderes.PoderHielo;
import poderes.PoderRayo;
import profesiones.Musico;
import profesiones.Policia;
import profesiones.Barrendero;
import profesiones.Bombero;
import profesiones.Profesor;

public class quickstart {
    public static void main(String[] args) {
        System.out.println("Hello clase de Poo");

        Persona jordan = new Persona();
        Persona p1 = new Persona("Juanito Perez", (byte ) 22);


        System.out.println(jordan.getNombre());
        jordan.cantar();

         System.out.println("---------------------");

        String nombreResultado = p1.getNombre();
        System.out.println(nombreResultado);
        p1.cantar();


        System.out.println("edad de "+ jordan.getNombre()+ jordan.getEdad());
        jordan.setEdad ((byte)18);
        System.out.println("edad de "+ jordan.getNombre()+ jordan.getEdad());
    
        System.out.println("---------------------");

        Persona xyz = p1;

       
        System.out.println("edad de "+ p1.getNombre()+ p1.getEdad());
        System.out.println("edad de "+ xyz.getNombre()+ xyz.getEdad());

        xyz.setEdad ((byte )27);
        System.out.println("edad de "+ xyz.getNombre()+ xyz.getEdad());




        Persona personajesNuevos[] = new Persona[5];

        // Todos los poderes disponibles, incluidos los nuevos
        IPower todosLosPoderes[] = {
            new PoderSalud(),
            new PoderPiedras(),
            new PoderFuego(),
            new PoderHielo(),
            new PoderRayo()
        };

        for (int i = 0; i < personajesNuevos.length; i++) {
            // se elige una profesion al azar entre las 5
            int tipoProfesion = (int)(Math.random() * 5);
            switch (tipoProfesion) {
                case 0:
                    personajesNuevos[i] = new Musico("Musico " + i, "Cancion " + i);
                    break;
                case 1:
                    personajesNuevos[i] = new Policia("Policia " + i, 30 + i);
                    break;
                case 2:
                    personajesNuevos[i] = new Barrendero("Barrendero " + i, "Zona " + i);
                    break;
                case 3:
                    personajesNuevos[i] = new Bombero("Bombero " + i, "Estacion " + i);
                    break;
                default:
                    personajesNuevos[i] = new Profesor("Profesor " + i, "Materia " + i);
            }

            // se le asigna un poder al azar entre todos los disponibles
            int poderAleatorio = (int)(Math.random() * todosLosPoderes.length);
            personajesNuevos[i].setPower(todosLosPoderes[poderAleatorio]);
        }

        for (Persona p : personajesNuevos) {
            System.out.println("Ataca " + p.getClass().getSimpleName());
            p.atacar();
        }

    }

}

