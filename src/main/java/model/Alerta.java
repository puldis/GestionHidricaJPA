/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class Alerta {

private  String codigoAlerta;
private  String tipo;
private  String fechaHora;
private  String descripcion ;
private  String zonaAfectada;
private  String estado;


public Alerta (){}

public Alerta (String codigoAlerta, String tipo, String fechaHora, String descripcion, String zonaAfectada, String estado){
    this.codigoAlerta = codigoAlerta;
    this.tipo = tipo;
    this.fechaHora = fechaHora;
    this.descripcion = descripcion;
    this.zonaAfectada = zonaAfectada ;
    this.estado = estado;
    
}
public String getCodigoAlerta(){
        return codigoAlerta;
        
}

public void setCodigoAlerta(String codigoAlerta) {
    this.codigoAlerta = codigoAlerta;
}
public String getTipo(){
    return tipo ;
    
}
public void  setTipo(String tipo){
this.tipo = tipo;
}
public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getZonaAfectada() {
        return zonaAfectada;
    }

    public void setZonaAfectada(String zonaAfectada) {
        this.zonaAfectada = zonaAfectada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
   
    public String toString() {
        return "Alerta{" +
                "codigoAlerta='" + codigoAlerta + '\'' +
                ", tipo='" + tipo + '\'' +
                ", fechaHora='" + fechaHora + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", zonaAfectada='" + zonaAfectada + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }









}
