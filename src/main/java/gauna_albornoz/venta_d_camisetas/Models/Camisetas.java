package gauna_albornoz.venta_d_camisetas.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Camisetas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String club;
    private String tipo;
    private long precio;
    private long stock;

    public long getid() {
        return id;
    }
    public void setid(long id) {
        this.id = id;
    }
    public String getclub() {
        return club;
    }
    
    public void setid(String club) {
        this.club = club;
    } 
    public String gettipo() {
        return tipo;
    }
    public void settipo(String tipo) {
        this.tipo = tipo;
    }
    public long getprecio() {
        return precio;
    }
    public void setprecio(long precio) {
        this.precio = precio;
    }
     
    public long getstock() {
        return stock;
    }
    public void setstock(long stock) {
        this.stock = stock;
    }  
}

    
    

