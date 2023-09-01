/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorevision;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Venta realizada por Lorenzo
 * @author ET36
 */
public class Venta {

    private ArrayList<Producto> producto = new ArrayList<Producto>();
    private Cliente cliente;
    private static int cantVentas = 1090;
    private int nroFact;
    private LocalDate fecha;

    public Venta(LocalDate fecha, Cliente cli) {
        int cont = 0;
        this.fecha = fecha;
        cantVentas++;
        nroFact = cantVentas;
        this.cliente=cli;

    }

    public void agregarProducto(Producto p) {
        producto.add(p);
    }

    public double calcularImporte() {
        double importe = 0;
        for (Producto p : producto) {
            importe = importe + p.getPrecio();
        }
        return importe;
    }

    public void ImprimirFactura() {
        System.out.println("Factura Nº" + nroFact + "-" + fecha);

        System.out.println("");
        System.out.println(cliente.toString());
        for (Producto p : producto) {
            System.out.println(  p.toString());

        }
        System.out.println("Total a pagar:" + "$" + calcularImporte());
    }

}
