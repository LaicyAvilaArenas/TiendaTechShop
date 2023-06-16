/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Categoria;

import com.tienda.service.CategoriaService;
import com.tienda.domain.Categoria;
import java.util.List;
import com.tienda.dao.CategoriaDao;
import org.springframework.beans.factory.annotation.Autowired;

@Service

public class ServiceImpl implements CategoriaService {
    
    //LA ANOTACION AUTOWIRED CREA UN UNICO OBJETO SIN HACER NEW
    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    public List<Categoria> getCategorias(boolean activos){
      var lista=categoriaDao.findAll();
      if (activos){//si quiero solo las categorias activas
       lista.removeIf(e -> !e.isActivo()) ;  
      }
      return lista;
              
    }
    
}
