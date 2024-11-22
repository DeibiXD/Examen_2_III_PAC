package hn.unah.poo.examen2.modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "duenios")
public class Duenios {
    @Id
    private String dni;

    private String nombre;

    private String apellido;

    private String telefono;

    @OneToMany(mappedBy = "duenios", cascade = CascadeType.ALL)
    private List<Condominios> condominios;
}
