/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class Consumo {
    
   private String idConsumo;
   private Cliente cliente;
   private String fechahora;
   private double  cantidad;
   private Tarifa  tarifaAplicada;
   private double  costoTotal;
    private Cliente Cliente;
    private String fechaHora;
    private double Cantidad;
   
   public Consumo(){}
   
   
   
   public Consumo(String idConsumo, Cliente cliente, String fechaHora, double cantidad, Tarifa tarifaAplicada ){
       this.idConsumo = idConsumo;
       this.cliente = cliente ;
       this.fechahora = fechaHora;
       double Cantidad = cantidad;
       this.tarifaAplicada = tarifaAplicada;
       this.costoTotal = cantidad * tarifaAplicada.getPRECIOPORM3();
   
   }
       
    /**
     *
     * @return
     */
    public String getIdConsumo() {
        return idConsumo;
    }
  
    public void setIdConsumo(String idConsumo) {
        this.idConsumo = idConsumo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.Cliente = cliente;
    }

    public String getFechaHora() {
       String fechaHora = null;
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.Cantidad = cantidad;
        recalcularCosto();
    }

    public Tarifa getTarifaAplicada() {
        return tarifaAplicada;
    }

    public void setTarifaAplicada(Tarifa tarifaAplicada) {
        this.tarifaAplicada = tarifaAplicada;
        recalcularCosto();
    }

    public double getCostoTotal() {
        return costoTotal;
    }

 
    private void recalcularCosto() {
        if (tarifaAplicada != null) {
            this.costoTotal = cantidad * tarifaAplicada.getPrecioPorM3();
        }
    }

   
   
    public String toString() {
        return "Consumo{" +
                "idConsumo='" + idConsumo + '\'' +
                ", cliente=" + (cliente != null ? cliente.getNombre() : "null") +
                ", fechaHora='" + fechaHora + '\'' +
                ", cantidad=" + cantidad +
                ", tarifaAplicada=" + (tarifaAplicada != null ? tarifaAplicada.getNombre() : "null") +
                ", costoTotal=" + costoTotal +
                '}';
    }
       
       
       
       
       
       
       
       
   
   
   
    
}
