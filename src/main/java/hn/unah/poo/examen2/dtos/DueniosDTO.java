package hn.unah.poo.examen2.dtos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DueniosDTO {
    private String dni;

    private String nombre;

    private String apellido;

    private String telefono;
}
