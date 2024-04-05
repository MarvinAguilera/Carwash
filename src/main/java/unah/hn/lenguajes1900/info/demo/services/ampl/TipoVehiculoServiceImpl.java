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
    public String eliminarVehiculoPorId(long idTipoVehiculo) {
      if(this.tipoVehiculoRepository.findById(idTipoVehiculo).isPresent()){
        this.tipoVehiculoRepository.deleteById(idTipoVehiculo);;
        return "vehiculo eliminado";
      }
      return "vehiculo no encontrado";

    }

}
