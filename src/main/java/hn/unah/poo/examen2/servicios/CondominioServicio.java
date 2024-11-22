package hn.unah.poo.examen2.servicios;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.poo.examen2.dtos.CondominioDTO;
import hn.unah.poo.examen2.dtos.MensaulidadesDTO;
import hn.unah.poo.examen2.repositorios.CondominioRepositiorio;

@Service
public class CondominioServicio {
    
    @Autowired
    private CondominioRepositiorio condominioRepositiorio;

    public String crearCondominio(CondominioDTO condominioDTO) {
        LocalDate fechaHoy = LocalDate.now();
        if (!condominioRepositiorio.existsById(condominioDTO.getNumeroCondominio())){
            double monto,area;
            area = condominioDTO.getArea().doubleValue();
            monto = area *2.50;

            List<MensaulidadesDTO> mensaulidadesDTOs = new ArrayList<>();
            
            return "Se agrego correctamente el condominio";
        }


        return "Este condominio ya existe";
    }
}
