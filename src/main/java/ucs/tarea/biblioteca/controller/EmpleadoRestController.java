
package ucs.tarea.biblioteca.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ucs.tarea.biblioteca.entity.Empleado;
import ucs.tarea.biblioteca.service.EmpleadoService;


@RestController
@RequestMapping("/emple")
public class EmpleadoRestController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping("/all")
    public List<Empleado> getPosts() {
        return empleadoService.readAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Empleado> getEmpledo(@PathVariable int id) {
        Empleado empleado = empleadoService.read(id);
        return ResponseEntity.ok(empleado);
    }

    @DeleteMapping("/{id}")
    public void deleteEmpleado(@PathVariable int id) {        
        empleadoService.delete(id);
    }
    @PostMapping("/add")
    public Empleado addEmpleado(@RequestBody Empleado empleado) {  
        return empleadoService.create(empleado);
    }
    @PutMapping("/edit")
    public Empleado editEmpleado(@RequestBody Empleado empleado) {  
        Empleado emple = new Empleado(empleado.getId(),empleado.getNombre(),empleado.getApellido(),empleado.getDNI());
        System.out.println(empleado.getId()+" , "+empleado.getNombre()+" , "+empleado.getApellido()+" , "+empleado.getDNI());
        return empleadoService.update(empleado);
    }
}

