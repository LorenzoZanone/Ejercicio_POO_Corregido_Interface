/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorevision;

/**
 * Producto realizado por Mel
 * Interface realizada por Lorenzo y Lautaro
 * @author ET36
 */
public abstract class Producto {

    protected String desc;
    protected double precio;
    protected static int codigo;

    public Producto(String desc, double precio) {
        this.desc = desc;
        this.precio = precio;
        this.codigo = codigo++;
    }

    @Override
    public String toString() {
        return this.desc + "........ $ " + this.getPrecio() ;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract double getPrecio();

    public void setPrecio(double precio) {
        this.precio = precio;
    }




}
