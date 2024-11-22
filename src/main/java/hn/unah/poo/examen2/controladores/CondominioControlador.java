package hn.unah.poo.examen2.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.poo.examen2.dtos.CondominioDTO;
import hn.unah.poo.examen2.servicios.CondominioServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/condominio")
public class CondominioControlador {
    
     @Autowired
    private CondominioServicio condominioServicio;

    @PostMapping("/crear")
    public String crearCondominio(@RequestBody CondominioDTO condominioDTO) {
        
        return condominioServicio.crearCondominio(condominioDTO);
    }
    
}
