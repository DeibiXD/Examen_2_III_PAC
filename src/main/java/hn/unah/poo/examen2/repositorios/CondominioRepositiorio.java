package hn.unah.poo.examen2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.poo.examen2.modelos.Condominios;

@Repository
public interface CondominioRepositiorio extends JpaRepository<Condominios,Integer>{
    
}
