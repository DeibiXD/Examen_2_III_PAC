package hn.unah.poo.examen2.servicios;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.poo.examen2.dtos.DueniosDTO;
import hn.unah.poo.examen2.modelos.Duenios;
import hn.unah.poo.examen2.repositorios.DuenioRepositorio;

@Service
public class DuenioServicio {
    
    private ModelMapper modelMapper;

    @Autowired
    private DuenioRepositorio duenioRepositorio;

    public String crearDuenio(DueniosDTO dueniosDTO) {
        if (!duenioRepositorio.existsById(dueniosDTO.getDni())){
            modelMapper = new ModelMapper();
            Duenios duenioAgregar = modelMapper.map(dueniosDTO, Duenios.class);
            duenioRepositorio.save(duenioAgregar);
            return "Duenio agregado con exito";
        }
        return "Dueño no existe";
    }

    public DueniosDTO buscarPorId(String dni) {
        if (duenioRepositorio.existsById(dni)){
            modelMapper = new ModelMapper();
            Duenios dueniosEncontrado = duenioRepositorio.findById(dni).get();
            DueniosDTO dueniosDTO = modelMapper.map(dueniosEncontrado, DueniosDTO.class);
            return dueniosDTO;
        }
        return null;
    }

    public List<Duenios> obtenerTodos() {
        return duenioRepositorio.findAll();
    }

    public String eliminarDuenio(DueniosDTO dueniosDTO) {
        if (duenioRepositorio.existsById(dueniosDTO.getDni())){
            modelMapper = new ModelMapper();
            Duenios duenioBorrar = modelMapper.map(dueniosDTO, Duenios.class);
            duenioRepositorio.delete(duenioBorrar);
            return "Borrado con exito";
        }
        return "Duenio no existe";
    }
}
