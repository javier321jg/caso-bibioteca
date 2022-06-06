
package ucs.tarea.biblioteca.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ucs.tarea.biblioteca.entity.Empleado;

/**
 *
 * @author javier
 */
@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>  {
    
}
