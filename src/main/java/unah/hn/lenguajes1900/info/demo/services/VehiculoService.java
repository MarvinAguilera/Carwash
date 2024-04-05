package unah.hn.lenguajes1900.info.demo.services;

import java.util.List;

import unah.hn.lenguajes1900.info.demo.entities.Vehiculo;

public interface VehiculoService {
    
    public Vehiculo crearVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> obtenerVehiculos();

    public Vehiculo obtenerVehiculoPorId(Integer idVehiculo );
}
