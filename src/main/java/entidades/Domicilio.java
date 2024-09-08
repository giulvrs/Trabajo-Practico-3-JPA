package entidades;

import javax.persistence.*;
import java.io.Serializable;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "domicilio")
public class Domicilio implements Serializable {

    @Column(name = "nombrecalle")
    private String nombreCalle;
    @Column(name = "número")
    private int numeroC;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne (mappedBy = "domicilio")
    private Cliente cliente;

}

