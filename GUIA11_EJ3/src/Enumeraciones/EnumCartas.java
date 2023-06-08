
package Enumeraciones;

public enum EnumCartas {
  
    UNO_ORO(1, "Oro"),
    DOS_ORO(2, "Oro"),
    TRES_ORO(3, "Oro"),
    CUATRO_ORO(4, "Oro"),
    CINCO_ORO(5, "Oro"),
    SEIS_ORO(6, "Oro"),
    SIETE_ORO(7, "Oro"),
    SOTA_ORO(10, "Oro"),
    CABALLO_ORO(11, "Oro"),
    REY_ORO(12, "Oro"),
    UNO_COPAS(1, "Copas"),
    DOS_COPAS(2, "Copas"),
    TRES_COPAS(3, "Copas"),
    CUATRO_COPAS(4, "Copas"),
    CINCO_COPAS(5, "Copas"),
    SEIS_COPAS(6, "Copas"),
    SIETE_COPAS(7, "Copas"),
    SOTA_COPAS(10, "Copas"),
    CABALLO_COPAS(11, "Copas"),
    REY_COPAS(12, "Copas"),
    UNO_ESPADAS(1, "Espadas"),
    DOS_ESPADAS(2, "Espadas"),
    TRES_ESPADAS(3, "Espadas"),
    CUATRO_ESPADAS(4, "Espadas"),
    CINCO_ESPADAS(5, "Espadas"),
    SEIS_ESPADAS(6, "Espadas"),
    SIETE_ESPADAS(7, "Espadas"),
    SOTA_ESPADAS(10, "Espadas"),
    CABALLO_ESPADAS(11, "Espadas"),
    REY_ESPADAS(12, "Espadas"),
    UNO_BASTOS(1, "Bastos"),
    DOS_BASTOS(2, "Bastos"),
    TRES_BASTOS(3, "Bastos"),
    CUATRO_BASTOS(4, "Bastos"),
    CINCO_BASTOS(5, "Bastos"),
    SEIS_BASTOS(6, "Bastos"),
    SIETE_BASTOS(7, "Bastos"),
    SOTA_BASTOS(10, "Bastos"),
    CABALLO_BASTOS(11, "Bastos"),
    REY_BASTOS(12, "Bastos");

    private final int valor;
    private final String palo;
    
    
//contructor
    private EnumCartas(int valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }
}
