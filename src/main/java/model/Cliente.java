/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author carlo
 */
public class Cliente {
    private int idCliente;
    private String nombre;
    private String correo;
    private String cedula;
    private String telefono;
    private String direccion;
    private String tipoCliente;
    private String numeroMedidor;
    
    
    
    public Cliente(){}
    
    
    public Cliente(int idCliente, String  nombre , String cedula, String telefono , String correo , String direccion , String tipoCliente, String numeroMedidor ){
        this.idCliente = idCliente;
        this.nombre  = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion =  direccion ;
        this.correo = correo ;
        this.tipoCliente= tipoCliente;
        this.numeroMedidor= numeroMedidor;
        
        
    }
    
    public int getidCliente(){ return idCliente;}
    public void  setidCliente(int idCliente){this.idCliente = idCliente;
    }
    
    
    public String getNombre(){return nombre;}
    public void setNombre (String nombre){this.nombre = nombre;
    }
    
    
    public String getcedula(){return cedula;}
    public void  setcedula(String cedula){this.cedula= cedula;
    }
    
     
    public String gettelefono(){return telefono;}
    public void settelefono(String telefono){this.telefono = telefono ;
    }
    
    
    public String  getdireccion(){return direccion;}
    public void setdireccion(String direccion ){this.direccion= direccion ;
    }
    
    public String getcorreo (){return correo;}
    public void setcorreo(String correo){this.correo=correo;
    }
    
    public String gettipoCliente (){return tipoCliente;}
    public void settipoCliente (String tipoCliente){this.tipoCliente=tipoCliente;
    }
    
    public String getnumeroMedidor (){return numeroMedidor;}
    public void setnumeroMedidor (String numeroMedidor){this.numeroMedidor=numeroMedidor;
    }
    
     
}
