/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class Tarifa {
     private String codigoTarifa;
     private String nombre;
     private String tipoCliente;
     private double precioPorM3;
     private String  fechaActualizacion;
     

public Tarifa (){}



public Tarifa(String codigoTarifa, String nombre, String tipoCliente, double precioPorM3, String fechaActualizacion){
   this.codigoTarifa = codigoTarifa;
   this.nombre = nombre;
   this.tipoCliente = tipoCliente;
   this.precioPorM3 = precioPorM3;
   this.fechaActualizacion =fechaActualizacion;
   
}

public String getCodigoTarifa() { return codigoTarifa; }
    public void setCodigoTarifa(String codigoTarifa) { this.codigoTarifa = codigoTarifa; 
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; 
    }

    public String getTipoCliente() { return tipoCliente; }
    public void setTipoCliente(String tipoCliente) { this.tipoCliente = tipoCliente;
    }

    public double getPrecioPorM3() { return precioPorM3; }
    public void setPrecioPorM3(double precioPorM3) { this.precioPorM3 = precioPorM3; 
    }

    public String getFechaActualizacion() { return fechaActualizacion; }
    public void setFechaActualizacion(String fechaActualizacion) { this.fechaActualizacion = fechaActualizacion;
    }

    
    public String toString() {
        return "Tarifa{" +
                "codigoTarifa='" + codigoTarifa + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipoCliente='" + tipoCliente + '\'' +
                ", precioPorM3=" + precioPorM3 +
                ", fechaActualizacion='" + fechaActualizacion + '\'' +
                '}';
    }

    double getPRECIOPORM3() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }









}
     
    