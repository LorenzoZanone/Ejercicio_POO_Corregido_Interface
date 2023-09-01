/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorevision;

/**
 * Pantalon realizado por Lorenzo
 *
 * @author ET36
 */
public class Pantalon extends Producto {

    private Opc talle;
    private String modelo;
    private String desc;
    private double precio;

    public Pantalon(Opc talle, String modelo, String desc, double precio) {
        super(desc, precio);
        this.desc = desc;
        this.precio = precio;
        this.talle = talle;
        this.modelo = modelo;
    }

    public double getPrecio() {
        double precio2 = 0;
        if ("Oxford".equalsIgnoreCase(modelo)) {
            precio2 = precio + (precio * 15 / 100);

        } else if ("Skinny".equalsIgnoreCase(modelo)) {
            precio2 = precio + (precio * 25 / 100);
        } else if ("Recto".equalsIgnoreCase(modelo)) {
            precio2 = precio - (precio * 15 / 100);
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
        this.desc = desc;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

  

}
