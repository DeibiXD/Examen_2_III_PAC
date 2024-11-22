package hn.unah.poo.examen2.modelos;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "condominios")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Condominios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numeroCondominio")
    private int numeroCondominio;

    private int nivel;

    private BigDecimal area;
    
    private String color;

    private int parqueos;

    @ManyToOne
    @JoinColumn(name="dni", referencedColumnName = "dni")
    @JsonIgnore
    private Duenios duenios;

    @OneToMany(mappedBy = "condominios", cascade = CascadeType.ALL)
    private List<Mensualidades> mensualidades;
}
