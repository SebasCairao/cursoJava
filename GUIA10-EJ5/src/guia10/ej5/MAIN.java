package guia10.ej5;

import EntidadPais.EntidadPais;
import ServicioPais.ServicioPais;
import java.util.HashSet;

public class MAIN {

    public static void main(String[] args) {

        ServicioPais s1 = new ServicioPais();
        //HashSet<EntidadPais> listaOrdenada = s1.getListaPais();
        
        
        
        s1.agregarPais();
        s1.mostrar();
        //s1.ordenarPaises(listaOrdenada);
        s1.ordenarPaises();
        
      



    }

}
