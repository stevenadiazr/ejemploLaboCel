/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciolabo;

import java.util.ArrayList;

/**
 *
 * @author UCA
 */
public class Telefono {
    private String numeroTelefono;
    private double credito;
    private int almacenamiento;
    private ArrayList<Aplicacion> listaApps;
    private Compania compania;
    
    public Telefono(){
        
    }
    
    public Telefono(String numeroTelefono, double credito, int almacenamiento, ArrayList<Aplicacion> listaApps, Compania compania){
        this.numeroTelefono = numeroTelefono;
        this.credito = credito;
        this.almacenamiento = almacenamiento;
        this.listaApps = listaApps;
        this.compania = compania;
        listaApps = new ArrayList<>();
    }
    
    public static void llamar(String numero){
        System.out.println("LLamada realizada al numero " + numero);
    }
    
    public void instalarApp(Aplicacion aplicacion){
        listaApps.add(aplicacion);
    }
    
    public void desinstalarApp(String nombre){
        for(int i = 0; i < listaApps.size(); i++){
            if (nombre == listaApps.get(i).getNombre()){
                listaApps.remove(i);
                break;
            }
        }
        System.out.println("No se encontro la app.");
    }
    
    public String consultarNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public double consultarCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public ArrayList<Aplicacion> mostrarListaApps() {
        return listaApps;
    }

    public void setListaApps(ArrayList<Aplicacion> listaApps) {
        this.listaApps = listaApps;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }
    
}
