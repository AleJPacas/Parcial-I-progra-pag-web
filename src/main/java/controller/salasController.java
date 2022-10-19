package controller;

import entity.pelicula;
import entity.salas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import service.IpeliculaService;
import service.IsalasService;




@Controller
public class salasController {
    
    @Autowired
    private IsalasService Salas_service;
    
    @Autowired
    private IpeliculaService Pelicula_service;
    
    @GetMapping("/salas")
    public String index(Model model){
        List<salas> listasalas = Salas_service.getAllSalas();
        model.addAttribute("titulo", "Tabla Salas");
        model.addAttribute("sala",listasalas);
        return"salas";
    }
    
    
    @GetMapping("/salasNuevo")
    public String crearSalas(Model model){
        List<pelicula> listaPeliculas = Pelicula_service.listPelicula();
        model.addAttribute("salas",new salas());
        model.addAttribute("pelicula", listaPeliculas);
        return "crear";
    }
    
    
    @PostMapping("/guardar")
    public String guardarSalas(@ModelAttribute salas Sala){
        Salas_service.saveSalas(Sala);
        return "redirect:/salas";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarSalas(@PathVariable("id") Long idsalas){
        Salas_service.delete(idsalas);
        return "redirect:/salas";
    }
    
    
    
    
    
    
    
    
    
    
    
}
