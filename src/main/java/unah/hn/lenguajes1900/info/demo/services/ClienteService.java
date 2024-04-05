package unah.hn.lenguajes1900.info.demo.services;

import java.util.List;
import java.util.Optional;

import unah.hn.lenguajes1900.info.demo.entities.Cliente;

public interface ClienteService {
    
    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> obtenerClientes();

    public Optional<Cliente> obtenerPorId(long codigoCliente);
    
}
