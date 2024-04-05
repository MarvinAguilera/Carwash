package unah.hn.lenguajes1900.info.demo.services.ampl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import unah.hn.lenguajes1900.info.demo.entities.Reserva;
import unah.hn.lenguajes1900.info.demo.entities.Vehiculo;
import unah.hn.lenguajes1900.info.demo.repositories.ReservaRepository;
import unah.hn.lenguajes1900.info.demo.repositories.VehiculoRepository;
import unah.hn.lenguajes1900.info.demo.services.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService {


    @Autowired
    private ReservaRepository reservaRepository;

    @Autowired
    private VehiculoRepository vehiculoRepository;


    @Override
    public String crearReserva(long codigoCliente, long idVehiculo, long dias) {
        Vehiculo vehiculo = vehiculoRepository.findById(idVehiculo).get();

        if(vehiculo.isDisponible()){
        Reserva nvaReserva = new Reserva();
        nvaReserva.setidCliente(idCliente);
        nvaReserva.setidVehiculo(idVehiculo);
        nvaReserva.setFecha(LocalDate.now());
        nvaReserva.setDias(dias);
        nvaReserva.setTotal(vehiculo.getTipoVehiculo().getPrecioXhora()*24*dias);
        this.reservaRepository.save(nvaReserva);
        vehiculo.setDisponible(false);
        vehiculoRepository.save(vehiculo);
        return "Su reserva se realizó exitosamente.";
        }
        return "Vehiculo esta rentado.";

    }

    
    
}
