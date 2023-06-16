
package com.tienda.controler;

import org.springframework.stereotype.Controller;
import 
        
@Controller
@RequestMapping ("/categoria")
public class CategoriaController {
  
    @Autowired
    private CategoriaService categoriaService;
    @GetMapping ("/listado")
    public String Listado(Model model){
        var categorias=categoriaService.getCategorias (false);
        model.addAttribute("categorias",categorias);
        model.addAttribute("totalcategorias",categorias.size());
        return "/categoria/listado";
        
    }
}
