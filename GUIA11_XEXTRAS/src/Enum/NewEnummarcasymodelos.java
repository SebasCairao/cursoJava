/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/**
 *
 * @author Seba
 */
public enum NewEnummarcasymodelos {
    

    
    
    V1("PEUGEOT","208",1988),
    V2("WW","GOLD",2003),
    V3("MECEDES","CHIQUITO",2001),
    V4("HONDA","TITAN",2022),
    V5("YAMAHA","YBR",1997),
    V6("APACHE","ay-64",1970),
    V7("MENEMCOPTER","AY-1447782SDGG",2059);
    

    
    private final String marca;
    private final String modelo;
    private final Integer anio;



private NewEnummarcasymodelos (String marca,String modelo,Integer anio){

this.marca = marca;
this.modelo = modelo;
this.anio = anio;


}







    
    
}
