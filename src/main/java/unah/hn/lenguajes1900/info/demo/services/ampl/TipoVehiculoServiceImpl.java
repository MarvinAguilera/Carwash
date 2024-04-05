package unah.hn.lenguajes1900.info.demo.services.ampl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.lenguajes1900.info.demo.entities.TipoCliente;
import unah.hn.lenguajes1900.info.demo.entities.TipoVehiculo;
import unah.hn.lenguajes1900.info.demo.repositories.TipoVehiculoRepository;
import unah.hn.lenguajes1900.info.demo.services.TipoVehiculoService;

@Service
public class TipoVehiculoServiceImpl implements TipoVehiculoService {


    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
       return this.tipoVehiculoRepository.save(tipoVehiculo);
    }

    @Override
    public TipoVehiculo eliminarVehiculoPorId(long idTipoVehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminarVehiculoPorId'");
    }

    public unah.hn.lenguajes1900.info.demo.controllers.TipoVehiculo crearTipoVehiculo(
            unah.hn.lenguajes1900.info.demo.controllers.TipoVehiculo tipoVehiculo) {
        return null;
    }

  
    
}
