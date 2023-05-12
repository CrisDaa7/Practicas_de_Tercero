/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Sucursal {
    private String nombre;
    private List<Venta> ventasMensuales;

    public Sucursal(String nombre, List<Venta> ventasMensuales) {
        this.nombre = nombre;
        this.ventasMensuales = ventasMensuales;
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Venta> getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(LinkedList<Venta> ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }
    
    
    

}
