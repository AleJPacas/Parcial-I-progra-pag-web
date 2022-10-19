package service;

import entity.salas;
import java.util.List;



public interface IsalasService {
    public List<salas> getAllSalas();
    public salas getSalasById(long id);
    public void saveSalas (salas Salas);
    public void delete (long id);
}
