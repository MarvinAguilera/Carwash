package unah.hn.lenguajes1900.info.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import unah.hn.lenguajes1900.info.demo.entities.Cliente;
import unah.hn.lenguajes1900.info.demo.services.ampl.ClienteServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class ClienteCotroller {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crear/cliente")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return this.clienteServiceImpl.crearCliente(cliente);
    }

    @GetMapping("/obtener/clientes")
    public List<Cliente> obtenerClientes() {
        return this.clienteServiceImpl.obtenerClientes();
    }

    @GetMapping("/buscar/cliente")
    public Optional<Cliente> obtenerPorId(@RequestParam long codigoCliente) {
        return this.clienteServiceImpl.obtenerPorId(codigoCliente);
    }
    

    
    
    
    
}
