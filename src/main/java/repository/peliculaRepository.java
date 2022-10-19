package repository;

import entity.pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface peliculaRepository extends CrudRepository<pelicula, Long>{
    
}
