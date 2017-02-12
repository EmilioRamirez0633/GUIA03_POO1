/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

/**
 *
 * @author leyes
 */
public class Valores {

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGalo() {
        return galo;
    }

    public void setGalo(String galo) {
        this.galo = galo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private String tipo;
    private String galo;
    private String nombre;

    public Valores(String tipo, String galo, String nombre) {
        this.tipo = tipo;
        this.galo = galo;
        this.nombre = nombre;
    }

}
