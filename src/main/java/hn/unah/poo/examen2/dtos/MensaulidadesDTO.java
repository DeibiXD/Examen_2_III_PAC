package hn.unah.poo.examen2.dtos;
import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MensaulidadesDTO {
    private int idMensualidad ;
    private BigDecimal monto;
    private String estado;
    private LocalDate fechaPago;

}
