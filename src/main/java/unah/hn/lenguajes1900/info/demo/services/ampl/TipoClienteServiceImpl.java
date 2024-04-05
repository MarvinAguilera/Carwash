package unah.hn.lenguajes1900.info.demo.services.ampl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.lenguajes1900.info.demo.entities.TipoCliente;
import unah.hn.lenguajes1900.info.demo.repositories.TipoClienteRepository;
import unah.hn.lenguajes1900.info.demo.services.TipoClienteService;

@Service
public class TipoClienteServiceImpl implements TipoClienteService  {

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(String descripcion) {
        TipoCliente nvoTipoCliente = new TipoCliente();
        nvoTipoCliente.setDescripcion(descripcion);
        return this.tipoClienteRepository.save(nvoTipoCliente);
    }

    
    
    
}
