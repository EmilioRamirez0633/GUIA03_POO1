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
public class Valoresconf {
    private String precioR;
    private String precioE;
    private String precioD;
    private String galonesR;
    private String galonesE;
    private String galonesD;

    public String getPrecioR() {
        return precioR;
    }

    public void setPrecioR(String precioR) {
        this.precioR = precioR;
    }

    public String getPrecioE() {
        return precioE;
    }

    public void setPrecioE(String precioE) {
        this.precioE = precioE;
    }

    public String getPrecioD() {
        return precioD;
    }

    public void setPrecioD(String precioD) {
        this.precioD = precioD;
    }

    public String getGalonesR() {
        return galonesR;
    }

    public void setGalonesR(String galonesR) {
        this.galonesR = galonesR;
    }

    public String getGalonesE() {
        return galonesE;
    }

    public void setGalonesE(String galonesE) {
        this.galonesE = galonesE;
    }

    public String getGalonesD() {
        return galonesD;
    }

    public void setGalonesD(String galonesD) {
        this.galonesD = galonesD;
    }

    public Valoresconf(String precioR, String precioE, String precioD,String galonesR,String galonesE,String galonesD) {
        this.precioR = precioR;
        this.precioE = precioE;
        this.precioD = precioD;
        this.galonesR = galonesR;
        this.galonesE = galonesE;
        this.galonesD = galonesD;
    }
}
