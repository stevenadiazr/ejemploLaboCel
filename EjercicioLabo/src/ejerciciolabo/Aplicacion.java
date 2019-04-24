/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolabo;

/**
 *
 * @author UCA
 */
public class Aplicacion {
    private String nombre;
    private int tamaño;

    public Aplicacion() {
    }

    public Aplicacion(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public static void ejecutar(String nombreApp){
        
    }
    
    public static void getApps(){
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
