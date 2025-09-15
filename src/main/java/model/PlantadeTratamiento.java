/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class PlantadeTratamiento {
    private String codigoPlanta;
    private String ubicacion;
    private double capacidad;
    private String estado ;
    private String historialInspecciones;
     
    
   public PlantadeTratamiento(){}
   
   
   public PlantadeTratamiento(String codigoPlanta, String ubicacion, double capacidad, String estado, String historialInspecciones){
       this.codigoPlanta = codigoPlanta;
       this.ubicacion = ubicacion;
       this.capacidad = capacidad;
       this.estado = estado;
       this.historialInspecciones = historialInspecciones;
   }
     public String getCodigoPlanta() { return codigoPlanta; }
    public void setCodigoPlanta(String codigoPlanta) { this.codigoPlanta = codigoPlanta; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public double getCapacidad() { return capacidad; }
    public void setCapacidad(double capacidad) { this.capacidad = capacidad; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getHistorialInspecciones() { return historialInspecciones; }
    public void setHistorialInspecciones(String historialInspecciones) { this.historialInspecciones = historialInspecciones; }

   
    public String toString() {
        return "PlantaTratamiento{" +
                "codigoPlanta='" + codigoPlanta + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", capacidad=" + capacidad +
                ", estado='" + estado + '\'' +
                ", historialInspecciones='" + historialInspecciones + '\'' +
                '}';
    
    
    
    }
}
