package unah.hn.lenguajes1900.info.demo.services.ampl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.lenguajes1900.info.demo.entities.Vehiculo;
import unah.hn.lenguajes1900.info.demo.repositories.VehiculoRepository;
import unah.hn.lenguajes1900.info.demo.services.VehiculoService;

@Service
public class VehiculoServiceImpl implements VehiculoService{

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {
        return this.vehiculoRepository.save(vehiculo);
    }

    @Override
    public List<Vehiculo> obtenerVehiculos() {
        return (List<Vehiculo>) this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo obtenerVehiculoPorId(Integer idVehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtenerVehiculoPorId'");
    }
    
}
