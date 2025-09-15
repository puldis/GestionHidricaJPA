
package model;

/**
 *
 * @author carlo
 */
public class Factura {
    private String numeroFactura;
    private Cliente cliente ;
    private String periodo ;
    private double consumoTotal;
    private String estado;
    private double monto;
    
    
    public Factura(){}
    
    public Factura (String numeroFactura, Cliente cliente, String periodo, double consumoTotal, double precioPorM3){
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;
        this.periodo = periodo;
        this.consumoTotal= consumoTotal;
        this.monto = consumoTotal * precioPorM3;
        this.estado ="pendiente";
        
        
    }
    
    public String getNumeroFcatura (){
        return numeroFactura;
    }
    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getConsumoTotal() {
        return consumoTotal;
    }

    public void setConsumoTotal(double consumoTotal) {
        this.consumoTotal = consumoTotal;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

  
    public void pagar() {
        this.estado = "Pagado";
    }

    
    public void vencer() {
        this.estado = "Vencido";
    }

   
    public String toString() {
        return "Factura{" +
                "numeroFactura='" + numeroFactura + '\'' +
                ", cliente=" + (cliente != null ? cliente.getNombre() : "null") +
                ", periodo='" + periodo + '\'' +
                ", consumoTotal=" + consumoTotal +
                ", monto=" + monto +
                ", estado='" + estado + '\'' +
                '}';
    }
    
    
}
