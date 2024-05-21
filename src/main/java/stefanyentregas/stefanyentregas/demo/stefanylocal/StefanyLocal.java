package stefanyentregas.stefanyentregas.demo.stefanylocal;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import stefanyentregas.stefanyentregas.demo.stefanyempleado.StefanyEmpleado;

@Entity
@Data
public class StefanyLocal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "lugar") 
    private boolean lugar;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefono")
    private int telefono;
    
    //Relacion con Empleado 
    @ManyToOne
    @JoinColumn(name = "empleado_id", nullable = false)
    private StefanyEmpleado empleado;
}
