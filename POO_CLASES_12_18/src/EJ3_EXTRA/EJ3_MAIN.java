package EJ3_EXTRA;

public class EJ3_MAIN {

    public static void main(String[] args) {

        System.out.println("Bienvenido Jugador 1, el Jugador 2 ingreso su numero");
        System.out.println("-----------------------");

        Juego j1 = new Juego();

        
        j1.juegoGo();

        System.out.println("Bienvenido Jugador 2, el Jugador 1 ingreso su numero");
        System.out.println("-----------------------");

        Juego j2 = new Juego();

        
        j2.juegoGo();

        System.out.println("---------------------------");
        System.out.println(" Jugador 1: " + j1.win2);
        System.out.println(" Jugador 2: " + j2.win2);
        System.out.println("---------------------------");
        
        if (j1.win2 > j2.win2) {
            System.out.println("GANO 1");
        }else{
            System.out.println("GANO 2");
            
        }

    }

}
