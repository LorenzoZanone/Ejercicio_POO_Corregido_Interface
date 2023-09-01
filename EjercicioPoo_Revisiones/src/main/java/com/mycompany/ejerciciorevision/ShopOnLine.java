/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejerciciorevision;

import java.time.LocalDate;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Main realizado por Lorenzo y Lautaro
 *
 * @author ET36
 */
public class ShopOnLine {

    static int ingresar = 1;

    public static void main(String[] args) {
      
        Cliente cliente = CrearCliente();
        Venta venta = CrearVenta(cliente);

        HacerCompra(cliente, venta);
        venta.ImprimirFactura();
        Ingresar(ingresar);

    }

    public static void Ingresar(int ingresar) {

        while (ShopOnLine.ingresar == 2) {
            ShopOnLine.ingresar = 1;
            Cliente cliente1 = CrearCliente();
            Venta venta1 = CrearVenta(cliente1);
            HacerCompra(cliente1, venta1);
            venta1.ImprimirFactura();

        }

    }

    public static Cliente CrearCliente() {
        String nombre;
        int dni;
        int telefono;
        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        dni = Integer.parseInt(JOptionPane.showInputDialog("Digite su dni"));
        telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero de telefono"));

        Cliente cliente = new Cliente(nombre, dni, telefono);
        return cliente;
    }

    public static Remera CrearRemera(Opc talle, double precio, String desc) {
        Remera remera = new Remera(talle, desc, precio);
        return remera;
    }

    public static Pantalon CrearPantalon(String modelo, double precio, String desc, Opc talle) {
        Pantalon pantalon = new Pantalon(talle, modelo, desc, precio);
        return pantalon;
    }

    public static Accesorio CrearAccesorio(Opc metal, String desc, double peso) {
        Accesorio accesorio = new Accesorio(peso, metal, desc, peso);
        return accesorio;
    }

    public static Venta CrearVenta(Cliente cliente) {
        LocalDate fecha;
        fecha = LocalDate.now();
        Venta venta = new Venta(fecha, cliente);
        return venta;
    }

    public static double CalcularImporte(Venta venta) {
        double importe = venta.calcularImporte();
        return importe;
    }

    public static void ImprimirFactura(Venta venta, double importe) {
        venta.ImprimirFactura();
    }
  
    public static void HacerCompra(Cliente cliente, Venta venta) {
        Opc opcion_enum = null;
    
        int opc = 0;
        String talle;
        double precio;
        String desc;
        
        while (ingresar == 1) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer: 1 - Comprar remeras: - 2 Pantalon - 3 Accesorios"));
            while (opc < 1 || opc > 3) {
                JOptionPane.showMessageDialog(null, "Error ingrese de nuevo");
                opc = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer: 1 - Comprar remeras: - 2 Pantalon - 3 Accesorios"));

            }
            switch (opc) {
                case 1:
                    talle = JOptionPane.showInputDialog("Digite el talle de su remera: S-M-L-XL en mayuscula");
                    precio = Double.parseDouble(JOptionPane.showInputDialog("Digite su precio"));
                    desc = JOptionPane.showInputDialog("Digite la descripcion");
                    opcion_enum = opcion_enum.valueOf(talle);
                    Remera remera = CrearRemera(opcion_enum, precio, desc);

                    venta.agregarProducto(remera);
                     

                    
                    break;
                case 2:
                    String modelo = JOptionPane.showInputDialog("Digite el modelo de su pantalon: a - Oxford -b Skinny - c- Recto");
                    talle = JOptionPane.showInputDialog("Digite el talle de su pantalon: S-M-L-XL en mayuscula");
                    precio = Double.parseDouble(JOptionPane.showInputDialog("Digite su precio"));
                    desc = JOptionPane.showInputDialog("Digite la discripccion");
                    opcion_enum = opcion_enum.valueOf(talle);
                    Pantalon p = CrearPantalon(modelo, precio, desc, opcion_enum);
                    venta.agregarProducto(p);

                    break;
                case 3:
                    String metal = JOptionPane.showInputDialog("Digite el material del accesorio que desea: Oro, Plata o Acero en minuscula");
                    opcion_enum = opcion_enum.valueOf(metal);

                    desc = JOptionPane.showInputDialog("Digite la discripccion");

                    double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite el peso del accesorio en Gramos"));
                    Accesorio accesorio = CrearAccesorio(opcion_enum, desc, peso);
                    venta.agregarProducto(accesorio);

                    break;
                default:
                    break;
            }

            ingresar = Integer.parseInt(JOptionPane.showInputDialog("Que quiere hacer: 1 Seguir comprando(Mismo cliente) - 2 Realizar otra venta- 3 Cerrar cajas"));
            while (ingresar < 1 || ingresar > 3) {
                JOptionPane.showMessageDialog(null, "Error, ingrese de nuevo");
                ingresar = Integer.parseInt(JOptionPane.showInputDialog("Que quiere hacer: 1 - Seguir comprando(Mismo cliente) - 2 Realizar otra venta- 3 Cerrar cajas "));

            }

        }

    }

}
