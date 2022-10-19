package service;

import entity.pelicula;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.peliculaRepository;



@Service
public class peliculaService implements IpeliculaService{
    
    @Autowired
    private peliculaRepository PeliculaRepository;

    @Override
    public List<pelicula> listPelicula() {
        return(List<pelicula>)PeliculaRepository.findAll();
    }
    
    
}
