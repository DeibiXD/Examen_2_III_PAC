package hn.unah.poo.examen2.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.poo.examen2.dtos.DueniosDTO;
import hn.unah.poo.examen2.modelos.Duenios;
import hn.unah.poo.examen2.servicios.DuenioServicio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/duenios")
public class DuenioControlador {
    
    @Autowired
    private DuenioServicio duenioServicio;

    @PostMapping("/crear")
    public String crearDuenio(@RequestBody DueniosDTO dueniosDTO) {
        return duenioServicio.crearDuenio(dueniosDTO);
    }

    @GetMapping("/buscar/id/{dni}")
    public DueniosDTO buscarPorId(@PathVariable(name = "dni")String dni) {
        return duenioServicio.buscarPorId(dni);
    }

    @GetMapping("/obtener/todos")
    public List<Duenios> obtenerTodos() {
        return duenioServicio.obtenerTodos();
    }

    @DeleteMapping("/eliminar")
    public String eliminarDuenio(DueniosDTO dueniosDTO){
        return duenioServicio.eliminarDuenio(dueniosDTO);
    }
    
    
}
