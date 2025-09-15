/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class Mantenimiento {
    private String codigoMantenimeinto;
    private String infraestructura;
    private String fechaInicio;
    private String fechaFinEstimado;
    private String descripcion;
    private String tecnicoAsignado;
    private String estado;
    private String fechaFinEstimada;
    private String codigoMantenimiento;
    
    
    
    public Mantenimiento (){}
    
    
    public Mantenimiento(String codigoMantenimiento, String infraestructura, String fechaInicio,
                         String fechaFinEstimada, String descripcion, String tecnicoAsignado, String estado){
        String codigoMntenimiento = null;
        this.codigoMantenimeinto = codigoMntenimiento;
        this.infraestructura = infraestructura;
        this.fechaInicio = fechaInicio;
        this.fechaFinEstimado = fechaFinEstimado;
        String decripcion = null;
        this.descripcion = decripcion;
        this.tecnicoAsignado = tecnicoAsignado;
        this.estado = estado;
        
    }
    public String getCodidoMantenimiento(){
      return codigoMantenimiento;
    
    }
    
     public void setCodigoMantenimiento(String codigoMantenimiento) {
        this.codigoMantenimiento = codigoMantenimiento;
    }

    public String getInfraestructura() {
        return infraestructura;
    }

    public void setInfraestructura(String infraestructura) {
        this.infraestructura = infraestructura;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinEstimada() {
        return fechaFinEstimada;
    }

    public void setFechaFinEstimada(String fechaFinEstimada) {
        this.fechaFinEstimada = fechaFinEstimada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTecnicoAsignado() {
        return tecnicoAsignado;
    }

    public void setTecnicoAsignado(String tecnicoAsignado) {
        this.tecnicoAsignado = tecnicoAsignado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Métodos de utilidad
    public void iniciar() {
        this.estado = "En Proceso";
    }

    public void finalizar() {
        this.estado = "Finalizado";
    }

      public String toString() {
        char fechaFinEstimada = 0;
        String codigoMantenimiento = null;
        return "Mantenimiento{" +
                "codigoMantenimiento='" + codigoMantenimiento + '\'' +
                ", infraestructura='" + infraestructura + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFinEstimada='" + fechaFinEstimada + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tecnicoAsignado='" + tecnicoAsignado + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
    
    
    
}
