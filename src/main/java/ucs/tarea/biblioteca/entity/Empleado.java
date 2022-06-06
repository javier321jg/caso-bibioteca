
package ucs.tarea.biblioteca.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author javier
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="empleados")

public class Empleado {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idempleado")
    private int id;
    private String nombre;
    private String apellido;
    private String DNI;
}
