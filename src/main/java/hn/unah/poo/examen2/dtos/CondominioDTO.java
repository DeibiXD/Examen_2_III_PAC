package hn.unah.poo.examen2.dtos;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CondominioDTO {
    private int numeroCondominio;

    private int nivel;

    private BigDecimal area;
    
    private String color;

    private int parqueos;
}
