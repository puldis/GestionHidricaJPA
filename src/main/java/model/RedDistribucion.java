/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class RedDistribucion {
    private String codigoRed;
    private String ubicacion;
    private double capacidad;
    private String zonasAbastecidas;
    private String estado;
    private String fechaUltimaInspeccion;
    
    
            
    
    public RedDistribucion(){}
    
    
    
    
   public RedDistribucion(String codigoRed, String ubicacion, double capacidad, String zonasAbastecidas,
                           String estado, String fechaUltimaInspeccion){
        String codigored = null;
       
       this.codigoRed = codigored;
        String zonasAbastecimiento = null;
       this.zonasAbastecidas = zonasAbastecimiento;
       this.fechaUltimaInspeccion =fechaUltimaInspeccion;
       this.capacidad = capacidad ;
       this.estado = estado;
       this.zonasAbastecidas=zonasAbastecidas;
       this.ubicacion = ubicacion;
           
   }
   
   public String getCodigoRed() { return codigoRed; }
    public void setCodigoRed(String codigoRed) { this.codigoRed = codigoRed; 
    }
   public String getZonasAbastecidas() { return zonasAbastecidas; }
    public void setZonasAbastecidas(String zonasAbastecidas) { this.zonasAbastecidas = zonasAbastecidas;
    }
    
    public String getFechaUltimaInspeccion() { return fechaUltimaInspeccion; }
    public void setFechaUltimaInspeccion(String fechaUltimaInspeccion) { this.fechaUltimaInspeccion = fechaUltimaInspeccion;
    }
     public double getCapacidad() { return capacidad; }
    public void setCapacidad(double capacidad) { this.capacidad = capacidad;
    }
 public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado;
 }
   public String getzonasAbastecidas() { return zonasAbastecidas; }
   public void setzonasAbastecidas(String zonasAbastecidas) { this.zonasAbastecidas = zonasAbastecidas; 
 }
public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion;
    }
    
    public String toString() {
        return "RedDistribucion{" +
                "codigoRed='" + codigoRed + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", capacidad=" + capacidad +
                ", zonasAbastecidas='" + zonasAbastecidas + '\'' +
                ", estado='" + estado + '\'' +
                ", fechaUltimaInspeccion='" + fechaUltimaInspeccion + '\'' +
                '}';
    }

   
}
