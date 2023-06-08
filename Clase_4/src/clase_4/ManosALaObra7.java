
package clase_4;
import java.util.Scanner;
public class ManosALaObra7 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);

    	int TipoMotor;

    	System.out.println("Ingrese una opción");

    	TipoMotor = leer.nextInt();

    	switch (TipoMotor) {
        	case 1:
           System.out.println("La bomba es una bomba de agua = 1");
           break;

        	case 2:
           System.out.println("La bomba es una bomba de gasolina = 2");
            break;
            
                case 3:
           System.out.println("La bomba es una bomba de hormigón = 2");
            break;
                case 4:
           System.out.println("La bomba es una bomba de pasta alimenticia");            
                    

        	default:
           System.out.println("No existe un valor válido para tipo de bomba");
    	}

    }
    
}
