package service;

import entity.salas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.salasRepository;



@Service
public class salasService implements IsalasService{
    
    @Autowired
    salasRepository Salasrepository;

    @Override
    public List<salas> getAllSalas() {
        return (List<salas>) Salasrepository.findAll();
    }

    @Override
    public salas getSalasById(long id) {
        return Salasrepository.findById(id).orElse(null);
    }

    @Override
    public void saveSalas(salas Salas) {
        Salasrepository.save(Salas);
    }

    @Override
    public void delete(long id) {
        Salasrepository.deleteById(id);
    }
    
    
    
    
}
