/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import controlador.ControladorVentas;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
    ControladorVentas controlador = new ControladorVentas();
    controlador.registrarSucursal("Cristian");
    controlador.registrarSucursal("David");
    controlador.registrarVenta("Cristian", "enero", 1000);
    controlador.registrarVenta("Cristian", "febrero", 1500);
    controlador.registrarVenta("David", "enero", 500);
    controlador.registrarVenta("David", "febrero", 2000);

    System.out.println("===============SUCURSALES===============");
    controlador.imprimirSucursales();
    System.out.println("===Sucursal con mayor venta en el mes===");
    String mes = "febrero";
    String sucursalConMayorVenta = controlador.obtenerSucursalMayorVenta(mes);
    System.out.println("Sucursal con mayor venta en " + mes + ": " + sucursalConMayorVenta);
    System.out.println("==============Total de venta==============");
    double totalVentas = controlador.obtenerTotalVentasAnio("Cristian");
    System.out.println("Mayor venta y valor: " + totalVentas);
    System.out.println("==========================================");
}
}
