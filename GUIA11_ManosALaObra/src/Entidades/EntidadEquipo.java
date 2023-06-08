package Entidades;

import java.util.ArrayList;

public class EntidadEquipo {

    
    private String team;
    private ArrayList <EntidadPersona> jugadores;

    public EntidadEquipo() {
    }

    public EntidadEquipo(String team, ArrayList<EntidadPersona> jugadores) {
        this.team = team;
        this.jugadores = jugadores;
    }

    public String getTeam() {
        return team;
    }

    public ArrayList<EntidadPersona> getJugadores() {
        return jugadores;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setJugadores(ArrayList<EntidadPersona> jugadores) {
        this.jugadores = jugadores;
    }

 
    @Override
    public String toString() {
        return "EntidadEquipo{" + "team=" + team + ", jugadores=" + jugadores + '}';
    }

}
