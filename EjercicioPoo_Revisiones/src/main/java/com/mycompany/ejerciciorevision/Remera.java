/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorevision;

/**
 * Remera realizado por Lautaro
 * @author ET36
 */
public class Remera extends Producto {

    private Opc talle;
    private String desc;
    private double precio;

    public Remera(Opc talle, String desc, double precio) {
         super(desc, precio);
        this.desc=desc;
        this.talle = talle;
        this.precio=precio;
    }

   
    public double getPrecio() {
        double precio2=0;
        if (Opc.S==talle) {
         precio2= precio +(precio *5/100) ;
         
        } else if (Opc.M==talle) {
            precio2 = precio + (precio * 10 / 100);
        } else if (Opc.L==talle) {
            precio2 = precio + (precio * 15 / 100);
        } else {
            precio2 = precio + (precio * 20 / 100);
        }

        return precio2;
    }

   
   

    @Override
    public String toString() {
        return super.toString().concat( "talle:" + talle);
    }

    @Override
    public String getDesc() {
        return this.desc;
    }

    @Override
    public void setDesc(String desc) {
        this.desc=desc;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio=precio;
    }

}
