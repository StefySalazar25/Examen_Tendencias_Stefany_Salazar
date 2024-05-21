package stefanyentregas.stefanyentregas.demo.stefanypedido;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import stefanyentregas.stefanyentregas.demo.stefanyempleado.StefanyEmpleado;
import stefanyentregas.stefanyentregas.demo.stefanyproducto.StefanyProducto;

@Entity
@Data
public class StefanyPedido{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "tipo")
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "producto_id") // Nombre de la columna en la tabla Pedido
    private StefanyProducto producto;
    
    @ManyToOne
    @JoinColumn(name = "empleado_id") // Nombre de la columna en la tabla Pedido
    private StefanyEmpleado empleado;
}