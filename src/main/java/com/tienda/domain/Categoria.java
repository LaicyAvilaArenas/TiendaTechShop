
package com.tienda.domain;

import lombok.Data;
import jakarta.persistence.*;
import java.io.Serializable;

@Data
@Endity
@Table(name="categoria")
public class Categoria implements Serializable {
   
  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTIFY)
  @Column(name="id_categoria")
  private Long  Idcategoria;
  private String descripcion;
  private String Rutaimagen;
  private boolean activo; 
  
  
  
  
}
