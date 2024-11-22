package hn.unah.poo.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.poo.examen2.modelos.Duenios;
@Repository
public interface DuenioRepositorio extends JpaRepository <Duenios,String> {
    
}
