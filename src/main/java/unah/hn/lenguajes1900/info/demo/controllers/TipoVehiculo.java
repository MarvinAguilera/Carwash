package unah.hn.lenguajes1900.info.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unah.hn.lenguajes1900.info.demo.services.ampl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping("/api")
public class TipoVehiculo {
    
    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;
    
    
    @PostMapping("/crear/tipoVehiculo")
    public TipoVehiculo crearTipoVehiculo(@RequestBody TipoVehiculo tipoVehiculo){
      return this.tipoVehiculoServiceImpl.crearTipoVehiculo(tipoVehiculo);
    }
}
