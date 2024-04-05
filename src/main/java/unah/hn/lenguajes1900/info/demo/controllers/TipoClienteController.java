package unah.hn.lenguajes1900.info.demo.controllers;

import org.springframework.web.bind.annotation.RestController;

import unah.hn.lenguajes1900.info.demo.entities.TipoCliente;
import unah.hn.lenguajes1900.info.demo.services.ampl.TipoClienteServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class TipoClienteController {

    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/crear/tipoCliente")
    public TipoCliente creaTipoCliente(@RequestBody TipoCliente tipoCliente ) {
        return this.tipoClienteServiceImpl.crearTipoCliente(tipoCliente);
    }
    

    
}
