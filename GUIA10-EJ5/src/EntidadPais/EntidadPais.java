package EntidadPais;

import java.util.Objects;

public class EntidadPais implements /*Interfaz*/ Comparable<EntidadPais> { //Extiendo entidad pais a Comparable

    private String nombrePais;

    public EntidadPais() {
    }

    public EntidadPais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public String toString() {
        return "EntidadPais{" + "nombrePais=" + nombrePais + '}';
    }

    @Override
    public int compareTo(EntidadPais otroPais) {
        return this.nombrePais.compareTo(otroPais.getNombrePais());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.nombrePais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EntidadPais other = (EntidadPais) obj;
        if (!Objects.equals(this.nombrePais, other.nombrePais)) {
            return false;
        }
        return true;

    }
    

}
