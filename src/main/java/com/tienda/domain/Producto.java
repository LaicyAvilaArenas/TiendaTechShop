package com.tienda.domain;

import lombok.Data;
import jakarta.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "producto")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idproducto;
private Long idCategoria;
    private String descripcion;
     private String detalle;
     private int existencias;
    private String rutaImagen; 
    private boolean activo;
    
   
}
public Producto(String descripcion, boolean activo){
this.descripcion =descripcion;
this.activo = activo;
}