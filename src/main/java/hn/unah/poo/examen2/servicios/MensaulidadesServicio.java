package hn.unah.poo.examen2.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.poo.examen2.repositorios.MensaulidadesRepositorio;

@Service
public class MensaulidadesServicio {

    @Autowired
    private MensaulidadesRepositorio mensaulidadesRepositorio;

}
