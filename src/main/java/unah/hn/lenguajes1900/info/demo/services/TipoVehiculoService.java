package unah.hn.lenguajes1900.info.demo.services;

import unah.hn.lenguajes1900.info.demo.entities.TipoVehiculo;

public interface TipoVehiculoService {
    
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo);

    public TipoVehiculo eliminarVehiculoPorId(long idTipoVehiculo);
}
