/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorevision;

/**
 * Accesorio realizado por Mel
 *
 * @author ET36
 */
public class Accesorio extends Producto implements Importable {

    private double peso;
    private Opc metal;
    private String desc;
    private double precio;

    public Accesorio(double peso, Opc metal, String desc, double precio) {
        super(desc, precio);
        this.desc = desc;
        this.precio = precio;
        this.peso = peso;
        this.metal = metal;
    }

    public double getPrecio() {
        double precio2 = 0;
        if (Opc.oro == metal) {
            precio2 = peso * 100;
        } else if (Opc.plata == metal) {
            precio2 = peso * 50;

        } else if (Opc.acero == metal) {
            precio2 = peso * 25;

        }
        precio2=CalcularArancelAduanero_Transporte(precio2);
        return precio2;

    }

    @Override
    public String toString() {
        return super.toString().concat("Bijouterie");

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

    @Override
    public double CalcularArancelAduanero_Transporte(double precio) {

        double aranceladuanero_transporte = precio + (precio * 12 / 100);
        return aranceladuanero_transporte;
    }

}
