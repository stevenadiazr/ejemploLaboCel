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
public class Compania {
    private String nombre;
    private int attCliente;
    private double creditoGlobal;

    public Compania() {
    }

    public Compania(String nombre,double creditoGlobal) {
        this.nombre = nombre;
        this.creditoGlobal = creditoGlobal;
    }
    
    public Compania(String nombre) {
        this.nombre = nombre;
        this.creditoGlobal = 1000.00;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAttCliente() {
        return attCliente;
    }

    public void setAttCliente(int attCliente) {
        this.attCliente = attCliente;
    }

    public double getCreditoGlobal() {
        return creditoGlobal;
    }

    public void setCreditoGlobal(double creditoGlobal) {
        this.creditoGlobal = creditoGlobal;
    }
    
    public static ArrayList<Compania> getCompania(){
        Compania c = new Compania("Claro");
        ArrayList<Compania> listaCompanias = new ArrayList<>();
        listaCompanias.add(c);
        listaCompanias.add(new Compania("Tigo"));
        listaCompanias.add(new Compania("Movistar"));
        listaCompanias.add(new Compania("Digicel"));
        return listaCompanias;
    }
}
