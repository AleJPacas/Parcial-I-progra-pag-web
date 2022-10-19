package repository;

import entity.salas;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface salasRepository extends CrudRepository<salas, Long>{
    
}
