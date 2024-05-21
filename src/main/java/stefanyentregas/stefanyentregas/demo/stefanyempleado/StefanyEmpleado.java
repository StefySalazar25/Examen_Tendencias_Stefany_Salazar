package stefanyentregas.stefanyentregas.demo.stefanyempleado;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StefanyEmpleado{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre") 
    private String nombre;

    @Column(name = "celular")
    private int celular;  

    // private void setId(Long ID2){
    //     this.id = ID2;
    // }
    // private Long getId(){
    //     return this.id;
    // }

    // private void setNombre(String nombre2){
    //     this.nombre = nombre2;
    // }
    // private String getNombre(){
    //     return this.nombre;
    // }
    // private void setCelular(int celular2){
    //     this.celular = celular2;
    // }
    // private int getCelular(){
    //     return this.celular;
    // }

}