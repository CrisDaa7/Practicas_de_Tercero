/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.LinkedList;
import java.util.List;
import modelo.Sucursal;
import modelo.Venta;

/**
 *
 * @author usuario
 */
public class ControladorVentas {
    private List<Sucursal> sucursales;

    public ControladorVentas() {
    this.sucursales = new LinkedList<Sucursal>();
}
    public void registrarSucursal(String nombre) {
    Sucursal nuevaSucursal = new Sucursal(nombre, new LinkedList<>());
    sucursales.add(nuevaSucursal);
}

    
    public void registrarVenta(String nombre, String mes, double cantidad) {
    for (Sucursal sucursal : sucursales) {
        if (sucursal.getNombre().equals(nombre)) {
            List<Venta> ventasMensuales = sucursal.getVentasMensuales();
            for (Venta venta : ventasMensuales) {
                if (venta.getMes().equals(mes)) {
                    venta.setCantidad(venta.getCantidad() + cantidad);
                    return;
                }
            }
            ventasMensuales.add(new Venta(mes, cantidad));
        }
    }
}

    
    public double obtenerTotalVentasAnio(String nombreSucursal) {
    double totalVentas = 0;
    for(Sucursal s : sucursales) {
        if(s.getNombre().equals(nombreSucursal)) {
            for(Venta v : s.getVentasMensuales()) {
                totalVentas += v.getCantidad();
            }
            break; 
        }
    }
    return totalVentas;
}

     
     public double obtenerPromedioVentasMes(String mes) {
        return 0;
    }
     
    public String obtenerSucursalMayorVenta(String mes) {
    double mayorVenta = 0;
    Sucursal sucursalMayorVenta = null;
    for (Sucursal s : sucursales) {
        double ventaTotal = 0;
        for (Venta v : s.getVentasMensuales()) {
            if (v.getMes().equals(mes)) {
                ventaTotal += v.getCantidad();
            }
        }
        if (ventaTotal > mayorVenta) {
            mayorVenta = ventaTotal;
            sucursalMayorVenta = s;
        }
    }
    return (sucursalMayorVenta != null) ? sucursalMayorVenta.getNombre() : null;
}

    
     public String obtenerMesMenoresVentas() {
        return null;
    }
    public void guardarHistorial(String accion) {
        
    }
    
    public void borrarHistorial(){
        
    }

    public void imprimirSucursales() {
    for(Sucursal s: sucursales) {
        System.out.println("Sucursal: " + s.getNombre());
        if(s.getVentasMensuales().isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            for(Venta v: s.getVentasMensuales()) {
                System.out.println("Mes: " + v.getMes() + " - Cantidad vendida: " + v.getCantidad());
            }
        }
    }
}

    
}
