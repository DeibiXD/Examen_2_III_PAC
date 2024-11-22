package hn.unah.poo.examen2.modelos;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "mensualidades")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Mensualidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMensualidad")
    private int idMensualidad ;
    
    private BigDecimal monto;
    private String estado;//Tipo char(1)
    
    @Column(name = "fechaPago")
    private LocalDate fechaPago;

    //Duenio
    
    @ManyToOne
    @JoinColumn(name="numeroCondominio", referencedColumnName = "numeroCondominio")
    @JsonIgnore
    private Condominios condominios;
}
