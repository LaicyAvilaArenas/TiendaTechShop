
package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
   //EL SIGUIENTE MÉTODO RETORNA UNA LISTA CON LAS CATEGORÍAS 
    //QUE ESTÁN EN LA TABLA DE CATEGORIAS, TODAS O SOLO LAS ACTIVAS
    public List<Producto> getProductos(boolean activos);
    
    //ACA SIGUEN LOS MÉTODOS PARA HACER UN CRUD DE LA TABLA CATEGORIA
    // Se obtiene un Producto, a partir del id de un categoria
    public Producto getProducto(Producto categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Producto categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Producto categoria); 
}
