package stefanyentregas.stefanyentregas.demo.stefanyempleado;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stefany-empleados")
public class StefanyEmpleadoController {

    private final StefanyEmpleadoService service;

    public StefanyEmpleadoController(StefanyEmpleadoService service) {
        this.service = service;
    }

    @PostMapping
    public StefanyEmpleado createStefanyEmpleado(@RequestBody StefanyEmpleado empleado) {
        return service.saveStefanyEmpleado(empleado);
    }

    @GetMapping
    public List<StefanyEmpleado> getAllStefanyEmpleados() {
        return service.getAllStefanyEmpleados();
    }

    @GetMapping("/{id}")
    public StefanyEmpleado getStefanyEmpleadoById(@PathVariable Long id) {
        return service.getStefanyEmpleadoById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStefanyEmpleado(@PathVariable Long id) {
        service.deleteStefanyEmpleado(id);
    }
}
