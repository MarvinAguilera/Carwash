package unah.hn.lenguajes1900.info.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import unah.hn.lenguajes1900.info.demo.entities.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long>{
    
}
