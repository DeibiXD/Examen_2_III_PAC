package hn.unah.poo.examen2.servicios;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.poo.examen2.dtos.CondominioDTO;
import hn.unah.poo.examen2.dtos.MensaulidadesDTO;
import hn.unah.poo.examen2.modelos.Condominios;
import hn.unah.poo.examen2.modelos.Mensualidades;
import hn.unah.poo.examen2.repositorios.CondominioRepositiorio;

@Service
public class CondominioServicio {
    
    @Autowired
    private CondominioRepositiorio condominioRepositiorio;

    ModelMapper modelMapper ;

    public String crearCondominio(CondominioDTO condominioDTO) {
        LocalDate fechaHoy = LocalDate.now();
        if (!condominioRepositiorio.existsById(condominioDTO.getNumeroCondominio())){
            modelMapper = new ModelMapper();
            double monto,area;
            area = condominioDTO.getArea().doubleValue();
            monto = area *2.50;

            List<Mensualidades> mensaulidadesDTOs = new ArrayList<>();
            for (int i=0; i<12; i++){
                
                Mensualidades nuevaMensaulidadesDTO = new Mensualidades();
                nuevaMensaulidadesDTO.setFechaPago(fechaHoy);
                BigDecimal nuevoMonto = new BigDecimal(monto);
                nuevaMensaulidadesDTO.setMonto(nuevoMonto);
                mensaulidadesDTOs.add(nuevaMensaulidadesDTO);
                fechaHoy.plusMonths(1);

            }
            Condominios condominios = modelMapper.map(condominioDTO,Condominios.class);
            condominios.setMensualidades(mensaulidadesDTOs); 

            return "Se agrego correctamente el condominio";
        }


        return "Este condominio ya existe";
    }
}
