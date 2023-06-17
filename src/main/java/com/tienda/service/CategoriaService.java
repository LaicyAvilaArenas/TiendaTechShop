
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

public interface CategoriaService {
   //EL SIGUIENTE MÉTODO RETORNA UNA LISTA CON LAS CATEGORÍAS 
    //QUE ESTÁN EN LA TABLA DE CATEGORIAS, TODAS O SOLO LAS ACTIVAS
    public List<Categoria> getCategorias(boolean activos);
    
    //ACA SIGUEN LOS MÉTODOS PARA HACER UN CRUD DE LA TABLA CATEGORIA
     
}
