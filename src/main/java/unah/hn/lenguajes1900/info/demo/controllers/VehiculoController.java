package unah.hn.lenguajes1900.info.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.lenguajes1900.info.demo.entities.Vehiculo;
import unah.hn.lenguajes1900.info.demo.services.ampl.VehiculoServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api")
public class VehiculoController {

    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/crear/vehiculo")
    public Vehiculo creaVehiculo(@RequestBody Vehiculo vehiculo) {
        return this.vehiculoServiceImpl.crearVehiculo(vehiculo);
    }

    @GetMapping("/obtener/vehiculos")
    public List<Vehiculo> obtenerVehiculos() {
        return this.vehiculoServiceImpl.obtenerVehiculos() ;
    }
    
    
    
}
