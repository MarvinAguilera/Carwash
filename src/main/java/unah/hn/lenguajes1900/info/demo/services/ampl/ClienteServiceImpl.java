package unah.hn.lenguajes1900.info.demo.services.ampl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.lenguajes1900.info.demo.entities.Cliente;
import unah.hn.lenguajes1900.info.demo.repositories.ClienteRepository;
import unah.hn.lenguajes1900.info.demo.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
    return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerClientes() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> obtenerPorId(long codigoCliente) {
       return this.clienteRepository.findById(codigoCliente); 
    }
    
    
}
